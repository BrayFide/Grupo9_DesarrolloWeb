/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.MiBirra.proyectofinal.controller;



import com.MiBirra.proyectofinal.service.MesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

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
//    @Autowired
//    private FirebaseStorageService firebaseStorageService;
//    @PostMapping ("/guardar")
//    public String guardar(Mesa mesa,
//             @RequestParam MultipartFile imagenFile){
//        if (!imagenFile.isEmpty()){
//            //Se sube la imagen al Storage
//            
//          mesaService.save(mesa);
//          String rutaImagen=firebaseStorageService.cargaImagen(imagenFile,
//                  "mesa", mesa.getIdMesa());
//              mesa.setRutaImagen(rutaImagen);
//            
//        }
//        mesaService.save(mesa);
//        return "redirect:/mesa/listado";
//        
//    }
    
//    @GetMapping("/eliminar/{idMesa}")
//    public String eliminar (Mesa mesa){
//        mesaService.delete(mesa);
//        return "redirect:/mesa/listado";
//    }
    
//    @GetMapping("/modificar/{idMesa}")
//    public String modificar (Mesa mesa, Model model){
//        mesa = mesaService.getMesa(mesa);
//        
//        model.addAttribute("mesa", mesa);
//        return "/mesa/modifica";
//        
//    }

}
