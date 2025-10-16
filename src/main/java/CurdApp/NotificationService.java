package CurdApp;

public class NotificationService {
    void notify(Order order) {

        System.out.println("\n Notification: New " + order.getType() + " order placed!");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("Order Id: " + order.getOrderId());
        System.out.println("Customer: " + order.user.getName());
        System.out.println("Dairy: " + order.user.cart.dairy.getName());

        if (order.getType() == "Delivery" || order.getType() == "delivery") {
        }
        else{
            System.out.println("Dairy address: " + order.user.cart.dairy.getAddress());
        }
        System.out.println("Ordered Products: ");

        for (MenuList list : order.user.cart.menu) {
            System.out.println("    -" + list.getName() + "(" + list.getPrice() + ")");
        }

        System.out.println("Total: " + order.user.cart.getTotalPrice());
        System.out.println("-----Payment Done-----");

    }
}
