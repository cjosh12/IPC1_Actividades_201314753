/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad8;

import actividad8.controlador.ControladorLibro;
import java.util.Scanner;

/**
 *
 * @author josue
 */
public class Actividad8 {

    public static void main(String[] args) {
        ControladorLibro control = new ControladorLibro();
        SumadorRunnable suma = new SumadorRunnable();
        MensajeRepetido mensaje = new MensajeRepetido();
        Scanner scan = new Scanner(System.in);
        int opc;
        do {
            System.out.println("opcion 1 serializar");
            System.out.println("opcion 2 deserealizar");
            System.out.println("opcion 3 Imprimir Mensaje");
            System.out.println("opcion 4 Realizar Suma");
            System.out.println("opcion 5 Salir");
            System.out.println("Ingrese una opcion: ");
            opc = scan.nextInt();
            scan.nextLine();
            switch (opc) {
                case 1:
                    control.serializarBilio("Biblioteca.ser");
                    break;
                    case 2:
                        control.deserializarBiblio("Biblioteca.ser");
                        control.mostrar();
                    break;
                    case 3:
                         mensaje.start();
                    break;
                    case 4:
                        suma.run();
                        
                    break;
                    case 5:
                        System.out.println("adios!!");
                        System.exit(0);
                    break;
                    default:
                        System.out.println("solo se permiten opciones del 1 al 5");
                        break;
            }

            
           
            
            
        } while (opc > 0 && opc < 5);
    }

}
