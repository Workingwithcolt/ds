package Tim;
public class Main {
    public static void main(String[] args){
        //ITelephone timephone;
        ITelephone timephone = new DeskPhone(1235363);
        timephone.powerOn();
        timephone.answer();
        timephone.callphone(779812);

        timephone = new Mobilephone(2434);
        timephone.answer();
        timephone.callphone(24533);
    }
}
