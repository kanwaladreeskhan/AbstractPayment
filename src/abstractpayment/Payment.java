package abstractpayment;
 public abstract class Payment {
    protected abstract void validate();
    protected abstract void processPayment();
    protected void sendConfirmation(){
        System.out.println("Sending payment confirmation....");
    }
    public void makePayment(){
        validate();
        processPayment();
        sendConfirmation();
    }
}
