package school.eva;

import static school.eva.Calculation.calculateInterest;

public final class PaymentCalculation {


    private final static double paymentTaxes = 20.00; //% drawn from the gross payment
    private final static double churchTaxes = 9.00; //% of the payment Taxes
    private final static double socialInsurance = 30.00;
    private final static double workerParticipation = 50.00; //%  payed by the worker
    private double netPayment = 0.00;

    public PaymentCalculation(double grossPayment){
        this.netPayment = calculateNetPayment(grossPayment);
    }

    public double calculateNetPayment(double grossPayment){
        var netPayment = grossPayment - calculateInterest(grossPayment,paymentTaxes);
        netPayment = netPayment - calculateInterest(netPayment,churchTaxes);
        var insurance = calculateInterest(netPayment,socialInsurance);
        return netPayment - calculateInterest(insurance, workerParticipation);
    }

    public double getNetPayment(){
        return this.netPayment;
    }

}
