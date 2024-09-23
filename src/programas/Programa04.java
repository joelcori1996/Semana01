/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programas;

/**
 *
 * @author PRV
 */
import java.util.Scanner;
public class Programa04 {
     public static void main(String arg[])
 {
     
    String cliente,Producto;
    Double Precio,SubTotal,IGV, TotalPagar;
    Integer Cantidad;
   
     Scanner lectura  = new Scanner(System.in);
    System.out.print("Ingrese Nombre de Cliente:");
    cliente = lectura.next();
    System.out.print("Ingrese el producto:");
    Producto = lectura.next();
    System.out.print("Ingrese Precio:");
    Precio = lectura.nextDouble();
     System.out.print("Ingrese Cantidad:");
     Cantidad = lectura.nextInt();
     
     SubTotal = Precio * Cantidad;
     IGV = (SubTotal*18)/100;
     TotalPagar = SubTotal + IGV;
     
     System.out.println("Subtotal:" + SubTotal);
         System.out.println("IGV:" + IGV);
   System.out.println("Total Pagar:" + TotalPagar);
 }
}
