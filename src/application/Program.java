package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Department dep = new Department(1, "Computer");
		
		Seller seller = new Seller(1, "William", "william@hotmail.com", new Date(), 3500.0, dep);
		
		SellerDao sellerDao = DaoFactory.crateSellerDao();
		
		System.out.println(seller);

	}

}
