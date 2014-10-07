
package boletin2.pkg3;

import java.util.Scanner;


public class Boletin23 
{
    public static void main(String[] args) 
    {
        double euros, cambio;
        System.out.println("Introducir cantidad en euros: ");
        Scanner dato = new Scanner(System.in);
        euros=dato.nextDouble();
        System.out.println("Introducir cambio: ");
        cambio=dato.nextDouble();
        System.out.println("Usted tendria: "+euros*cambio);
        
    }
    
}
