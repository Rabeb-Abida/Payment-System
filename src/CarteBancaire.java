public class CarteBancaire extends PaymentClass{

    private String cardNum;
    private String cvv;


    public CarteBancaire(String cardNum, String cvv){
     this.cardNum = cardNum;
     this.cvv = cvv;
    }


   @Override
    public boolean validate(){
        log("la carte est valide.... ");
        return cardNum.length() == 16 && cvv.length() == 3;

    }

   @Override
    public boolean pay(double amount){
        if (validate()){
            log("paiement par la carte est reussi : " +amount + "DT");
            return true;
        }
        log(" echec payement par carte .");
        return false;


    }



}
