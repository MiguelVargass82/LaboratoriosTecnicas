package com.mycompany.persistence;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Brayan Santiago Ramirez Silva
 *         Miguel Jose Vargas Pacheco
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

    

    public void saveProductsInv(){
        Gson gson = new GsonBuilder().create();
        String json = gson.toJson(this.products);

        try (FileWriter fileWriter = new FileWriter("ProductsListing.json")){
            fileWriter.write(json);
            System.out.println("Succesfully save: Product list ");
        }catch (IOException e){
            System.err.println("Error saving product list to JSON: " + e.getMessage());
        }
    }

    public void readFile(){
        try{
            Gson gson = new GsonBuilder().create();
            FileReader fileReader = new FileReader("ProductsListing.json");

            java.lang.reflect.Type typeListProducts = new TypeToken<ArrayList<Product>>(){}.getType();

            this.products = gson.fromJson(fileReader, typeListProducts);
            updateModelList(tableModel, products);
        }catch (IOException e){
            System.err.println("Error reading JSON file: " + e.getMessage());
        }
    }

}
