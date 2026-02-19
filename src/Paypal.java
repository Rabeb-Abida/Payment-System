public class Paypal extends PaymentClass {

    private String email;

    public Paypal(String email){
    this.email = email;
    }

    @Override
    public boolean validate() {
        log("validation paypal ...");
        return email.contains("@");
    }

    @Override
    public boolean pay(double amount) {
        if(validate()){
           log("le paiement paypal est reussi " +amount+ " DT");
           return true;
        }
        log("echec payment paypel");
        return false;
    }
}
