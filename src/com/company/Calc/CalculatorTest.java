package com.company.Calc;

class CalculatorTest {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 2;

        //client는 어떻게 구현되었는지 상관없이 interface의 정의만을 보고 사용할 수 있음

        Calc calc = new CompleteCalc(); // Calc라는 타입을 가지고 있다 타입상속
        //Calc calc1 = new Calc(); 인터페이스라서 x
        //Calc calc2 = new Calculator(); 추상클래스라서 x

       System.out.println(calc.add(num1 , num2));

       // calc.showInfo(); calc가 타입이 Calc라서 CompleteCalc서 구현한 showInfo는 안보인다
        //Calc타입에 종속되어서 Calc 타입인 것만 가능하다

        calc.description();

        int [] arr = {1, 2, 3, 4, 5};
        int sum = Calc.total(arr);
        System.out.println(sum);
    }
}
