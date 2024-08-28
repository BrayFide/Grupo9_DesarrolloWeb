package com.MiBirra.proyectofinal.controller;

import com.MiBirra.proyectofinal.domain.Menu;
import com.MiBirra.proyectofinal.service.FirebaseStorageService;
import com.MiBirra.proyectofinal.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping("/listado")
    public String listado(Model model) {
        var lista = menuService.getMenus(false);
        model.addAttribute("menus", lista);
        model.addAttribute("totalMenus", lista.size());
        return "menu/listado";
    }

    @PostMapping("/{id}/imagen")
    public ResponseEntity<?> cargarImagen(@PathVariable Long id, @RequestParam("imagen") MultipartFile imagen) {
        Menu menu = menuService.getMenu(new Menu(id));
        if (menu != null) {
            menuService.actualizarImagen(menu, imagen);
            return ResponseEntity.ok("Imagen actualizada correctamente");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Menú no encontrado");
        }
    }
    
    @Autowired
    private FirebaseStorageService firebaseStorageService;
    @PostMapping ("/guardar")
    public String guardar(Menu menu,
             @RequestParam MultipartFile imagenFile){
        if (!imagenFile.isEmpty()){
            //Se sube la imagen al Storage
            
          menuService.save(menu);
          String rutaImagen=firebaseStorageService.cargaImagen(imagenFile,
                  "menu", menu.getIdMenu());
              menu.setRuta_imagen(rutaImagen);
            
        }
        menuService.save(menu);
        return "redirect:/menu/listado";
        
    }
    
    @GetMapping("/eliminar/{idMenu}")
    public String eliminar (Menu menu){
        menuService.delete(menu);
        return "redirect:/menu/listado";
    }
    
    @GetMapping("/modificar/{idMenu}")
    public String modificar (Menu menu, Model model){
        menu = menuService.getMenu(menu);
        
        model.addAttribute("menu", menu);
        return "/menu/modifica";
        
    }
    
}
