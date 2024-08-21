package etc.api.Collection.ListPrac;

import java.util.LinkedList;

public class LinkedListEX {
    public static void main(String[] args) {

        LinkedList<String> linklist = new LinkedList<>();

        linklist.add("일레븐");
        linklist.add("데비");
        linklist.add("마를렌");
        linklist.addLast("뒤");

        System.out.println(linklist);

        System.out.println("-----------------------------");

        //stack 후입선출

        linklist.push("카티야");
        System.out.println(linklist);
        linklist.poll();
        System.out.println(linklist);
        //peek: 삭제 없이 참조
        System.out.println(linklist.peek());

        // offer/poll 선입선출
        linklist.poll();
        linklist.offer("에스텔");
        System.out.println(linklist);


    }
}
