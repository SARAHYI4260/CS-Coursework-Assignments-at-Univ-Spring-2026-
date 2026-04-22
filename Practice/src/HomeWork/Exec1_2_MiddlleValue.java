package HomeWork;

import java.util.Scanner;

public class Exec1_2_MiddlleValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("3개의 정수를 입력하세요 (공백으로 구분): ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int median;

        // 중간값 결정 로직
        if ((x >= y && x <= z) || (x >= z && x <= y)) {
            // x가 y보다 크고 z보다 작거나, 그 반대일 때
            median = x;
        } else if ((y >= x && y <= z) || (y >= z && y <= x)) {
            // y가 x보다 크고 z보다 작거나, 그 반대일 때
            median = y;
        } else {
            // 위 두 조건에 해당하지 않으면 z가 중간값
            median = z;
        }
        System.out.println("중간값은: " + median);

        sc.close();
    }
}
