/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.security.SecureRandom;
// import java.security.*;

/**
 *
 * @author reroes
 */
public class Ejemplo03 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        int limite = 100;
        int numeroElementos = 20;
        int [] valores = obtenerValores(numeroElementos,limite);
        funcionPresentarDatos(valores);
}
    
    
    public static void funcionPresentarDatos(int[] a ) {
        int numero = 0;
        for (int i = 0; i < a.length; i++) {
            numero = numero + 1;
            System.out.printf("%d. %d\n",numero,a[i]);
        }
        
        
    }
    
    
    public static int[]obtenerValores(int numero, int limite) {
        int []arreglo = new int [numero];
        
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i]=obtenerNumero(limite);
        }
        return arreglo;
    }
    
    public static int obtenerNumero(int a) {
        // objeto generador de números aleatorios
        SecureRandom numerosAleatorios = new SecureRandom();
        
        // Returns a pseudorandom, uniformly distributed int value 
        // between 0 (inclusive) and the specified value (exclusive)
        int valorAleatorio = numerosAleatorios.nextInt(a);
        return valorAleatorio;
    }
    
    
}
