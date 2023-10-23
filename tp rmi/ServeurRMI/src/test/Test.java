/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.IDao;
import entities.Machine;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import service.MachineService;
import util.HibernateUtil;

/**
 *
 * @author lenovo
 */
public class Test {
    public static void main(String[] args) {
        IDao<Machine> dao;
        try {
            dao = new MachineService();
        dao.create(new Machine("ht", "HP", 4000));
        dao.create(new Machine("de ", "ACER", 5000));
        dao.create(new Machine("J15", "Dell", 4500));
        dao.create(new Machine("DF", "Lenovo", 5000));
        for (Machine m: dao.findAll()){
            System.out.println(m);
        }
        } catch (RemoteException ex) {
            System.out.println("Erreur"+ex.getMessage());
        }
        

    }
    
}
