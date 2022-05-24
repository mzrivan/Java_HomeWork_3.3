public class CreditPaymentService {
    public int calculate(int years, int creditSum, double percent) {
        double monthPercent = percent / 100 / 12;
        int payment = (int) (creditSum * (monthPercent + (monthPercent / (Math.pow(1 + monthPercent, 12 * years) - 1))));
        return payment;
    }
}
