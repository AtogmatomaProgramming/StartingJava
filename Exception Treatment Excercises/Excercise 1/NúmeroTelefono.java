/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio;

/**
 *
 * @author USUARIO
 */

/*Se define una clase llamada "NumeroTelefono", para trabajar mejor con ella en el método principal.*/
public class NúmeroTelefono {
    private int numero;
    
    
    /*Definimos un constructor por defecto, en donde el número de teléfono sea igual a cero*/
    public NúmeroTelefono (){
    numero=0;
    }
    
    /*Definimos ahora sus setters y getters*/

    public NúmeroTelefono(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
}
