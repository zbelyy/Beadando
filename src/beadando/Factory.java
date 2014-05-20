/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beadando;

import java.util.ArrayList;

/**
 *
 * @author zbocskay
 */
public class Factory {
    
    protected static ArrayList<Kaja> kajalista = new ArrayList<>();
    
    /**
     * 
     * Léterhozza az új kaja objektumot
     */
    public static void newKaja(int id, String Nev, int Kaloria, int Feherje, int Szenhidrat){
        kajalista.add(new Kaja(id,Nev,Kaloria,Feherje,Szenhidrat));
    }
    
    public static void newKapcsolo(){
        
    }
    
    public static void newNapszak(){
        
    }
    
    public static void newUser(){
        
    }
    
    public static ArrayList<Kaja> getKajak(){
        return kajalista;
    }
    /**
     * Memóriába tölti be az adatbázisban lévő adatokat
     */
    public static void loadKajak(){
        //kajalista = sql eredményt;
    }
    
    /**
     * Az adatbázisba menti le a memóriában lévő adatokat.
     */
    public static void saveKajak(){
        for(Kaja item : kajalista){
            item.save();
        }
        
    }
    
    /*public static ArrayList<Kapcsolo> getKapcsolok(){
        retrun null;
    }*/
    
}
