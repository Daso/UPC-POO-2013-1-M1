
package models;

import Interfases.IImprimible;


public class Esclavo implements IImprimible{
    private int numero;

    @Override
    public String imprimirme() {
        return "quiero ser libre";
    }
    
    
}
