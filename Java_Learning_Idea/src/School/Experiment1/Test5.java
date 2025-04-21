package School.Experiment1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Test5 extends Application{
    public void start(Stage primaryStage) {
        Button btOK = new Button("Hello World!");
        Scene scene = new Scene(btOK, 200, 50);
        primaryStage.setTitle("招笑");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}

//虚拟机选项 ： --module-path "C:\Users\43502\AppData\Roaming\.minecraft\runtime\java-runtime-delta\javafx-sdk-11.0.2\lib" --add-modules javafx.controls,javafx.fxml
