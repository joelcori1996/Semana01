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
public class Programa05 {
     public static void main(String arg[])
 {
     
   
    Double Sueldo1,Sueldo2,Sueldo3, Sueldo4,Sueldo5 , Total, Promedio;
   
   
     Scanner lectura  = new Scanner(System.in);
    System.out.print("Ingrese Sueldo 1:");
    Sueldo1 = lectura.nextDouble();
      System.out.print("Ingrese Sueldo 2:");
    Sueldo2 = lectura.nextDouble();
      System.out.print("Ingrese Sueldo 3:");
    Sueldo3 = lectura.nextDouble();
      System.out.print("Ingrese Sueldo 4:");
    Sueldo4 = lectura.nextDouble();
      System.out.print("Ingrese Sueldo 5:");
    Sueldo5 = lectura.nextDouble();
 
    Total = Sueldo1 + Sueldo2 + Sueldo3 + Sueldo4 + Sueldo5;
    Promedio = Total/5;
    System.out.println("\n");
    System.out.println("Total de Sueldo :" + Total);
    System.out.println("Promedio de Sueldo:" + Promedio);
 
 }
}
