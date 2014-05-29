/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beadando;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zbocskay
 */
public class Kaja extends ConnectionHandler{
    
    protected int id;
    protected String Nev;
    protected int Kaloria;
    protected int Feherje;
    protected int Szenhidrat;
    
    protected Connection conn = this.getConnection();
    public Kaja( String Nev, int Kaloria, int Feherje, int Szenhidrat) {
        this.Nev = Nev;
        this.Kaloria = Kaloria;
        this.Feherje = Feherje;
        this.Szenhidrat = Szenhidrat;
    }

    public Kaja() {
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNev() {
        return Nev;
    }

    public void setNev(String Nev) {
        this.Nev = Nev;
    }

    public int getKaloria() {
        return Kaloria;
    }

    public void setKaloria(int Kaloria) {
        this.Kaloria = Kaloria;
    }

    public int getFeherje() {
        return Feherje;
    }

    public void setFeherje(int Feherje) {
        this.Feherje = Feherje;
    }

    public int getSzenhidrat() {
        return Szenhidrat;
    }

    public void setSzenhidrat(int Szenhidrat) {
        this.Szenhidrat = Szenhidrat;
    }

    @Override
    public String toString() {
        return "ID=" + id +"Nev=" + Nev + ", Kaloria=" + Kaloria + ", Feherje=" + Feherje + ", Szenhidrat=" + Szenhidrat;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Kaja other = (Kaja) obj;
        if (!Objects.equals(this.Nev, other.Nev)) {
            return false;
        }
        return true;
    }

    
    
    public void save(){
        String sql = "INSERT INTO kaja .......";
    }
    
//    
    
}
