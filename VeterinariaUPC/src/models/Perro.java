
package models;


public class Perro extends Mascota{
    private String tamanho;   

    public Perro(String tamanho, String nombre) {
        super(nombre);
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String imprimirme() {
        return "Guau " + nombre;
    }
    
   
    
}
