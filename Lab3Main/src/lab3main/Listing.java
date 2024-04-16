package lab3main;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Brayan Santiago Ramirez Silva
 *         Miguel Pacheco
 */
public class Listing {

    private ArrayList<Product> products;
    private DefaultTableModel tableModel;

    
    
     public Listing() {
        products = new ArrayList<>();
        tableModel = new DefaultTableModel();
    }

    
    public DefaultTableModel getTableModel() {
        return tableModel;
    }
     
    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

      
   
    //Modify the model table with de ArrayList 
    public void updateModelList (DefaultTableModel modelTable, ArrayList<Product> products){
         modelTable.setRowCount(0);
        for(Product product: products){
                modelTable.addRow(new Object[]{product.getItemName(),product.getPrice(),product.getAmount()     });
       }                  
    }
        
    public void addProduct(Product product) {
        this.getProducts().add(product);
        updateModelList(tableModel,products);
    }

    public void updateProduct(String itemName, double price, int amount) {
        for (Product product : getProducts()) {
            if (product.getItemName().equals(itemName)) {
                product.setPrice((int) price);
                product.setAmount(amount);
                return;
            }
        }
    }

    public void deleteProduct(String itemName) {
        for (Product product : getProducts()) {
            if (product.getItemName().equals(itemName)) {
                this.getProducts().remove(product);
                return;
            }
        }
        updateModelList(tableModel,products);
    }

    

}
