package HomeWork;

import java.util.Scanner;

public class Exec2_1_ProductsForThreeDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 비정방형 배열 선언 (3행만 먼저 생성)
        String[][] products = new String[3][];

        // 2. 데이터 입력 단계
        for (int i = 0; i < products.length; i++) {
            System.out.print((i + 1) + "번째날 상품의 개수 : ");
            int count = sc.nextInt();
            sc.nextLine(); // 버퍼 비우기 (nextInt 다음에 nextLine 쓸 때 필수!)

            // 입력받은 개수만큼 해당 행의 열 크기를 결정 (비정방형의 핵심)
            products[i] = new String[count];

            for (int j = 0; j < count; j++) {
                System.out.print("상품의 이름 : ");
                products[i][j] = sc.nextLine();
            }
        }

        // 3. 데이터 출력 단계
        for (int i = 0; i < products.length; i++) {
            System.out.print((i + 1) + "번째날 상품 목록 : ");
            for (int j = 0; j < products[i].length; j++) {
                System.out.print(products[i][j] + " ");
            }
            System.out.println(); // 날짜별 줄바꿈
        }
        sc.close();
    }
}