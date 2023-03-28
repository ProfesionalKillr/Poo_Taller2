package salud;
import java.util.Scanner;
public class Persona {
    int tipoDoc, documento, edad, sexo;
    String nombre,apellido;
    Double peso, estatura,pesoActual, pesoActual1;
    
    Scanner leer =new Scanner(System.in);
    
    public void pedirDatos(){
        System.out.println("Escoja su tipo de documento (1.Tarjeta de Identidad 2.Cedula de Ciudadania 3.Pasaporte Extranjero): ");
        tipoDoc=leer.nextInt();
        System.out.println("Digite su numero de documento: ");
        documento=leer.nextInt();
        System.out.println("Escriba su nombre: ");
        nombre=leer.next();
        System.out.println("Escriba su apelldo: ");
        apellido=leer.next();
        System.out.println("Digite su peso en kilogramos: ");
        peso=leer.nextDouble();
        System.out.println("Digite su estatura en metros: ");
        estatura=leer.nextDouble();
        System.out.println("Escriba su edad: ");
        edad=leer.nextInt();
        System.out.println("Escoja su genero (1.Masculino 2.Femenino): ");
        sexo=leer.nextInt();
    }
    public void mostrarPersona(){
        System.out.println("Sus datos son: ");
        System.out.println("Tipo de documento: " + tipoDoc + " ,Su documento " + documento + " ,Su nombre " + nombre + " ,Su Apellido " + apellido + " ,Su peso " + peso + " ,Su estatura " + estatura + " ,Su edad " + edad + " ,Y su genero " + sexo);
    } 
    public void calcularlmc(){
        pesoActual1= peso/estatura;
        pesoActual = Math.pow(pesoActual1,2);
        if (pesoActual<20){
            System.out.println("El peso esta por debajo de lo ideal");
        }
        else if (pesoActual>=20 && pesoActual<=25){
            System.out.println("El peso es ideal");
        }
        else if(pesoActual>25){
            System.out.println("Tiene sobrepeso");
        }
    }
    public void mayorEdad(){
        if(edad>=18){
            System.out.println("Es mayor de edad");
        }
        else{
            System.out.println("Es menor de edad");
        }
    }
}
