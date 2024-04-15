
package lab3main;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class Listing {
    private List<Product> product;

    public Listing() {
        product = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.product.add(product);
    }

    public void updateProduct(String itemName, double price, int amount) {
        for (Product product : product) {
            if (product.getItemName().equals(itemName)) {
                product.setPrice((int) price);
                product.setAmount(amount);
                return;
            }
        }
        
    }

    public void deleteProduct(String itemName) {
        for (Product product : product) {
            if (product.getItemName().equals(itemName)) {
                this.product.remove(product);
                return;
            }
        }
        
    }

    public Product searchProduct(String itemName) {
        for (Product product  : product) {
            if (product.getItemName().equals(itemName)) {
                return product;
            }
        }
        return null; 
    }

    
    
}
