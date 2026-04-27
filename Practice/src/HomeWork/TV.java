package HomeWork;

public class TV {
    // 멤버 변수
    boolean power = false; // Off 상태
    int channel = 10;      // 기본 채널
    int volume = 5;        // 기본 볼륨

    // ① 전원 변경 메서드
    public void ChangePower() {
        power = !power; // false면 true로, true면 false로 반전
        if (power) {
            System.out.println("- TV가 켜졌습니다.");
        } else {
            System.out.println("- TV가 꺼졌습니다.");
        }
    }

    // ② 채널 변경 메서드
    public void ChangeChannel(int ch) {
        if (power) {
            this.channel = ch;
            System.out.println("채널을 " + channel + "으로 변경했습니다.");
        } else {
            System.out.println("TV가 꺼져있어 채널을 변경할 수 없습니다.");
        }
    }

    // ③ 볼륨 변경 메서드
    public void ChangeVolume(int vol) {
        if (power) {
            this.volume = vol;
            System.out.println("소리를 " + volume + "으로 변경했습니다.");
        } else {
            System.out.println("TV가 꺼져있어 볼륨을 변경할 수 없습니다.");
        }
    }

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