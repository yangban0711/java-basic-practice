package basic.operater;

// 1. Scanner API 로딩 (제공되는 Scanner 클래스 정보를 현재 클래스로 가져오기
// -> main처럼 Scanner 입력시 자동생성
import java.util.Scanner;

public class OutputPractice {

    public static void main(String[] args) {

        // 2. 스캐너 객체를 생성
        // 3. 객체 type은 Scanner
       Scanner jav_input = new Scanner(System.in);

       /*
         4. Scanner의 함수들을 이용하여 데이터를 입력받을 수 있습니다.
         - next(): 공백이 없는 문자열을 입력받습니다.
         - nextLine(): 공백을 포함한 문자를 입력받습니다.
         - next + 기본타입이름(): 해당 타입에 맞는 데이터를 입력받습니다.
         ex)
             nextInt(): 정수 데이터를 입력받습니다.
             nextDouble(): 실수 데이터를 입력받습니다.
      */
        System.out.println("이름을 입력하시오: ");
        String name =jav_input.nextLine();
        System.out.println("name = " + name);

        System.out.println("나이를 입력하시오: ");
        int age =jav_input.nextInt();
        System.out.println(age + "살");

        //스캐너 닫기
        jav_input.close();
    }
}

