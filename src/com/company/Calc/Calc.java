package com.company.Calc;

public interface Calc {

    final double PI = 3.14; // hea에 메모리가 잡힌다
   public static final int ERROR = -999999999; // public static final  아무것도 쓰지않아도  상수로 선언이 된것으로 된다

    public abstract int  add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

     default void description() {
        System.out.println("정수 계산기를 구현합니다 ");
        }


        static int total(int [] arr) {
        int total = 0;

        for(int i : arr) total += i;

        return total;
        }

    }

