package com.MiBirra.proyectofinal.controller;

import com.MiBirra.proyectofinal.domain.Proveedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.MiBirra.proyectofinal.service.ProveedorService;

@Controller
@RequestMapping("/proveedor")
public class ProveedorController {
    @Autowired
    private ProveedorService proveedorService;

    @GetMapping("/listado")
    public String listado(Model model) {
        var lista = proveedorService.getProveedores(0);
        model.addAttribute("proveedor", lista);
        model.addAttribute("totalProveedor", lista.size());

        return "proveedor/listado";

    }
    
    @PostMapping ("/guardar")
    public String guardar(Proveedor proveedor){
             
        proveedorService.save(proveedor);
        return "redirect:/proveedor/listado";
        
    }
    
    @GetMapping("/eliminar/{idProveedor}")
    public String eliminar (Proveedor proveedor){
        proveedorService.delete(proveedor);
        return "redirect:/proveedor/listado";
    }
    
    @GetMapping("/modificar/{idProveedor}")
    public String modificar (Proveedor proveedor, Model model){
        proveedor = proveedorService.getProveedor(proveedor);
        
        model.addAttribute("proveedor", proveedor);
        return "proveedor/modifica";
        
    }
}
