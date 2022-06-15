
package sai;
import java.util.HashMap;
import java.util.Scanner;

public class Account {
    static Atm atm = new Atm();
    public static  void delay(int n){
        try {
            Thread.sleep(n);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        operations intrf = new operationsimpl();

        HashMap<Integer,Integer> accdetails = new HashMap<>();
        HashMap<Integer,Double> amoutofacc = new HashMap<>();
        accdetails .put(989898,12345);
        amoutofacc.put(989898,1278.95);
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to Atm ");
        String str = "Welcome to the mybank ATM";
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));
            delay(150);
             }
        System.out.println();
        delay(1000);
         System.out.println("enter the atm number");
        int atmnum = sc.nextInt();
        delay(1000);
        System.out.println("enter the atm pin");
        int atmpin  = sc.nextInt();
        delay(1000);
        System.out.println("Validating the details");
        delay(750);
        System.out.print("..");
        delay(750);
        System.out.print("..");
        delay(200);
        System.out.println();
        if((accdetails.containsKey(atmnum))&& (accdetails.get(atmnum)==atmpin)){
            System.out.println("Validation done");
            double setamt  =amoutofacc.get(atmnum);
            atm.setBalance(setamt);
             while(true){
                System.out.println("option 1 : view the balance");
                System.out.println("option 2 : withdraw the money");
                System.out.println("option 3 : deposit the money");
                System.out.println("option 4 : vive the statement");
                System.out.println("option 5 : exit");
                System.out.println("Enter your option");

                int op = sc.nextInt();
                if(op == 1){
                  intrf.viebalance();
                }
                else if(op == 2){
                    System.out.println("enter the amount to withdraw");
                    double withamt = sc.nextDouble();
                    intrf.withdrawamt(withamt);
                }
                else if (op==3){
                    System.out.println("enter the deposit amount :");
                    double dipamt  = sc.nextDouble();
                     intrf.depositeamt(dipamt);
                }
                else if(op ==4){
                    System.out.println("please wait for us to get the previous transactions");
                    delay(750);
                    System.out.print("..");
                    delay(750);
                    System.out.print("..");
                    delay(200);
                    System.out.println();
                    intrf.ministatement();
                }
                else if(op == 5){
                    System.out.println("collect your atm card before you leave");
                    String tank = "Thank you for using our ATM";
                    for(int i=0;i<tank.length();i++){
                        System.out.print(tank.charAt(i));
                        delay(150);
                    }
                    System.exit(0);
                }
                else{
                    System.out.println("enter the the valid option");
                }

            }
        }
        else{
            System.out.println("incorrect details please check the details and try again");
            System.exit(0);
        }
    }
}
