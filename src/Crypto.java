public class Crypto extends PaymentClass{

    private String walletAddress;

    public Crypto(String walletAdress){

        this.walletAddress = walletAdress;
    }


    @Override
    public boolean validate() {

        log("validation Crypto...");
        return walletAddress.startsWith("x0") && walletAddress.length() > 10;
    }

    @Override
    public boolean pay(double amount) {
        if(validate()) {
            log("trasaction Crypto est reussi :" + amount + "DT");
            return true;
        }
            log("Echec transaction");
            return false;
    }
}
