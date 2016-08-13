package product;

/**
 * Created by helix on 8/10/2016.
 */
public class Product {
    public String location;
    public String name;
    public int cost;
    public int capacity;

    public Product(String location, String name, int cost) {
        this.location = location;
        this.name = name;
        this.cost = cost;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public void setCapacity(int capa) {
        this.capacity = capa;
    }

}
