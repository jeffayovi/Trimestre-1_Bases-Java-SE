
package volumencilindro;
/*
Programa que calcule el volumen de un cilindro (usar Math.PI y variables con alcance controlado).
*/

public class VolumenCilindro {
//Constantes (alcance controlado con 'final')
   private static final double PI = Math.PI;//Usamos Math.PI para alta precisión
   
    public static void main(String[] args) {
       double radio = 5.0;//Radio del cilindro en cm
       double altura = 10.0;//Altura del cilindro en cm
       
       //Cálculo del volumen (V = π * r² * h)
        double volumen = calcularVolumen(radio, altura);
        
         // Mostrar resultado
         System.out.println("El volumen del cilindro es: " +volumen );
        
    }
    
    private static double calcularVolumen(double radio,double altura){
        return PI * Math.pow(radio, 2) * altura; 
  
    }
}
