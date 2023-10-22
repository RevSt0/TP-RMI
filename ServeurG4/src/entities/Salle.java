/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 *
 * @author RevSt
 */
@Entity
@NamedQuery(name ="findAllSalles",query = "from Salle")
@NamedNativeQuery(name = "findAllSallesNative", query = "select * from salle", resultClass = Salle.class)
public class Salle implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String code;
    
    private static final long serialVersionUID = 6529685098267757690L;
    
    @OneToMany(mappedBy= "salle", fetch=FetchType.EAGER)
    private List<Machine> machines;
    
    public Salle(){
        
    }
    
    public Salle(String code) {
        this.code = code;
       
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
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
