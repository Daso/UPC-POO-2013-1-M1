
package matricula;


public class Alumno {
    private String codigo;
    private String nombre;
    private String apellido;

    public Alumno(String codigo, String nombre, String apellido) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    
    
    public String saludar(){
        return "Hola, soy " + nombre + " " + apellido;
    }
    
}
