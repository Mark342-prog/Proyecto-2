import java.util.ArrayList;
import java.util.Scanner;

public class perros {
    /**
 * se crean las listas para alos perros
 */
    ArrayList<String> asignacion = new ArrayList();
    ArrayList<String> perro1 = new ArrayList();
    ArrayList<String> perro2 = new ArrayList();
    ArrayList<String> perro3 = new ArrayList();
    ArrayList<String> perro4 = new ArrayList();
    ArrayList<String> perro5 = new ArrayList();
    ArrayList<String> perro6 = new ArrayList();
    ArrayList<String> perro7 = new ArrayList();
    Scanner sc = new Scanner(System.in);
    
    public void agregar1() {/**
        * aquí se solicita la información del can
        */
        String raza = sc.nextLine();
        perro1.add(raza);
        System.out.println("Diga el tamano del perro");
        String tamano = sc.nextLine();
        perro1.add(tamano);
        System.out.println("Diga el estado de salud del perro del 1 al 10");
        String salud = sc.nextLine();
        perro1.add(salud);
    }
    public void agregar2() {
        String raza = sc.nextLine();
        perro2.add(raza);
        System.out.println("Diga el tamano del perro");
        String tamano = sc.nextLine();
        perro2.add(tamano);
        System.out.println("Diga el estado de salud del perro del 1 al 10");
        String salud = sc.nextLine();
        perro2.add(salud);
    }
    public void agregar3() {
        String raza = sc.nextLine();
        perro3.add(raza);
        System.out.println("Diga el tamano del perro");
        String tamano = sc.nextLine();
        perro3.add(tamano);
        System.out.println("Diga el estado de salud del perro del 1 al 10");
        String salud = sc.nextLine();
        perro3.add(salud);
    }
    public void agregar4() {
        String raza = sc.nextLine();
        perro4.add(raza);
        System.out.println("Diga el tamano del perro");
        String tamano = sc.nextLine();
        perro4.add(tamano);
        System.out.println("Diga el estado de salud del perro del 1 al 10");
        String salud = sc.nextLine();
        perro4.add(salud);
    }
    public void agregar5() {
        String raza = sc.nextLine();
        perro5.add(raza);
        System.out.println("Diga el tamano del perro");
        String tamano = sc.nextLine();
        perro5.add(tamano);
        System.out.println("Diga el estado de salud del perro del 1 al 10");
        String salud = sc.nextLine();
        perro5.add(salud);
    }
    public void agregar6() {
        String raza = sc.nextLine();
        perro6.add(raza);
        System.out.println("Diga el tamano del perro");
        String tamano = sc.nextLine();
        perro6.add(tamano);
        System.out.println("Diga el estado de salud del perro del 1 al 10");
        String salud = sc.nextLine();
        perro6.add(salud);
    }
    public void agregar7() {
        String raza = sc.nextLine();
        perro7.add(raza);
        System.out.println("Diga el tamano del perro");
        String tamano = sc.nextLine();
        perro7.add(tamano);
        System.out.println("Diga el estado de salud del perro del 1 al 10");
        String salud = sc.nextLine();
        perro7.add(salud);
    }
    public void crear() {/**
        * se crea la lista de los perros peligrosos
        */
        asignacion.add("pitbull terrier");
        asignacion.add("Pit bull terrier");
        asignacion.add("Tosa Inu");
        asignacion.add("Dogo argentino");
        asignacion.add("Dogo Guatemalteco");
        asignacion.add("Fila brasileño");
        asignacion.add("Presa canario");
        asignacion.add("Dóberman");
        asignacion.add("Gran perro japonés");
        asignacion.add("Mastín napolitano");
        asignacion.add("Presa Mallorqui");
        asignacion.add("Dogo de burdeos");
        asignacion.add("Bullmastiff");
        asignacion.add("Bull terrier inglés");
        asignacion.add("Bulldog americano");
        asignacion.add("Rhodesiano");
        asignacion.add("Rottweiler");
        
    }
}
