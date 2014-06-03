/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import beadando.ConnectionHandler;
import beadando.Kaja;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import machine.KaloriatablaDDD;
import machine.KaloriatablaDDDImpl;
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
    protected Connection conn = ConnectionHandler.getConnection();
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
        String sql = String.format("delete from Kaja where nev='Kaja1'");
        try{
            Statement load = conn.createStatement();
            load.executeQuery(sql);
        }catch(SQLException e){
            Logger.getLogger(Kaja.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    @Test
    public void AddKajaTest() throws ClassNotFoundException{
        KaloriatablaDDD ddd = new KaloriatablaDDDImpl();
        Kaja kaja1 = new Kaja("Kaja1",100,100,100);
        ddd.saveKaja(kaja1);
        ArrayList<Kaja> kajaList = ddd.getKajak();
        assertEquals(true, kajaList.contains(kaja1));
    }
    
    @Test
    public void AddKajaTestKetszer() throws ClassNotFoundException{
        KaloriatablaDDD ddd = new KaloriatablaDDDImpl();
        Kaja kaja1 = new Kaja("Kaja1",100,100,100);
        assertEquals(kaja1, ddd.saveKaja(kaja1));
        assertEquals(null, ddd.saveKaja(kaja1));
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
