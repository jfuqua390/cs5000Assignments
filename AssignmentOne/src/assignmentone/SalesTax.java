/**
   SalesTax calculates the sales tax on a purchase. 
 */
package assignmentone;

/**
 *
 * @author jfuqua390
 */
public class SalesTax {
    private double actualTR;
    private double totalTaxAmt;
    private double purchasePrice;
    private double totalCost;
    
    /**
     * Constructs a new SalesTax
     * @param stateTR the State Tax Rate
     * @param countyTR the County Tax Rate
     */
    public SalesTax(double stateTR, double countyTR) {
        actualTR = stateTR + countyTR;
    }
    
    /**
     * Calculates the total tax of the purchase
     * @param price Price of the purchase
     */
    public void calculateTax(double price) {
        purchasePrice = price;
        totalTaxAmt = price * actualTR;
    }
    
    /**
     * Calculates the total cost of the purchase
    */
    public void calculateTotalCost() {
        totalCost = purchasePrice + totalTaxAmt;
    }
    
    /**
     * Gets the sales tax amount
     * @return the sales tax
     */
    public double getSalesTax() {
        return totalTaxAmt;
    }
    
    /**
     * Gets the total cost
     * @return the total cost
     */
    public double getTotalCost() {
        return totalCost;
    }
}
