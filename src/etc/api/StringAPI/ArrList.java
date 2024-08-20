package etc.api.StringAPI;

/*
         # ArrayList
         - 배열과 다르게 크기가 자동으로 조절되는 자료구조 클래스.
         - 배열과 유사한 형태이기 때문에 순차적으로 데이터에 접근하기가 좋다.
         - 인덱스를 활용하며, 객체의 중복 저장을 허용한다.
*/

import java.util.ArrayList;
import java.util.List;

public class ArrList {

    public static void main(String[] args) {

        // <> -> 제네릭: 타입의 형식을 지정하여 타입 안정성을 꾀하기 위한 문법
        List<String> nick = new ArrayList<>();

        String str = ("dog-awww");

        nick.add(str);
        nick.add("cat-eong");
        nick.add(new String("frog-brrr"));

        System.out.println(nick);

        nick.add(1, "inside");
        System.out.println(nick);

        //get(인덱스): 리스트 내부의 객체들 참조
        String name = nick.get(3);
        System.out.println(nick);
        System.out.println(name);

        System.out.println("nick size: " + nick.size());

        // set(인덱스, 수정할 객체); 리스트 내부 객체 수정
        nick.set(1, "goat-beeeee");
        System.out.println(nick);

        //remove(인덱스) 객체 제거
        nick.remove(3);
        System.out.println(nick);

        //리스트 반복문
        for (int i = 0; i < nick.size(); i++){
            System.out.println(nick.get(i));
        }

        //contain(객체); 리시트 내의 객체 유무 파악(boolian)
        int Num = nick.indexOf("goat-beeeee");
        System.out.println(nick.contains("goat-beeeee"));
        System.out.println(Num);
     }


}
