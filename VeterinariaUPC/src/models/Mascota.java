
package models;

import Interfases.IImprimible;


public abstract class Mascota implements IImprimible {
    protected String nombre;
    protected boolean vacunado;
    protected String tipo_vacuna;

    public Mascota(String nombre) {
        this.nombre = nombre;
        this.vacunado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }

    public String getTipo_vacuna() {
        return tipo_vacuna;
    }

    public void setTipo_vacuna(String tipo_vacuna) {
        this.tipo_vacuna = tipo_vacuna;
    }
    
    
    
}
