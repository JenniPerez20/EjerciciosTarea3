
package com.mycompany.ejercicio2tarea3;

import java.util.Scanner;

public class Ejercicio2tarea3 {

    public static void main(String[] args) {
        
        
        Scanner sn = new Scanner(System.in);
        
        
        int numero;
        int suma=0;
        
        
        do{
            System.out.println("Coloque un numero");
            numero = sn.nextByte();
            
            
            suma= suma+numero;
        }while(numero!=0);
        System.out.println("La sume de los numeros son: "+suma);
    }
}
