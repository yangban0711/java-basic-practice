package etc.api.Enum_;

public enum Language {


    JAVA("자바", true),
    Python("파이썬", false),
    CPP("C++", true),
    JAVASCRIPT("자바스크립트", false),
    C("C", true);

    //상수와 연관시킬 데이터를 담을 필드를 선언
    private final String name;
    private final boolean iscompileLang;

    public String getName() {
        return name;
    }

    public boolean isIscompileLang() {
        return iscompileLang;
    }

    // 외부에서 enum 타입의 상수를 사용하면 enum 객체가 생성됨
    // 위의 상수에 선언한 방식의 생성자 호출문을 통해 연관 문자가 매게값으로 전달되면서 필드를 초기화
    private Language(String name, boolean iscompileLang) {
        this.name = name;
        this.iscompileLang = iscompileLang;
    }
}
