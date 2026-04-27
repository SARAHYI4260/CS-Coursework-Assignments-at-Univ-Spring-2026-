package HomeWork;

public class Exec4_2_TvRemoteControl {
    public static void main(String[] args) {
        TV myTv = new TV();
        System.out.println("새 TV를 구매했습니다.");

        myTv.ChangeChannel(1);
        myTv.ChangeVolume(2);
        myTv.ChangePower();    // TV 켜기
        myTv.ChangeChannel(3);
        myTv.ChangeVolume(4);
        myTv.ChangePower();    // TV 끄기
    }
}
