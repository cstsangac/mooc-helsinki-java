
public class Accounts {

    public static void transfer(Account from, Account to, double howMuch){
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }
    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account a1 = new Account("A", 100.00);
        Account a2 = new Account("B", 0);
        Account a3 = new Account("C", 0);

        
        transfer(a1,a2,50);
        transfer(a2,a3,25);
        
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }


}
