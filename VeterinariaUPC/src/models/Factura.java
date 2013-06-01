
package models;

import Interfases.IImprimible;


public class Factura implements IImprimible{
    private String RUC;
    private double monto;

    public Factura(String RUC, double monto) {
        this.RUC = RUC;
        this.monto = monto;
    }

    @Override
    public String imprimirme() {
        return "Factura por " + monto;
    }
    
   
}
