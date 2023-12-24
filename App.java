package com.Hibernate.Hibernate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
    	drivers d= new drivers();
    	d.setId(12);
    	d.setName("Lance Stroll");
    	d.setTeam("Aston Martin");
    	
    	EntityManagerFactory emf= Persistence.createEntityManagerFactory("dts");
        EntityManager em =emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(d);
        em.getTransaction().commit();
        System.out.print(d);
        
    }
}
