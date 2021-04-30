package oopIntro;

public class Main {
	public static void main(String[] args) {
	
		
		Product product1 =new Product(1,"Lenovo ", 15000,"16gb ram",10,13500);
		
		Product product2=new Product();
		product2.setId(0);
		product2.setName("casper");
		product2.setDetail("");
		product2.setDiscount(10);
		product2.unitPriceAfterDiscount=14400;
		
	
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		Category category1 =new Category(0, null);
		category1.setId(1);
		category1.setName("Ýçecek");
		
		Category category2= new Category(0, null);
		category2.setId(2);
		category2.setName("Yiyecek");
		
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());
		
	}
	

}
