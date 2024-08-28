
package com.MiBirra.proyectofinal.service;

import org.springframework.web.multipart.MultipartFile;
//metodo para pasar imagenes y todo hacia el storage en la nube
public interface FirebaseStorageService {

    public String cargaImagen (MultipartFile archivoLocalCliente, String carpeta, Long id);

    //El BuketName es el <id_del_proyecto> + ".appspot.com"
    final String BucketName = "techshop-m-c96ff.appspot.com";

    //Esta es la ruta básica de este proyecto Techshop
    final String rutaSuperiorStorage = "techshop";

    //Ubicación donde se encuentra el archivo de configuración Json
    final String rutaJsonFile = "firebase";
    
    //El nombre del archivo Json
    final String archivoJsonFile = "techshop-m-c96ff-firebase-adminsdk-s7rcs-776d51f2f2.json";
}
