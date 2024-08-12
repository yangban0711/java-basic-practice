package basic.casting;

public class CastingPractice2 {

    public static void main(String[] args) {

        char c = 'B';
        int i = 2;

        int intResult = c + i;
        char charResult = (char) (c+ i);

        System.out.println("intResult = " + intResult);
        System.out.println("charResult = " + charResult);

        ////////////////////////////

        int k = 10;
        double d = k / 4;
        //int k와 int 4의 계산결과는 int가 된다.
        System.out.println("d = " + d);

        d = (double) k / 4;
        System.out.println("d = " + d);
    }
}
