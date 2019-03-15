package project;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MainMenu { 
	
	Stage stage;
	Scene scene;
	Loginform loginform;
	Deposit deposit;
	Withdrawal withdrawal;
	account account=new account (0);
	public MainMenu(Stage stage){
		this.stage=stage;
	}
	
	public void preparescene(){
		Button BalanceInquiry= new Button("BalanceInquiry");
		Button Deposit=new Button("Deposit");
		Button Withdrawal=new Button("Withdrawal");
		Button Previous=new Button("Previous");
		Button Next=new Button("Next");
		Label Balance=new Label();
		GridPane grid=new GridPane();
		grid.add(BalanceInquiry, 0, 0);
		grid.add(Deposit, 3, 0);
		grid.add(Withdrawal, 0, 1);
		grid.add(Previous, 3, 1);
		grid.add(Next, 2,2 );
		
		
		Deposit.setOnAction(new EventHandler<ActionEvent>(){
			
			@Override
			public void handle(ActionEvent event){
			
			stage.setScene(deposit.getScene());
			
			}
		});
Withdrawal.setOnAction(new EventHandler<ActionEvent>(){
			
			@Override
			public void handle(ActionEvent event){
			
			stage.setScene(withdrawal.getScene());
			}
		});
BalanceInquiry.setOnAction(new EventHandler<ActionEvent>(){
			
			@Override
			public void handle(ActionEvent event){
			System.out.println(account.getBalance());
			
			}

});
			
	
scene = new Scene(grid, 600, 400);
	}
	public Stage getStage(){
		return stage;
	}
	public void setStage(Stage stage){
		this.stage=stage;
	}
	public void setScene(Scene scene){
		this.scene=scene;
	}
	public Withdrawal getWithdrawal(){
		return withdrawal;
	}
	public  Scene getScene(){
		return scene;
	}
	public void setWithdrawal(Withdrawal withdrawal){
		this.withdrawal=withdrawal;
	}
	public void setLoginform(Loginform loginform) {
		this.loginform = loginform;
	}

	public void setDeposit(Deposit deposit) {
		this.deposit=deposit;
	}
		}




