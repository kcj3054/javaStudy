package com.company.Calc;

public class CustomerTest {

    public static void main(String[] args) {
        Customer customer = new Customer();

        Buy buyer = customer;
        buyer.buy();

        Sell seller = customer;
        seller.sell();


        customer.order(); // 가상 메서드
        buyer.order(); // 현재 바인딩 된 것이 customer이기 때문에 customer의 order 가불린다
        seller.order();

    }


}
