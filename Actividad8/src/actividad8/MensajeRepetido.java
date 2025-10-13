/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad8;

import java.io.*;

public class MensajeRepetido extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                System.out.println("Este es un mensaje desde un hilo");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("");
    }
}
