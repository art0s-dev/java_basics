package school.taxCalculation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxCalculationTest {
    @Test
    void GivenGrossPayment_WhenTaxCalculationIsCalled_ThenGrossPaymentCanBeRead(){
        var grossPayment = 40_000;
        var taxCalculation = new TaxCalculation(grossPayment);
        assertEquals(grossPayment, taxCalculation.getGrossPayment());
    }

    @Test
    void GivenGrossPaymentHigherThan75K_WhenGetNetPaymentIsCalled_ThenValueIs30PercentLessThanGrossPayment(){
        var grossPayment = 100_000;
        var netPayment = 70_000;
        var taxCalculation = new TaxCalculation(grossPayment);
        assertEquals(netPayment, taxCalculation.getNetPayment());
    }

    @Test
    void GivenGrossPaymentEquals100_WhenGetNetPaymentIsCalled_ThenValueIsStill100(){
        var taxCalculation = new TaxCalculation(100);
        assertEquals(100, taxCalculation.getNetPayment());
    }

    @Test
    void GivenGrossPaymentEquals48K_WhenGetNetPaymentIsCalles_ThenValueIs20PercentLess(){
        var grossPayment = 48_001;
        var taxCalculation = new TaxCalculation(grossPayment);
        assertEquals(38400.8, taxCalculation.getNetPayment());
    }

    @Test
    void GivenGrossPaymentHigherThan75K_WhenGetTaxRateIsCalled_ThenValueIs30(){
        var grossPayment = 100_000;
        var taxCalculation = new TaxCalculation(grossPayment);
        assertEquals(30, taxCalculation.getTaxRate());
    }
}
