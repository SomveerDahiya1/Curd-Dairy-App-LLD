package CurdApp;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    Dairy dairy;
    List<MenuList> menu = new ArrayList<MenuList>();

    Cart() {
        dairy = null;
    }

    public void addItem(MenuList menuList) {
        if (dairy == null) {
            System.out.println("OOPs,First Select Restaurant.");
        }
        else {
            menu.add(menuList);
        }
    }

    public double getTotalPrice() {
        int sum = 0;

        for (MenuList menuList : menu) {
            sum += menuList.getPrice();
        }
        return sum;
    }

    Dairy getDairy(Dairy dairy) {
        dairy = this.dairy;
        return dairy;
    }

    void setDairy(Dairy dairy) {
        this.dairy = dairy;
    }

    void printCart() {
        System.out.println("----Cart Items----");

        for (MenuList menuList : menu) {
            System.out.println(menuList.getName());
        }
    }
}
