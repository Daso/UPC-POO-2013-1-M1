
package pagos;

import java.util.ArrayList;

public class Pagos {

    public static void main(String[] args) {
       Tarjeta pago01 = new Tarjeta("0923444", "BCP", 109.00);
       Servicio pago02 = new Servicio("Mayo", "Leche", 200.00);
       Otros pago03 = new Otros("Alquiler", 250.00);
       Persona persona01 = new Persona("Carlos");
       
       persona01.agregarPago(pago01);
       persona01.agregarPago(pago02);
       persona01.agregarPago(pago03);
       
       ArrayList<Pago> pagos;
       pagos = persona01.getPagos();
       double total = 0;
       for (Pago pago : pagos){
           System.out.println(pago.getMonto());
           total = total + pago.getMonto();
       }
       
       System.out.println(total);
       /*
       System.out.println(pago01.getNombre());
       System.out.println(pago02.getNombre());
       
       System.out.println(pago01.pagoNeto());
       System.out.println(pago02.pagoNeto());
       
       System.out.println(pago01.igv());
       System.out.println(pago02.igv());
       */
    }
}
