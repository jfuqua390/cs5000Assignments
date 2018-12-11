/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final2018;

/**
 *
 * @author jfuqua390
 */
public class Item {
    public double price;
    public int quantity;
    public boolean isPet;
    public Item (double aPrice, boolean isItPet, int aQuantity) {
        price = aPrice;
        isPet=isItPet;
        quantity=aQuantity;
    }
    
    public double getTotalPrice() {
        return price * quantity;
    }
    
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public boolean getIsPet() {
        return isPet;
    }
    
}
