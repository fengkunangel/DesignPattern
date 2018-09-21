package com.fengkun.design_pattern.proxy.static_proxy;

/**
 * Created by fengkunangel on 2018/9/19.
 */
public class ProxyMain {

    public static void main(String[] args) {
        NikeCompany nikeCompany = new NikeCompany();
        ChinaNikeProxy chinaNikeProxy = new ChinaNikeProxy(nikeCompany, 0.95);
        JapanNikeProxy japanNikeProxy = new JapanNikeProxy(nikeCompany, 0.93);
        Shoes shoes = japanNikeProxy.provideShoes(new NikeRetailCustomer(NikeRetailCustomer.Location.JAPAN, 1.0));
        System.out.println(shoes);

        Shoes shoes1 = chinaNikeProxy.provideShoes(new NikeRetailCustomer(NikeRetailCustomer.Location.HUBEI, 1.0));
        System.out.println(shoes1);

        BeiJingNikeProxy beiJingNikeProxy = new BeiJingNikeProxy(chinaNikeProxy);
        Shoes shoes2 = beiJingNikeProxy.provideShoes(new NikeRetailCustomer(NikeRetailCustomer.Location.HUBEI, 1.0));
    }
}
