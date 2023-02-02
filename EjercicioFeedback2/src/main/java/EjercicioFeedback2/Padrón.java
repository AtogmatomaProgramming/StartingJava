/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioFeedback2;

/**
 *
 * @author USUARIO
 */
public class Padrón {

    /*Paso 1. Definición de atributos. 
    
    Se encapsulan através de "private" para que el software 
    acceda a través de ellos por los setters y getters que
    configuraremos más adelante. 
    
     */
    private int AñoPadrón;
    private int NumeroHabitantesActual;
    private double Porcentaje;
    private boolean Crecimiento;

    /*Definimos "Crecimiento" como una variable "booleana" 
    ya que este atributo solo puede tener dos valores:
    crece/decrece (true/false)*/

 /*Paso 2. Constructores
    
    El programa se ha pensado para que se vayan poniendo uno a uno los valores
    por teclado, no hace falta la definición de constructures. Java usará el "constructor por defecto", 
    es decir, el lenguaje ya hace un "constructor vacío" relacionado con la clase. Ahora bien, si se quisiera
    establecer directamente los valores de los atributos, el código del constructor 
    necesario para ello sería el siguiente: 
    
    "public Padrón (int AñoPadrón, int NumeroHabitantesActual, int NumeroHabitantesAñoPasado){
    this.AñoPadrón=AñoPadrón;
    this.NumeroHabitantesActual=NumeroHabitantesActual;
    this.NumeroHabitantesAñoPasado=NumeroHabitantesAñoPasado;"
    
    }*/
    //Paso 3. Establecimiento de los Setter & Getters 
    public void dameAñoPadrón(int AñoPadrón) {
        if (AñoPadrón > 0) {
            this.AñoPadrón = AñoPadrón;
        } else {
            System.out.println("Error: Año no válido. Introduce de nuevo el valor");
        }
    }

    /*Se configura para trabajar con años enteros positivos. 
    Se pone un mensaje de error para cuando no introduzca 
    valores correctos. Este software no trabaja con años antes de Cristo*/
    public int elAñoPadron() {
        return AñoPadrón;
    }

    public void dameNumeroHabitantesActual(int NumeroHabitantesActual) {
        if (NumeroHabitantesActual > 0) {
            this.NumeroHabitantesActual = NumeroHabitantesActual;
        } else {
            System.out.println("Error:Número de habitantes no válido. Vuelva a introducir el dato");
        }
    }

    /*Se configura para trabajar con números de habitantes enteros positivos. 
    Se pone un mensaje de error para cuando no introduzca 
    valores correctos.*/
    public int elNumeroHabitantesActual() {
        return NumeroHabitantesActual;
    }

    public void damePorcentaje(double Porcentaje) {
        if (Porcentaje >= 0 && Porcentaje <= 100) {
            this.Porcentaje = Porcentaje;
        } else {
            System.out.println("Error: Porcentaje no válido.");
        }

    }

    /*Se configura para trabajar con porcentajes comprendidos entre 0 y 100. 
    Se pone un mensaje de error para cuando no introduzca 
    valores correctos.*/
    public double elPorcentaje() {
        return Math.round(Porcentaje * 100.0) / 100.0;
    }

    /*Luego, a la hora de ponerlo, independientemente de los décimales que se pongan, 
    el programa lo aproximará hasta la centésima parte.*/
    public void dameCrecimiento(String Crecimiento) {
        //Usamos el método "equalsIgnoresCase" para decir que la respuesta debe ser igual al String vinculado, ignorando mayúsculas y minúsculas.
        if (Crecimiento.equalsIgnoreCase("Sí") || Crecimiento.equalsIgnoreCase("Si")) {
            this.Crecimiento = true;
        } else if (Crecimiento.equalsIgnoreCase("No")) {
            this.Crecimiento = false;
        } else {
            System.out.println("Error. Respuesta no válida");
        }

    }

    public String elCrecimiento() {
        if (Crecimiento) {
            return "crecido";
        } else {
            return "disminuido";

        }
    }

}
