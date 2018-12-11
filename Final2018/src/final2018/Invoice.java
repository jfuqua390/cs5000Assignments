/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final2018;
import java.util.ArrayList;

/**
 *
 * @author jfuqua390
 */
public class Invoice {
    private ArrayList<Item> items;
    
    public Invoice() {
        items = new ArrayList<Item>();
    }
    
    public void add(Item anItem) {
        Item item = new Item(anItem.price, anItem.isPet, anItem.quantity);
        items.add(item);
    }
    
    public double getDiscount() {
        boolean hasPet = false;
        double totalCost = 0;
        for(Item i: items) {
            if(i.isPet) {
                hasPet = true;
            } else {
                totalCost += (i.price * i.quantity);
            }
        }
        if(hasPet && items.size() >= 5) {
           return totalCost * 0.2;
        } else {
            return 0;
        }
        
    }
}
