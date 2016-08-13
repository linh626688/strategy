package ship;

import constant.Constant;
import strategy.ShipStrategy;

/**
 * Created by helix on 8/10/2016.
 */
public class ShipByOffice implements ShipStrategy {
    public int maxCapacity = Constant.BIG;

    @Override
    public void ship() {
        System.out.println("Ship By " + Constant.OFFICE);
    }

    @Override
    public int getCapicity() {
        return maxCapacity;
    }

}
