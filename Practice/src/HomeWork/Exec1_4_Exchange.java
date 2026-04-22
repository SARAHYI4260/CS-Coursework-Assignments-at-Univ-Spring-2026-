package HomeWork;

import java.util.Scanner;

public class Exec1_4_Exchange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, tmp;

        // 1. 값 입력 받기
        System.out.print("정수 x를 입력하세요: ");
        x = sc.nextInt();

        System.out.print("정수 y를 입력하세요: ");
        y = sc.nextInt();

        System.out.println("교환 전: x = " + x + ", y = " + y);

        // 2. 값 교환 (Swap) 로직
        tmp = x;    // x의 값을 tmp에 보관
        x = y;      // y의 값을 x에 대입
        y = tmp;    // tmp에 보관했던 원래 x의 값을 y에 대입

        // 3. 결과 출력
        System.out.println("교환 후: x = " + x + ", y = " + y);

        sc.close();
	}
}
