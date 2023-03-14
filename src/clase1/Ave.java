package clase1;

public class Ave extends Animal{

    //Atributos propios
    private String envergadura;

    //Metodo constructor

    public Ave(){

    }

    public Ave(String nombre, int edad, String envergadura){
        super(nombre,edad);
        this.envergadura=envergadura;
    }

    //metodos accesores getters y setters
    public String getEnvergadura() {
        return envergadura;
    }

    public void setEnvergadura(String envergadura) {
        this.envergadura=envergadura;
    }

    //metodos propios

    public void mostrarAve(){
        System.out.println("El nombre del animal es: " + getNombre() + " tiene" + getEdad() + " años y La envergadura del ave es: " + this.envergadura);
    }
    
}
