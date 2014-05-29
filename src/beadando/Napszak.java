/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beadando;

import java.util.Objects;

/**
 *
 * @author zbocskay
 */
public class Napszak {
    protected int id;
    protected String napSzak;

    public Napszak(int id, String napSzak) {
        this.id = id;
        this.napSzak = napSzak;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNapSzak() {
        return napSzak;
    }

    public void setNapSzak(String napSzak) {
        this.napSzak = napSzak;
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Napszak other = (Napszak) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.napSzak, other.napSzak)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Napszak =" + napSzak;
    }
    
    
    
}
