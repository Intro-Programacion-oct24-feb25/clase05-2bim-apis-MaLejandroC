/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import org.apache.commons.lang3.math.NumberUtils;

/**
 *
 * @author Alejandro
 */
public class Clase03 {

    public static void main(String[] args) {
        String[] dataInicial = {"100", "90", "1n", "10", "H1", "H2"};
        int[] dataFinal = new int[dataInicial.length];
        
        for (int i=0; i<dataInicial.length;i++){
            dataFinal[i]=NumberUtils.toInt(dataInicial[i],0);
            
        }
        
         for (int i=0; i<dataInicial.length;i++){
             System.out.printf("%d ",dataFinal[i]);
         }
    }

    

}
