package clase1;
import java.util.Scanner;
public class prueba {
    public static void main(String[]args) {
        Scanner leer=new Scanner(System.in);
        Animal guacamayo=new Animal();

        System.out.println("Ingrese el nombre del animal:");
        String nombre=leer.nextLine();

        System.out.println("Ingrese la edad del animal:");
        int edad=leer.nextInt();


        guacamayo.registrarAnimal(nombre, edad);//invocar o llamar un metodo
        guacamayo.mostrarAnimal();
        guacamayo.duplicarEdad(edad);
    }
}
