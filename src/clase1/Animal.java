package clase1;
import java.util.Scanner;
public class Animal {
    //Atributos
    public String nombre;
    public int edad;
    //Metodo constructor
    
    Scanner leer=new Scanner(System.in);

    //Metodos accesores
    public int getEdad(){//Metodo get o getter
        return edad;
    }

    public void setEdad(int edad){//Metodo set o setter
        this.edad=edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    //Metodos u operaciones

    

    public Animal() {
    }
    
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

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
