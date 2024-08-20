package etc.api.Object;

import java.util.Objects;

public class Person implements Cloneable {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {            //Object 타입을 받으므로 누구나 들어올 수 있다.
        if (this == obj) return true;         //주소값이 같다면 같은 객체야
        if (obj instanceof Person) {
            Person p = (Person) obj;
            if (p.age == this.age) return true;
        }
        return false;
    }

    //equals를 오버라이딩 할 때는 hashCode도 함께 오버라이딩을 진행해 주시는 것이 좋습니다.
    //equals를 재 정의한다는 것은 내가 원하는 방식의 동등 비교를 하겠다는 것이기 때문에
    //hashcode의 값도 그에 맞게 같이 재 정의가 되어야 합니다. (hash 주소를 equals에 맞게 정의)

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
    // 객체 복사 메서드
    // Cloneable 인터페이스를 사용함
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {       // 추후 버전에서 없어질 가능성이 있는 기능
        System.out.println(this.name + "으앙 쥬금 ㅠㅠ");                            // 사용하지 않을 것을 권장함
    }
}
