package exceptionPack;

//TASK 2
public class bankAccount {
    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void takeMoney(int amount) throws IndexOutOfBoundsException {
        if (amount > balance) {
            throw new IndexOutOfBoundsException("You can not take more money than it is on your bank account");
        } else {
            System.out.println("Amount of " + amount + " money has been taken");
            balance -= amount;
        }
    }
}
