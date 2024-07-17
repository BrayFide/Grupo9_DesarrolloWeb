/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mibirra.proyectoFinal.controller;


import com.mibirra.proyectoFinal.domain.Mesa;
import com.mibirra.proyectoFinal.service.MesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/mesa")
public class MesaController {

    @Autowired
    private MesaService mesaService;

    @GetMapping("/listado")
    public String listado(Model model) {
        var lista = mesaService.getMesas(false);
        model.addAttribute("mesas", lista);
        model.addAttribute("totalMesas", lista.size());

        return "/mesa/listado";

    }
    @Autowired
    
    
    
    @GetMapping("/eliminar/{idMesa}")
    public String eliminar (Mesa Mesa){
        mesaService.delete(Mesa);
        return "redirect:/mesa/listado";
    }
    
    @GetMapping("/modificar/{idMesa}")
    public String modificar (Mesa mesa, Model model){
        mesa = mesaService.getMesa(mesa);
        
        model.addAttribute("mesa", mesa);
        return "/mesa/modifica";
        
    }

}
