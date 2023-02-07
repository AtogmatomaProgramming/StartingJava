/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;
import java.util.*;
import java.util.ArrayList;
/**
 *
 * @author USUARIO
 */
public class Persona {
    private String nombre;
    private int edad;
    private int dni;
    private char sexo;
    private double altura; 
    
    public Persona (){
        sexo='H';
    
    };
    
    public Persona (String nombre, int edad, char sexo){
    this.nombre=nombre;
    this.edad=edad;
    this.sexo=sexo;
    }
    
    
    public Persona (String nombre, int edad, String dni, char sexo, double altura){
    this.nombre=nombre;
    this.edad=edad;
    this.dni=dni;
    this.sexo=sexo;
    this.altura=altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
    
    
    public boolean esMayorDeEdad(){
    //Es función en vez de void porque retorna un boolean
    return edad >= 18;
    }
    
    public void comprobarSexo (char sexo){
    if(sexo!='M' && sexo!='H'){
        this.sexo='H';
    } else {
        this.sexo='M';
        
    }
    }
    
    //Importante examen, es una sobrecarga estática, hay que poner el overrife
    @Override
    public String toString(){
        return nombre+ edad + dni + sexo + altura;
    }
    
    public int generaDNI(){
    return (int) Math.floor(Math.random()*Math.pow(10, 8)+1);
    }
    
    
    
    }
    
    
    
    }
    
    
    
    
}
