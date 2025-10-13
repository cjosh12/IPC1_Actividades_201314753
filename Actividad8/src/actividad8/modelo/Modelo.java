/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad8.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author josue
 */
public class Modelo implements Serializable{
    List<ModeloLibro> biblioteca = new ArrayList<ModeloLibro> ();

    public Modelo() {
        biblioteca.add(new ModeloLibro("La Divina Comedia", "Dante Alighieri",1931));
        biblioteca.add(new ModeloLibro("Harry Potter y la Piedra Filosofal", "J. K. Rowling",1997));
        biblioteca.add(new ModeloLibro("El señor de los Anillos ", "J. R. R. Tolkien",1954));
        
    }
    public List<ModeloLibro> getBiblioteca(){
        return biblioteca;
    }
    
}
