/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ApartadoA;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Principal {

    public static void main(String[] args) {
        System.out.println("Ejercicio. Desarrolar un programa que pida el ingreso del precio de un artículo y la cantidad que lleva el cliente. \n Debe mostrar lo que debe abonar el comprador teniendo en cuenta una rebaja de un 20%.");
        Scanner teclado = new Scanner(System.in);
        System.out.println("-----------------------------------");
        System.out.println("¿Cuánto vale (euros) el artículo que deseas?");
        double precio = teclado.nextDouble();
        double precioRebajado= precio*0.8;
        System.out.println("¿Cuántas unidades piensas llevarte?");
        int unidades = teclado.nextInt();
        double pagar=precioRebajado*unidades;
        System.out.println("En total tienes que pagar "+pagar+" euros. Muchas gracias");
    }
}
