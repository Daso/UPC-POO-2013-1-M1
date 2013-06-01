
package views;

import controllers.FactoryModels;
import controllers.Impresora;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Reportes {
    
   public static void menu(){
       System.out.println("Reportes");
       System.out.println("-------------------");
       System.out.println("1) Gato");
       System.out.println("2) Perrito");
       System.out.println("3) Usuario");
       System.out.println("4) Factura");
       System.out.println("5) Aves");
       System.out.println("6) Esclavos");
       System.out.println("Ingrese su opción");
       
   } 
   
   public static void leerOpcion(){
       char opcion = ' ';       
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       menu();
       try {
           
           opcion = in.readLine().charAt(0);
           
           
       } catch (Exception e) {
       }
       FactoryModels.procesarOpcion(opcion);
   
   }   
}
