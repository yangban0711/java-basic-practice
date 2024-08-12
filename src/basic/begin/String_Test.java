package basic.begin;


public class String_Test {

    /**
     * /*
     *          # 문자열을 저장할 수 있는 데이터 타입 String
     *          - 저장하고 싶은 문자열을 겹따옴표("")에 담아 대입합니다.
     *          - String은 기본 데이터 타입은 아니지만 자주 쓰이기 때문에
     *          기본 데이터 타입처럼 사용합니다. (사실은 객체 타입)
     *
     */
    public static void main(String[] args) {
        String str = "hello";
        String s1 = "my dream";
        String s2 = "is a programmer";

        System.out.println(str + s1 + s2);

        int month = 7;
        int date = 11;

        System.out.println("내 생일은" + month + date);
    }

}
