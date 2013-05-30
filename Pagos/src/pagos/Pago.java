
package pagos;

public abstract class Pago {
   protected String nombre;
   protected double monto;
   
    public Pago(String nombre, double monto) {
        this.nombre = nombre;
        this.monto = monto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    public abstract double pagoNeto();
    
    public double igv(){
        return pagoNeto() * 0.18;
    }
    
   
   
   
}
