package CurdApp;

import java.util.ArrayList;

public class CurdApp {
    DairyManager DM = DairyManager.getInstance();
    Order order;
    Cart cart;
    PaymentStrategy paymentStrategy;

    void initializingDairy() {
        Dairy D1 = new Dairy("James's Dairy", "Delhi");
        D1.addMenu(new MenuList("Cow's Milk", 120));
        D1.addMenu(new MenuList("Butter", 1500));
        D1.addMenu(new MenuList("Curd", 100));

        Dairy D2 = new Dairy("John's Dairy", "Delhi");
        D2.addMenu(new MenuList("Cow's Milk", 120));
        D2.addMenu(new MenuList("Butter", 1500));
        D2.addMenu(new MenuList("Curd", 100));

        Dairy D3 = new Dairy("Karan's Dairy", "Haryana");
        D3.addMenu(new MenuList("Buffalo's Milk", 180));
        D3.addMenu(new MenuList("Butter", 1800));
        D3.addMenu(new MenuList("Curd", 200));

        Dairy D4 = new Dairy("Karl's Dairy", "Mumbai");
        D4.addMenu(new MenuList("Buffalo's Milk", 180));
        D4.addMenu(new MenuList("Cow's Milk", 120));
        D4.addMenu(new MenuList("Butter Milk", 50));

        DM.addDairy(D1);
        DM.addDairy(D2);
        DM.addDairy(D3);
        DM.addDairy(D4);

    }

    ArrayList<Dairy> searchDairy(String location) {
        return DM.searchByLocation(location);
    }

    void selectDairy(User user, Dairy dairy) {
        cart = user.getCart();
        cart.setDairy(dairy);
        System.out.println(user.getName() + " selected " + dairy.getName());
    }

    void addToCart(User user, String name) {

        for (MenuList list : user.cart.dairy.menuList) {
            Dairy dairy = cart.dairy.getDairy();
            if (dairy == null) {
                System.out.println("----First select Dairy----");
                return;
            }
            if (list.getName().equals(name)) {
                System.out.println("Added to Cart-->" + "[" + name + "]");
                cart.addItem(list);
                break;
            }
        }
    }

    void printCart(User user) {
        System.out.println("----Cart----");

        for (MenuList menuList : user.cart.menu) {
            System.out.println(menuList.getName());
        }
        System.out.println("Total: " + cart.getTotalPrice());

    }

    Order checkout(User user, String orderType, PaymentStrategy paymentStrategy) {
        order = new CheckoutOrder();
        order.checkout(user, orderType, paymentStrategy);
        this.paymentStrategy = paymentStrategy;
        return order;
    }

    void pay(User user, Order order) {
        boolean isPaymentSuccess = order.paymentStrategy.pay(user.cart.getTotalPrice());
        if (isPaymentSuccess) {
            order.notificationService.notify(order);
        }
    }
}