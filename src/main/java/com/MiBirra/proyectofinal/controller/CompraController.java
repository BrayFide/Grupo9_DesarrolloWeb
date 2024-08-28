package com.MiBirra.proyectofinal.controller;



import com.MiBirra.proyectofinal.domain.Compra;
import com.MiBirra.proyectofinal.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/compra")
public class CompraController {

    @Autowired
    private CompraService compraService;

    @GetMapping("/listado")
    public String listado(Model model) {
        var lista = compraService.getCompras(false);
        model.addAttribute("compras", lista);
        model.addAttribute("totalCompras", lista.size());

        return "compra/listado";

    }
    @PostMapping("/guardar")
public String guardar(Compra compra, @RequestParam(required = false) MultipartFile imagenFile) {
    // Check if an image file is provided
    if (imagenFile != null && !imagenFile.isEmpty()) {
        // If you want to do something with the image, you can add the logic here
        // For now, we're ignoring the image
    }
    
    // Save the Mesa object to the database
    compraService.save(compra);

    // Redirect to the list of mesas
    return "redirect:/mesa/listado";
}
    
    @GetMapping("/eliminar/{idCompra}")
    public String eliminar (Compra compra){
        compraService.delete(compra);
        return "redirect:/compra/listado";
    }
    
    @GetMapping("/modificar/{idCompra}")
    public String modificar (Compra compra, Model model){
        compra = compraService.getCompra(compra);
        
        model.addAttribute("compra", compra);
        return "compra/modifica";
        
    }

}
