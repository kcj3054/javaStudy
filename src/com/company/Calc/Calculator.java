package com.company.Calc;

//Calc를 일부만 구현하면 추상 메소드가 된다, abstract 붙여주면된다
// Type 상속
public abstract class Calculator implements Calc {


    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int substract(int num1, int num2) {
        return num1 - num2;
    }

}
