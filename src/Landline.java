public class Landline implements Phone{

    private String myPhoneNo;
    private boolean isRinging;
    private static boolean isPowerOn;

    public Landline(String phoneNo) {
        this.myPhoneNo = phoneNo;
        isRinging = false;
        isPowerOn = true;
    }

    public String getPhoneNo() {
        return myPhoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.myPhoneNo = phoneNo;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    public static boolean isPowerOn() {
        return isPowerOn;
    }

    public static void setPowerOn(boolean powerOn) {
        Landline.isPowerOn = powerOn;
    }

    @Override
    public void powerOn() {
        Landline.isPowerOn = true;
    }

    @Override
    public void callNumber(String phoneNo) {
        if(Landline.isPowerOn){
            System.out.println("Calling " + phoneNo);
        }
        else{
            System.out.println("The landline number your trying to reach is switched off");
        }
    }

    @Override
    public void receiveCall(String phoneNo) {
        if(Landline.isPowerOn && (this.myPhoneNo.equals(phoneNo))){
            this.isRinging = true;
            System.out.println("In coming call");
        } else {
            System.out.println("Call not recieved");
        }
    }

    @Override
    public boolean answerCall() {
        if(this.isRinging){
            System.out.println("Call answered");
            this.isRinging = false;
            return true;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return this.isRinging;
    }
}
