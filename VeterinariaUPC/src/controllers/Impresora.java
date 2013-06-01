
package controllers;

import Interfases.IImprimible;



public class Impresora {
   public static void imprimir(IImprimible imprimible){
     System.out.println( imprimible.imprimirme());
     
   }       
}
