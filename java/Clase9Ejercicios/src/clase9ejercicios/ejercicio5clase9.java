
package clase9ejercicios;

import java.util.Scanner;

public class ejercicio5clase9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la primera calificación:");
        double calificacion1 = scanner.nextDouble();

        System.out.println("Ingrese la segunda calificación:");
        double calificacion2 = scanner.nextDouble();

        System.out.println("Ingrese la tercera calificación:");
        double calificacion3 = scanner.nextDouble();

        double suma = calificacion1 + calificacion2 + calificacion3;

        System.out.println("La suma de las calificaciones es: " + suma);
    }
}