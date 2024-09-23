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
public class Programa06 {
     public static void main(String arg[])
 {
    String Empleado,Cargo;
    Double Ingreso,Gasto,Mensual, Bimestral,Semestral , Anual;
   
   
     Scanner lectura  = new Scanner(System.in);
    System.out.print("Nombre de Empleado :");
    Empleado = lectura.next();
    System.out.print("Nombre de Cargo :");
    Cargo = lectura.next();
       System.out.print("Ingresos del empleado:");
    Ingreso = lectura.nextDouble();
       System.out.print("Gastos del empleado:");
    Gasto = lectura.nextDouble();
    
    Mensual = Ingreso - Gasto;
    Bimestral = Mensual * 2;
    Semestral = Mensual * 6;
    Anual = Mensual * 12;

    System.out.println("Ahorro Mensual :" + Mensual);
       System.out.println("Ahorro Bimestral :" + Bimestral);
        System.out.println("Ahorro Semestral :" + Semestral);
        System.out.println("Ahorro Anual :" + Anual);
 }
}
