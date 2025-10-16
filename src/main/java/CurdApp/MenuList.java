package CurdApp;

public class MenuList {
    private String name;
    private double price;

    MenuList(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void setName(String name) {
        this.name = name;
    }

    void setPrice(double price) {
        this.price = price;
    }

    String getName() {
        return name;
    }

    double getPrice() {
        return price;
    }

}
