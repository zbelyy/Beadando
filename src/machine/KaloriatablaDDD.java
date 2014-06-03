/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package machine;

import beadando.Kaja;
import beadando.Kapcsolo;
import beadando.Napszak;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zbocskay
 */
public interface KaloriatablaDDD {
    
    /*megvizsgálja, hogy létezik e már a kaja*/
    public boolean letezik(Kaja kaja);
    
    /* csekkolja, hogy van e a megadott dátum alatt bejegyzés*/
    public boolean vane(String s);
    
    /*visszaadja az összes kaját*/
    public ArrayList<Kaja> getKajak();
    
    /*vissza adja a kaját azonosító alapján*/
    public Kaja getKajabyazon(int azon, int x);
    
    /*felvesz egy új kaját az adatbázisba*/
    public Kaja saveKaja(Kaja kaja);
    
    /*felvesz egy kaját egy adott dátumra*/
    public Kapcsolo setKajabyDate(Kapcsolo kapcsolo);
    
    /*visszadja az adott nap elfogyasztott kajákat*/
    public String getKajabyDate(String date);
    
    /*visszadja a napszakot id alapján*/
    public Napszak getNapszak(int id);
        
}
