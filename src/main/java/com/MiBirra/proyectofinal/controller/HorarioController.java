/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.MiBirra.proyectofinal.controller;



import com.MiBirra.proyectofinal.domain.Horario;
import com.MiBirra.proyectofinal.service.FirebaseStorageService;
import com.MiBirra.proyectofinal.service.HorarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/horario")
public class HorarioController {

    @Autowired
    private HorarioService horarioService;

    @GetMapping("/listado")
    public String listado(Model model) {
        var lista = horarioService.getHorarios(false);
        model.addAttribute("horarios", lista);
        model.addAttribute("totalHorarios", lista.size());

        return "horario/listado";

    }
   
    @PostMapping ("/guardar")
    public String guardar(Horario horario,
             @RequestParam MultipartFile imagenFile){
        if (!imagenFile.isEmpty()){
            //Se sube la imagen al Storage
            
       
            
        }
        horarioService.save(horario);
        return "redirect:/horario/listado";
        
    }
    
    @GetMapping("/eliminar/{idHorario}")
    public String eliminar (Horario horario){
        horarioService.delete(horario);
        return "redirect:/horario/listado";
    }
    
    @GetMapping("/modificar/{idHorario}")
    public String modificar (Horario horario, Model model){
        horario = horarioService.getHorario(horario);
        
        model.addAttribute("horario", horario);
        return "/horario/modifica";
        
    }

}
