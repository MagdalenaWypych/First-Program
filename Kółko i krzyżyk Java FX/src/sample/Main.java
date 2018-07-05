package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler<ActionEvent> {

    private void addbuttons(GridPane gridPane, int row) {
        for (int i = 1; i <= 3; i++) {
            Button button = new Button("");
            button.setPrefSize(250, 250);
            gridPane.add(button, i - 1, row);
            button.setOnAction(this);
            button.setBackground(new Background(new BackgroundFill(Color.rgb(0, 150, 255), CornerRadii.EMPTY, Insets.EMPTY)));
        }
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        // Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));


        GridPane gridPane = new GridPane();
        gridPane.setStyle("-fx-background-color: white; -fx-grid-lines-visible: true");
        addbuttons(gridPane, 0);
        addbuttons(gridPane, 1);
        addbuttons(gridPane, 2);


        primaryStage.setTitle("Kółko i Krzyżyk");
        primaryStage.setScene(new Scene(gridPane, 750, 750));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    private int counter = 0;

    @Override
    public void handle(ActionEvent event) {
        Button button = (Button) event.getSource();
        Font font = new Font(80);
        button.setFont(font);


        if (counter % 2 == 0) {

            button.setText("X");
            button.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));


        } else {
            button.setText("O");

            button.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        }
        button.setDisable(true);


        counter++;
    }

}