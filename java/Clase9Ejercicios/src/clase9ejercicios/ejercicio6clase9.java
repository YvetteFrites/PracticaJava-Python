
package clase9ejercicios;

import java.util.Scanner;

public class ejercicio6clase9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float guille,luis,juan,total;

        System.out.println("Ingrese la cantidad de dinero de Guillermo");
        guille = input.nextInt();

        luis = guille / 2;
        juan = (luis + guille) / 2;
        total = luis + guille + juan;

        System.out.println("El dinero de Luis es: " + luis);
        System.out.println("El dinero de Juan es: " + juan);

        System.out.println("El total entre los 3 es: " + total);
    }
}
