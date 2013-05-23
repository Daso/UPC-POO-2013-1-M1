package calculadoratdd;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;


public class CalculadoraTDDTest {
    
    private CalculadoraTDD miCalculadora;
    
    public CalculadoraTDDTest() {
        miCalculadora = new CalculadoraTDD();
    }

    @Test
    public void siSumo3Y2DebeDar5() {      
       Assert.assertEquals(5, miCalculadora.suma(3,2));       
    }
    
    @Test
    public void siSumo7y0DebeDar7(){       
       Assert.assertEquals(7, miCalculadora.suma(7,0));   
    }
    
    @Test
    public void siResto5de10DebeDar5(){
        Assert.assertEquals(5, miCalculadora.resta(10, 5));
    }
    
    @Test
    public void siMultiplico5y3DebeDar15(){
        Assert.assertEquals(15, miCalculadora.multiplica(5, 3));
    }
    
    @Test
    public void siElNumeroEs0DebeDarVerdadero(){
        Assert.assertTrue(miCalculadora.esCero(0));
    }
    
    @Test
    public void siElNumeroNoEs0DebeDarFalso(){
        Assert.assertFalse(miCalculadora.esCero(6));
    }
    
    @Test
    public void siDividoEntre0DebeDarme0(){
        Assert.assertEquals(0,miCalculadora.dividir(3,0));
    }
    
    @Test
    public void siDivido3Entre9DebeDarme3(){
        Assert.assertEquals(3,miCalculadora.dividir(9,3));
    }
}

