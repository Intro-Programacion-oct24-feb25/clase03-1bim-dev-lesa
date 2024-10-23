/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo05;

/**
 *
 * @author reroes
 */
public class Ejemplo05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Divide pero solo como entero
        System.out.println("----------------");
        System.out.println(10 / 3);
        
        // divide pero como float
        System.out.println("----------------");
        System.out.println(10 / 3.0);
        
        // resuelve por gerarquia de operaciones
        System.out.println("----------------");
        System.out.println(10 / 3.0 + 1);
        System.out.println(10 / (3.0 + 1));
        
        System.out.println("----------------");
        // esta operación es para hacer el calculo del residuo
        System.out.println(10 % 3 );
        
        // esta operación es para hacer una potencia
        System.out.println("----------------");
        System.out.println(Math.pow(10, 2));
        
        // esta operación es para la raiz cuadrada
        System.out.println("----------------");
        System.out.println(Math.sqrt(16));
        
        // sirve para almacenar informacion en una variable
        double m = Math.sqrt(16);
        System.out.println(m);
        
    }

}
