package polimorfismo;
import java.util.Scanner;
public class Reto4 {
    
    static Scanner leer=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int opcion1=1, opcion2;

        Cuadrado ejercicio1=new Cuadrado();
        Circulo ejercicio2=new Circulo();
        Triangulo ejercicio3=new Triangulo();
        Rectangulo ejercicio4=new Rectangulo();

        while (opcion1 == 1){
            System.out.println("A cual figura quiere hallerle el area: 1.Cuadrado 2.Circulo 3.Triangulo 4.Rectangulo");
            opcion2= leer.nextInt();

            if (opcion2==1){
                ejercicio1.calcularArea();
            }
            else if (opcion2 == 2){
                ejercicio2.calcularArea();
            }
            else if (opcion2 ==3){
                ejercicio3.calcularArea();
            }
            else if (opcion2 ==4){
                ejercicio4.calcularArea();
            }
            else{
                System.out.println("Error");
            }
            System.out.println("Quiere escoger otra opcion 1.Si 2.No");
            opcion1=leer.nextInt();
        }
}
}