package com.MiBirra.proyectofinal.controller;

import com.MiBirra.proyectofinal.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @Autowired
    private MenuService menuService;

    @GetMapping("/")
    public String listado(Model model) {
        var menu = menuService.getMenus(true);
        model.addAttribute("menu", menu);

        return "index";

    }
}
