package libreria;

import java.util.Scanner;

public class Libreria {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese los siguientes datos del libro");

        System.out.println("Digite el nombre del libro");
        String nombre = entrada.nextLine();
        System.out.println("Digite el ID del libro");
        int idlibro = Integer.parseInt(entrada.nextLine());
        System.out.println("Digite el precio del libro");
        double precio = Double.parseDouble(entrada.nextLine());
        System.out.println("Indicar si el envío es gratuito (true/false)");
        boolean envio = Boolean.parseBoolean(entrada.nextLine());
        
        System.out.println("");
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + idlibro);
        System.out.println("Precio: " + precio);
        System.out.println("¿El envio es gratuito?: " + envio);
    }
    
}
