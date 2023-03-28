package Juego;
import java.util.Scanner;
public class Carisellazo implements Juego{
    private String nombre;
    private int eleccion, lanzamiento;

    Scanner leer=new Scanner (System.in);
    @Override
    public void iniciar() {

        System.out.println("Ingrese el nombre del jugardor: ");
        nombre=leer.next();
    }

    @Override
    public void jugar() {
        int lanzamiento=(int)(Math.random()*2+1);
        System.out.println(nombre + " Seleccione: 1.Cara 2.Sello");
        eleccion=leer.nextInt();
    }

    @Override
    public void finalizar() {
       
    }
    






    
}
