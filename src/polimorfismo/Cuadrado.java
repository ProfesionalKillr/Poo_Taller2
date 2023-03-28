package polimorfismo;

public class Cuadrado extends figura {

    private float lado;//Atributo encapsulado

    //Metodos accesores get y sett
    public float getLado(){
        return lado;
    }
    public void setLado(float lado){
        this.lado = lado;
    }

    //sobrescritura metodo calcularArea()
    @Override
    public void calcularArea() {
        // area del cuadrado
        float area=lado*lado;
        System.out.println("El lado del cuadrado es: " + lado + " El area es: " + area);
            
    }
}