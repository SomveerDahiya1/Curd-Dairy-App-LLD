package CurdApp;

public class User {
    String name;
    String address;
    Cart cart;
    static int userId;

    public User(String name, String address) {
        this.name = name;
        this.address = address;
        cart = new Cart();
    }

    void setName(String name) {
        this.name = name;
    }

    void setAddress(String address) {
        this.address = address;
    }

    String getName() {
        return this.name;
    }

    String getAddress() {
        return this.address;
    }

    Cart getCart() {
        return this.cart;
    }

}
