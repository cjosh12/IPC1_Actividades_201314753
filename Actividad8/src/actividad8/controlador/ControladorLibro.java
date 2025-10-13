/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad8.controlador;

import actividad8.modelo.Modelo;
import actividad8.modelo.ModeloLibro;
import java.io.*;
import java.util.*;

/**
 *
 * @author josue
 */
public class ControladorLibro {

    private Modelo model;

    public ControladorLibro() {
        model = new Modelo();
    }

    public void serializarBilio(String archivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(model.getBiblioteca());
            System.out.println("se ha creado el archivo binario " + archivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deserializarBiblio(String archivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            List<ModeloLibro> biblio = (List<ModeloLibro>) ois.readObject();
            model = new Modelo();
            model.getBiblioteca().clear();;
            model.getBiblioteca().addAll(biblio);
            System.out.println("se han cargador los datos del archivo " + archivo);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar archivo");
            e.printStackTrace();
        }
    }
    public void mostrar(){
        for (ModeloLibro libro : model.getBiblioteca()) {
            System.out.println("titulo: "+libro.getTitulo()+" | autor: "+libro.getAutor()+" | anio: "+libro.getAnio());
        }
    }
}
