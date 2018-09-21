package com.fengkun.design_pattern.proxy.static_proxy;

/**
 * Created by fengkunangel on 2018/9/18.
 */
public class NikeRetailCustomer implements NikeCustomer {

    public static enum Location{
        HUBEI,
        BEIJING,
        JAPAN;
    }

    private Location location;

    private double discount;

    public NikeRetailCustomer(Location location, double discount) {
        this.location = location;
        this.discount = discount;
    }

    public Location getLocation() {
        return location;
    }

    @Override
    public double getDiscount() {
        return discount;
    }
}
