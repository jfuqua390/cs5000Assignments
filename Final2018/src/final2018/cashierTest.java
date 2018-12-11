/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final2018;
import java.util.Scanner;
/**
 *
 * @author jfuqua390
 */
public class cashierTest {
    public static void main() {
        Invoice newInvoice = new Invoice();
        Scanner in = new Scanner(System.in);
        
        while(true) {
            System.out.println("Please enter an item price: (-1 to quit)");
            double price = in.nextDouble();
            if(price == -1) {
                double discount=newInvoice.getDiscount();
                System.out.print("Discount for Invoice: ");
                System.out.println(discount);
                return;
            }
            System.out.println("Please enter item quantity:");
            int quant = in.nextInt();
            System.out.println("Please enter Y for pet, or N for other item");
            String pet = in.next();
            boolean isPet = false;
            if(pet.equalsIgnoreCase("Y")){
                isPet=true;
            } else if(pet.equalsIgnoreCase("N")) {
                isPet=false;
            } else {
                System.out.println("Invalid Input");
            }
            System.out.print("Entering item... Price: ");
            System.out.print(price);
            System.out.print(", isPet: ");
            System.out.print(isPet);
            System.out.print(", Quantity: ");
            System.out.println(quant);
            newInvoice.add(new Item(price, isPet, quant));
            System.out.println("Item Added to Invoice.");
        }
        
    }
}
