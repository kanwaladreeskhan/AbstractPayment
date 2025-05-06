 
package abstractpayment;
 
public class CreditCardPayment extends Payment{
    @Override
    protected void validate(){
         System.out.println("Validating Credit card details....");
    }
    @Override
     protected void processPayment(){
          System.out.println("Processing Credit card payment....");
     }
}
