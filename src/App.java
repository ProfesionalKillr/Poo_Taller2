import clase1.movie;
import clase1.Ave;
import clase1.Animal;

public class App {
    public static void main(String[] args) {
        
        Animal tigre=new Animal();
        Ave condorito=new Ave();

        condorito.setNombre("Condorito");
        condorito.setEdad(50);
        condorito.setEnvergadura("300cm");

        condorito.mostrarAve();
        
        
        /*movie avatar= new movie();
        avatar.setName("Avatar");
        System.out.println("El nombre de la pelicula es : " + avatar.getName());
        avatar.setCategory("Accion");
        System.out.println("El nombre de la categoria es: " + avatar.getCategory());*/

    }
}
