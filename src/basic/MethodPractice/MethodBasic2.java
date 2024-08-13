package basic.MethodPractice;

public class MethodBasic2 {
    //매개변수가 필요 없는 경우
    static String selectRandomFood(){
        String[] food_list = {"aaa", "bbb", "ccc", "ddd"};

        int i = (int) (Math.random() * 4);

        return food_list[i];
    }

    static int ListRandomPick(int[] lt){
        int i = (int) (Math.random() * lt.length);

        return lt[i];
    }

    public static void main(String[] args) {
        System.out.println(selectRandomFood());

        int[] numlist = {1, 2, 3, 4, 5};
        System.out.println(ListRandomPick(numlist));

    }
}

/*
# 매개 변수 (parameter, argument)

1. 매개변수는 메서드를 호출할 때, 메서드 실행에 필요한 값들을
 메서드 내부로 전달하는 매개체 역할을 합니다.

2. 메서드 호출부에서 어떤 매개값을 전달하느냐에 따라
 메서드의 실행 결과는 달라질 수 있습니다.

3. 매개값을 몇 개 받아서 사용할지는 메서드를 선언할 때 선언부에서
 ()안에 미리 개수와 타입을 지정합니다.

4. 매개변수의 이름을 지을 때는 호출자가 선언부로 돌아와서
매개값을 확인하지 않게, 어떠한 값을 담는 변수인지
그 뜻을 알기 쉽게 지어주면 서로에게 좋습니다.

5. 매개변수를 하나도 선언하지 않을 수도 있습니다. 이 때는 메서드의 선언부에
 () 내부를 비워둡니다. 그리고 호출할 때도 ()를 비워서 호출합니다.

*/
