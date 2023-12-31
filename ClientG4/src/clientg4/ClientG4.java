/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientg4;

import dao.IDao;
import entities.Machine;
import entities.Salle;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lachgar
 */
public class ClientG4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            IDao<Machine> dao = (IDao<Machine>) Naming.lookup("rmi://localhost:1099/dao");
            IDao<Salle> daoS = (IDao<Salle>) Naming.lookup("rmi://localhost:1099/daoS");
       
            for (Machine m : dao.findAll()) {
                System.out.println(m);
            }
            
            for (Salle s : daoS.findAll()){
                System.out.println(s);
            }
        
        } catch (NotBoundException ex) {
            Logger.getLogger(ClientG4.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ClientG4.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ClientG4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
