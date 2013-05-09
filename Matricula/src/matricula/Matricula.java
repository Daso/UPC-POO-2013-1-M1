
package matricula;

public class Matricula {

  
    public static void main(String[] args) {
        
        Alumno alumno01 = new Alumno("001", "Carlos", "Perez");
        Alumno alumno02 = new Alumno("002", "Fernando", "Torres");
        System.out.println(alumno01.saludar());
        System.out.println(alumno02.saludar());
       
    }
}
