package CurdApp;

public class OrderFactory {
    String type;

    OrderFactory(String type) {
        this.type = type;
    }

    OrderType getType() {
        if (type == "Delivery" || type == "deilvery") {
            return new DeliveryOrder();
        }
        else {
            return new PickupOrder();
        }
    }
}
