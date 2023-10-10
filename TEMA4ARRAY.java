/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4array;

import java.util.Scanner;

/**
 *
 * @author AlumnoT
 */

public class TEMA4ARRAY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int size;
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce tamano de la raid");  //DETECTA EL TAMAÑO DEL ARRAY
        size = teclado.nextInt();
        int[] array = new int[size];
        
        for (int i = 0; i < size; i++) {
            System.out.println("introduce el valor de la posicion " + i);
            // DESDE LA POSICION "0" HASTA LA "SIZE -1" VA PIDIENDO VALORES POR CONSOLA PARA IR DEFINIENDO EL ARRAY
            array[i] = teclado.nextInt();

        }

        for (int i = 0; i < size; i++) {
            System.out.println("El valor de la posicion " + i + " es " + array[i]);
        }
    }

}
