/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mibirra.proyectoFinal.controller;

import com.mibirra.proyectoFinal.domain.Purchase;
import com.mibirra.proyectoFinal.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/purchase")
public class PurchaseController {
    @Autowired
    private PurchaseService purchaseService;

    @GetMapping("/listado")
    public String listado(Model model) {
        var lista = purchaseService.getPurchases(0);
        model.addAttribute("purchases", lista);
        model.addAttribute("totalPurchases", lista.size());

        return "/purchase/listado";

    }
    
    @PostMapping ("/guardar")
    public String guardar(Purchase purchase){
             
        purchaseService.save(purchase);
        return "redirect:/purchase/listado";
        
    }
    
    @GetMapping("/eliminar/{idPurchase}")
    public String eliminar (Purchase purchase){
        purchaseService.delete(purchase);
        return "redirect:/purchase/listado";
    }
    
    @GetMapping("/modificar/{idPurchase}")
    public String modificar (Purchase purchase, Model model){
        purchase = purchaseService.getPurchase(purchase);
        
        model.addAttribute("purchase", purchase);
        return "/purchase/modifica";
        
    }
}
