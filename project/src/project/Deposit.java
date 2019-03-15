package project;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Deposit {
Stage stage;
Scene scene;
MainMenu mainMenu;
account account= new account(0);
public Deposit(Stage stage){
	this.stage=stage;
}
public void preparescene(){
	Label Deposit=new Label("amount");
	Label show=new Label();
	TextField DepositField=new TextField();
	Button confirm=new Button("confirm");
	Button back=new Button("Back to main menu");
	GridPane grid=new GridPane();
	grid.add(Deposit, 0, 0);
	grid.add(DepositField, 0, 1);
	grid.add(confirm, 1, 2);
	grid.add(back, 1, 3);
	grid.add(show,1, 4);
	
	
	confirm.setOnAction(new EventHandler<ActionEvent>(){     
		
		@Override
		public void handle(ActionEvent event){
			double amount=Double.parseDouble(DepositField.getText());
			account.Deposit(amount);
			show.setText("success");
			System.out.print(account.Deposit(amount));
			
		}
	});
back.setOnAction(new EventHandler<ActionEvent>(){     
		
		@Override
		public void handle(ActionEvent event){
			mainMenu.preparescene();
		stage.setScene(mainMenu.getScene());
			
		}
	});
	scene=new Scene(grid,300,100);
	
	
}
public Scene getScene(){
	return scene;
}
public void setScene(Scene scene){
	this.scene=scene;
}
public Stage getStage(){
	return stage;
}
public void setStage(Stage stage){
	this.stage=stage;
}
public MainMenu getMainMenu(){
	return mainMenu;
}
public void setMainMenu(MainMenu mainMenu){
	this.mainMenu=mainMenu;
}
public account getaccount(){
	return account;
}
public void setaccount(account account){
	this.account=account;
}
}
