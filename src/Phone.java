public interface Phone {
    public void powerOn();
    public void callNumber(String phoneNo);
    public void receiveCall(String phoneNo);
    public boolean answerCall();
    public boolean isRinging();
}
