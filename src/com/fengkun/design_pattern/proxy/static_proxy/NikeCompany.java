package com.fengkun.design_pattern.proxy.static_proxy;

/**
 * Created by fengkunangel on 2018/9/18.
 */
public class NikeCompany implements NikeProvider {

    private final double STANDARD_US_PRICE = 100.0;

    @Override
    public Shoes provideShoes(NikeCustomer customer) {
        return new Shoes("kobe 9", new Currency(Currency.CurrencyType.USD, STANDARD_US_PRICE * customer.getDiscount()));
    }
}
