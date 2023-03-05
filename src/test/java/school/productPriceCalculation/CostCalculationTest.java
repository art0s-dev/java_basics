package school.productPriceCalculation;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CostCalculationTest {
    @Test
    void GivenBuyersPrice_WhenGetSellersPriceIsCalled_ThenProductCostsWereCalculatedCorrectly(){
        //All information we need to buy the item
        var costConfig = new CostConfig();
        costConfig.setBuyersPrice(5.56); //Let's say we buy fish at the fish market
        costConfig.setQuantityDiscount(10.00); //% We buy a boat load of fish
        //we substract the amount of percent off from the price - should be 5,004
        costConfig.setDeliveryDiscount(5.00); //% We pick up the fish ourselves
        //same with this amount - should be 4,7538
        costConfig.setFrequencyDiscount(10.00); //% We come every monday to buy
        // 4,27842 should the result be until here
        //All information we need to sell the item
        costConfig.setHoldingSurchargeAmount(33.56); //% We have to pay our warehouse and our workers etc
        // 5,7142 ... should be the amount
        costConfig.setProfit(86.00); //% We want to sell with profit for growth!
        //The result should be 10,628519419
        //All methods until here are from a hundrud now all methods are done with reverse percentage
        // capital / ((100 - interest)/100) = value
        costConfig.setPayingDiscount(5.00);  //% For when the customer wants to pay now
        //11,187915178
        costConfig.setFrequencySellerDiscount(10.00); //When the customer buys many products
        var result = 12.431016864;
        var costCalculation = new CostCalculation(costConfig);
        assertEquals(result, costCalculation.getProductCost());
    }
}
