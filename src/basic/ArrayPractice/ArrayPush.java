package basic.ArrayPractice;

import java.util.Arrays;

public class ArrayPush {
    public static void main(String[] args) {

        //push: 맨 끝에 데이터를 추가
        int[] numbers = {10, 20, 30, 40};
        int newNum = 50;

        // 1. 기존 array의 길이보다 1 더 큰 배열 생성
        int[] temp = new int[numbers.length + 1];

        // 2. 기존 데이터를 새로운 배열에 그대로 복사
        for (int i = 0; i < numbers.length; i++) {
            temp[i] = numbers[i];
        }

        // 3.temp 맨 끝에 데이터 삽입
        temp[numbers.length] = newNum;

        // 4. 주소값 이전
        numbers = temp; temp = null;

        System.out.println(Arrays.toString(numbers));
    }
}
