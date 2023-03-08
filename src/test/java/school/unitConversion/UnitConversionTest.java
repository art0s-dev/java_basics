package school.unitConversion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static school.unitConversion.UnitConversion.*;

public class UnitConversionTest {
    @Test
    void GivenValueInCentimeters_WhenUnitIsConvertedToInches_ThenInchesAreCalculatedCorrectly(){
        assertEquals(3.937007874015748,toInches(10));
    }

    @Test
    void GivenValueInMeters_WhenUnitIsConvertedToYards_ThenTheAmountIsCalculatedCorrectly(){
        assertEquals(10.936132983377078, toYards(10));
    }

    @Test
    void GivenValueInKilometers_WhenUnitIsConvertedToMile_ThenTheAmountIsCalculatedCorrecty(){
        assertEquals(6.2137119223733395, toMiles(10));
    }

    @Test
    void GivenValueInMiles_WhenUnitIsConvertedToNauticalMiles_ThenTheAmountIsCalculatedCorrectly(){
        assertEquals(8.68975825092546, toNauticalMiles(10));
    }
}
