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
public class BankAccountTester {
    public static void main() {
        try {
           BankAccount negativeBalance = new BankAccount(-5);
        } catch(Exception e) {
            System.out.println(e);
        }
        
        BankAccount negativeDeposit = new BankAccount(100);
        try {
            negativeDeposit.deposit(-50);
        } catch(Exception e) {
            System.out.println(e);
        }
        
        try {
            negativeDeposit.withdraw(200);
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
