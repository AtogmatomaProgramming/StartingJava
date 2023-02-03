/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ApartadoB;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ejercicio. Escribir un programa que lea los valores inicial y final de un bucle for, \nque recorrerá los números entre esos dos, indicando para cada uno de ellos si es divisible por 5 o no.");
        System.out.println("---------------------------------");
        System.out.println("Nota1: el programa solo trabaja con números enteros positivo y negativos. No admite décimales.");
        System.out.println("---------------------------------");
        System.out.println("Dame el valor inicial");
        int num1 = teclado.nextInt();
        System.out.println("Dame el valor final");
        int num2 = teclado.nextInt();
        if (num2 > num1) {
            for (int i = num1; i <= num2; i++) {
                if (i % 5 == 0) {
                    System.out.println("El número " + i + " es divisible por 5");
                } else {
                    System.out.println("El número " + i + " es no divisible por 5");
                }
            }
        } else if (num1 > num2) {
            for (int i = num1; i >= num2; i--) {
                if (i % 5 == 0) {
                    System.out.println("El número " + i + " es divisible por 5");
                } else {
                    System.out.println("El número " + i + " es no divisible por 5");
                }
            }
        } else {
            if (num1 % 5 == 0) {
                System.out.println("El valor inicial y final es el mismo, " + num1 + ", y es divisible por 5");
            } else {
                System.out.println("El valor inicial y final es el mismo, " + num1 + ", y no es divisible por 5");
            }
        }
    }
}
