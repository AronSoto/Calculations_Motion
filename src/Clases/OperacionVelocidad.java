/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

public class OperacionVelocidad extends Operacion {

    private double distancia;
    private double tiempo;

    public OperacionVelocidad(double distancia, double tiempo) {
        super("Velocidad");
        this.distancia = distancia;
        this.tiempo = tiempo;
    }
    //CalcularVelocidad

    public OperacionVelocidad() {
        super(null);
    }

    
    public double convertirAMetrosPorSegundo() {
        return getResultado() * 0.27778;
    }

    public double convertirAKilometrosPorHora() {
        return getResultado() * 3.6;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

 
         
    public String solucionPasoAPaso(double distancia,double tiempo,String resultado) {
        // Aquí puedes construir la cadena de texto con la solución paso a paso de la operación de tiempo
        // Puedes utilizar un StringBuilder para ir agregando cada paso
        StringBuilder sb = new StringBuilder();

        // Agregar cada paso a la cadena de texto
        sb.append("FORMULA A USAR : Distancia/Tiempo \n");
        sb.append("[(D)/(T)] => " +"[("+distancia+")/("+tiempo+")]"+"\n");
        sb.append("[ Velocidad ] ==>" +resultado+"...\n");
        // Agrega más pasos según sea necesario

        // Devolver la cadena de texto con la solución paso a paso
        return sb.toString();
    }
    

    @Override
    public void calcular() {

        double velocidad = distancia / tiempo;
        setResultado(velocidad);
    }

}
