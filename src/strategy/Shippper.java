package strategy;

import customer.Customer;
import product.Product;
import ship.ShipByExpress;
import ship.ShipByGlobal;
import ship.ShipByMoto;
import ship.ShipByOffice;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by helix on 8/10/2016.
 */
public class Shippper {
    public Customer customer;
    public Product product;

    public Shippper(Customer customer, Product product) {
        this.customer = customer;
        this.product = product;
    }

    public void Order() {
        Scanner scanner = new Scanner(System.in);

        int wieght;
        System.out.println("nhap khối lượng Product: ");
        wieght = scanner.nextInt();
        product.setCapacity(wieght);


        ArrayList<ShipStrategy> strategyInternal = new ArrayList<>();
        strategyInternal.add(new ShipByMoto());
        strategyInternal.add(new ShipByOffice());

        ArrayList<ShipStrategy> strategyNational = new ArrayList<>();
        strategyNational.add(new ShipByExpress());
        strategyNational.add(new ShipByGlobal());


        if (customer.getLocation().equals(product.getLocation())) {
            System.out.println("Product Internal");
            System.out.println("---------Ship----------");
            System.out.println("1: Chuyen hang Xe May (<= 20kg)");
            System.out.println("2: Chuyen Hang Buu Dien ");

            int temp = scanner.nextInt();

            switch (temp) {
                case 1:
                    if (product.getCapacity() <= strategyInternal.get(0).getCapicity()) {
                        strategyInternal.get(0).ship();
                        customer.recieveProduct(product);
                        break;
                    } else {
                        System.out.println("Quá khối lượng");
                        System.out.println("Hãy chuyển bằng Bưu điện");
                    }
                    break;
                case 2:
                    strategyInternal.get(1).ship();
                    customer.recieveProduct(product);
                    break;
                default:
                    return;
            }

        } else {
            System.out.println("Product international");
            System.out.println("---------Ship----------");
            System.out.println("1: Chuyen Hang Express (<= 10kg)");
            System.out.println("2: Chuyen hang Toan Cau ");

            int temp = scanner.nextInt();
            switch (temp) {
                case 1:
                    if (product.getCapacity() <= strategyNational.get(0).getCapicity()) {
                        strategyNational.get(0).ship();
                        customer.recieveProduct(product);
                    } else {
                        System.out.println("Quá khối lượng");
                        System.out.println("Hãy Chuyển bằng Global");
                    }
                    break;
                case 2:
                    strategyNational.get(1).ship();
                    customer.recieveProduct(product);
                    break;
                default:
                    return;
            }

        }

    }

}
