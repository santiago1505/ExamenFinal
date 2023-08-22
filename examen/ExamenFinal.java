/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author 503
 */
import java.util.Scanner;
public class ExamenFinal {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        //Punto_1();
        //Punto_2();
        Punto_3();
        //Punto_6();
        
    }
    public static void Punto_1() {
        String nombres [];
        nombres = new String[6];
        for (int i = 0; i < 6; i++) {
            System.out.println("ingrese los nombres que desea agregar");
            nombres[i]=leer.next(); 
        }
        for (int j = 0; j < nombres.length; j++) { 
                System.out.println("el nombre en la posicion " + j + " es " + nombres[j]);
            }
    }
    
    public static void Punto_2() {
        int array[][] ={{20,16,10},{22,34,19},{2,55,75}};
        
         for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print( array[i][j] + "\t" );
            }
            System.out.println();
        }
    }
    
    public static void Punto_3() {
        String jugadores [][]={{"juan","15 años","delantero"},{"pedro","16 años","defensa"},{"luis","17 años","arquero"}};
        //String jugador1[]={"juan","15 años","delantero"};
        //String jugador2[]={"pedro","16 años","defensa"};
        //String jugador3[]={"luis","17 años","arquero"};
        
        for (int i = 0; i < jugadores.length; i++) {
            for (int j = 0; j < jugadores[i].length; j++) {
                 System.out.print( jugadores[i][j] + "\t" );
            }
            System.out.println();
        }
       
         System.out.println("----------------------------------------");
         System.out.println("punto 4");
         System.out.println("en la posicion 2 esta :" + jugadores[2][2]);
         System.out.println("----------------------------------------");
         System.out.println("punto 5");
         System.out.println("en la posicion 1 del jugador2 esta : " + jugadores[1][1]);
    }
    
    public static void Punto_6() {
       int contador = 0;
       int numeros [];
       numeros = new int[7];
        do{
            System.out.println("ingrese los 7 numeros");
            numeros[contador]=leer.nextInt();
            contador++;
        }while (contador < 7);
        
        System.out.println("----------------------------------------");
         System.out.println("punto 4");
         
         for (int i = 0; i < numeros.length; i++) {
             System.out.println("los  numeros en la posicio " + i + " es " + numeros[i]);
            
        }
    }
}
