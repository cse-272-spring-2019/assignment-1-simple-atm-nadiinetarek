package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import static sample.transactions.history;

public class Main extends Application {
    ATM client = new ATM( 6000);
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();


        Label historylabel = new Label ();
        Label atm = new Label ("Welcome to atm");
        Label cardnumber = new Label("Card Number");
        Label password = new Label ("PassWord");
        TextField cardfield = new TextField();
        PasswordField passfield = new PasswordField();
        Button proceed = new Button("Proceed");
        Label validationlabel = new Label ();
        Label balancell = new Label("Balance");
        Label balancell1 = new Label("Balance");

        Label deposit11 = new Label("Balance");
        Label withdrawll1 = new Label("Withdraw");
        Label withdrawll = new Label("Withdraw");
        Button balance1 = new Button("Balance");
       // Button withdrawx = new Button("Withdraw");
     //   Button depositx = new Button("Deposit");
        Button withdraw1 = new Button("Withdraw");
        Button deposit1 = new Button("Deposit");
        Button previous1 = new Button("Back");
        Button next1 = new Button("Next");
        Button previous2 = new Button("Back");
        //Button next2 = new Button("Next");
        Button previous3 = new Button("Back");
        // Button next3 = new Button("Next");
        Button previous4 = new Button("Back");
        //  Button next4 = new Button("Next");
        Button previous5 = new Button("Back");
        //Button next5 = new Button("Next");
        Label balanceoutput = new Label();
        //  TextField withdrawfield = new TextField();
        TextField balancefield1 = new TextField();
        TextField withdrawfield1 = new TextField();
        TextField depoitfield = new TextField();
        Label postwithdraw = new Label();
        Label postdeposit = new Label();
        Button num1 = new Button("1");
        Button num2 = new Button("2");
        Button num3 = new Button("3");
        Button num4 = new Button("4");
        Button num5 = new Button("5");
        Button num6 = new Button("6");
        Button num7 = new Button("7");
        Button num8 = new Button("8");
        Button num9 = new Button("9");
        Button num0 = new Button("0");


        Button num1x = new Button("1");
        Button num2x = new Button("2");
        Button num3x = new Button("3");
        Button num4x = new Button("4");
        Button num5x = new Button("5");
        Button num6x = new Button("6");
        Button num7x = new Button("7");
        Button num8x = new Button("8");
        Button num9x = new Button("9");
        Button num0x = new Button("0");

        Button enter = new Button("enter");
        Button enter1 = new Button("enter");
        Button history1 = new Button("show history(last 5)");
        Button balanceshow = new Button("show balance");
        Button back = new Button("history(previous)");
        Label history_last = new Label();


        GridPane grid1 = new GridPane();
        grid1.add(atm, 0, 0);
        grid1.add(cardnumber, 0, 1);
        grid1.add(password, 0, 2);
        grid1.add(cardfield, 1, 1);
        grid1.add(passfield, 1, 2);
        grid1.add(proceed, 2, 3);
        grid1.add(validationlabel, 2, 4);


        GridPane grid2 = new GridPane();
        grid2.add(balance1, 0, 0);
        grid2.add(withdraw1, 0, 1);
        grid2.add(deposit1, 0, 2);
        grid2.add(previous1, 2, 1);
        grid2.add(next1, 2, 3);
        grid2.add(history1, 0, 3);
        grid2.add(back, 0, 4);
        grid2.add(history_last, 1, 4);




        GridPane grid3 = new GridPane();
        grid3.add(deposit11, 0, 0);
        grid3.add(enter, 3, 0);
        grid3.add( depoitfield , 1,0);
        grid3.add(num1, 0, 1);
        grid3.add(num2, 1, 1);
        grid3.add(num3, 2, 1);
        grid3.add(num4, 0, 2);
        grid3.add(num5, 1, 2);
        grid3.add(num6, 2, 2);
        grid3.add(num7, 0, 3);
        grid3.add(num8, 1, 3);
        grid3.add(num9, 2, 3);
        grid3.add(num0, 2, 4);
        grid3.add(postdeposit,2,5);
        grid3.add(previous2,2,6);

        GridPane grid4 = new GridPane();
        grid4.add(withdrawll, 0, 0);
        grid4.add( withdrawfield1 , 1,0);
        grid4.add(enter1, 3, 0);
      grid4.add(num1x, 0, 1);
        grid4.add(num2x, 1, 1);
        grid4.add(num3x, 2, 1);
        grid4.add(num4x, 0, 2);
        grid4.add(num5x, 1, 2);
        grid4.add(num6x, 2, 2);
        grid4.add(num7x, 0, 3);
        grid4.add(num8x, 1, 3);
        grid4.add(num9x, 2, 3);
        grid4.add(num0x, 2, 4);
        grid4.add(postwithdraw,2,5);
        grid4.add(previous3,2,6);
        grid4.add(withdrawll1,5,6);

        GridPane grid5 = new GridPane();
        grid5.add( balancell1 , 0,0);
       // grid5.add( balancefield1 , 0,1);
        grid5.add( balanceoutput , 0,2);
        grid5.add( previous4 , 0,3);
        grid5.add( balanceshow , 0,4);


