/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import beadando.Kaja;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author zbocskay
 */
public class BeadandoJUnitTest {
    
    public BeadandoJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @Test
    public void Proba1() throws ClassNotFoundException{
        Kaja k = new Kaja(1,"Zaba",120,21,2);
        assertEquals("teszt", 120, k.getKaloria());
        assertEquals(k.getClass(), Kaja.class);
    }
    
    @Test
    public void RowTest(){
//        Kaja k = new Kaja();
//        k.getKaja();
//        assertEquals(k.getKajalista().size(), 27);
        
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
