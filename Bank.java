
class Bank extends BankAccount {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();

        b.setAccount_number(56345252D);
        b.setBalance(10000.00D);

        double Account_number = b.getAccount_number();
        double Balance = b.getBalance();

        System.out.println("bank account number " + Account_number);
        System.out.println(" bank balance " + Balance);
    }
}
