package ship;

import constant.Constant;
import strategy.ShipStrategy;

/**
 * Created by helix on 8/10/2016.
 */
public class ShipByGlobal implements ShipStrategy {

    public int maxCapacity = Constant.BIG;

    @Override
    public void ship() {
        System.out.println("Ship By " + Constant.GLOBAL);
    }

    @Override
    public int getCapicity() {
        return maxCapacity;
    }

}
