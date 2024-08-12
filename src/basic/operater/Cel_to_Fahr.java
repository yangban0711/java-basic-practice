package basic.operater;

import java.util.Scanner;

public class Cel_to_Fahr {

    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);

        double Cel = scn.nextDouble();
        double Fahr = Cel * 9/5 + 32;
        System.out.println(Fahr);

        scn.close();
    }
}
