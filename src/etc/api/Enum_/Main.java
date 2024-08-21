package etc.api.Enum_;

public class Main {
    public static void main(String[] args) {

        Developer kim = new Developer();
        kim.name = "kim";
        kim.career = 3;
        kim.lang = Language.JAVA;

        Developer hong = new Developer();
        hong.name = "hong";
        hong.career = 5;
        hong.lang = Language.JAVASCRIPT;

        Developer park = new Developer();
        park.name = "park";
        park.career = 12;
        park.lang = Language.Python;

        System.out.println("kim의 주력언어는 " + kim.lang);
        System.out.println("hong의 주력언어는 컴파일 언어인가? " + kim.lang.isIscompileLang());
        //System.out.println("hong의 주력언어는 z" + kim.lang);
        //System.out.println("kim의 주력언어는 " + kim.lang);

        //ordinal() : 열거형 타입에 열거되어 있는 순서를 점수값으로 리턴
        System.out.println(park.lang.ordinal());
    }

    /*
     # 상수를 정의해서 코드를 작성하면 다양한 문제가 발생할 수 있다.
     1. 상수의 값 자체는 변경이 불가하겠지만, 상수를 받는 객체의 필드 값은 안정적이지 못함.
     2. 상수는 어느 클래스에서나 선언할 수 있기 때문에 무분별한 상수 선언이 이뤄질 수 있음.
     3. 코드의 가독성 또한 좋지 못하다.
     # enum class를 사용하면 얻을 수 있는 장점.
     1. 코드가 단순해지고 가독성이 좋아짐.
     2. 정의한 상수 이외의 값을 컴파일 과정에서 막기 때문에 타입 안정성이 증가함.
     3. 관련있는 상수들끼리 모아놓기 때문에 구현의 의도를 명확하게 파악 가능.
     */
}
