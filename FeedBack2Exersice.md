# StartingJava
Here you can see my starting programs on Java

package EjercicioFeedback2;

import java.util.*;

/**
 *
 * @author USUARIO
 */
public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Se instancian el objeto Padrón "a" y el objeto Población "a1"
        Padrón a = new Padrón();
        Población a1 = new Población();
        System.out.println("¡Hola! Soy un software de registro de municipios. Por favor, vete \n facilitándome los datos de que pido.");
        System.out.println("¿Cuál es el nombre del municipio?");
        a1.dameNombre(teclado.nextLine());
        System.out.println("¿A qué provincia pertenece?");
        a1.dameProvincia(teclado.nextLine());
        System.out.println("¿A qué Comunidad Autónoma pertenece?");
        a1.dameCCAA(teclado.nextLine());
        System.out.println("¿Cuál es el año del último padrón disponible?\nNota: Insertar número entero positivo, por favor.");
        a.dameAñoPadrón(teclado.nextInt());
        System.out.println("¿Cuánto habitantes hay censados este año?\nNota: Insertar número entero positivo, por favor.");
        a.dameNumeroHabitantesActual(teclado.nextInt());
        System.out.println("¿En qué porcentaje ha variado la población respecto el año pasado?\nNota: Insertar décimal entero positivo, entre 0 y 100, por favor.");
        a.damePorcentaje(teclado.nextDouble());
        System.out.println("¿Ha crecido el municipio (Sí/No)?");
        a.dameCrecimiento(teclado.next());
        a1.damePadrón(a);
        System.out.println("---------------------------------------");
        a1.FichaPueblo();

        /*NOTA IMPORTANTE: "Limitaciones del software"
        El programa desarrollado tiene las siguientes limitaciones:

        a) Si insertas un dato equivocado, te lo recoje dando un mensaje de error.
        Mi plan original era crear un bucle "do while" que obligara a poner de nuevo
        la cifra hasta que fuera correcta, pero empezó a dar muchos errores y problemas.
        
        b) Aunque pongas entradas érroneas no aparece el mensaje de que se ha cometido un error configurado en la clase "Población", en el setter "FichaPueblo". 
        Así, el mensaje de que han sido insertados correctamente los datos aparece con un 0 cuando se pone en negativo 
        el valor de la fechas o los habitantes. Cuando se responde a "¿Ha crecido el municipio (Sí/No)?" con otra respuesta (por ejemplo: "Valencia")
        aparece "disminuido" 

         */
    }
}
