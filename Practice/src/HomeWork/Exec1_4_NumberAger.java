package HomeWork;

import java.util.Scanner;

public class Exec1_4_NumberAger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();

        // 10으로 나누어 '십의 자리' 숫자만 추출 (예: 25 / 10 = 2)
        int ageGroup = age / 10;

        switch (ageGroup) {
            case 0:
                System.out.println("10세 미만(아동)입니다.");
                break;
            case 1:
                System.out.println("10대입니다.");
                break;
            case 2:
                System.out.println("20대입니다.");
                break;
            case 3:
                System.out.println("30대입니다.");
                break;
            case 4:
                System.out.println("40대입니다.");
                break;
            case 5:
                System.out.println("50대 이상입니다."); // 50대 이상으로 묶을 때
                break;
            default:
                if (age >= 60) {
                    System.out.println("60대 이상의 고령층입니다.");
                } else {
                    System.out.println("올바른 나이를 입력해 주세요.");
                }
                break;
        }

        sc.close();
    }
}