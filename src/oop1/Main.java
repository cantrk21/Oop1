package oop1;

public class Main {

	public static void main(String[] args) {
		// data.type / name
		Product product1 = new Product();
		// set value
		/*product1.name = "Delonghi Coffee Machine";
		product1.unitPrice = 7500;
		product1.discount = 7;
		product1.unitsInStock = 3;
		product1.imageUrl = "image1.jpg";*/
		
		product1.setName("Delonghi Coffee Machine");
		product1.setUnitPrice(7500);
		product1.setDiscount(7);
		product1.setUnitsInStock (3);
		product1.setImageUrl("image1.jpg");

		Product product2 = new Product();
		// set value
		/*product2.name = "Smeg Coffee Machine";
		product2.unitPrice = 6500;
		product2.discount = 8;
		product2.unitsInStock = 2;
		product2.imageUrl = "image2.jpg";*/
		
		product2.setName("Smeg Coffee Machine");
		product2.setUnitPrice(6500);
		product2.setDiscount(7);
		product2.setUnitsInStock (3);
		product2.setImageUrl("image2.jpg");


		Product product3 = new Product();
		// set value
		/*product3.name = "Kitchen Coffee Machine";
		product3.unitPrice = 4500;
		product3.discount = 9;
		product3.unitsInStock = 5;
		product3.imageUrl = "image3.jpg";*/
		
		product3.setName("Kitchen Coffee Machine");
		product3.setUnitPrice(4500);
		product3.setDiscount(7);
		product3.setUnitsInStock (3);
		product3.setImageUrl("image2.jpg");

		Product[] products = { product1, product2, product3 };

		System.out.println("<ul>");

	/*	for (Product product : products) {

			System.out.println("<li>" + product.name + "</li>");
		}
		System.out.println("</ul>");*/
		
		for (Product product : products) {

			System.out.println("<li>" + product.getName() + "</li>");
		}
		System.out.println("</ul>");
		
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("052222222");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Can");
		individualCustomer.setLastName("Turk");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		
		corporateCustomer.setId(2);
		corporateCustomer.setCustomerNumber("54321");
		corporateCustomer.setCompanyName("cansoft.ls");
		corporateCustomer.setPhone("053333333");
		corporateCustomer.setTaxNumber("11111111111");
		
		//  System.out.println(corporateCustomer.getId());
		
		
		Customer[] customers = {individualCustomer,corporateCustomer};
		
	}

}
