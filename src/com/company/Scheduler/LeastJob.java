package com.company.Scheduler;

public class LeastJob implements Scheduler {
    @Override
    public void getNextCall() {
        System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("다음 순서 상담원에게 배분합니다");
    }
}
/*
* static(정적) 메서드 : 인스턴스 생성과 상관 없이 인터페이스 타입으로 사용할 수 있는 메서드
* private 메서드 : 인터페이스를 구현한 클래스에서 사용하거나 재정의 할 수 없음, 인터페이스 내부에서만 기능을 제공하기 위해 구현하는 메서드
* 디볼트 메서드 : 기본 구현을 가지는 메서드, 구현 클래스에서 재정의 할 수 있음.
 */