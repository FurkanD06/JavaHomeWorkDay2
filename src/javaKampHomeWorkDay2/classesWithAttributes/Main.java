package javaKampHomeWorkDay2.classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescreption("Asus Laptop");
		product.setPrice(8200);
		product.setStockAmount(5);
		
		Product product2 = new Product(1, "Laptop","Asus Laptop",8500, 4, "hjashjawhjbjh");
		System.out.println(product2.getName());
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);
		
		
	}

}