        /*transactions  out= new transactions("0",0);
        if (history.isEmpty()) {
            balanceoutput.setText("no balance");
        } else
        {  out = history.peek();
         // System.out.println("m");
        balanceoutput.setText(String.valueOf(out.amount));}

       /* GridPane grid6 = new GridPane();
        grid6.add( withdrawll1 , 0,0););
        grid5.add( withdrawfield1 , 0,0);)*/


        Scene scene1 = new Scene(grid1, 500, 500);
        Scene scene2 = new Scene(grid2, 500, 500);
        Scene scene3 = new Scene(grid3, 500, 500);
        Scene scene4 = new Scene(grid4, 500, 500);
        Scene scene5 = new Scene(grid5, 500, 500);


        num1.setOnAction(e->depoitfield.setText(depoitfield.getText()+"1"));
        num2.setOnAction(e->depoitfield.setText(depoitfield.getText()+"2"));
        num3.setOnAction(e->depoitfield.setText(depoitfield.getText()+"3"));
        num4.setOnAction(e->depoitfield.setText(depoitfield.getText()+"4"));
        num5.setOnAction(e->depoitfield.setText(depoitfield.getText()+"5"));
        num6.setOnAction(e->depoitfield.setText(depoitfield.getText()+"6"));
        num7.setOnAction(e->depoitfield.setText(depoitfield.getText()+"7"));
        num8.setOnAction(e->depoitfield.setText(depoitfield.getText()+"8"));
        num9.setOnAction(e->depoitfield.setText(depoitfield.getText()+"9"));
        num0.setOnAction(e->depoitfield.setText(depoitfield.getText()+"0"));

        num1x.setOnAction(e->withdrawfield1.setText(withdrawfield1.getText()+"1"));
        num2x.setOnAction(e->withdrawfield1.setText(withdrawfield1.getText()+"2"));
        num3x.setOnAction(e->withdrawfield1.setText(withdrawfield1.getText()+"3"));
        num4x.setOnAction(e->withdrawfield1.setText(withdrawfield1.getText()+"4"));
        num5x.setOnAction(e->withdrawfield1.setText(withdrawfield1.getText()+"5"));
        num6x.setOnAction(e->withdrawfield1.setText(withdrawfield1.getText()+"6"));
        num7x.setOnAction(e->withdrawfield1.setText(withdrawfield1.getText()+"7"));
        num8x.setOnAction(e->withdrawfield1.setText(withdrawfield1.getText()+"8"));
        num9x.setOnAction(e->withdrawfield1.setText(withdrawfield1.getText()+"9"));
        num0x.setOnAction(e->withdrawfield1.setText(withdrawfield1.getText()+"0"));




        proceed.setOnAction(new EventHandler<javafx.event.ActionEvent>() {
            @Override
            public void handle(javafx.event.ActionEvent event) {

                   String cardid = cardfield.getText();
                   String password = passfield.getText();

                validation x = new validation();

                boolean valid = x.validate(cardid, password);
                if (valid) {
                    validationlabel.setText("welcome to ATM");
                    primaryStage.setScene(scene2);
                } else {
                    validationlabel.setText("wrong card number or password");
                    validationlabel.setFont(new Font("Verdana", 16));
                }
            }

        });

        enter.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event ) {
               double  y=Double.parseDouble(depoitfield.getText());
               client.setDeposit(y);
               depoitfield.setText("");

            }
        });
        enter1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event ) {
                double  z=Double.parseDouble(withdrawfield1.getText());
                client.getWithdraw(z);
                String balancex;
                balancex=String.valueOf(client.seeBalance()) ;
                withdrawfield1.setText("");

           withdrawll1.setText(balancex);
            }
        });
        previous1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event ) {
                primaryStage.setScene(scene1);
            }
        });
        previous2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event ) {
                primaryStage.setScene(scene2);
            }
        });
        previous3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event ) {
                primaryStage.setScene(scene2);
            }
        });

        previous4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event ) {
                primaryStage.setScene(scene2);
            }
        });
        back.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event ) {
                transactions  out1= new transactions("0",0);
                if (history.isEmpty()) {
                    history_last.setText("no balance");
                } else
                {  out1 = history.peek();
                    // System.out.println("m");
                    history_last.setText(out1.printtrans());}
            }

            });

        balanceshow.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event ) {
               // transactions  out= new transactions("0",0);
                double out;
               /* if (history.isEmpty()) {
                    balanceoutput.setText("no balance");*/

                out = client.seeBalance();
                    // System.out.println("m");
                    balanceoutput.setText(String.valueOf(out));}


        });

        history1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event ) {
              // client.showhist();
                historylabel.setMaxSize(15,16);
           //    historylabel.setText(client.showhist());
            }
        });
        balance1.setOnAction(new EventHandler<ActionEvent>() {
            @Override

            public void handle (ActionEvent event)
            {
                primaryStage.setScene(scene5);

            }});

        deposit1.setOnAction(new EventHandler<ActionEvent>() {
            @Override

            public void handle (ActionEvent event)
            {
                primaryStage.setScene(scene3);
            }});

        withdraw1.setOnAction(new EventHandler<ActionEvent>() {
            @Override

            public void handle (ActionEvent event)
            {
                primaryStage.setScene(scene4);
            }});



        primaryStage.setTitle("ATM system");
        primaryStage.setScene(scene1);

    }


    public static void main(String[] args) {
        launch(args);
    }
}
