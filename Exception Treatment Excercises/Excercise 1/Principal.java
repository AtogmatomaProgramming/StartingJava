/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author USUARIO
 */
public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        NúmeroTelefono m = new NúmeroTelefono();

        System.out.println("¡Hola! Soy un software de registro de teléfonos móviles. Dame el número por favor. \n"
                + "Este tiene que ser un entero de 9 dígitos, y empezar por 6, 7 o 9.");
        //Ponemos el bloque para "atrapar" errores "try-catch-finally".
        try {

            m.setNumero(teclado.nextInt());

            //Para trabajar mejor con el número de teléfono, lo convertimos a String con la clase Integer
            String a = Integer.toString(m.getNumero());

            /*Como necesitamos conocer por cual valor empieza, definimos la variable b, como caracter, tomando esta
            la primera "letra" de nuestro número*/
            char b = a.charAt(0);

            //Este es el método que examina el número, teniendo en cuenta su tamaño y el número por el que empieza
            examina_numero(a, b);

            /*Insertamos dos bloque catch:
            -Uno para atrapar los errores de insertar el formato incorrecto de número (letras, decimales o números superiores 
            a 9 cifras). Estos se engloban en la excepcion "RuntimeException" (clase padre), más concretamente en "InputMismatchException" (clase hija)
             */
        } catch (InputMismatchException e) {

            System.out.println("Error, has introducido una cadena de caracteres o un número superior a los nueve dígitos.\n"
                    + "Revisalo de nuevo, por favor."
            );

            /*
            -Otro para atrapar los errores de números menores a 9 cifras o que no cumplan el requisito de empezar por 6, 7 o 9. 
            Para ello se creó nuestra propia exepción "Numero_erroneo", que está definida más abajo en el programa
             */
        } catch (Exception e) {

            System.out.println(e);
            
        //Con el bloque finally obligamos a la sentencia dentro de él que se ejecute sí o sí, pase lo que pase  

        } finally {

            /*Tanto si hay excepción como no, obligamos a desconectar programa-pantalla de ejecución 
        con "teclado.close"*/
            teclado.close();

        }

    }

        /*Creamos el método "examina_numero", para que analice el número que entramos por pantalla
        y, en función de lo que ingresemos, gestione las diferentes situaciones: entramos número correcto. 
        número incorrecto, ... Conseguimos que el método lance la excepción "Numero_erroneo" usando la 
        claúsula "throws"*/
    static void examina_numero(String a, char b) throws Numero_erroneo {

        if (a.length() < 9) {

            System.out.println("Número de longitud inferior a 9 dígitos");

        } else if (a.length() == 9 && b == '6') {

            System.out.println("El número de móvil registrado es el " + a);

        } else if (a.length() == 9 && b == '7') {

            System.out.println("El número de móvil registrado es el " + a);

        } else if (a.length() == 9 && b == '9') {

            System.out.println("El número de móvil registrado es el " + a);

        } else {

            System.out.println("Número de móvil incorrecto. No empieza ni por 6, ni por 7, ni por 9.");
        }

    }

}

    /*Creamos nuestra propia clase para tratar la excepción relacionada error de longitud, ya que en la API de Java no
    se encuentra como tal una excepción de este tipo. Usamos "Exception", ya que es la que está 
    más arriba en la jerarquía, por lo que es más genérica, y, a parte, nos obliga a capturar errores con "try-catch"*/
class Numero_erroneo extends Exception {

    //Creamos dos constructores
    // a) Constructor por defecto
    public Numero_erroneo() {
    }

    // b) Constructor mensaje de error
    public Numero_erroneo(String msj_error) {
        //Se llama al constructor de la clase padre "Exception".
        super(msj_error);
    }

}
