package school.eva;

import jdk.jfr.Name;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaymentCalculationTest {
    public PaymentCalculation paymentCalculation = new PaymentCalculation(40_000);

    @Test
    void GivenGrossPayment_WhenPaymentCalculationIsInstanciated_ThenItCalculatesNetPaymentCorrectly(){
        var payment = 40_000;
        var paymentTaxes = 20.00; //3200
        var churchTaxes = 9.00; //29120
        var socialInsurance = 30.00;//(8736)
        var workerParticipation = 50.00;//-4368
        //Expected Result
        var netPayment = 24_752;
        var paymentCalculation = new PaymentCalculation(40_000);
        assertEquals(netPayment, paymentCalculation.getNetPayment());
    }

}
