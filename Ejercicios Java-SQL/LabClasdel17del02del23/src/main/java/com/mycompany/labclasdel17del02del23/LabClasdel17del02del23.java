/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.labclasdel17del02del23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class LabClasdel17del02del23 {

    public static void main(String[] args) throws InterruptedException {
        
        String usuario = "user_dam";
        String pass = "dam-pasword-1234";
        String url = "jdbc:mysql://localhost:4306/peliculas";
        try {
            Scanner teclado = new Scanner(System.in);
            Connection con = DriverManager.getConnection(url, usuario, pass);
            System.out.println("Conexión correcta");
            Statement s= con.createStatement();
            boolean salida = s.execute("CREATE TABLE IF NOT EXISTS `peliculas`.`pelis` (`id` INT NOT NULL , `titulo` VARCHAR(255) NOT NULL , `genero` VARCHAR(255) NOT NULL , `año` INT NOT NULL , PRIMARY KEY (`id`))");
            System.out.println("Tabla creada correctamente");
            
           
            
            //Sentencias preparadas *****IMP**** Examen
            
            //Ver la información de las tablas
            String sqlSelect = "SELECT * FROM pelis WHERE id=?";
            PreparedStatement select = con.prepareStatement(sqlSelect);
            
            Statement insercion= con.createStatement();
            System.out.println("Introduce el registro que quieres ver");
            int id1=teclado.nextInt();
            
            select.setInt(1, id1);
            
            ResultSet registros = select.executeQuery();
            System.out.println("Ejecutando consulta");
            Thread.sleep(3000);
            while (registros.next()){
                System.out.println(registros.getString(1));
                System.out.println(" - ");
                System.out.println(registros.getString(2));
                System.out.println(" - ");
                System.out.println(registros.getString(3));
                System.out.println(" - ");
                System.out.println(registros.getString(4));
                
            }
            /*
            int n=insercion.executeUpdate("INSERT INTO `pelis` (`id`, `titulo`, `genero`, `año`) "
                    + "VALUES (1, 'Regreso al Futuro', 'Ciencia Ficción', 1985)");
            System.out.println("Registro correcto");*/
            
            //Y si todavía no sé datos de la película.....
            //Usuario pone datos de la película
            
            //Version con las Sentecias preparadas o "Prepared statement"
            String sqlInsercionPreparada="INSERT INTO `pelis` (`id`, `titulo`, `genero`, `año`) "
                    + "VALUES (?, ?, ?, ?)";
            PreparedStatement insercionPreparada = con.prepareStatement(sqlInsercionPreparada);
            
           
            System.out.println("Introduzca ID");
            int id2= teclado.nextInt();
            insercionPreparada.setInt(1, id2);
            System.out.println("Introduzca Título");
            //Solucion al teclado.nextLine
            String titulo = JOptionPane.showInputDialog("Título");
            insercionPreparada.setString(2, titulo);
            System.out.println("Introduzca Género");
            String genero = JOptionPane.showInputDialog("Género");
            insercionPreparada.setString(3, genero);
            System.out.println("Introduzca Año");
            int ano= teclado.nextInt();
            insercionPreparada.setInt(4, ano);
            //Nota: el orden en que los pongas da igual, como tienes las posiciones configuradas es indiferente
            
            insercionPreparada.executeUpdate();
            System.out.println("Insercion correcta");
            
            //Borrado con PreparedStatement
            String sqlBorradoPreparado ="DELETE FROM `pelis` WHERE `pelis`.`titulo`=?"; 
            PreparedStatement borradoPreparado = con.prepareStatement(sqlBorradoPreparado);
            System.out.println("Nombre de la peli que quieres borrar: ");          
            titulo = JOptionPane.showInputDialog("Introduce el número que quieres borrar");
            System.out.println(titulo);          
            borradoPreparado.setString(1, titulo);
            borradoPreparado.executeUpdate();
            //System.out.println("Borrado correcto...");
            /*if(){
                System.out.println("Se ha borrado el registro");
            } else {
                System.out.println("No se ha borrado " + titulo);
            };*/
            
            
            //Update...
            String sqlActualizacion = "UPDATE pelis SET año = ? WHERE id =?";
            PreparedStatement actualizacionPreparada = con.prepareStatement(sqlActualizacion);
            int id3 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el id para actualizar año"));
            int year = Integer.parseInt(JOptionPane.showInputDialog("Dime el año..."));
            
            actualizacionPreparada.setInt(2, id3);
            actualizacionPreparada.setInt(1, year);
            
            actualizacionPreparada.executeUpdate();
            System.out.println("Actualización preparada");
        } catch (SQLException e) {
            System.out.println("Error SQL");
        }



    }
}
