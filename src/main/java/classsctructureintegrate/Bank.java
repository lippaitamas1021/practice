package classsctructureintegrate;

public class Bank {

    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount("11121314", "LT", 1111111);
        BankAccount bankAccount2 = new BankAccount("22232425", "OÉ", 5555555);

        System.out.println(bankAccount1.getInfo());
        System.out.println(bankAccount2.getAccountNumber());
        System.out.println(bankAccount1.getBalance());
        System.out.println(bankAccount2.getOwner());

        bankAccount1.deposit(2222222);
        bankAccount2.withdraw(1111111);

        System.out.println(bankAccount1.getInfo());
        System.out.println(bankAccount2.getInfo());

        bankAccount1.transfer(bankAccount2, 2222222);
        System.out.println(bankAccount1.getInfo());
        System.out.println(bankAccount2.getInfo());
    }
}
