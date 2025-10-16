package CurdApp;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    static OrderManager instance = null ;
    List<Order> orderList = new ArrayList<Order>();
    private OrderManager() {

    }
    static OrderManager getInstance() {
        if(instance == null) {
            instance = new OrderManager();
        }
        return instance;
    }
    void addOrder(Order order) {
        orderList.add(order);
        System.out.println("-----Order Added-----");
    }
    void listOrders() {
        for (Order order : orderList) {
            System.out.println("\n\n------------------------");
            System.out.println("----Order Lists----");

            System.out.println("Order Id: "+order.getOrderId());
            System.out.println("Ordered for "+order.user.getName());
            if(order.getType()=="Delivery"||order.getType()=="delivery")
            {
                System.out.println("Ordered at "+order.user.getAddress());
            }
            else
            {
                System.out.println("Ordered picked from "+order.user.cart.dairy.getAddress());
            }
            System.out.println("Total: "+order.user.cart.getTotalPrice());

        }
    }
}
