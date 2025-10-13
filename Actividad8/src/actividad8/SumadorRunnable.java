/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad8;

import java.io.*;

public class SumadorRunnable implements Runnable {

    @Override
    public void run() {
        int resultado = 0;
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("sumando: " + (i + 1));
                resultado += (i + 1);
                System.out.println("Total: " + resultado);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
