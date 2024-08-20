package etc.api.Object;

public class Main {
    public static void main(String[] args) {
         Person kim = new Person("김춘식", 30);
         Person hong = new Person("홍길동", 25);

        // 객체 타입의 변수를 출력하거나 값을 얻을 떄
        // 뒤에 자동으로 .toString()이 붙어서 진행됩니다. (Object가 불러주는 메서드)
        System.out.println(kim);

        System.out.println(kim.equals(hong));
        System.out.println(kim.hashCode());
        System.out.println(hong.hashCode());


        //finalize는 gc를 호출하는 순서가 보장되지 않기 때문에
        //사용이 권장되지 않습니다. (객체가 소멸하는 시점을 정확히 판단하기 어려움)
        /*
        kim = null;
        hong = null;
        System.gc();
        */

        Person park = new Person("박영희", 19);

        try {
            Person clonePerson = (Person) park.clone();
            System.out.println("복사된 객체 : " + clonePerson);

        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
