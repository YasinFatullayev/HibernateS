package com.remoteTiger.HybernateDAO.hibernate;

public class ServiceLayer {
	
	private CoffeeDAO a=new CoffeeDAO();
	
	
	public void add(String fname, String country, 
			int quantity,int productNo)
	
	{		CoffeeDAO.Connect();
		
		 a.addEmployee(fname, country, quantity, productNo);	
		
	}
	
	
	
	public void delete(int id){
		CoffeeDAO.Connect();
		a.del(id);		
		System.out.println("-----------=======DELETED=======---------------");
	}
	
	
	
	

}
