package com.company.Calc;

// default 메서드가 중복되면 재저의 해서  사용하면된다

public class Customer implements  Buy, Sell{
    @Override
    public void buy() {
        System.out.println("사기");
    }

    @Override
    public void sell() {
        System.out.println("판매하기");
    }


    @Override
    public void order() {
        System.out.println("고객 주문");
    }
}
