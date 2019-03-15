package project;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Withdrawal {
 protected static final double Balance=0;
 Stage stage;
 Scene scene;
 MainMenu mainMenu;
 account account=new account(0);
 
 public Withdrawal(Stage stage){
	 this.stage=stage;
	 
 }
 public void preparescene(){
	    Label Withdrawal=new Label("amount");
	    Label show=new Label();
		TextField WithdrawalField=new TextField();
		Button confirm=new Button("confirm");
		Button back=new Button("Back to main menu");
		GridPane grid=new GridPane();
		grid.add(Withdrawal, 0, 0);
		grid.add(WithdrawalField, 0, 1);
		grid.add(confirm, 1, 2);
		grid.add(back, 1, 3);
		grid.add(show,1, 4);
		
		
		confirm.setOnAction(new EventHandler<ActionEvent>(){     
			
			@Override
			public void handle(ActionEvent event){
				double amount=Double.parseDouble(WithdrawalField.getText());
				if(Balance>amount){
				account.Withdrawal(amount);
				show.setText("success");
				System.out.println(account.Withdrawal(amount));
			}else
				show.setText("Failed");
			}
		});
		back.setOnAction(new EventHandler<ActionEvent>(){     
			
			@Override
			public void handle(ActionEvent event){
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
	public void setMainMenu(MainMenu mainMenu){
		this.mainMenu=mainMenu;
	}
}
