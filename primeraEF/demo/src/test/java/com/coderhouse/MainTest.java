package com.coderhouse;

import com.coderhouse.Entities.Client;
import com.coderhouse.controler.JavaDataBaseController;

public class MainTest {

	public static void main(String[] args) {
		JavaDataBaseController controller = new JavaDataBaseController();
		
		controller.getConnection();
		
		
		
		Client cliente1 = new Client(39340661,"Martin","Neme");
		Client cliente2 = new Client(17254889,"Arnaldo","Guemez");
		controller.insertClient(cliente1);
		controller.insertClient(cliente2);
		
		

		controller.closeConnection();
	}

}
