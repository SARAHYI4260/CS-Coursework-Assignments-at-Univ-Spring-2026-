package HomeWork;

import java.util.Scanner;

public class Exec2_2_Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("양의 정수 입력 >> ");
        int star = sc.nextInt();;

        for(int i = star + 1; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
