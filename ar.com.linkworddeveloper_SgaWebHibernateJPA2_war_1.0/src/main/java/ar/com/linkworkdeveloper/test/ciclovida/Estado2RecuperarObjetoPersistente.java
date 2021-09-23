/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.linkworkdeveloper.test.ciclovida;

import ar.com.linkworddeveloper.domain.Contacto;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author octavio
 */
public class Estado2RecuperarObjetoPersistente {
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
        
        //1. estado transitivo
        Contacto contacto = null;
        contacto = em.find(Contacto.class, 3);
        
        System.out.println("contacto: " + contacto);
        
    }
}
