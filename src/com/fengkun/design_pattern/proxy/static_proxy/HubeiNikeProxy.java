package com.fengkun.design_pattern.proxy.static_proxy;

/**
 * Created by fengkunangel on 2018/9/18.
 */
public class HubeiNikeProxy implements NikeProvider, NikeCustomer {

    private ChinaNikeProxy chinaNikeProxy;

    public ChinaNikeProxy getChinaNikeProxy() {
        return chinaNikeProxy;
    }

    public HubeiNikeProxy(ChinaNikeProxy chinaNikeProxy) {

        this.chinaNikeProxy = chinaNikeProxy;
    }

    @Override
    public Shoes provideShoes(NikeCustomer customer) {
        if (!(customer instanceof NikeRetailCustomer)) {
            throw new NoRetailCustomerException();
        }
        NikeRetailCustomer customer1 = (NikeRetailCustomer)customer;
        Shoes shoes = chinaNikeProxy.provideShoes(this);
        Currency price = shoes.getPrice();
        NikeRetailCustomer.Location location = customer1.getLocation();
        if (location != NikeRetailCustomer.Location.HUBEI) {
            price.setValue(price.getValue() * customer1.getDiscount() + 100);
        } else {
            price.setValue(price.getValue() * customer1.getDiscount() + 50);
        }
        return shoes;
    }

    @Override
    public double getDiscount() {
        return 1.0;
    }
}
