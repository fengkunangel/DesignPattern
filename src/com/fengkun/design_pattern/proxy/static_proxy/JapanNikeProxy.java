package com.fengkun.design_pattern.proxy.static_proxy;

/**
 * Created by fengkunangel on 2018/9/18.
 */
public class JapanNikeProxy implements NikeProvider, NikeCustomer {

    private NikeCompany nikeCompany;

    private double discount;

    public JapanNikeProxy(NikeCompany nikeCompany, double discount) {
        this.nikeCompany = nikeCompany;
        this.discount = discount;
    }

    @Override
    public Shoes provideShoes(NikeCustomer customer) {
        Shoes shoes = nikeCompany.provideShoes(this);
        shoes.setName("鞋子");
        Currency price = shoes.getPrice();
        double usPrice = price.getValue();
        double yenPrice = getYenPrice(usPrice) * customer.getDiscount();
        price.setType(Currency.CurrencyType.YEN);
        price.setValue(yenPrice);
        return shoes;
    }

    private double getYenPrice(double usPrice) {
        return Rate.getYenRate() * usPrice;
    }

    public NikeCompany getNikeCompany() {
        return nikeCompany;
    }

    public void setNikeCompany(NikeCompany nikeCompany) {
        this.nikeCompany = nikeCompany;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public double getDiscount() {
        return discount;
    }
}
