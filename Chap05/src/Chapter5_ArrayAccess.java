import java.util.Scanner;

/**
 * 프로젝트명 : Chap05 실습
 * 작성자 : 사용자 (동국대학교 Duica 컴퓨터공학)
 * 작성일 : 2026/04/15
 */
public class Chapter5_ArrayAccess {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // --------------------------------------------------
        // 1. Exception(예외 처리) 실습 부분
        // --------------------------------------------------
        System.out.println("나눗셈을 위한 정수 두 개를 입력하세요:");
        int a, b;
        a = scn.nextInt();
        b = scn.nextInt();

        // 0으로 나눌 경우 ArithmeticException이 발생할 수 있으므로 주의해야 합니다.
        if (b != 0) {
            System.out.println("나눗셈 결과 : " + a / b);
        } else {
            System.out.println("오류: 0으로 나눌 수 없습니다.");
        }
        // 에러 로그 참고용: Exception in thread "main" java.lang.ArithmeticException: / by zero

        // --------------------------------------------------
        // 2. 2차원 배열과 중복 for문 실습 (평균 구하기)
        // --------------------------------------------------
        /*double score[][] = {
                {4.2, 4.3}, // 1학년 1, 2학기
                {3.9, 3.5}, // 2학년
                {4.1, 4.2}, // 3학년
                {4.4, 4.5}  // 4학년
        };
        double sum = 0; // 합계를 저장할 변수 선언

        for (int j = 0; j < score.length; j++) { // 학년 (행)
            for (int i = 0; i < score[j].length; i++) { // 학기 (열)
                sum = sum + score[j][i];
            }
        }
        int totalElements = score.length * score[0].length; // 전체 데이터 개수 (8)
        System.out.println("4년간의 전체 평균 : " + sum / totalElements);
        */
        // ---------------------------------------------------
        // 3. 배열과 for-each문 실습
        // ---------------------------------------------------
        /*int intArray[] = {1, 2, 3, 4, 5};
        int arraySum = 0;

        // 일반 for문
        for (int i = 0; i < intArray.length; i++) {
            arraySum = arraySum + intArray[i];
        }

        // 위의 for문과 동일한 동작을 하는 for-each문 (확장 for문)
        int forEachSum = 0;
        for (int n : intArray) {
            forEachSum = forEachSum + n;
        }
        System.out.println("배열의 총합(for-each) : " + forEachSum);
        */
        // ---------------------------------------------------
        // 4. 배열을 이용한 최대값 찾기 실습
        // ---------------------------------------------------

        /*int inputTable[] = new int[5]; // 5개의 정수를 담을 배열 생성
        int max = 0; // 최대값을 저장할 변수

        System.out.println("양수 5개를 입력하세요.");
        for (int i = 0; i < 5; i++) {
            inputTable[i] = scn.nextInt(); // 입력받은 정수를 배열에 저장
            if (inputTable[i] > max) {     // 입력값이 현재 max보다 크면
                max = inputTable[i];       // max를 새로운 값으로 교체
            }
        }
        System.out.println("입력된 값 중 가장 큰 수는 " + max + "입니다.");
        */
        scn.close(); // 스캐너 객체 닫기
    }
}