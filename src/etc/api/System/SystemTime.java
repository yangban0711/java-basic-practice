package etc.api.System;

public class SystemTime {
    public static void main(String[] args) {


        //1970년 1월 1일 자정 기준으로부터 흐른 시간
        long start = System.currentTimeMillis();

        int total = 0;
        for (int i = 0; i < 20000000; i++) {
            total += 0;
        }

        long end =System.currentTimeMillis();

        System.out.println("실행 소요시간: " + (end - start) *0.001 + "초");
    }
}
