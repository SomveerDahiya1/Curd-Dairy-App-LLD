package CurdApp;

public abstract class Order {
    abstract void checkout(User user, String orderType, PaymentStrategy paymentStrategy);

    PaymentStrategy paymentStrategy;
    OrderFactory factory;
    User user;
    static int orderId;
    Order order;
    String type;
    NotificationService notificationService = new NotificationService();

    void setUser(User user) {
        this.user = user;
    }

    String getUser() {
        return user.getName();
    }

    abstract String getType();

    abstract int getOrderId();

}

class CheckoutOrder extends Order {
    CheckoutOrder() {
        orderId += 1;
    }

    @Override
    int getOrderId() {
        return orderId;
    }

    @Override
    void checkout(User user, String orderType, PaymentStrategy paymentStrategy) {

        factory = new OrderFactory(orderType);
        OrderType Type = factory.getType();
        Type.doCheckout(orderType);
        type = orderType;

        System.out.println("----Order Details----");
        System.out.println("Order Type: " + Type.getTypeName());
        System.out.println("Dairy :" + user.cart.dairy.getName() + "," + user.cart.dairy.getAddress());
        System.out.println("--Cart Items--");

        for (MenuList cartItem : user.cart.menu) {
            System.out.println(cartItem.getName() + " :" + cartItem.getPrice());
        }

        System.out.println("Total :" + user.cart.getTotalPrice());
        setPaymentStrategy(paymentStrategy);
        setUser(user);

    }


    @Override
    String getType() {
        return type;
    }

    void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
}
