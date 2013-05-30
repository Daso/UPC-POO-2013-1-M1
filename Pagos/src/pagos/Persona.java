
package pagos;

import java.util.ArrayList;


public class Persona {
private String nombre;
private ArrayList<Pago> pagos;

public Persona(String nombre) {
  this.nombre = nombre;
  pagos = new ArrayList<Pago>();
}

public void agregarPago(Pago pago){
    pagos.add(pago);
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Pago> getPagos() {
        return pagos;
    }


  
}
