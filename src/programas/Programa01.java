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
public class Programa01 {
 public static void main(String arg[])
 {
     String empleado;
     double ingreso,gasto,ahorrom,ahorroa;
     Scanner lectura  = new Scanner(System.in);
     System.out.print("Nombre de empleado: ");
     empleado = lectura.next();
     System.out.print("Ingresos del empleado: ");
     ingreso = lectura.nextDouble();
     System.out.print("Gastos del empleado: ");
     gasto=lectura.nextDouble();
     
     ahorrom=ingreso-gasto;
     ahorroa= ahorrom*12;
     System.out.println("Ahorro Mensual: " + ahorrom);
     System.out.println("Ahorro Anual: " + ahorroa);
     
 }
}
