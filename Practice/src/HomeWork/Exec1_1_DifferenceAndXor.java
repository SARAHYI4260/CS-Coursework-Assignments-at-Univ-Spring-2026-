package HomeWork;

import java.util.Scanner;

public class Exec1_1_DifferenceAndXor {
	
	public static void main(String[] args) {
        //2개의 정수값을 입력 받아 두수의 차이(양수), 두수를 AND한 결과, XOR한 결과를 각각 출력하는 프로그램을 작성하여 보자.
        //- Bit 계산 결과를 출력하기 위해 printf를 이용하며, 16진수로 출력한다.
        Scanner scn = new Scanner(System.in);
        int a, b, diff;

        System.out.println("정수 2개를 입력하세요.");
        a = scn.nextInt();
        b = scn.nextInt();

        if(a < b) {
            diff = b - a;
        } else {
            diff = a - b;
        } System.out.println(diff);

        /* 질문하신 코드를 삼항 연산자로 바꾸면:
        int diff = (a < b) ? (b - a) : (a - b);
        System.out.println(diff);*/

        int andRes = a & b;
        int xorRes = a ^ b;
        System.out.printf("두값의 Bit AND 결과는 %04X입니다.\n", andRes );
        System.out.printf("두값의 Bit XOR 결과는 %04X입니다.\n", xorRes );
	}
}