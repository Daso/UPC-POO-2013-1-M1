
package models;

import Interfases.IImprimible;


public class Gato extends Mascota{

    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public String imprimirme() {
        return "Miau " + nombre;
    }
    
}
