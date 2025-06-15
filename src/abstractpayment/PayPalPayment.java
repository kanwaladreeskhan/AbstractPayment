 package abstractpayment;
 public class PayPalPayment extends Payment{
       @Override
    protected void validate(){
         System.out.println("Validating PayPal details....");
    }
    @Override
     protected void processPayment(){
          System.out.println("Processing PayPal payment....");
     }
}
