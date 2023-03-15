package ch7;

public class Main {

    static void run(CellPhone phone) {
        phone.powerOn();
        phone.powerOff();
        phone.bell();
        phone.sendVoice("안녕");
        phone.hangUp();    
    }

    //오버로딩 - 같은 이름으로 통일하되, 인자를 통해 구분
    //오버라이딩 - 덮어 씌움, 이름, 인자 같음, 일부 대치
    public static void main(String[] args) {
        //CellPhone phone = new CellPhone();
        //MyPhone phone = new MyPhone();
        CellPhone phone = new MyPhone(); //MyPhone에서 같은 함수 대치시킨 것 반영됨, is a 관계 - MyPhone is a CellPhone
        run(phone);

        // phone.powerOn();
        // phone.powerOff();
        // phone.bell();
        // phone.sendVoice("안녕");
        // phone.hangUp();

        // phone.turnOnDmb();
        // phone.changeChannelDmb(12);
        // phone.turnOnDmb();
        // phone.turnOffDmb();

        phone = new YourPhone();
        run(phone);

        phone = new HerPhone();
        run(phone);
    }    
}
