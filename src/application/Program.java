package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Department dep = new Department(1, "Computer");
		
		Seller seller = new Seller(1, "William", "william@hotmail.com", new Date(), 3500.0, dep);
		
		System.out.println(seller);

	}

}
