package com.fengkun.design_pattern.proxy.static_proxy;

/**
 * Created by fengkunangel on 2018/9/19.
 */
public class BeiJingNikeProxy implements NikeProvider, NikeCustomer {

    private ChinaNikeProxy chinaNikeProxy;

    public ChinaNikeProxy getChinaNikeProxy() {
        return chinaNikeProxy;
    }

    public BeiJingNikeProxy(ChinaNikeProxy chinaNikeProxy) {

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
        if (location != NikeRetailCustomer.Location.BEIJING) {
            throw new NotBeiJingCustomerException();
        } else {
            price.setValue(price.getValue() * customer1.getDiscount() + 100);
        }
        return shoes;
    }

    @Override
    public double getDiscount() {
        return 0.98;
    }

    private class NotBeiJingCustomerException extends RuntimeException {

        public NotBeiJingCustomerException() {
            super("抱歉，改商品只提供北京");
        }
    }
}
