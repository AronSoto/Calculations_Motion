/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
 
public class OperacionDistancia extends Operacion {

    protected double tiempo;
    protected double velocidad;

    public OperacionDistancia(double tiempo, double velocidad) {
        super("Distancia");
        this.tiempo = tiempo;
        this.velocidad = velocidad;
    }

    public OperacionDistancia() {
        super(null);
    }
    

    public double convertirMetrosAKilometros() {
        return getResultado() / 1000;
    }

    public double convertirKilometrosAMetros() {
        return getResultado() * 1000;
    }

        
    public String solucionPasoAPaso(double tiempo,double velocidad,String resultado) {
        // Aquí puedes construir la cadena de texto con la solución paso a paso de la operación de tiempo
        // Puedes utilizar un StringBuilder para ir agregando cada paso
        StringBuilder sb = new StringBuilder();

        // Agregar cada paso a la cadena de texto
        sb.append("FORMULA A USAR : Tiempo x Velocidad \n");
        sb.append("[(T)*(V)] => :" +"[("+tiempo+") x ("+velocidad+")]"+"\n");
        sb.append("[ Distancia ] ==>" +resultado+"...\n");
        // Agrega más pasos según sea necesario

        // Devolver la cadena de texto con la solución paso a paso
        return sb.toString();
    }

    @Override
    public void calcular() {
        double distancia = tiempo * velocidad;
        setResultado(distancia);
    }

}
