package com.remoteTiger.HybernateDAO.hibernate;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;


 
import org.hibernate.Session; 


public class CoffeeDAO {

	
	 private static SessionFactory factory; 
	   public static void Connect() {
	      try{
	         factory = new AnnotationConfiguration().
	                   configure().
	                   addPackage("com.remoteTiger.HybernateDAO.hibernate"). //add package if used.
	                   addAnnotatedClass(CoffeeBean.class).
	                   buildSessionFactory();
	      }catch (Throwable ex) { 
	         System.err.println("Failed to create sessionFactory object." + ex);
	         throw new ExceptionInInitializerError(ex); 
	      }

}
	   


	   public Integer addEmployee(String fname, String country, int quantity,int productNo){
		   
		   System.out.println("ADD EMPLOYEE()------------------------------");
		   
		   
		   Session session = factory.openSession();
		      Transaction tx = null;
		      Integer CoffeeID = null;
		      try{
		         tx = session.beginTransaction();
		         CoffeeBean cofe = new CoffeeBean();
		         cofe.setName(fname);
		         cofe.setCountry(country);
		         cofe.setQuantity(quantity);
		         cofe.setPRODUCT_NO(productNo);
		         CoffeeID = (Integer) session.save(cofe); 
		         tx.commit();
		         
		      }catch (HibernateException e) {
		         if (tx!=null) tx.rollback();
		         e.printStackTrace(); 
		      }finally {
		         session.close(); 
		      }
		      return CoffeeID;
		   }
	   
	   
	   
	   
	   
	   
	   public void del(int id){
		   
   System.out.println("delete coffee()------------------------------");
		   
		   
		   Session session = factory.openSession();
		      Transaction tx = null;
		      Integer CoffeeID = null;
		      try{
		         tx = session.beginTransaction();
		         CoffeeBean cofe = new CoffeeBean();
		         cofe.setId(id);
		         session.delete(cofe);
		         tx.commit();
		      }catch (HibernateException e) {
		         if (tx!=null) tx.rollback();
		         e.printStackTrace(); 
		      }finally {
		         session.close(); 
		      }
		    
		   }
	   


}
