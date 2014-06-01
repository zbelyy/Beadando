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
import java.lang.Exception;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zbocskay
 */
public class KaloriatablaDDDImpl extends ConnectionHandler implements KaloriatablaDDD {
    protected Connection conn = ConnectionHandler.getConnection();
    
    @Override
    public ArrayList<Kaja> getKajak(){
        ArrayList<Kaja> kajalista = new ArrayList<>();
        String SQLText = "select * from kaja order by NLSSORT(lower(NEV), 'NLS_SORT=west_european')";
        try{

            Statement stmnt = conn.createStatement();
            ResultSet rs = stmnt.executeQuery(SQLText);
            while (rs.next()) { 
                kajalista.add( new Kaja(rs.getInt("ID"),rs.getString("Nev"),rs.getFloat("Kaloria"), rs.getFloat("Feherje"), rs.getFloat("Szenhidrat")));
            } 

        } catch (SQLException ex) {
            Logger.getLogger(Kaja.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        return kajalista;
    }
    
    @Override
    public Kaja getKajabyazon(int azon, int x) {
        String SQLText = String.format("select * from kaja where id=%d", azon);
        try{
            Statement stmnt = conn.createStatement();
            ResultSet rs = stmnt.executeQuery(SQLText);
            rs.next();
            return new Kaja(rs.getInt("ID"),rs.getString("NEV"), rs.getFloat("KALORIA")*x/100, rs.getFloat("FEHERJE")*x/100, rs.getFloat("SZENHIDRAT")*x/100);
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
                        save.setFloat(2, kaja.getKaloria());
                        save.setFloat(3, kaja.getFeherje());
                        save.setFloat(4, kaja.getSzenhidrat());
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
            if(kapcsolo.getMennyiseg() != 0){
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
            }return kapcsolo;
        }catch (SQLException e){
            Logger.getLogger(Kapcsolo.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
        public String formatString(String s) {
        int limit = 20;
        StringBuilder sb = new StringBuilder();
        sb.append(s);

        if (sb.length() > limit - 1) {
            // ha nem fér ki 
            sb.setLength(limit - 4);
            sb.append("... ");
            return sb.toString();
        } else {
            // ha kifér 
            while (sb.length() < limit) {
                sb.append(" ");
            }
            return sb.toString();
        }

    }
    


    
        
    @Override
    public String getKajabyDate(String date) {
        ArrayList kajak = new ArrayList();
        String SQLText = String.format("select * from kapcsolo where DATUM='%s'", date);
        try{
            String szoveg;
            Statement stmnt = conn.createStatement();
            ResultSet rs = stmnt.executeQuery(SQLText);
            szoveg = String.format("Kaja név\tKalória\tFehérje\tSzénhidrát\tNapszak\tMennyiség\tDátum\n");
            
            while(rs.next()){
                    Kaja kaja = getKajabyazon(rs.getInt("KAJAID"), rs.getInt("MENNYISEG"));
                    szoveg += kaja.getNev()+ "\t"+kaja.getKaloria()+"\t"+kaja.getFeherje()+"\t"+kaja.getSzenhidrat()+"\t"+getNapszak(rs.getInt("NAPSZAKID"))+"\t"+rs.getInt("MENNYISEG")+"\t"+date+"\n";
            }
            return szoveg;
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
            while(rs.next()){
                napszakok.add(new Napszak(rs.getInt("ID"), rs.getString("NAPSZAK")));
        }return napszakok;
        }catch(SQLException e){
            Logger.getLogger(Napszak.class.getName()).log(Level.SEVERE, null, e);
                    return null;
        }

    }
    
}
