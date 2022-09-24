package oop1;

public class Main {
	
	public static void main(String[] args) {

		String mesaj = "Vade oranı";
		Product product1 = new Product();
		// set value
		
		
		product1.setName("Belongi Kahve Makinası");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitInStock(3);
		product1.setImageUrl("image1.jpg");
		
		
		Product product2 = new Product();
		product2.setName("Belongi Kahve Makinası");
		product2.setDiscount(5);
		product2.setUnitPrice(7500);
		product2.setUnitInStock(3);
		product2.setImageUrl("image1.jpg");
		
		
		Product product3 = new Product();
		product3.setName("Belongi Kahve Makinası");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitInStock(3);
		product3.setImageUrl("image1.jpg");
		
		Product[] products= {product1,product2,product3};
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>"+product.getName()+"</li>");
			
		}
		System.out.println("</ul>");

		// get
		// System.out.println(product1.name);
		IndividualCustomer individualCustomer=new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05222222");
		individualCustomer.setCustomerNumber("25");
		individualCustomer.setFirstName("Mehmet");
		individualCustomer.setLastName("Gürbüz");
		
		CorporateCustomer corporateCustomer=new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setTaxNumber("222222");
		corporateCustomer.setPhone("5435354");
		corporateCustomer.setCustomerNumber("5556565654");
		Customer[] customer= {individualCustomer,corporateCustomer};
		
	}

}
