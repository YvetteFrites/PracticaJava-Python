package clase8ejercicios;

import java.util.Scanner;
        
public class Ejercicio1 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int area,perimetro,base,altura;

        System.out.println("Digite la base del rectangulo");
        base = input.nextInt();

        System.out.println("Digite la altura del rectangulo");
        altura = input.nextInt();

        area=base*altura;
        perimetro=(base+altura)*2;

        System.out.println("El perimetro es: "+perimetro+" cm");
        
        System.out.println("El área del rectangulo es: "+area+" cm2");
    }
}


