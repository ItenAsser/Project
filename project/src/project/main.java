package project;

import javafx.application.Application;
import javafx.stage.Stage;

public class main extends Application {
	public static void main(String[] args){
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("atm");
		Loginform loginform=new Loginform(primaryStage);
		MainMenu mainMenu= new MainMenu(primaryStage);
		Deposit deposit=new Deposit(primaryStage);
		Withdrawal withdrawal=new Withdrawal(primaryStage);
		loginform.preparescene();
		mainMenu.preparescene();
		deposit.preparescene();
		withdrawal.preparescene();
		loginform.setMainMenu(mainMenu);
		mainMenu.setLoginform(loginform);
	    mainMenu.setDeposit(deposit);
	    mainMenu.setWithdrawal(withdrawal);
	    withdrawal.setMainMenu(mainMenu);
		primaryStage.setScene(loginform.getscene());
		
		primaryStage.show();
		
	}
	
}
