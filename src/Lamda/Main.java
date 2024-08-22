package Lamda;

import java.util.List;

import static Lamda.FilterApple.*;

import static Lamda.Color.*;


public class Main {

    public static void main(String[] args) {

        // 사과 바구니 생성
        List<Apple> appleBasket = List.of(
                new Apple(80, GREEN)
                , new Apple(155, GREEN)
                , new Apple(120, RED)
                , new Apple(97, RED)
                , new Apple(200, GREEN)
                , new Apple(50, RED)
                , new Apple(85, YELLOW)
                , new Apple(75, YELLOW)
        );

        System.out.println("========녹색 사과만 필터링=============");
        List<Apple> greenApples = FilterAppleByColor(appleBasket, YELLOW);
        System.out.println(greenApples);

        System.out.println("========원하는 조건의 사과만 필터링=============");
        List<Apple> LightApples = FilterApple(appleBasket, new LightApplePredicate());


        System.out.println("--------------------------------------------");
        List<Apple> apples = FilterApple.(appleBasket,
                                          (apple -> apple.getColor() == GREEN
                                            && apple.getWight() <= 100));
    }
}
