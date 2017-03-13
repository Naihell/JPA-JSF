/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daniel.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Daniel
 */
public class PersistePessoa {
    
    public static void main(String[] args){

        EntityManager em = JPAUTIL.getEntityManager();
        
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Daniel");
        pessoa.setCpf("103.645.756.70");
        
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(pessoa);
        tx.commit();
        
        em.close();
        em.close();
    }
    
}
