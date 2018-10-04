package com.arunhib.Task5;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Employee arun = new Employee();
        arun.setEmpId(6);
        arun.setName("Balakumaran");
        arun.setGender("M");
        arun.setFatherName("Suresh");
        arun.setBornDay("31-7-1990");
        arun.setJoinedOn("25-04-2016");
        
      Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class);
      
    ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
      
        SessionFactory sf = con.buildSessionFactory(reg);
        
        Session session =sf.openSession();
        
        Transaction tx = session.beginTransaction();
      session.save(arun);  
      
      tx.commit();
    }
}
