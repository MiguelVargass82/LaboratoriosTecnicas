package com.mycompany.persistence;

public class Product {
    private String itemName;
    private int price;
    private int amount;
   
    
    public Product(String itemName, int price,int amount){
    this.itemName = itemName;
    this.price=price;
    this.amount=amount;
    }
    
    
    public String getItemName() {
        return itemName;
    }
 
    public void setName(String itemName) {
        this.itemName = itemName;
    }
    
    public int getPrice() {
        return price;
    }
 
    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }    
    
}
