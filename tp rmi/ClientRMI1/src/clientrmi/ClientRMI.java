/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientrmi;

import dao.IDao;
import entities.*;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class ClientRMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            IDao<Machine> dao;
          //  IDao<Salle> dao2;
            
        try {
            dao = (IDao<Machine>) Naming.lookup("rmi://localhost:1099/dao");
           IDao<Salle>  dao2= (IDao<Salle>) Naming.lookup("rmi://localhost:1099/dao2");

        } catch (NotBoundException ex) {
            Logger.getLogger(ClientRMI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ClientRMI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ClientRMI.class.getName()).log(Level.SEVERE, null, ex);
        }




        






         
       
        
    }
    
}
