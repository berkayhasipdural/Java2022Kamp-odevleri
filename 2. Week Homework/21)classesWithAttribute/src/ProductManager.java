
public class ProductManager {
	
	public ProductManager() {
		System.out.println("Prduct manager çalýþtý");
	}
	
	public void Add(Product product) {
		System.out.println("Product added: " + product.getName() );
	}
	public void Delete(Product product) {
		System.out.println("Product deleted " + product.getName() );
	}
	
}
