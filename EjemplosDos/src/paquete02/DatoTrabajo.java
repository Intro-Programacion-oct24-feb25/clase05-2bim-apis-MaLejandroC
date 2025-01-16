/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class DatoTrabajo {
    // método que permita preguntar al usuario el nombre de la empresa
    public static String obtenerNombre(){
        Scanner entrada = new Scanner(System.in);
        entrada.nextLine();
        System.out.println("Ingrese el nombre de la empresa");
        String empresa = entrada.nextLine();
        
        return empresa;
    }
        // método que permita preguntar al usuario la dirección de la empresa

    public static String obtenerDireccion(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la dirección de la empresa\n" +
"}");
        String direccion = entrada.nextLine();
        
        return direccion;
    }
}
