/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beadando;


import java.sql.Timestamp;


/**
 *
 * @author zbocskay
 */
public class Kapcsolo {
    protected int id;
    protected int userId;
    protected int kajaId;
    protected int napszakId;
    protected Timestamp date;

    public Kapcsolo( int userId, int kajaId, int napszakId, String date) {
        this.userId = userId;
        this.kajaId = kajaId;
        this.napszakId = napszakId;
        String split[] = date.split("-");
        this.date = new Timestamp(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]),0,0,0,0);
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getKajaId() {
        return kajaId;
    }

    public void setKajaId(int kajaId) {
        this.kajaId = kajaId;
    }

    public int getNapszakId() {
        return napszakId;
    }

    public void setNapszakId(int napszakId) {
        this.napszakId = napszakId;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }
    
    
}
