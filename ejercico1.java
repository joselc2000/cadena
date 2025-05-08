import java.util.Scanner;
public class Cadena {
    public static void main(String[] args){
        Scanner almacenar = new Scanner(System.in);
        System.out.println("Escribe tu nombre:");
        String nombres = almacenar.nextLine();
        System.out.println("Escribe tus apellidos:");
        String apellidos = almacenar.nextLine();
        System.out.println("Tu nombre completo es: " + nombre + apellidos);
    }
}