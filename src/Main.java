public class Main {
    public static void main(String[] args) {
        Payment carteBancaire = new CarteBancaire("1234567890123456","123");
        carteBancaire.pay(150);

        Payment Crypto = new Crypto("x0-ryptorabeb");
        Crypto.pay(120);

        Payment paypel = new Paypal("abidarabeb@gmail.com");
        paypel.pay(170);

// demande chatGPT pour code simple pour un interface pour debutant avec angular par exemple pour mettre sur Github
    }
}