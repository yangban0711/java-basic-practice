package basic.operater;

public class InputPractice {
    public static void main(String[] args) {

        int month = 12;
        int day = 25;
        String str = "크리스마스";

        //12월 25일은 크리스마스입니다.

        //print/println 출력
        System.out.println(month + "월 " + day + "일은 " + str + "입니다.");
        //printf 출력
        System.out.printf("%d월 %d일은 %s입니다", month, day, str);
        // 실수를 표현하는 서식문자 %f -> 기본 6자리까지 표현
        // %.[자리수를 지정하는 숫자]f -> 원하는 자리수까지 표현.(반올림 지원)
        // %라는 문자 자체를 표현할 때는 %% 쓰시면 됩니다.`


        /*
         # 포맷팅 서식 문자 종류
         %d: 부호가 있는 정수 데이터 (decimal)
         %f: 실수 데이터 (floation point)
         %s: 문자열 (String)
         # 탈출 코드 (escape code) -> printf에만 동작하는 게 아니에요.
         - 반드시 따옴표 내에 위치해야 합니다
         - 문자열 내에서 특정 명령을 내리고 싶을 때 사용하는 특수 기호입니다.
         \n: 줄 개행 명령
         \t: 가로 공백 (스페이스 4칸)
       */


    }
}
