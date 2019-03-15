package project;



import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Loginform {
	Stage stage;
	Scene scene;
	login login;
	MainMenu mainMenu;
	
	public Loginform(Stage stage){
		this.stage=stage;
	}

	
	public void preparescene() {
		
		login=new login();
	
		
		Label username=new Label("Card number");
		Label password=new Label("password");
		
		TextField usernameField=new TextField();
		PasswordField passwordField=new PasswordField();
		Button ok=new Button("ok");
		Label validationLabel= new Label();
		GridPane grid=new GridPane();
		grid.add(username, 0, 0);
		grid.add(password, 0, 1);
		grid.add(usernameField, 1, 0);
		grid.add(passwordField, 1, 1);
		grid.add(ok,1, 3);
		grid.add(validationLabel, 1, 4);
		
		ok.setOnAction(new EventHandler<ActionEvent>(){     
			
			@Override
			public void handle(ActionEvent event){
			String username=usernameField.getText();
			String password=passwordField.getText();
			boolean valid=login.validate(username, password);
			if(valid){
				
				stage.setScene(mainMenu.getScene());
			}
			else{
				validationLabel.setText("Wrong Card number or Password" );
			}
			}
		});
		scene=new Scene(grid,300,100);
 
		
	}
	public Scene getscene(){
		return this.scene;
	}
	
	public void setMainMenu(MainMenu mainMenu) {
		this.mainMenu = mainMenu;
	}
	
	
}