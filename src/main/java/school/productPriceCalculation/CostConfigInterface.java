package school.productPriceCalculation;

public interface CostConfigInterface {
    double getBuyersPrice();
    void setBuyersPrice(double buyersPrice);
    double getQuantityDiscount();
    void setQuantityDiscount(double quantityDiscount);
    double getDeliveryDiscount();
    void setDeliveryDiscount(double deliveryDiscount);
    double getFrequencyDiscount();
    void setFrequencyDiscount(double frequencyDiscount);
    double getHoldingSurchargeAmount();
    void setHoldingSurchargeAmount(double holdingSurchargeAmount);
    double getProfit();
    void setProfit(double profit);
    double getPayingDiscount();
    void setPayingDiscount(double payingDiscount);
    double getFrequencySellerDiscount();
    void setFrequencySellerDiscount(double frequencySellerDiscount);
}
