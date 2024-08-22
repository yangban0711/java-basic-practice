package Lamda;

@FunctionalInterface
public interface ApplePredicate {

    //사과를 전달 받으면 조건에 맞는 검사를 수행하고, 결과값을 리턴하는 메서드
    boolean test(Apple apple);
}
