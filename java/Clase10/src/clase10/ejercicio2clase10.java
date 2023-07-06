package clase10;

import java.util.Scanner;

public class ejercicio2clase10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el mes del año");
        var mes = input.nextInt();
        var estacion = "Estacion desconocida";
        
        switch (mes) {
            case 1: case 2: case 3:
                estacion = "Verano";
                break;
            case 4: case 5: case 6:
                estacion = "Otoño";
                break;
            case 7: case 8: case 9:
                estacion = "Invierno";
                break;
            case 10: case 11: case 12:
                estacion = "Primavera";
                break;
            default:
                break;
        }

        System.out.println("La estacion es: " + estacion);
    }
}