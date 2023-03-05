package school.productPriceCalculation;

import school.eva.Calculation;

import java.util.Arrays;

import static school.eva.Calculation.calculateInterest;
import static school.eva.Calculation.reversePercentage;

public class CostCalculation {
    private double productCost = 0.00;
    public CostCalculation(CostConfigInterface costConfig){
        this.productCost = this.calculateProductCost(costConfig);
    }

    private double calculateProductCost(CostConfigInterface costConfig){
        var buyersPrice = costConfig.getBuyersPrice();

        buyersPrice = buyersPrice - calculateInterest(buyersPrice, costConfig.getQuantityDiscount());
        buyersPrice = buyersPrice - calculateInterest(buyersPrice, costConfig.getDeliveryDiscount());
        buyersPrice = buyersPrice - calculateInterest(buyersPrice, costConfig.getFrequencyDiscount());

        buyersPrice = buyersPrice + calculateInterest(buyersPrice, costConfig.getHoldingSurchargeAmount());
        buyersPrice = buyersPrice + calculateInterest(buyersPrice, costConfig.getProfit());

        buyersPrice = reversePercentage(buyersPrice, costConfig.getPayingDiscount());
        buyersPrice = reversePercentage(buyersPrice, costConfig.getFrequencySellerDiscount());

        return buyersPrice;
    }

    public double getProductCost(){
        return this.productCost;
    }
}
