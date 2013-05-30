
package pagos;


public class Servicio extends Pago{
  private String nombreDelMes;

    public Servicio(String nombreDelMes, String nombre, double monto) {
        super(nombre, monto);
        this.nombreDelMes = nombreDelMes;
    }

    public String getNombreDelMes() {
        return nombreDelMes;
    }

    public void setNombreDelMes(String nombreDelMes) {
        this.nombreDelMes = nombreDelMes;
    }

    @Override
    public double pagoNeto() {
        return this.monto + (this.monto * 0.12);
    }
  
  
}
