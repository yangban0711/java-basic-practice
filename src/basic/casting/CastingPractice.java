package basic.casting;

public class CastingPractice {

    /*
         - 크기가 작은 데이터 타입의 자료를 큰 데이터 타입으로 변환할 때는
          자바 가상 머신 (JVM)이 자동으로 타입을 올려서 변환해 줍니다.
          (promotion, UpCasting)
    */

    /*
         - 크기가 큰 데이터 타입의 값을 작은 데이터 타입으로 변환하려면
          반드시 형 변환 연산자: (type)를 사용하여 명시적으로
          형 변환을 진행해 주셔야 합니다. (DownCasting)

         - 명시적으로 형 변환을 해야 하는 이유는, DownCasting의 경우
          저장 공간이 줄어들어 데이터 손실의 가능성이 항상 존재하기 때문입니다.
          (overflow, underflow)
    */

    public static void main(String[] args) {

        byte b = 10;
        int i = b;
        System.out.println("i = " + i);

        char c = '가';
        i = c;
        System.out.println("가의 문자 번호: " + i);

        int k = 500;
        double g = k;
        System.out.println("int 500 = double " + g);

        int i1 = 72;
        char c1 = (char) i1;
        System.out.println("c1 = " + c1);

        //값손실 예시
        double d1 = 4.98765;
        int i2 = (int) d1;
        System.out.println("double 4.98765 = int " + i2 * 100000);
    }
}
