package basic.ArrayPractice;

import javax.swing.*;
import java.util.Arrays;

public class ArrayBasics {
    public static void main(String[] args) {


        //배역 생성 순서

        // 1. 배열 변수 선언
        int[] numbers;

        // 2. 배열 객체를 생성
        int arr_len = 5;
        numbers = new int[arr_len];

        // 3. 배열 내부 초기화
        numbers[0] = 50;
        numbers[1] = 77;
        numbers[2] = (int) 3.14;
        numbers[3] = numbers[0] + 20;
        numbers[4] = numbers[1+2];

        // 4. 출력해보기
        for (int i = 0; i < arr_len; i++)
            System.out.println(numbers[i]);
        //forech 형태
        for(int n : numbers)
            System.out.println(n);

        //배열내부를 문자열 형태로 간결하게 출력
        System.out.println(Arrays.toString(numbers));
    }
}
