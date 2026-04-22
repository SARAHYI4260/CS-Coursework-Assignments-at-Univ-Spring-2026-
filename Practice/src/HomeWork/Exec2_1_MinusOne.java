package HomeWork;

import java.util.Scanner;

public class Exec2_1_MinusOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("양의 정수를 입력하세요. ");
        int n = sc.nextInt();

        // n부터 0까지 1씩 감소하면서 반복
        for (int i = n; i >= 0; i--) {
            // 3의 배수인지 확인 (단, 0은 보통 제외하거나 포함할 수 있음)
            if (i != 0 && i % 3 == 0) {
                System.out.print(i + " ");
            }
        }

        // 만약 0도 출력하고 싶다면 i % 3 == 0 조건만 남기면 됩니다.
        /*while( i >= 0) {
            if(i != 0 && i % 3 == 0){
                System.out.print(i + " ");
            }
            i--;
        }*/
        System.out.println("\n출력을 종료합니다.");
        sc.close();
    }
}
