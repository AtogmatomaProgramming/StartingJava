/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ApartadoC;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ejercicio. Realizar un programa que calcule el factorial de un número positivo (n!).");
        System.out.println("--------------------------");
        System.out.println("Recuerda:  el factorial de un número es igual al producto \nde todos los números enteros positivos desde 1 hasta dicho número.\nEs decir, no se aceptan números que no sean naturales (negativos, decimales, ...),\na no ser el 0.");
        System.out.println("--------------------------");
        System.out.println("Nota: el máximo valor que puede hayar de un factorial es hasta 170. De ahí en adelante el \nresultado supera el número de bits con los que trabaja el software.");
        System.out.println("--------------------------");
        System.out.println("¿Qué numero deseas que calcule su factorial?");
        double num1 = teclado.nextDouble();
        double factorial = 1;
        if (num1 == 0) {
            System.out.println("El factorial de " + num1 + " es 1");
        } else if ((num1 > 0) && (num1<=170)) {
            for (double i = num1; i > 0; i--) {
                factorial = factorial * i;
            }
            System.out.println("El factorial de " + num1 + " es " + factorial);
        } else {
            System.out.println("El número escrito es inválido");
        }

    }

}
