package com.MiBirra.proyectofinal.service.impl;

import com.MiBirra.proyectofinal.dao.MenuDao;
import com.MiBirra.proyectofinal.domain.Menu;
import com.MiBirra.proyectofinal.service.FirebaseStorageService;
import com.MiBirra.proyectofinal.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    
    @Autowired
    private MenuDao menuDao;

    @Override
    public List<Menu> getMenus(boolean activos) {
        List<Menu> lista = menuDao.findAll();
        if (activos) {
            lista.removeIf(c -> !c.isActivo());
        }
        return lista;
    }

    @Override
    public Menu getMenu(Menu menu) {
        return menuDao.findById(menu.getIdMenu()).orElse(null);
    }

   // @Override
    public void save(Menu menu) {
       menuDao.save(menu);
    }

    //@Override
    public void delete(Menu menu) {
        
    menuDao.delete(menu);
    }

    @Override
    public void actualizarImagen(Menu menu, MultipartFile archivo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
}
