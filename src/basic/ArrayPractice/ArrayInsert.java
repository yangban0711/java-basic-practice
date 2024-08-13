package basic.ArrayPractice;

import java.util.Arrays;

public class ArrayInsert {
    public static void main(String[] args) {
         int[] arr = {10, 20, 30 ,40 ,50};
         int newNum = 33;
         int targetIndex = 3;

         //30과 40 사이에 삽입하고 싶다
         // 1. 사이즈 1만큼 더 큰 새로운 배열을 생성
        int[] temp = new int[arr.length +1];

         // 2. 기존 데이터를 temp에 복사
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        // 3. 삽입 위치에서 한칸씩 이동
        for (int i = arr.length; i > targetIndex; i--) {
            temp[i] = temp[i-1];
        }

        // 4, 지정 위치에 삽입
        temp[targetIndex] = newNum;

        // 5. arr로 주소값 디전
        arr = temp; temp = null;

        System.out.println(Arrays.toString(arr));
    }
}
