import java.util.Scanner;
public class Vista {
    Scanner sc = new Scanner(System.in);
    String skip = ("");
/**
 * Aquí se llaman a lo que es necesario de hacer antes, para poder tener la información necesaria del usuarío
 */
    public void soludar(){
        System.out.println("Hola u bienvenido al sistema de asignación de perros del programa de rescate de canes");
        /**
        * saludo por parte del programa 
        */
    }
    public void menu() {/**
        * el menú del programa
        */
        System.out.println("Por favor seleccione uno de las siguentes occiones a continuación");
        System.out.println("1.Nueva Familia");
        System.out.println("2.Nuevo perro");
        System.out.println("3.Asignar perro a familia");
        System.out.println("4.Salir");
    }
    /**
 * preguntas que se realizan
 */
    public void fperguntaf1(){
        System.out.println("Escriba el apellido por favor");
    }
    public void fpergunta2(){
        System.out.println("¿Tiene niños pequeños ? (por debajo del los 10 años)");
        System.out.println("Responda True o False ");
    }
    public void fpergunta3(){
        System.out.println("¿Tiene niños grandes ? (por arriba del los 10 años)");
        System.out.println("Responda True o False ");
    }
    public void ppregunta4() {
        System.out.println("Diga la raza del perro");
    }
}
