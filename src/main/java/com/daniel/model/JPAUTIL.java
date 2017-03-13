/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daniel.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Daniel
 */
public class JPAUTIL {
    
    private static final EntityManagerFactory emf = 
            Persistence.createEntityManagerFactory("estudo");
    
    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
}
