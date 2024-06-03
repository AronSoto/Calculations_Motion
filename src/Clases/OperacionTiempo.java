/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

public class OperacionTiempo extends Operacion {

   

    protected double distancia;
    protected double velocidad;

    public OperacionTiempo(double distancia, double velocidad) {
        super("Tiempo");
        this.distancia = distancia;
        this.velocidad = velocidad;
    }

    public OperacionTiempo() {
        super(null);
    }

    
    public double convertirSegundosAHoras() {
        return getResultado() / 3600.0;
    }

    // Convertidor de minutos a segundos
    public double convertirHorasaSegundos() {
        return getResultado() / 3600.0;
    }

    

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    
    public String solucionPasoAPaso(double distancia,double velocidad,String resultado) {
        // Aquí puedes construir la cadena de texto con la solución paso a paso de la operación de tiempo
        // Puedes utilizar un StringBuilder para ir agregando cada paso
        StringBuilder sb = new StringBuilder();

        // Agregar cada paso a la cadena de texto
        sb.append("FORMULA A USAR : Distancia/Velocidad \n");
        sb.append("[(D)/(V)] => " +"[("+distancia+")/("+velocidad+")]"+"\n");
        sb.append("[ Tiempo ] ==>" +resultado+"...\n");
        // Agrega más pasos según sea necesario

        // Devolver la cadena de texto con la solución paso a paso
        return sb.toString();
    }
    @Override
    public void calcular() {
        double tiempo = distancia / velocidad;
        setResultado(tiempo);
    }
}
