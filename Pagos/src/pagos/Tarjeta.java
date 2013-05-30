
package pagos;


public class Tarjeta extends Pago{
    
  private String numeroDeTarjeta;

    public Tarjeta(String numeroDeTarjeta, String nombre, double monto) {
        super(nombre, monto);
        this.numeroDeTarjeta = numeroDeTarjeta;
    }

    public String getNumeroDeTarjeta() {
        return numeroDeTarjeta;
    }

    public void setNumeroDeTarjeta(String numeroDeTarjeta) {
        this.numeroDeTarjeta = numeroDeTarjeta;
    }

    @Override
    public double pagoNeto() {
       return (this.monto + (this.monto * 0.1) + 12);
    }
  
  
    
}
