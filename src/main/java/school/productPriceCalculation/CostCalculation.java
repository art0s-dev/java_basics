package school.productPriceCalculation;

import static school.eva.Calculation.calculateInterest;
import static school.eva.Calculation.reversePercentage;

public class CostCalculation {
    private double productCost = 0.00;
    private final CostConfigInterface costConfig;

    public CostCalculation(CostConfigInterface costConfig){
        this.costConfig = costConfig;
        this.productCost = this.calculateProductCost();
    }

    private double calculateProductCost(){
        var buyersPrice = costConfig.getBuyersPrice();
        buyersPrice = this.substractDiscounts(buyersPrice);
        buyersPrice = this.addCostAllocations(buyersPrice);
        return this.addDiscounts(buyersPrice);
    }

    private double substractDiscounts(double from){
        from = from - calculateInterest(from, this.costConfig.getQuantityDiscount());
        from = from - calculateInterest(from, this.costConfig.getDeliveryDiscount());
        return from - calculateInterest(from, this.costConfig.getFrequencyDiscount());
    }
    private double addCostAllocations(double to){
        to = to + calculateInterest(to, costConfig.getHoldingSurchargeAmount());
        return to + calculateInterest(to, costConfig.getProfit());
    }
    private double addDiscounts(double to){
        to = reversePercentage(to, costConfig.getPayingDiscount());
        return reversePercentage(to, costConfig.getFrequencySellerDiscount());
    }

    public double getProductCost(){
        return this.productCost;
    }
}
