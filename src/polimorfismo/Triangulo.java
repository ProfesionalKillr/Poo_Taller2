package polimorfismo;
import java.util.Scanner;
public class Triangulo extends figura{
    static Scanner leer=new Scanner (System.in);

    private float base,altura;

    public float getBase(){
        return base;
    }
    public void setBase(float base){
        this.base = base;
    }
    public float getAltura(){
        return altura;
    }
    public void setAltura(float altura){
        this.altura = altura;
    }


    @Override
    public void calcularArea() {
        System.out.println("Digite la base del triangulo: ");
        base=leer.nextFloat();
        System.out.println("Digite la altura del triangulo: ");
        altura=leer.nextFloat();
        float area=base*altura/2;
        System.out.println("La base del triangulo es: " + base + " La altura del triandulo es: " + altura + " Y el area es: " + area);
    }
}
