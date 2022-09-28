public class Main {

	public static void main(String[] args) {
		Product product = new Product(1,"Laptop","Asus",3000,2,"Siyah");
		//Product product =new Product();
		//product.name = "Laptop";
	//	product.setId(1);
	//	product.setDescription("Asus");
	//	product.setStockAmount(3);
		
		
		System.out.println(product.getName());
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		System.out.println(product.getKod());
		

	}

}