package clase1;
import java.util.Scanner;
public class Animal {
    //Atributos
    public String nombre;
    public int edad;

    Scanner leer=new Scanner(System.in);

    //Metodos u operaciones

    public void registrarAnimal(String n, int e) {
        //cuerpo metodo
        nombre=n;
        edad=e;

    }
    public void mostrarAnimal(){
        System.out.println("El nombre del animal ingresado es: " + nombre + " y tiene: " + edad + " Años");
    }
    public int duplicarEdad(int edad){
        int duplicado=edad*2;
        return duplicado;
    }
}
