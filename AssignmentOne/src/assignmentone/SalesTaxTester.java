/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentone;
import javax.swing.JOptionPane;
/**
 * a class to test the SalesTax class
 * @author jfuqua390
 */
public class SalesTaxTester {
    /**
     * tests the methods of the SalesTax class
     */
    public static void main() {
       String purchase = JOptionPane.showInputDialog("What is the price of your purchase?");
       double purchasePrice = Double.parseDouble(purchase);
       SalesTax jonsSalesTax = new SalesTax(.06,.04);
       jonsSalesTax.calculateTax(purchasePrice);
       jonsSalesTax.calculateTotalCost();
       double totalSalesTax = jonsSalesTax.getSalesTax();
       double totalCost = jonsSalesTax.getTotalCost();
       System.out.print("Purchase price= ");
       System.out.println(purchasePrice);
       System.out.print("Total Sales Tax= ");
       System.out.println(totalSalesTax);
       System.out.print("Total Cost= ");
       System.out.println(totalCost);
       double expectedTotalTax = purchasePrice * (.06+.04);
       double expectedTotalCost = purchasePrice + expectedTotalTax;
       System.out.print("Expected Total Tax= ");
       System.out.print(expectedTotalTax);
       System.out.print(", and Expected Total Cost= ");
       System.out.println(expectedTotalCost);
    }
}
