/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadratica;
import java.util.Scanner;
/**
 *
 * @author Frankin Bermudez
 */
public class cuadratica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**Las raices reales de la expresion ax^2+bx+c=0 se obtiene a traves de la formula general.
         */
       Scanner teclado = new Scanner(System.in);
        int a,b,c; //Valores de la ecuación
        double R1,R2; //Posibles resultados
        double operacionRaiz;

        System.out.print("Valor a: ");
        a = (int) teclado.nextDouble();
        System.out.print("Valor b: ");
        b = (int) teclado.nextDouble();
        System.out.print("Valor c: ");
        c = (int) teclado.nextDouble();
        
        operacionRaiz = (b*b) - (4*a*c);
        System.out.println("discriminante: " +operacionRaiz);
        if(operacionRaiz > 0) {
            R1 = (-b + Math.sqrt(operacionRaiz)) / 2*a;
            R2 = (-b - Math.sqrt(operacionRaiz)) / 2*a;
            System.out.println("La ecuacion tiene dos soluciones");
            System.out.println("R1:"  +R1);
            System.out.println("R2:"  +R2);
        }else {
            if(operacionRaiz == 0) {
               R1 = (-b) / 2*a;
               System.out.println("La ecuacion tiene una solucion");  
               System.out.println("R1:"  +R1);
            } else {
                System.out.println("La ecuacion no tien solución");
            }
        }
        
    }
    
}