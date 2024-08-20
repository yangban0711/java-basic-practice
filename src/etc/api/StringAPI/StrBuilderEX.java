package etc.api.StringAPI;

public class StrBuilderEX {

    public static void main(String[] args) {

        String str = "hello";
        System.out.println(str.hashCode());

        str = "hell";
        System.out.println(str.hashCode());

        str = "bangkk";
        System.out.println(str.hashCode());

        System.out.println("---------------------------");

        StringBuilder sb = new StringBuilder("bringbangbong");
        System.out.println(sb);
        System.out.println(sb.hashCode());

        sb.append("bangbong");
        System.out.println(sb);
        System.out.println(sb.hashCode());

        sb.insert(6,"  yeah   ");
        System.out.println(sb);
    }

}
