public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println(service.calculate(1,1_000_000, 9.99));
        System.out.println();
        System.out.println(service.calculate(2,1_000_000, 9.99));
        System.out.println();
        System.out.println(service.calculate(3,1_000_000, 9.99));
    }
}