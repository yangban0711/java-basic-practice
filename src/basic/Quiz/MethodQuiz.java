package basic.Quiz;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MethodQuiz {

    static String[] foods = {"chickin", "pasta", "beef"};

    // 배열 내부 한눈에 보기
    static void printFoods() {
        System.out.println(Arrays.toString((foods)));
    }

    // 특정 요소가 배열에 포함되어 있는지의 여부 확인
    static boolean isInclude(String searchTarget) {
        for (int i = 0; i < foods.length; i++) {
            if (searchTarget.equals(foods[i])) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        printFoods();

        if (isInclude("pasta")){
            System.out.println("존재함");
        }
    }
}
