package clase9ejercicios;

import java.util.Scanner;

public class ejercicio7clase9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int salario = 1000;
        int comision = 150, venta;
        float precioauto, totalprecio, porcVenta, salariomensual;

        System.out.println("Ingrese la cantidad de autos vendidos");
        venta = input.nextInt();
        System.out.println("Ingrese el precio de los autos vendidos");
        precioauto = input.nextInt();

        comision *= venta;
        totalprecio = precioauto * venta;
        porcVenta = totalprecio * 0.05f;
        salariomensual = salario + comision + porcVenta;

        System.out.println("El salario mensual es: " + salariomensual);
    }
}