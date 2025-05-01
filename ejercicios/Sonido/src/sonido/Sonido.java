/*
 * Calcula la distancia a un rayo basado en el tiempo
 * entre el relámpago y el sonido (7.2 segundos).
 * Fórmula: distancia = tiempo * velocidad del sonido (1100 pies/segundo)
 */
package sonido;

public class Sonido {

    
    public static void main(String[] args) {
        double tiempoRelampago = 7.2;//Segundos
        double velocidadSonido = 1100;//pies/segundos
        
        double distancia = tiempoRelampago * velocidadSonido;
        
        System.out.println("El rayo esta a "+ distancia + " pies de distancia");
        
        
    }
    
}
