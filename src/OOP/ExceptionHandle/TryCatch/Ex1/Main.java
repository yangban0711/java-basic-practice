package OOP.ExceptionHandle.TryCatch.Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("정수1 : ");
        int i = sc.nextInt();
        System.out.println("정수2 : ");
        int j = sc.nextInt();

        try {
            System.out.printf("%d / %d = %d\n",i, j, i/j);
        }
        catch(Exception e){              //Exception은 거의 모든 예외문의 부모이다. 즉, 다형성의 특성을 활용한 것이다.
            System.out.println("0으로 나누지 마세요");
        }

        System.out.println("프로그램 정상종료");
    }
}
