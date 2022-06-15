package sai;

import java.util.HashMap;
import java.util.Map;

public class operationsimpl implements operations {
    HashMap<Double,String> map = new HashMap<>();

    Account acc = new Account();

     @Override
    public void viebalance() {
        System.out.println("available amount : "+ acc.atm.getBalance());
    }

    @Override
    public void withdrawamt(double amt) {
        double bal = acc.atm.getBalance();
        if(bal - amt <0){
            System.out.println("Insufficient Balance");
        }
        else{
            map.put(amt,"withdraw");
            System.out.println("withdraw successfully   -----   please collect the cash");
           acc.atm.setBalance(bal - amt);
        }
        acc.delay(1000);
        viebalance();
    }

    @Override
    public void depositeamt(double amt) {
     double bal = acc.atm.getBalance();
     if(bal + amt <bal){
         System.out.println("deposit amount cannot be negative ");
         acc.delay(1000);
         viebalance();
     }
     else{
         map.put(amt,"deposited");
         System.out.println("deposited successfully");
         acc.delay(1000);
         acc.atm.setBalance(bal + amt);
         viebalance();
     }


    }

    @Override
    public void ministatement() {
       for(Map.Entry<Double,String> m : map.entrySet()){
           System.out.println(m.getKey()+" "+m.getValue());

       }
       viebalance();
    }
}
