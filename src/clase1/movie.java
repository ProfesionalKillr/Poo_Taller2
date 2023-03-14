package clase1;
public class movie {
    private String name, categoty;
    private int year;
    public int duration;
    public static void main(String[]args) {
        
    }
    public movie() {
    }
    public movie(String name, String categoty, int year, int duration) {
        this.name = name;
        this.categoty = categoty;
        this.year = year;
        this.duration = duration;
    }
    public void mostrarMovie(String name, String categoty, int year, int duration){
        System.out.println("El nombre de la pelicula es: " + name + " La categoria de la pelicula es: " + categoty + " El año de estreno de la pelicula es: " + year + " El tiempo de duracion de la pelicula es: " + duration);
    }
    public void setName(String nombre){
        name=nombre;
    }
    public String getName(){
        return name;
    }
    public void setCategory(String category){
        categoty=category;
    }
    public String getCategory(){
        return categoty;
    }
}
