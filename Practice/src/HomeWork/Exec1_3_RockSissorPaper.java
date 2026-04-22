package HomeWork;

import java.util.Scanner;

public class Exec1_3_RockSissorPaper {
    public static void main(String[] args) {
        System.out.println("가위바위보 게임입니다. 가위, 바위, 보를 입력하세요.");
        Scanner sc = new Scanner(System.in);

        System.out.print("Player1 : ");
        String player1 = sc.next();

        System.out.print("Player2 : ");
        String player2 = sc.next();

        System.out.println("-------------------------");
        System.out.println("player1 : " + player1);
        System.out.println("player2 : " + player2);
        System.out.println("-------------------------");

        // 판별 로직
        if (player1.equals(player2)) {
            System.out.println("비겼습니다!");
        } else if ((player1.equals("가위") && player2.equals("보")) ||
                (player1.equals("바위") && player2.equals("가위")) ||
                (player1.equals("보") && player2.equals("바위"))) {
            // Player1이 이기는 모든 경우의 수
            System.out.println("Player1이 이겼습니다!");
        } else {
            // 비기지도 않았고 Player1이 이긴 것도 아니라면 Player2가 이긴 것
            System.out.println("Player2가 이겼습니다!");
        }

        sc.close();
    }
}