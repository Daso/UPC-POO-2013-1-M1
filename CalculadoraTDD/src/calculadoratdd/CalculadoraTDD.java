
package calculadoratdd;


public class CalculadoraTDD {

    
    public int suma(int a, int b){
        return a + b;
    }
    
    public int resta(int a, int b){
        return a - b;
    }
    
    public int multiplica(int a, int b){
        return a * b;
    }
   
    public boolean esCero(int a){        
        if (a == 0){
            return true;
        }else{
            return false;
        }                   
    }
    
    public int dividir(int a, int b){                
        if (esCero(b)){
            return 0;
        }else{
            return a / b;
        }        
    }
    
    public static void main(String[] args) {
       
    }
}
