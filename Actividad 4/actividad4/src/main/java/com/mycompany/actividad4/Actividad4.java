/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.actividad4;

import java.util.*;

/**
 *
 * @author josue
 */
public class Actividad4 {

    static String opc;
    static double a, b, resultado;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        do {
            System.out.println("Bienvenido");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Potencia");
            System.out.println("6. Raiz");
            System.out.println("7. Salir");
            System.out.println("Ingrese una opción: ");
            opc = scan.next();
            switch (opc.toLowerCase()) {
                case "uno":
                    opc1();
                    break;
                case "dos":
                    opc2();
                    break;
                case "tres":
                    opc3();
                    break;
                case "cuatro":
                    opc4();
                    break;
                case "cinco":
                    opc5();
                    break;
                case "seis":
                    opc6();
                    break;
                case "siete":
                    break;
                default:
                    System.out.println("solo puede ingresar opciones del 1-7 de manera no numerica!");
                    break;
            }
        } while (!opc.toLowerCase().equals("siete"));
    }

    public static void opc1() {
        try {
            System.out.println("ingrese numero a: ");
            a = scan.nextDouble();
            System.out.println("ingrese numero b: ");
            b = scan.nextDouble();
            resultado = a + b;
            System.out.println("el resultado es: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Solo puede ingresar numeros!!");
            menu();
        }

    }

    public static void opc2() {
        try {
            System.out.println("ingrese numero a: ");
            a = scan.nextDouble();
            System.out.println("ingrese numero b: ");
            b = scan.nextDouble();
            resultado = a - b;
            System.out.println("el resultado es: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Solo puede ingresar numeros!!");
            menu();

        }
    }

    public static void opc3() {
        try {
            System.out.println("ingrese numero a: ");
            a = scan.nextDouble();
            System.out.println("ingrese numero b: ");
            b = scan.nextDouble();
            resultado = a * b;
            System.out.println("el resultado es: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Solo puede ingresar numeros!!");
            menu();
        }
    }

    public static void opc4() {
        try {
            System.out.println("ingrese numero a: ");
            a = scan.nextDouble();
            System.out.println("Ingrese numero b: ");
            b = scan.nextDouble();
            if (b == 0) {
                System.out.println("no se puede dividir por 0 ingrese otro numero: ");
                b = scan.nextByte();
            }
            resultado = a / b;
            System.out.println("el resultado es: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Solo puede ingresar numeros!!");
            menu();
        } catch (ArithmeticException d) {
            System.out.println("no se puee dividir en 0");
            opc4();
        }
    }

    public static void opc5() {
        try {
            System.out.println("ingrese numero a: ");
            a = scan.nextDouble();
            System.out.println("ingrese numero b: ");
            b = scan.nextDouble();
            resultado = potencia(a, b);
            System.out.println("el resultado es: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Solo puede ingresar numeros!!");
            menu();
        }
    }

    public static void opc6() {
        try {
            System.out.println("ingrese numero a: ");
            a = scan.nextDouble();
            System.out.println("ingrese numero b: ");
            b = scan.nextDouble();
            if (a < 0 && b % 2 == 0) {
                System.out.println("Las raiz se encuentra en el rango de imaginarios!");
                menu();
            }else{
                resultado = Math.pow(a, 1 / b);
                System.out.println("el resultado es: " + resultado);
            }

        } catch (InputMismatchException e) {
            System.out.println("solo puede ingresar numeros");
            menu();
        }
    }

    public static double potencia(double i, double j) {

        if (j == 0) {
            return 1;
        } else if (j > 0) {
            return i * potencia(i, j - 1);
        } else {
            return 1 / (i * potencia(i, j - 1));
        }
    }
}
