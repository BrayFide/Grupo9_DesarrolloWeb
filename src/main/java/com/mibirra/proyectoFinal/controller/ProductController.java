/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mibirra.proyectoFinal.controller;

import com.mibirra.proyectoFinal.domain.Product;
import com.mibirra.proyectoFinal.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/listado")
    public String listado(Model model) {
        var lista = productService.getProducts(0);
        model.addAttribute("products", lista);
        model.addAttribute("totalProducts", lista.size());

        return "/product/listado";

    }
    
    @PostMapping ("/guardar")
    public String guardar(Product product){
             
        productService.save(product);
        return "redirect:/product/listado";
        
    }
    
    @GetMapping("/eliminar/{idProduct}")
    public String eliminar (Product product){
        productService.delete(product);
        return "redirect:/product/listado";
    }
    
    @GetMapping("/modificar/{idProduct}")
    public String modificar (Product product, Model model){
        product = productService.getProduct(product);
        
        model.addAttribute("product", product);
        return "/product/modifica";
        
    }
}
