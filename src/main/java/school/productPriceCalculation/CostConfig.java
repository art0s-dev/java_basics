package school.productPriceCalculation;

public class CostConfig implements CostConfigInterface {
    double buyersPrice;
    double quantityDiscount;
    double deliveryDiscount;
    double frequencyDiscount;
    double holdingSurchargeAmount;
    double profit;
    double payingDiscount;
    double frequencySellerDiscount;

    public double getBuyersPrice(){return this.buyersPrice;}
    public void setBuyersPrice(double buyersPrice){this.buyersPrice = buyersPrice;}
    public double getQuantityDiscount(){return this.quantityDiscount;}
    public void setQuantityDiscount(double quantityDiscount){this.quantityDiscount = quantityDiscount;}
    public double getDeliveryDiscount(){return this.deliveryDiscount;}
    public void setDeliveryDiscount(double deliveryDiscount){this.deliveryDiscount = deliveryDiscount;}
    public double getFrequencyDiscount(){return this.frequencyDiscount;}
    public void setFrequencyDiscount(double frequencyDiscount){this.frequencyDiscount = frequencyDiscount;}
    public double getHoldingSurchargeAmount(){return this.holdingSurchargeAmount;}
    public void setHoldingSurchargeAmount(double holdingSurchargeAmount){this.holdingSurchargeAmount = holdingSurchargeAmount;}
    public double getProfit(){return this.profit;}
    public void setProfit(double profit){this.profit = profit;}
    public double getPayingDiscount(){return this.payingDiscount;}
    public void setPayingDiscount(double payingDiscount){this.payingDiscount = payingDiscount;}
    public double getFrequencySellerDiscount(){return this.frequencySellerDiscount;}
    public void setFrequencySellerDiscount(double frequencySellerDiscount){this.frequencySellerDiscount = frequencySellerDiscount;}
}
