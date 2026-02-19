public abstract class PaymentClass implements Payment{

    protected String transactionId;


    public PaymentClass() {
        this.transactionId = "TX-" + System.currentTimeMillis();
    }

    public String getTransactionId(){
        return transactionId;
    }

    public void log(String msg){
        System.out.println(this.transactionId +":"+ msg);
    }

    public abstract boolean validate();
    public abstract boolean pay(double amount);



}
