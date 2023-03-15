package ch7;

//extends - 상속, 계승
public class MyPhone extends CellPhone{
    //필드
    int channel = 0;

    //생성자

    //메소드
    //powerOn 메소드를 대치하는 코드
    void powerOn() {
        System.out.println("짜잔!!");
    }

    void turnOnDmb() {
        System.out.println("채널: " + channel + "번 DMB 방송 수신을 시작합니다.");
    }

    void changeChannelDmb(int channel) {
        this.channel = channel;
        System.out.println("채널: " + channel + "번으로 바꿉니다.");
    }

    void turnOffDmb() {
        System.out.println("DMB방송 수신을 멈춥니다.");
    }
}
