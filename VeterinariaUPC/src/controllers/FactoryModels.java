
package controllers;

import Interfases.IImprimible;
import models.Ave;
import models.Cliente;
import models.Esclavo;
import models.Factura;
import models.Gato;
import models.Perro;

public class FactoryModels {
    
    public static void procesarOpcion(char opcion){
        IImprimible objeto = null; 
        switch(opcion){
            case '1':
               objeto = new Gato("Satan");
              
               break;
            case '2':
               objeto = new Perro("Grande", "Fifi");
               
               break;
                
            case '3':
               objeto = new Cliente("Carlos"); 
                                  
                break;
                
            case '4':    
               objeto = new Factura("09312312333", 200);
               
               break;
               
           case '5':    
              objeto = new Ave();
             
               break;
            case '6':    
               objeto = new Esclavo();
              
        }
         Impresora.imprimir(objeto);
        
    }
    
}
