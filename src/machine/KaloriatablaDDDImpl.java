/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package machine;

import beadando.ConnectionHandler;
import beadando.Kaja;
import beadando.Kapcsolo;
import beadando.Napszak;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.Exception;

/**
 *
 * @author zbocskay
 */
public class KaloriatablaDDDImpl extends ConnectionHandler implements KaloriatablaDDD {
    protected Connection conn = ConnectionHandler.getConnection();
    
    @Override
    public ArrayList<Kaja> getKajak(){
        ArrayList<Kaja> kajalista = new ArrayList<>();
        String SQLText = "select * from kaja";
        try{

            Statement stmnt = conn.createStatement();
            ResultSet rs = stmnt.executeQuery(SQLText);
            while (rs.next()) { 
                kajalista.add( new Kaja(rs.getString("Nev"),rs.getInt("Kaloria"), rs.getInt("Feherje"), rs.getInt("Szenhidrat")));
            } 

        } catch (SQLException ex) {
            Logger.getLogger(Kaja.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        return kajalista;
    }
    
    @Override
    public Kaja getKajabyazon(int azon) {
        String SQLText = String.format("select * from kaja where id=%d", azon);
        try{
            Statement stmnt = conn.createStatement();
            ResultSet rs = stmnt.executeQuery(SQLText);
            rs.next();
            return new Kaja(rs.getInt("ID"),rs.getString("NEV"), rs.getInt("KALORIA"), rs.getInt("FEHERJE"), rs.getInt("SZENHIDRAT"));
        }catch(SQLException e){
            Logger.getLogger(Kaja.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }

    @Override
    public Kaja saveKaja(Kaja kaja) {
        String SQLText = String.format("insert into kaja (NEV,KALORIA,FEHERJE,SZENHIDRAT) values (?,?,?,?)");
        PreparedStatement save;
        Statement load;
        if(!this.letezik(kaja)){
                   try{
                        save = conn.prepareStatement(SQLText);
                        save.setString(1, kaja.getNev());
                        save.setInt(2, kaja.getKaloria());
                        save.setInt(3, kaja.getFeherje());
                        save.setInt(4, kaja.getSzenhidrat());
                        save.executeUpdate();
                        String sql = String.format("select id from kaja where rownum <= 1 order by id desc");
                        load = conn.createStatement();
                        ResultSet rs = load.executeQuery(sql);
                        rs.next();
                        kaja.setId(rs.getInt("ID"));
                        return kaja;
                      }catch(SQLException e){
                            Logger.getLogger(Kaja.class.getName()).log(Level.SEVERE, null, e);
                            return null;
                        }
        }else{
            return null;
            
        }        

    }

    @Override
    public Kapcsolo setKajabyDate(Kapcsolo kapcsolo) {
        String SQLText = String.format("insert into kapcsolo (NAPSZAKID,KAJAID,MENNYISEG,DATUM) values (?,?,?,?)");
        PreparedStatement save;
        Statement load;
        try{
            save = conn.prepareStatement(SQLText);
            save.setInt(1, kapcsolo.getNapszak().getId());
            save.setInt(2, kapcsolo.getKaja().getId());
            save.setFloat(3, kapcsolo.getMennyiseg());
            save.setString(4, kapcsolo.getDate());
            save.executeUpdate();
            String sql = String.format("select id from kapcsolo where rownum <= 1 order by id desc");
                        load = conn.createStatement();
                        ResultSet rs = load.executeQuery(sql);
                        rs.next();
                        kapcsolo.setId(rs.getInt("ID"));
            return kapcsolo;
        }catch (SQLException e){
            Logger.getLogger(Kapcsolo.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }

    @Override
    public ArrayList<Kapcsolo> getKajabyDate(String date) {
        ArrayList kajak = new ArrayList();
        Kapcsolo kapcs = new Kapcsolo();
        String SQLText = String.format("select * from kapcsolo where DATUM='%s'", date);
        try{
            Statement stmnt = conn.createStatement();
            ResultSet rs = stmnt.executeQuery(SQLText);
            while(rs.next()){
                kajak.add(new Kapcsolo(rs.kapcs.get));
            }
        }catch(SQLException e){
            Logger.getLogger(Kapcsolo.class.getName()).log(Level.SEVERE, null, e);            
        }
        return null;
    }

    @Override
    public boolean letezik(Kaja kaja) {
        for(Kaja item: getKajak()){
            if(item.equals(kaja))
                return true;
        }
        return false;
    }

    @Override
    public Napszak getNapszak(int id) {
        String SQLText = String.format("select * from napszak where id=%d", id);
        try{
            Statement stmnt = conn.createStatement();
            ResultSet rs = stmnt.executeQuery(SQLText);
            rs.next();
            return new Napszak(rs.getInt("ID"), rs.getString("NAPSZAK"));
        }catch(SQLException e){
            Logger.getLogger(Napszak.class.getName()).log(Level.SEVERE, null, e);
            
        }
        return null;
    }

    @Override
    public ArrayList<Napszak> load() {
                ArrayList<Napszak> napszakok = new ArrayList<>();
        String SQLText = String.format("select * from napszak");
        try{
            Statement stmnt = conn.createStatement();
            ResultSet rs = stmnt.executeQuery(SQLText);
            while(rs.next());{
                napszakok.add(new Napszak(rs.getInt("ID"), rs.getString("NAPSZAK")));
        }
        }catch(SQLException e){
            Logger.getLogger(Napszak.class.getName()).log(Level.SEVERE, null, e);
            
        }
        return null;
    }
    
}
