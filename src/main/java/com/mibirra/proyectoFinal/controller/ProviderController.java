/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mibirra.proyectoFinal.controller;

import com.mibirra.proyectoFinal.domain.Provider;
import com.mibirra.proyectoFinal.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/provider")
public class ProviderController {
    @Autowired
    private ProviderService providerService;

    @GetMapping("/listado")
    public String listado(Model model) {
        var lista = providerService.getProviders(0);
        model.addAttribute("providers", lista);
        model.addAttribute("totalProviders", lista.size());

        return "/provider/listado";

    }
    
    @PostMapping ("/guardar")
    public String guardar(Provider provider){
             
        providerService.save(provider);
        return "redirect:/provider/listado";
        
    }
    
    @GetMapping("/eliminar/{idProvider}")
    public String eliminar (Provider provider){
        providerService.delete(provider);
        return "redirect:/provider/listado";
    }
    
    @GetMapping("/modificar/{idProvider}")
    public String modificar (Provider provider, Model model){
        provider = providerService.getProvider(provider);
        
        model.addAttribute("provider", provider);
        return "/provider/modifica";
        
    }
}
