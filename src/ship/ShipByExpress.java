package ship;

import constant.Constant;
import strategy.ShipStrategy;

/**
 * Created by helix on 8/10/2016.
 */
public class ShipByExpress implements ShipStrategy {
    public int maxCapacity = Constant.SMALL;

    @Override
    public void ship() {
        System.out.println("Ship By " + Constant.Express);
    }
    @Override
    public int getCapicity() {
        return maxCapacity;
    }
}
