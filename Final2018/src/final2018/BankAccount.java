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
public class BankAccount {
    private double balance;
    
    public BankAccount()
    {
        balance = 0;
    }
    
    public BankAccount(double initialBalance)
    {
        if(initialBalance<0) {
            throw new NegativeBalanceException("Enter a positive number please.");
        }
        balance = initialBalance;
        
    }
    
    public void deposit(double amount) 
    {
        if(amount<0) {
            throw new NegativeAmountException("Cannot deposit a negative amount");
        }
        balance = balance + amount;
    }
    
    public void withdraw(double amount)
    {
        if(amount > balance) {
            throw new InsufficientFundsException("Insufficient Funds");
        }
        balance = balance - amount;
    }
    
    public double getBalance()
    {
        return balance;
    }
    
    /**
        This exception reports a negative initial balance on a bank account.
    */
    public class NegativeBalanceException extends RuntimeException
    {
       public NegativeBalanceException()
       {
       }

       public NegativeBalanceException(String message)
       {
          super(message);
       }
    }
    /**
        This exception reports a negative deposit on a bank account.
    */
    public class NegativeAmountException extends RuntimeException
    {
       public NegativeAmountException()
       {
       }

       public NegativeAmountException(String message)
       {
          super(message);
       }
    }
    
    /**
        This exception reports when trying to withdraw an amount greater than the balance
    */
    public class InsufficientFundsException extends RuntimeException
    {
       public InsufficientFundsException()
       {
       }

       public InsufficientFundsException(String message)
       {
          super(message);
       }
    }
}
