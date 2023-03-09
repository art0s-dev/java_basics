package school.taxCalculation;

import static school.eva.Calculation.calculateInterest;

public class TaxCalculation {
    private final double grossPayment;
    private int taxRate = 0;
    private final double netPayment;
    public TaxCalculation(double grossPayment){
        this.grossPayment = grossPayment;
        this.netPayment = this.calculateNetPayment(grossPayment);
    }

    private double calculateNetPayment(double grossPayment){
        if(grossPayment >= 48_001 && grossPayment <= 75_000){
            this.taxRate = 20;
        }
        if(grossPayment > 75_000){
            this.taxRate = 30;
        }
        return grossPayment - calculateInterest(grossPayment, taxRate);
    }

    public double getGrossPayment() {
        return this.grossPayment;
    }
    public double getNetPayment(){
        return this.netPayment;
    }
    public int getTaxRate(){
        return this.taxRate;
    }
}
