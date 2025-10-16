package CurdApp;

import java.util.ArrayList;
import java.util.List;

public class Dairy {
    private String name;
    private String address;
    private static int dairyId;
    List<MenuList> menuList = new ArrayList<>();

    Dairy(String name, String address) {
        this.name = name;
        this.address = address;
        dairyId += 1;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAddress(String address) {
        this.address = address;
    }

    String getName() {
        return name;
    }

    String getAddress() {
        return address;
    }

    int getId() {
        return dairyId;
    }

    void addMenu(MenuList menu) {
        menuList.add(menu);
    }

    void showMenu() {
        System.out.println("- - - - " + name + "'s Menu List - - - -");

        for (MenuList menu : menuList) {
            System.out.println(menu.getName() + ":" + menu.getPrice() + "₨");
        }
    }

    Dairy getDairy() {
        return this;
    }
}
