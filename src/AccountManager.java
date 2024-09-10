public class AccountManager {
    private double balance;

    public void deposit(double amount) {
        balance = getBalance() + amount;
    }

    public void withdraw(double amount){
        if (balance >= amount){
            balance = getBalance() - amount;
        }else{
            System.out.println("HESAP BAKİYESİ YETERSİZ");
        }
        }

    public double getBalance() {
        return balance;
    }
}

//balance=hesap bakiye
//deposit=hesaba para yatır
//withdraw=hesaptan para çek
//amount=miktar