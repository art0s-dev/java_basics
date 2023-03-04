package school.eva;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static school.eva.Calculation.*;

public class CalculationTest {
    public double interest = 5_000;
    public double capital = 100_000;
    public double interestRate = 5.00;

    @Test
    public void GivenCapitalAndInterestRate_WhenCalculateInterestIsCalled_ThenInterestRateIsCalculatedCorrectly(){
        assertEquals(interest, calculateInterest(capital,interestRate) );
    }

    @Test
    public void GivenCapitalAndInterest_WhenCalculateInterestRateIsCalled_ThenInterestRateIsCalculatedCorrectly(){
        assertEquals(interestRate, calculateInterestRate(capital,interest));
    }

    @Test
    public void GivenInterestAndInterestRate_WhenCalculateCapitalIsCalled_ThenTheCapitalIsCalculatedCorrectly(){
        assertEquals(capital, calculateCapital(interestRate, interest));
    }
}
