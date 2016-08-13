package main;

import constant.Constant;
import customer.Customer;
import product.Product;
import strategy.Shippper;

/**
 * Created by helix on 8/10/2016.
 */
public class App {
    public static void main(String[] args) {
        Customer cus = new Customer(Constant.VI);
        Product pro = new Product(Constant.US, "Tủ Lanh Sanyo ", 5000);

        Shippper shippper = new Shippper(cus, pro);
        shippper.Order();
    }
}
