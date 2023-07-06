package clase10;

import java.util.Scanner;

public class ejercicio4clase10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero como calificacion");
        var calificacion = input.nextInt();
        
        switch (calificacion) {
            case 9: case 10:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                if (calificacion >= 0 && calificacion < 6){
            System.out.println("F");
        }
                else {
            System.out.println("Calificacion no encontrada");
        }
                break;
        }
    }
}