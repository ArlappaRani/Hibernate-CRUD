package com.hibernate.crud.HibernateCRUD;

import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        //create()
    	//read();
    	update();
    }
    public static void create()
    {
    	 Configuration cfg=new Configuration().configure();
         SessionFactory factory=cfg.buildSessionFactory();
         Session session=factory.openSession();
         Transaction trans=session.beginTransaction();
         
         //creating the object of lap top class
         Laptop lap1=new Laptop(11,"Dell",45000);
         
         session.save(lap1);
         trans.commit();
         System.out.println("Object is saved");
    }
    public static void read()
    {
    	 Configuration cfg=new Configuration().configure();
         SessionFactory factory=cfg.buildSessionFactory();
         Session session=factory.openSession();
         Transaction trans=session.beginTransaction();
         
         //reading the object of lap top class using class name,id
         Laptop lap=session.get(Laptop.class, 11);
         
         trans.commit();
         System.out.println(lap);
    }
    public static void update()
    {
    	 Configuration cfg=new Configuration().configure();
         SessionFactory factory=cfg.buildSessionFactory();
         Session session=factory.openSession();
         Transaction trans=session.beginTransaction();
         
         //getting  the object of lap top class
         
         
        
   
         
         
         
         
        
         
        
         trans.commit();
         System.out.println("Object is saved");
    }
    public static void delete()
    {
    	 Configuration cfg=new Configuration().configure();
         SessionFactory factory=cfg.buildSessionFactory();
         Session session=factory.openSession();
         Transaction trans=session.beginTransaction();
         
         //creating the object of lap top class
         Laptop lap1=new Laptop(11,"Dell",45000);
         
         session.save(lap1);
         trans.commit();
         System.out.println("Object is saved");
    }
}
