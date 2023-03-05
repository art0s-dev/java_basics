package school.eva;

import static school.eva.Calculation.calculateInterestRate;

public class FuelCalculation {
    private final double average;
    public FuelCalculation (double kilometers, double fuelBurned){
        this.average = calculateInterestRate(kilometers, fuelBurned);
    }

    public double getAverage(){
        return this.average;
    }
}
