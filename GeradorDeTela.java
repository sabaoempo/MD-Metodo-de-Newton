package project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GeradorDeTela extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("view/tela.fxml"));
        primaryStage.setTitle("Método de Newton - Matemática Discreta");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.setMaxHeight(600);
        primaryStage.setMaxWidth(800);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
