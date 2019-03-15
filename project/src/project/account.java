package project;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class account {
	
	Stage stage;
	Scene scene;
	MainMenu mainMenu;
	login login;
	Loginform loginform;
	public account(Stage stage){
		this.stage=stage;
	}
	
		
	
	private double balance;
	public void preparescene(){
		MainMenu mainMenu;
		Button BalanceInquiry= new Button("BalanceInquiry");
		GridPane grid=new GridPane();
		grid.add(BalanceInquiry, 0, 0);
	}
	
	public account(double balanceInquiry){
		if(balanceInquiry>=0.0)
			balance=balanceInquiry;
	}
 public void debit(double amount){
	 balance+=amount;
 }
  public void withdrawal(double amount){
	  if(amount>balance)
		  System.out.println("not enough money");  
	  else  
	  balance-=amount;
	  
  }
 
  
  public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public Scene getscene(){
		return this.scene;
  }

public double Deposit(double amount) {
	return amount;
	// TODO Auto-generated method stub
	
}

public double Withdrawal(double amount) {
	return amount;
	// TODO Auto-generated method stub
	
}

	}
	



