/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author franciscojavier.mart
 */
public class FechasEquivalenciaBeforeAfterTest {
    
    private FechasEquivalenciaBeforeAfterTest instance;
    
    public FechasEquivalenciaBeforeAfterTest() {
    }
    
    @Before
    public void setUp() {
        
        instance = new FechasEquivalenciaBeforeAfterTest();
        System.out.println("Before");
    }
    
    @After
    public void tearDown() {
        
        instance = null;
        System.out.println("After");
    }

    @Test
    public void testEsFacturaCorrectaEnFecha() throws Exception {
        System.out.println("esFacturaCorrectaEnFecha");
        String fechaFactura = "2021-05-28";
        Fechas instance = new Fechas();
        int expResult = 0;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testEsFacturaCorrectaEnFecha2() throws Exception {
        System.out.println("esFacturaCorrectaEnFecha");
        String fechaFactura = "2022-05-28";
        Fechas instance = new Fechas();
        int expResult = 1;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testEsFacturaCorrectaEnFecha3() throws Exception {
        System.out.println("esFacturaCorrectaEnFecha");
        String fechaFactura = "2001-05-28";
        Fechas instance = new Fechas();
        int expResult = -1;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
}
