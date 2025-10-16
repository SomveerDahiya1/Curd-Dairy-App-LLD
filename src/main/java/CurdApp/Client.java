package CurdApp;

import java.util.ArrayList;
import java.util.List;


public class Client {
    public static void main(String[] args) {

        User User1 = new User("Somveer Dahiya", "Delhi");//User-Location-Delhi
        CurdApp curdApp = new CurdApp();// Main app Interface
        curdApp.initializingDairy();//Initializing Dairies & Adding to the list
        List<Dairy> foundDairies = curdApp.searchDairy("Delhi");//Dairies of Location-Delhi

        if (foundDairies == null) {
            System.out.println("----Dairies not found----");
        }
        else { //All Dairies of Location - Delhi.
            System.out.println("------Dairies nears you------");

            for (Dairy dairy : foundDairies) {
                System.out.println(dairy.getName());
            }
        }

        curdApp.selectDairy(User1, foundDairies.get(0)); //Selects a Random dairy
        curdApp.addToCart(User1, "Cow's Milk");//Adding item to the cart
        curdApp.addToCart(User1, "Butter");


        Order order = curdApp.checkout(User1, "Delivery", new DebitCard("1223456754"));
        curdApp.pay(User1, order);

        OrderManager OM =OrderManager.getInstance(); //Order Manager interface
        OM.addOrder(order); //Adding Orders
        OM.listOrders();   //Listing all the Orders with details


    }

}
