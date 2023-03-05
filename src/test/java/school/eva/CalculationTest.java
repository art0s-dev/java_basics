package school.eva;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static school.eva.Calculation.*;

public class CalculationTest {
    public double interest = 5_000;
    public double capital = 100_000;
    public double interestRate = 5.00;

    @Test
    void GivenCapitalAndInterestRate_WhenCalculateInterestIsCalled_ThenInterestRateIsCalculatedCorrectly(){
        assertEquals(interest, calculateInterest(capital,interestRate) );
    }

    @Test
    void GivenCapitalAndInterest_WhenCalculateInterestRateIsCalled_ThenInterestRateIsCalculatedCorrectly(){
        assertEquals(interestRate, calculateInterestRate(capital,interest));
    }

    @Test
    void GivenInterestAndInterestRate_WhenCalculateCapitalIsCalled_ThenTheCapitalIsCalculatedCorrectly(){
        assertEquals(capital, calculateCapital(interestRate, interest));
    }

    @Test
    void GivenCapitalAndInterestRate_WhenReversePercentageIsCalled_ThenTheCalculationIsDoneCorrectly(){
        // capital / ((100 - interest)/100) = value
        //100K / 0,95  = value
        var result = 105263.15789473684;
        assertEquals(result, reversePercentage(capital, interestRate));
    }


}
