/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examone;

/**
 *
 * @author jfuqua390
 */
public class CarTester {
    public static void main() {
        Car myHybrid = new Car(20);
        myHybrid.addGas(40);
        myHybrid.drive(100);
        System.out.print("Expected Fuel Left: ");
        System.out.print(myHybrid.getGasInTank());
        System.out.print(", Expected Miles Left In Tank: ");
        System.out.println(myHybrid.getMilesToGo());
        System.out.print("Expected Fuel Left: ");
        System.out.print("35");
        System.out.print(", Expected Miles Left In Tank: ");
        System.out.println("700");
    }
}
