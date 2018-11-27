/*
 * Car class
 */
package examone;

/**
 *
 * @author jfuqua390
 */
public class Car {
    private double mpg;
    private double fuel;
    /**
     * Constructs a new Car
     * @param fuelEff Fuel Efficiency of the Car
     */
    public Car(double fuelEff) {
        mpg = fuelEff;
        fuel = 0;
    }
    
    /**
     * To reduce the amount of gasoline in the fuel tank after driving a certain distance
     * @param miles Amount of miles to drive
     */
    public void drive(double miles) {
        double fuelUsed = miles/mpg;
        fuel -= fuelUsed;
    }
    
    /**
     * Adds gas to the car
     * @param gal Amount of gallons to put in the gas tank
     */
    public void addGas(double gal) {
        fuel += gal;
    }
    
    /**
     *
     * @return amount of gallons of fuel left in the tank
     */
    public double getGasInTank() {
        return fuel;
    }
    
    /**
     *
     * @return the miles the car can drive before running out of fuel
     */
    public double getMilesToGo() {
        return fuel*mpg;
    }
}
