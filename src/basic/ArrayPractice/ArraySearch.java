package basic.ArrayPractice;

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {

        String[] foods = {"aaa", "bbb", "ccc", "ddd"};

        Scanner sc = new Scanner(System.in);

        System.out.println("음식 검색: ");
        String food_name = sc.next();

        for (int i = 0; i < foods.length; i++) {
            if (foods[i].equals(food_name)){
                System.out.println("탐색 완료");
                System.out.println("번호 : " + (i+1) +"번");
                break;
            }
        }
    }
}
