/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.CalculatorController;
import javax.swing.JFrame;

/**
 *
 * @author josue
 */
public class Ventana extends JFrame{
    private CalculatorController control;

    public CalculatorController getControl() {
        return control;
    }

    public void setControl(CalculatorController control) {
        this.control = control;
    }
    
}
