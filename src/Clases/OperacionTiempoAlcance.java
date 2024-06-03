/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import javax.swing.JOptionPane;

public class OperacionTiempoAlcance extends Operacion {

    private double velocidad1;
    private double velocidad2;
    private double distancia;

    public OperacionTiempoAlcance(double velocidad1, double velocidad2, double distancia, String nombre) {
        super(nombre);
        this.velocidad1 = velocidad1;
        this.velocidad2 = velocidad2;
        this.distancia = distancia;
    }

    public OperacionTiempoAlcance() {
        super(null);
    }

    
    @Override
    public void calcular() {
        // Calcular el tiempo de alcance
        double tiempoAlcance = distancia / (velocidad2 - velocidad1);
        setResultado(tiempoAlcance);
    }
}
