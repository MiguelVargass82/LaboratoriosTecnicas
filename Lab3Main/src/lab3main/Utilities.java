package lab3main;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Utilities {
    
    static boolean typeValidation(String text){
               boolean flat = true;
        try {   
            int number = Integer.parseInt(text);        
            if(number<0 ){ //Range validation      
            flat=false;
            }                           
        } catch (NumberFormatException ex) {    //Cant be a integer  
            flat = false;
        }
        return flat;
    }
    
    
    
    
    static boolean containtInInventory(String text,ArrayList<Product> products ){
       for (Product product:products){
         if(product.getItemName().equals(text)){
           return false;            
         }        
       }
       return true;      
    }
    
    static String nameSelected(int rowSelected, javax.swing.JTable table){                   
        Object nameSelected = table.getValueAt(rowSelected, 0);
        String convert = nameSelected.toString();
        return convert;       
    }
    
    static Product productWithName(String name, ArrayList<Product> products){
        for (Product product:products){
            if(product.getItemName().equals(name)){
                return product;
            }
        }
        return null;
    }
    
    
    
}
