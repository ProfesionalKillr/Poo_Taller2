package Juego;
import java.util.Scanner;

public class Reto5 implements Juego {
    static Scanner leer=new Scanner(System.in);
    int number;
    String nombre, aleatorio;
    public void iniciar(){
        System.out.println("Digite el nombre del usuario/jugador: ");
        nombre=leer.nextLine();
    }
    public void jugar(){
    number=(int)(Math.random()*3+1);
    System.out.println("Elija piedra, papel o tijera");
    aleatorio=leer.nextLine();
    }
    public void finalizar(){
        if (aleatorio.equalsIgnoreCase("piedra") && number==1){
            System.out.println("El usuario: "+ nombre +" Ha empatado (Piedra=Piedra)");
        }
        else if (aleatorio.equalsIgnoreCase("papel") && number==2){
            System.out.println("El usuario: "+ nombre +" Ha empatado (Papel=Papel)");
        }
        else if (aleatorio.equalsIgnoreCase("tijera") && number==3){
            System.out.println("El usuario: "+ nombre +" Ha empatado (Tijera=Tijera)");
        }
        if (aleatorio.equalsIgnoreCase("piedra") && number==3){
            System.out.println("El usuario: "+ nombre +" Ha ganado al escoger piedra contra tijeras, Felicidades");
        }
        else if (aleatorio.equalsIgnoreCase("papel") && number==1){
            System.out.println("El usuario: "+ nombre +" Ha ganado al escoger papel contra piedra, Felicidades");
        }
        else if (aleatorio.equalsIgnoreCase("tijera") && number==2){
            System.out.println("El usuario: "+ nombre +" Ha ganado al escoger tijera contra papel, Felicidades");
        } 
        if (aleatorio.equalsIgnoreCase("piedra") && number==2){
            System.out.println("El usuario: "+ nombre +" ha perdido al escoger piedra contra papel");
        }
        else if (aleatorio.equalsIgnoreCase("papel") && number==3){
            System.out.println("El usuario: "+ nombre +" Ha perdido al esocger papel contra tijeras");
        }
        else if (aleatorio.equalsIgnoreCase("tijera") && number==1){
            System.out.println("El usuario: "+ nombre +" ha perdido al escoger tijera contra piedra");
        }
    }
}
