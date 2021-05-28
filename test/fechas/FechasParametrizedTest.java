/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author franciscojavier.mart
 */

@RunWith(value = Parameterized.class)
public class FechasParametrizedTest {
    
    private String cadena;
    private int resultado;
    
    public FechasParametrizedTest(String cadena, int resultado) {
        this.cadena = cadena;
        this.resultado = resultado;
    }

    @Parameters
    public static Iterable<Object> getData(){
       
        List<Object> obj = new ArrayList<>();
       
        obj.add(new Object[]{"2021-05-28", 0});
        obj.add(new Object[]{"2001-05-28", -1});
        obj.add(new Object[]{"2022-05-28", 1});
        obj.add(new Object[]{"2021-05-27", -1});
        obj.add(new Object[]{"2021-05-29", 1});
        
        return obj;
    }
    
    
     @Test
    public void testEsFacturaCorrectaEnFecha3() throws Exception {
        System.out.println("esFacturaCorrectaEnFecha");
        String fechaFactura = cadena;
        Fechas instance = new Fechas();
        int expResult = resultado;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
}
