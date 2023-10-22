/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author RevSt
 */
public class Salle implements Serializable{
    
    private int id;
    
    private String code;
    
    private List<Machine> machines;
    
    private static final long serialVersionUID = 6529685098267757690L;

    public Salle(String code) {
        this.code = code;
    }

    public Salle() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Machine> getMachines() {
        return machines;
    }

    @Override
    public String toString() {
        return "id=" + id + ", code=" + code;
    }
    
}
