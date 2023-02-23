/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte_1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author USUARIO
 */
public class Principal {
    public static void main(String[] args) throws SQLException {
        //Conexión bbdd
        //Crear nuevo usuario para la tabla
        //GRANT ALL PRIVILEGES ON almunosDAM.* to 'user_dam'@localhost IDENTIFIED BY 'alumnosDAM2023'
        String usuario = "user_dam";
        String pass = "alumnosDAM2023";
        String url = "jdbc:mysql://localhost:4306/alumnosDAM";
        Connection con=DriverManager.getConnection(url, usuario, pass); 
        System.out.println("Me he conectacto xDDD");
        
        //Para ejecutar sentencias sql
        Statement sql = con.createStatement();
        //System.out.println(sql.execute("CREATE TABLE `alumnosdam`.`aviones` (`id` INT NOT NULL AUTO_INCREMENT , `tipo` VARCHAR(255) NOT NULL , `peso` INT NOT NULL , `fabricante` VARCHAR(255) NOT NULL , PRIMARY KEY (`id`)) ENGINE = InnoDB;"));
        System.out.println("Tabla bien creada");
        
        //Insertar un avion
        //Si ejecuto varias veces el código se va añadiendo los mismo valores a la tabla 
        //tantas veces como lo ejecute
        int n=sql.executeUpdate("INSERT INTO `aviones` (`id`, `tipo`, `peso`, `fabricante`) "
                + "VALUES (NULL, 'BOING 747', '17', 'BOIN ')");
        n=sql.executeUpdate("INSERT INTO `aviones` (`id`, `tipo`, `peso`, `fabricante`) "
                + "VALUES (NULL, 'A330', '19', 'AIRBUS')");
        n=sql.executeUpdate("INSERT INTO `aviones` (`id`, `tipo`, `peso`, `fabricante`) "
                + "VALUES (NULL, 'B52', '15', 'AIRBUS')");
        n=sql.executeUpdate("INSERT INTO `aviones` (`id`, `tipo`, `peso`, `fabricante`) "
                + "VALUES (NULL, 'BALLENA', '23', 'AIRBUS ')");
        
        System.out.println("Lo hemos insertado bien");
        
        //Borrar avion
        
        n= sql.executeUpdate("DELETE FROM `aviones` WHERE `aviones`.`tipo` = 'B52'");
        System.out.println("Borrado de los B52");
        n= sql.executeUpdate("DELETE FROM `aviones` WHERE `aviones`.`tipo` = 'AIRBUS'");
        System.out.println("Borrado de los Airbus");
        
        //Modificar avion
        
        n= sql.executeUpdate("UPDATE `aviones` SET `fabricante` = 'boing' WHERE `aviones`.`fabricante` = 'BOIN '");
        System.out.println("Fabricantes actualizados");
        
        //Select... UPDATE QUERY
        
        ResultSet salida = sql.executeQuery("SELECT * FROM `aviones`");
        System.out.println(salida);
        //salida.absolute(3);
        
        //Muestra el 'tipo' de todas las filas de la tabla
        while (salida.next()){
        System.out.print(salida.getString("tipo"));
        System.out.print(" - ");
        System.out.print(salida.getInt(1));
        System.out.print(" - ");
        System.out.print(salida.getString("peso"));
        System.out.println("");
        }
        
    }
}
