
public class ProductValidator {
	public boolean isValid(Product product) {
		if(product.price>0 && !product.Name.isEmpty()) {
			return true;
			
		}else {
			return false;
		}
	}

}
