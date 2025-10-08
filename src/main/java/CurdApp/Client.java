package CurdApp;
import java.util.ArrayList;
import java.util.List;


public class Client {
    public static void main(String[] args) {

        User User1 = new User("Somveer Dahiya","Delhi");//User-Location-Delhi
        CurdApp curdApp = new CurdApp();// Main app Interface
        curdApp.initializingDairy();//Initializing Dairies & Adding to the list.
        List<Dairy> foundDairies =  curdApp.searchDairy("Delhi");//Dairies of Location-Delhi.

        if(foundDairies==null){
            System.out.println("----Dairy not found----");
        }
        else { //All Dairies of Location - Delhi.
            System.out.println("------Dairy found------");
            for(Dairy dairy:foundDairies){
                System.out.println(dairy.getName());
            }
        }

        curdApp.selectDairy(User1,foundDairies.get(0));
        curdApp.addToCart(User1,"Cow's Milk");

    }

}
