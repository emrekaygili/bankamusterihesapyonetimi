//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    AccountManager manager = new AccountManager();
    System.out.println("Hesap Bakiyesi= "+manager.getBalance());
    manager.deposit(100);
    System.out.println("Hesap Bakiyesi= "+manager.getBalance());
    manager.withdraw(80);
    System.out.println("Hesap Bakiyesi= "+manager.getBalance());
    manager.withdraw(50);
        System.out.println("Hesap Bakiyesi= "+manager.getBalance());
}
}