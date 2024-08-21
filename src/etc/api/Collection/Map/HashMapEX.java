package etc.api.Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapEX {

    public static void main(String[] args) {
        /*
        Map
        -Key / Value가 한 세트를 이루는 자료구조
        -Key는 중복저장을 허용하지 않음

         */

        // Map은 Key, Value 쌍을 이루기 때문에 멀티 제네릭을 설정해야함
        Map<String, String> map = new HashMap<>();

        map.put("No.1", "a");
        map.put("No.2", "b");
        map.put("No.3", "c");

        // 중복사용할 경우 기존 Key에 맵핑된 Value가 수정됨


        // 맵핑되지 않은 키를 부를 경우 Null이 반환됨
        String s =  map.get("No.99");
        System.out.println(s);

        // 그러므로 Key의 존재 유무를 확인해야 오류를 방지할 수 있음
        System.out.println(map.containsKey("No.2"));

        // Map에서 Key들만 추출하는 메서드 KeySet()
        // 모든 Key들을 Set에 담아서 반환합니다. -> forEach 사용이 가능해짐
        for (String sr : map.keySet()){
            System.out.printf("Key : %s, Value : %s \n", sr ,map.get(sr));
        }
    }
}
