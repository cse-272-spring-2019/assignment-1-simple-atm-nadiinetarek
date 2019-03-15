package sample;

import java.util.Stack;
import java.lang.String;

public class transactions {
    public String type;
    public double amount;

    public static Stack<transactions> history  = new Stack<>();
    public static Stack<transactions> history2 = new Stack<transactions>();



    public transactions(String m, double n) {
        type = m;
        amount = n;
    }



    public void add(transactions t) {
          int limit =0;
          do {
              history.push(t);
              limit++;
          }
          while(limit<5);
    }
     transactions display_trans[];
    public transactions[] displayTrans() {
        int x = 5;

        while (x != 0) {
            if (history.isEmpty())
                break;
             display_trans[0]= history.pop();
             x--;
        }
        return display_trans;
    }

    public transactions previous() {
        int x = 1;
        transactions disp1 = new transactions("0",0);
        disp1=history.pop();
     /*   while (x != 0) {
            transactions disp1 = new transactions("0",0);
                    disp1=history.pop();
           // System.out.println(disp1.amount + " " + disp1.type);
            x--;
        }*/

        return disp1;
    }
    public String printtrans()
    {
        return type+Double.toString(amount);
    }
  public String devideTrans1(transactions y)
  { String x = y.type;
    return x;
  }

    public String devideTrans2(transactions n)
    { String b = String.valueOf(n.amount);
        return b;
    }

    public static void main(String[] args) {
        ;
    }
}
