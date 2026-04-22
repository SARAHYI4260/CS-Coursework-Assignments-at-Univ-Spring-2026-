package HomeWork;

public class Exec2_3_Array6Number {
    public static void main(String[] args) {
        int[] array = new int[6];

        for(int i = 0; i < array.length; i++) {
            int num = (int)(Math.random() * 60) + 1;
            array[i] = num;
        }
        System.out.println("생성된 6개의 랜덤 번호 : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
