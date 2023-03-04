package school.eva;

public final class Calculation {
    public static double calculateInterest(double capital, double rate){
        return capital * rate / 100;
    }
    public static double calculateInterestRate(double capital, double interest){
        return  interest / capital * 100;
    }
    public static double calculateCapital(double rate, double interest){
        return interest * 100 / rate;
    }
}
