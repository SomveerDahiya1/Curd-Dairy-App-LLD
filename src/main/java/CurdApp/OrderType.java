package CurdApp;

public abstract class OrderType {
    abstract void doCheckout(String orderType);

    abstract String getTypeName();
}

class DeliveryOrder extends OrderType {
    @Override
    void doCheckout(String orderType) {
        System.out.println("Delivery Order");
    }

    @Override
    String getTypeName() {
        return "Delivery Order";
    }
}

class PickupOrder extends OrderType {
    @Override
    void doCheckout(String orderType) {
        System.out.println("Pickup Order");
    }

    @Override
    String getTypeName() {
        return "Pickup Order";
    }
}