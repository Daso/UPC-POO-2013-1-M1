
package models;

import Interfases.IImprimible;
import java.util.ArrayList;

public class Cliente implements IImprimible{
    private String name;
    ArrayList<Mascota> mascotas;

    public Cliente(String name) {
        this.name = name;
        mascotas = new ArrayList<Mascota>();
    }
    
    public void addMascota(Mascota mascota){
        mascotas.add(mascota);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    @Override
    public String imprimirme() {
        return "Mi nombre es: " + name;
    }
    
   
    
    
}
