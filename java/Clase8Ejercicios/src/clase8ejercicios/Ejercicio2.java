package clase8ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1,num2;

        System.out.println("Digite dos numeros");
        num1 = input.nextInt();
        num2 = input.nextInt();

        if (num1 == num2){
            System.out.println("Numeros iguales");
        }
        else{
            if (num1 > num2){
            System.out.println("El numero mayor es:  "+num1);
            }
            else{
            System.out.println("El numero mayor es:  "+num2);    
            }
        }
    }
}
