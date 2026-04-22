import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NumException {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str[] = new String[3];   //문자열 배열, 크기 3

        for(int i = 0; i < 3; i++)     //반복문 문자열 입력 -> 배열
            str[i] = sc.next();

            int n;
            try {
                for (int i = 0; i < 3; i++) {    //반복은 문자열 정수로 변환 후 출력
                    n = Integer.parseInt(str[i]);
                    System.out.println("숫자 " + i + " : " + n);
                }
            }
            catch (NumberFormatException e){
            System.out.println("문자열을 정수로 변환할 수 없습니다.");
        }
    }
}
