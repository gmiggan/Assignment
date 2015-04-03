package estore.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@NamedQueries({
	@NamedQuery(name = "Product.findAll", query="select o from Product o"),
})
	
	
	
	@Entity
	public class Product{
		
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int id;
		private String manufacturer;
		private String model;
		private double price;
		
	}
	
	

