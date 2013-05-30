
package pagos;

public class Otros extends Pago{

    public Otros(String nombre, double monto) {
        super(nombre, monto);
    }

    @Override
    public double pagoNeto() {
        return this.monto;
    }
    
}
