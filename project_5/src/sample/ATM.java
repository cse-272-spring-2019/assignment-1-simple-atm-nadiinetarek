package sample;

import java.util.Scanner;

public class ATM {private double balance;
    private String CardNumber;
    private String Password;
    private double amount;



    Scanner x = new Scanner(System.in);
    Scanner y = new Scanner(System.in);
    Scanner z = new Scanner(System.in);

    public ATM(double intialbalance) {
        CardNumber = "53455505";
        Password = "5230066" ;
        if (intialbalance > 0.0) {
            balance = intialbalance;

        }
    }
    public void menu(int x){
        switch (x) {
            case 1 :
                System.out.println("Please enter amount to withdraw: ");
                amount = z.nextFloat();
                getWithdraw(amount);
              /*  transactions t= new transactions("withdraw",amount);
                t.add(t);*/
                break;
            case 2 :
                System.out.println("Please enter amount to deposit: ");
                amount = z.nextFloat();
                setDeposit(amount);
             /*   transactions tt= new transactions("deposit",amount);
                tt.add(tt);*/
                break;

            case 3 :
                seeBalance();
                break;

            case 4 :
                transactions ttt= new transactions("0",0);
                ttt.displayTrans();
                break;


            case 5 :
                transactions tttt= new transactions("0",0);
                tttt.previous();
                break;

            case 6 :
                System.exit(0);
                break;
        }

    }

    public double setDeposit(double amount) {

        balance = balance + amount;
        transactions tt= new transactions("deposit",amount);
        tt.add(tt);
        return balance;

    }

    public String getWithdraw(double amount) {
        if (amount > balance) {
           return "error" ;
        } else {
            balance = balance - amount;
            transactions t= new transactions("withdraw",amount);
            t.add(t);
            return String.valueOf(balance);

        }
    }
    public double seeBalance() {
       return balance;
    }

    transactions histout[];

    public transactions[] showhist()
    { transactions ttt= new transactions("0",0);
        histout.equals(ttt.displayTrans());
    return histout;
    }
    public void showlast()
    { transactions tttt= new transactions("0",0);
        tttt.previous();

    }


    public static void main(String[] args) {

        Scanner m = new Scanner(System.in);

        // ATM inst=new ATM(6000.0);
        System.out.println("enter your card number");
        String CardInput = m.nextLine();
        System.out.println("enter your password");
        String PassInput = m.nextLine();
        ATM acc1 = new ATM(5000.00);
        if (acc1.CardNumber.equals(CardInput)&&acc1.Password.equals(PassInput))
        { System.out.println("your card is verified");
            while(true){
                System.out.println("choose from 1-5(1- withdraw, 2-Deposit, 3-Balance Inquiry 4-show history 5-previous 6-exit)");
                int choice;
                choice=m.nextInt();
                acc1.menu(choice);
            }}
        else
        { System.out.println("your card is not verified"); }




    }
}
