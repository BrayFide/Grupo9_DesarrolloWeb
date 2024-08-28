
package com.MiBirra.proyectofinal.service;


import com.MiBirra.proyectofinal.domain.Menu;
import java.util.List;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author braym
 */
public interface MenuService {
//Se enuncia un metodo que recupera los registros de la
    //tabla mesa dentro de un ArrayList, pueden
    //ser todos los registros o solo los activos


    List<Menu> getMenus(boolean activos);
    Menu getMenu(Menu menu);
    void actualizarImagen(Menu menu, MultipartFile archivo);

  public void save (Menu menu);
    
    //Se elimina el registro que tiene idCategoria
    
    public void delete (Menu menu);
    

}