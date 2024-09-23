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
public class Programa03 {
 public static void main(String arg[])
 {
     
     int vt1,vt2,vt3;
     double sm,pt,c ;
     String vendedor;
     Scanner lectura = new Scanner(System.in);
     System.out.print("Nombre de Vendedor:");
     vendedor=lectura.next();
     System.out.print("Sueldo Mensual:");
     sm=lectura.nextDouble();
     System.out.print("Venta 1:");
     vt1=lectura.nextInt();
     System.out.print("Venta 2:");
     vt2=lectura.nextInt();
     System.out.print("Venta 3:");
     vt3=lectura.nextInt();
     c=(vt1+vt2+vt3)*0.10;
     pt=sm+c;
     
     System.out.println("La comision de la venta es        :"+c);
     System.out.println("El sueldo mensual del vendedor es :"+pt );
     
     
  
 }
}
