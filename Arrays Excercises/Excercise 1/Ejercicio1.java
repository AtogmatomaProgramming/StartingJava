/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */

/*Escribe un programa que lea 10 números por teclado y que luego los muestre en orden
 inverso, es decir, el primero que se introduce es el último en mostrarse y viceversa. */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, i, contador=0;
        int[] numeros=new int [10];
        for (i=9;i>=0;i--){
        contador++;
        System.out.println("Dame el número "+contador);
        num=teclado.nextInt();
        numeros[i]=num;
        
        }
        System.out.println(java.util.Arrays.toString(numeros));
    }
    
}
