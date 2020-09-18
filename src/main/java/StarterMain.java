import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.util.ResourceBundle;

public class StarterMain extends Application{


        public static void main(String[] args) {
            launch(args);
        }

        public void start(Stage primaryStage) throws Exception {
            primaryStage.setTitle("Obieg sprzętu");
            primaryStage.show();
        }
    }
