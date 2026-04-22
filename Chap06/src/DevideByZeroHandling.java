import java.util.InputMismatchException;
import java.util.Scanner;

public class DevideByZeroHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b;

        try {
            a = scanner.nextInt();
            b = scanner.nextInt();
            System.out.println("나눗셈 결과 : " + a / b);
        }catch (ArithmeticException e) {
            System.out.println("0으로 나눗셈을 할 수 없습니다.");
        }catch (InputMismatchException e) {
            System.out.println("입력값은 숫자만 가능합니다.");
        }finally {
            System.out.println("실행을 마칩니다.");
        }
        scanner.close();
    }
}