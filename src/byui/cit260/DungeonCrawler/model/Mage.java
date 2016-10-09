/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DungeonCrawler.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Jeff
 */
public class Mage implements Serializable{
    
    private String names;

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public Mage(String names) {
        this.names = names;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.names);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Mage other = (Mage) obj;
        if (!Objects.equals(this.names, other.names)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Mage{" + "names=" + names + '}';
    }
    
    
}
