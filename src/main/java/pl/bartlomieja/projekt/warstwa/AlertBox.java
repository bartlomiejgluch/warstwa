package pl.bartlomieja.projekt.warstwa;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBox {


    public static void display(String title, String message) {

        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(200);
        window.setMinHeight(150);
        window.setMaxWidth(200);
        window.setMaxHeight(150);




        Label label = new Label();
        label.setText(message);


        Button closeButton = new Button("Close the window");
        closeButton.setOnAction(event -> window.close());


        VBox layout3 = new VBox(10);
        layout3.getChildren().addAll(label, closeButton);
        layout3.setAlignment(Pos.CENTER);
        layout3.setMargin(label, new Insets(10, 10, 10, 10));


        Scene scene = new Scene(layout3);
        window.setScene(scene);
        window.showAndWait();


    }

}
