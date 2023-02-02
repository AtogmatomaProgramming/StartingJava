/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioFeedback2;

/**
 *
 * @author USUARIO
 */
public class Población {

    /*Paso1: Definición de atributos.
    Se encapsulan "private" para que el software 
    acceda a través de ellos por los setters y getters que
    configuraremos más tarde
     */
    private String Nombre;
    private Padrón PadrónAsociado;
    /*El atributo "PadrónAsociado" se define a través de la clase ya creada "Padrón".
    Así se consigue una relación entre clases llamada "asociación". Es en este caso
    una variable de tipo objeto, al igual que pasa con "String*/
    private String Provincia;
    private String CCAA;

    /*Paso 2. Constructores
    
    El programa se ha pensado para que se vayan poniendo uno a uno los valores
    por teclado, no hace falta la definición de constructures. Java usará el "constructor por defecto", 
    es decir, el lenguaje ya hace un "constructor vacío" relacionado con la clase. Ahora bien, si se quisiera
    establecer directamente todos los valores de los atributos, el código del constructor 
    necesario para ello sería el siguiente: 
    
    
    "public Población (String Nombre, Padrón PadrónAsociado, String Provincia, String CCAA){
    this.Nombre=Nombre;
    this.PadrónAsociado=PadrónAsociado;
    this.Provincia=Provincia;
    this.CCAA=CCAA"
    }*/
    //Paso 3. Establecimiento de los Setter & Getters 
    public void dameNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String elNombre() {
        return Nombre;
    }

    public void dameProvincia(String Provincia) {
        this.Provincia = Provincia;
    }

    public String laProvincia() {
        return Provincia;
    }

    public void dameCCAA(String CCAA) {
        this.CCAA = CCAA;
    }

    public String laCCAA() {
        return CCAA;

    }

    public void damePadrón(Padrón PadrónAsociado) {
        this.PadrónAsociado = PadrónAsociado;
    }

    public Padrón elPadrón() {
        return PadrónAsociado;
    }


    public void FichaPueblo() {
        if ((((PadrónAsociado.elAñoPadron() < 0 || PadrónAsociado.elNumeroHabitantesActual() < 0) || PadrónAsociado.elPorcentaje() < 0) || PadrónAsociado.elPorcentaje() > 100) || PadrónAsociado.elCrecimiento() != "crecido" && PadrónAsociado.elCrecimiento() != "disminuido") {
            System.out.println("ERROR. Alguno de los datos introducido con anterioridad es érroneo. Tienes que volverlos a introducir correctamente.\n "
                    + "Revisa aquellos en donde aparezca un mensaje de «Error» y ejecuta de nuevo el programa");
        } 
         else {
            System.out.println("El pueblo introducido es " + Nombre + ", perteneciente \n"
                    + "a la Comunidad autónoma de " + CCAA + " y a la provincia de \n"
                    + Provincia + ". En el padrón del año " + PadrónAsociado.elAñoPadron() + " hay \n"
                            + "un total de " + PadrónAsociado.elNumeroHabitantesActual() + " habitantes. \n"
                                    + "Con respecto al año pasado, ha " + PadrónAsociado.elCrecimiento() + " un " + PadrónAsociado.elPorcentaje() + "%");
        }
    }
   

            /*Se configura un mensaje de error para que, en caso de poner un número de habitantes, años,
            porcentaje incorrectos o responder con otra cosa que no sea "Sí" o "No" al crecimiento,
            aparezca un error que señale que los datos han sido introducidos incorrectamente.*/
        
        
    }
    

