package sai;
public class Atm {
    private double balance;
    private double depositamt;
    private double withdrawamt;
    public Atm(){

    }

    //getter setter

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDepositamt() {
        return depositamt;
    }

    public void setDepositamt(double depositamt) {
        this.depositamt = depositamt;
    }

    public double getWithdrawamt() {
        return withdrawamt;
    }

    public void setWithdrawamt(double withdrawamt) {
        this.withdrawamt = withdrawamt;
    }
}
