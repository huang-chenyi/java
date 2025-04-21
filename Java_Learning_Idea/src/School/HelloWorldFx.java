package School;

import java.util.Scanner;

import javafx.application.Application;
import javafx.scene.control.Alert;

import javafx.stage.Stage;

public class HelloWorldFx extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		System.out.println("Please input dollar to change(as 75.2):");
		double dollar_money;
		Scanner input = new Scanner(System.in);
			dollar_money = input.nextDouble();
		double rmb_money = dollar_money * 6.639;
		alert.setTitle("��ʾ��Ϣ��");
		alert.setHeaderText("");
		alert.setContentText("$" + dollar_money +" = " + rmb_money +"RMB");
		alert.showAndWait();
		
	}
	public static void main(String[] args) {
		Application.launch(args);
	}
}
