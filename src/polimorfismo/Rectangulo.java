package polimorfismo;
import java.util.Scanner;
public class Rectangulo extends figura{
    static Scanner leer= new Scanner(System.in);

    private float alto,ancho;

    public float getAncho(){
        return ancho;
    }
    public void setAncho(float ancho){
        this.ancho = ancho;
    }

    public float getAlto(){
        return alto;
    }
    public void setAlto(float alto){
        this.alto = alto;
    }

    @Override
    public void calcularArea() {
        System.out.println("Digite el alto del rectangulo: ");
        alto=leer.nextFloat();
        System.out.println("Digite el ancho del rectangulo: ");
        ancho=leer.nextFloat();
        float area=alto*ancho;
        System.out.println("El alto del rectangulo es: " + ancho + " El ancho del rectangulo es: " + ancho + " Y el area es: " + area);
    }
}
