package HomeWork;

import java.util.Scanner;

public class Exec2_4_Theater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] seat = new int[10]; // 좌석 10개 (0으로 자동 초기화)

        while (true) {
            // 1. 상단 UI 출력
            System.out.println("영화 예매를 시작합니다.");
            System.out.println("-------------------------------");
            for (int i = 1; i <= 10; i++)
                System.out.print(i + " "); // 좌석 번호
            System.out.println("\n-------------------------------");

            // 2. 현재 좌석 상태(0 또는 1) 출력
            for (int i = 0; i < seat.length; i++) {
                System.out.print(seat[i] + " ");
            }
            System.out.println("\n-------------------------------");

            // 3. 예약 입력 받기
            System.out.print("어떤 좌석을 예약하시겠습니까? ");
            int reserve = sc.nextInt();

            // 4. 종료 조건 (0 입력 시)
            if (reserve == 0) {
                System.out.println("영화 예매를 종료합니다.");
                break;
            }

            // 5. 예약 로직 (입력값은 1~10이므로 인덱스는 reserve - 1)
            int index = reserve - 1;

            if (seat[index] == 0) {
                seat[index] = 1; // 예약 완료 표시
                System.out.println(reserve + "번 좌석을 예약하였습니다.");
            } else {
                System.out.println("이미 예약된 좌석입니다.");
            }
            System.out.println(); // 줄바꿈용
        }
        sc.close();
    }
}