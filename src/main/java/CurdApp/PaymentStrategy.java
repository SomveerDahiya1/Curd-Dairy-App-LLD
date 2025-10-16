package CurdApp;

public abstract class PaymentStrategy {
    String input;
    abstract boolean pay(double amount);
}

class DebitCard extends PaymentStrategy {

    DebitCard(String cardNumber) {
        input = cardNumber;
    }

    boolean pay(double payAmount) {
        System.out.println("Payment successful via Debit card: " + input + "-" + payAmount);
        return true;
    }

}

class UPI extends PaymentStrategy {
    UPI(String cardNumber) {
        input = cardNumber;
    }

    boolean pay(double payAmount) {
        System.out.println("Payment successful via Debit UPI: " + input + "-" + payAmount);
        return true;
    }
}