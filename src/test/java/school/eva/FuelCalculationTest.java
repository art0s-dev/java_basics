package school.eva;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FuelCalculationTest {
    @Test
    void GivenKilometersAndAmountOfFuel_WhenGetAverageAmountIsCalled_TheAverageIsCalculatedCorrectly(){
        var kilometers = 10;
        var fuel = 3.58; //Amount in Litres
        var amount = fuel / kilometers * 100;
        var fuelCalculation = new FuelCalculation(kilometers, fuel);
        assertEquals(amount, fuelCalculation.getAverage());
    }
}
