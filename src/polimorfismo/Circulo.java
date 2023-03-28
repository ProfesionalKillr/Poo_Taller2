package polimorfismo;
import java.util.Scanner;
public class Circulo extends figura{
    static Scanner leer=new Scanner (System.in);

    private double radio;

    public double getRadio(){
        return radio;
    }
    public void setRadio(double radio){
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        System.out.println("Digite el radio del circulo: ");
        radio=leer.nextFloat();
        radio=Math.pow(radio,2);
        double area=3.1416*radio;
        System.out.println("El radio del circulo es: " + radio + " Y el area es: " + area);
        
    }
}
