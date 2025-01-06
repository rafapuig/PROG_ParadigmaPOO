package imports;

// Declaración de importación de una única clase, la clase Scanner que pertenece al paquete java.util
import java.util.Scanner;

// Importación estática a demanda de todas los miembros estáticos declarados en la clase Math del paquete java.lang
import static java.lang.Math.*;

// Importación estática de un único miembro estático, el campo out de la clase System perteneciente al paquete java.lang
import static java.lang.System.out;

public class ImportsDemo {

    // Usamos el nombre simple Scanner gracias a que hemos importado el tipo
    // No podemos usar directamente el campo in de la clase System porque solamente importamos el campo out
    // Lo que su usamos es directamente el nombre de la clase System porque el paquete java.lang
    // es importado bajo demanda automáticamente por el compilador de java
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Usamos directamente el campo estático out de la clase System gracias a la importación estática
        out.println("Introduce el radio de la circunferencia:");

        double radius = scanner.nextDouble();

        // Usamos directamente el campo estático PI y el método estático pow gracias a la importación a demanda de
        // todos los miembros de la clase Math del paquete java.lang
        double area = PI * pow(radius, 2);

        // Usamos directamente el nombre simple String de la clase String del paquete java.lang
        // precisamente porque el compilador importa todos los tipos declarados en ese paquete bajo demanda
        String message = "El area del círculo de radio " + radius + " es " + area;

        out.println(message);
    }
}
