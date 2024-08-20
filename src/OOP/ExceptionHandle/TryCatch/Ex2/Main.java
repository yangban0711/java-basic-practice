package OOP.ExceptionHandle.TryCatch.Ex2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];


        try {
            System.out.print("정수: ");
            int num = sc.nextInt();

            int result = 100 / num;

            System.out.println(arr[result]);

            String s = null;
            //s.equals("메롱");
        }
        catch (InputMismatchException | ArithmeticException e) {              //or문으로 두가지 예외처리를 한가지로 처리 가능
            System.out.println("정수로만 입력하세요");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스 범위가 벗어났어요");
        }
        catch (NullPointerException e){                 //
            System.out.println("주소가 null입니다");
        }
        catch (Exception e) {                           //위에서부터 순차적으로 비교하기 때문에 범용적인 오류를 검사하는 Exception e은 가장 아래에 배치해야함
            System.out.println("알 수 없는 오류 발생");
        }
        finally {
            System.out.println("예외처리 발생과 상관없이 실행");
        }
    }
}
/*
             - 다중 catch문은 실제로 에러가 발생하면
              위에서부터 순서대로 catch문을 검색하면서 내려오기 때문에
              부모 타입의 예외를 자식 타입의 예외보다 위에 작성하시면 안됩니다.
             - catch 옆에 괄호에 예외 타입을 여러 개 작성하고 싶은 경우는
              | 기호를 사용하여 타입을 나열해 주시면, 하나의 catch 블록으로
              여러 타입의 예외를 동시에 처리할 수 있습니다.
              (java 7버전부터 가능한 문법)
*/
