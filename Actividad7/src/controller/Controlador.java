/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Modelo;
import view.CalculatorView;
import view.View;

/**
 *
 * @author josue
 */
public class Controlador {
    private Modelo modelo;
    private View vista;
    private CalculatorController controladorCalc;

    public Controlador(Modelo modelo, View vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.controladorCalc = new CalculatorController();
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public View getVista() {
        return vista;
    }

    public void setVista(View vista) {
        this.vista = vista;
    }

    public CalculatorController getControladorCalc() {
        return controladorCalc;
    }

    public void setControladorCalc(CalculatorController controladorCalc) {
        this.controladorCalc = controladorCalc;
    }
    public void init(){
        this.controladorCalc.setControlPrincipal(this);
        
    }
    
    public void cVentanas(){
        this.vista.setCalculator(new CalculatorView ());
        this.vista.getCalculator().setControl(this);
    }
}
