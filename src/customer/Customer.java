package customer;

import product.Product;

/**
 * Created by helix on 8/10/2016.
 */
public class Customer {
    private String location;

    public Customer(String location) {
        this.location = location;
    }


    public void OfferProduct(Product product) {
        System.out.println("Offer: " + product.getName());
    }

    public void recieveProduct(Product product) {
        System.out.println("Đã Nhận được product: " + product.getName());
    }

    public String getLocation() {
        return location;
    }

}
