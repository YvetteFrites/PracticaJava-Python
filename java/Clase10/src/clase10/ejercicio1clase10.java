package clase10;

import java.util.Scanner;

public class ejercicio1clase10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el mes del año");
        var mes = input.nextInt();
        var estacion = "Estacion desconocida";
        
        if (mes==1 || mes==2 || mes==3){
            estacion = "Verano";
        }
        else if (mes==4 || mes==5 || mes==6){
            estacion = "Otoño";
        }
        else if (mes==7 || mes==8 || mes==9){
            estacion = "Invierno";
        }
        else if (mes==10 || mes==11 || mes==12){
            estacion = "Primavera";
        }

        System.out.println("La estacion es: " + estacion);
    }
}