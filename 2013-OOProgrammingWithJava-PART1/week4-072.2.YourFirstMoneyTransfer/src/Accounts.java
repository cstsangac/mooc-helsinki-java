
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account a1 = new Account("Matt's account", 1000.00);
        Account a2 = new Account("My account", 0);

        
        a1.withdrawal(100);
        
        a2.deposit(100);
        System.out.println(a1);
        System.out.println(a2);
    }

}
