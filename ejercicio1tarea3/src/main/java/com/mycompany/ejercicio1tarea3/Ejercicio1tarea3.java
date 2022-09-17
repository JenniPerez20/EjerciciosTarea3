
package com.mycompany.ejercicio1tarea3;

import java.util.Scanner;

public class Ejercicio1tarea3 {

    public static void main(String[] args) {
        
        Scanner Pn = new Scanner(System.in);
        
        int aleatorio, numero, contador =0;
        
        aleatorio = (int) (Math.random()*100);   
        
        do{
            System.out.println("Ingrese un numero");
            numero= Pn.nextInt();
            if (aleatorio>numero){
                System.out.println("Coloque un numero mayor: ");
            }
            else{
                System.out.println("Coloque un numero menor: ");
            }
            contador++;
        
        }while(numero != aleatorio);
        
        System.out.println("Excelente adivinaste el numero");
        System.out.println("Tu numero de intentos fue: "+contador+" **");
            
            
        
    }
}
