 
package abstractpayment;
 
public class AbstractPayment {
 
    public static void main(String[] args) {
        System.out.println("=====Creditcard Payment=====");
        Payment pay1=new CreditCardPayment();
        pay1.makePayment();
        System.out.println("=====PayPal Payment=====");
        Payment pay2=new PayPalPayment();
        pay2.makePayment();
    }
    
}
