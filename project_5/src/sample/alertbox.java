/*package sample;

import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.awt.*;

public class alertbox {
    public void display(String title, String message ){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
       Label label = new label;
       label.setText(message);

       Button closebutton = new Button("close");
       closebutton.setOnAction(e->window.close());
        GridPane grid = new GridPane();
        grid.getChildren().addAll(label,closebutton);

        Scene scene =new Scene(grid);
        window.setScene(scene);
        window.showAndWait();



    }
}
*/