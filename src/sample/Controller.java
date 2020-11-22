package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import java.io.*;
public class Controller {
    @FXML private TextField archivo;
    @FXML private Label textos;
   @FXML private RadioButton directorio;
   @FXML public TextField carpeta;
public void BotonDirectorio(ActionEvent event){

    if (directorio.isSelected()){
        carpeta.setDisable(false);
    }
    else{
              carpeta.setDisable(true);
    }
}
    public void accion(ActionEvent event){
if (directorio.isSelected()){

       File folder=new File(carpeta.getText());
    folder.mkdir();
    String nombre=carpeta.getText()+"\\"+ archivo.getText()+".txt";
    File crear=new File(nombre);
    try {
        boolean a=crear.createNewFile();
        if(crear.exists()){
            System.out.println("El archivo se creo correctamente");
        }
    }
    catch (IOException e){
        System.out.println("El archivo no se pudo crear"+e);
    }
}
else{

         String nombre=archivo.getText()+".txt";
         File crear=new File(nombre);
    try {
        boolean a=crear.createNewFile();
        if(crear.exists()){

            System.out.println("El archivo se creo correctamente");
        }
    }
    catch (IOException e){
        System.out.println("El archivo no se pudo crear"+e);
    }
}


    }
}
