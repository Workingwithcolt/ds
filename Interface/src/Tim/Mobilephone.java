package Tim;
public class Mobilephone implements ITelephone {
    private int myNumber;
    private boolean isRinging;
    private boolean isOn  = false;
    public Mobilephone(int myNumber){
        this.myNumber  = myNumber;
    }
    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("MObile phone powered up");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn) {
            System.out.println("Now ringing" + phoneNumber + "on deskPhone");
        }else {
            System.out.println("Phone is switched off");
        }
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the Mobile phone ");
            isRinging = false;
        }

    }

    @Override
    public boolean callphone(int phoneNumber) {
        if(phoneNumber == myNumber && isOn){
            isRinging = true;
            System.out.println("Melody Ringing");
        }else{
            isRinging = false;
            System.out.println("Mobile phone not or number different");
        }
        return isRinging;
    }

    @Override
    public boolean inRiging() {
        return isRinging;
    }
}
