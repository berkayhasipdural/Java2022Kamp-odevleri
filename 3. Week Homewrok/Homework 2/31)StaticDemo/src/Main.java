
public class Main {

	public static void main(String[] args) {
		ProductManager manager = new ProductManager();
		Product product = new Product();
		product.price = 12.45;
		product.Name = "Mouse";
		
		manager.add(product);
	}

}
