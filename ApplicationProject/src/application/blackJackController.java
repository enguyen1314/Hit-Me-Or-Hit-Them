/**
 * 
 */
package application;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;

/**
 * @author oep957
 *
 */
public class blackJackController 
{
	@FXML
	private Rectangle p1;
	@FXML
	private Rectangle p2;
	@FXML
	private Rectangle p3;
	@FXML
	private Rectangle p4;
	@FXML
	private Rectangle p5;
	@FXML
	private Rectangle d1;
	@FXML
	private Rectangle d2;
	@FXML
	private Rectangle d3;
	@FXML
	private Rectangle d4;
	@FXML
	private Rectangle d5;
	@FXML
	private Label lblp1;
	@FXML
	private Label lblp2;
	@FXML
	private Label lblp3;
	@FXML
	private Label lblp4;
	@FXML
	private Label lblp5;
	@FXML
	private Label lbld1;
	@FXML
	private Label lbld2;
	@FXML
	private Label lbld3;
	@FXML
	private Label lbld4;
	@FXML
	private Label lbld5;
	@FXML
	private Label lblDeck;
	@FXML
	private Label txtHelp;
	@FXML
	private Label lblDiff;
	
	private int diffInt = 1;
	Computer cpu = new Computer(diffInt);
	ArrayList<String> player = Card.getDeck();
	Stack<String> centerPile = new Stack<String>();
	//Add round mechanic?
	//Maybe add betting??
	@FXML
    private void initialize()
    {
		//Testing computer class
		
		
		//For center pile. TODO: FIND WAY TO IMPLEMENT STACK WITH CARD OBJECTS
    }
	
	@FXML
	private void changeDifficulty(ActionEvent event)
	{
		//Changes difficulty based on what's already shown
		//diffInt purely for computer use.
		switch (diffInt) {
			case 1:
				diffInt = 2;
				lblDiff.setText("Medium");
				break;
			case 2:
				diffInt = 3;
				lblDiff.setText("Hard");
				break;
			case 3:
				diffInt = 1;
				lblDiff.setText("Easy");
				break;
			
		}
		cpu.setDifficulty(diffInt);
		//Edit lblDiff to display difficulty (Easy, medium, hard, each editing difficulty object (TODO)
		
	}
	@FXML
	private void slapAction(ActionEvent event)
    {
		System.out.println("hit");
		String test = centerPile.peek();
		if(test.equals("Jack")) {
			//Maybe call a function to measure button press
			//response time vs computer?
			
			//WINNING STUFF
			//Implement bot response time by waiting seconds corresponding 
			//to responseTime
			//may need to do somewhere else outside of button, maybe initialize??
		}
		else {
			//Implement code for either affecting score or moving all cards in 
			//stack to the player's deck
			
		}
		//Convert to label, implement randomness into deck shuffling
		
    }
	
	@FXML
	private void flipAction(ActionEvent event)
    {
		System.out.println("hold hit");
		//Convert to label, implement computer actions/comparison between
		//player and cpu.
		//centerPile.push(cpu.)
		//TODO: NEED TO REFACTOR CARD CODE, SOME METHODS DO TOO MUCH
		//IE CAN'T ACCESS TOP CARD
    }
	
	@FXML
	private void returnAction(ActionEvent event)
    {
		Main.url=Main.class.getResource("titleScreen.fxml");
		Main.loader.setLocation(Main.url);	
        try {
			Main.scene.setRoot(FXMLLoader.load(getClass().getResource("titleScreen.fxml")));
			Main.root=(AnchorPane)Main.loader.load();
		      
			Main.stage.setScene(Main.scene);
			Main.stage.setTitle("Hit Me or Hit Them"); //Changing the title of the primaryStage to better fit the purpose of the application
			Main.stage.show();
		}
        catch (IOException e) 
        {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//Connecting to the FXML
    }
	
	@FXML
	private void helpAction(ActionEvent event)
	{
		if(txtHelp.isVisible())
		{
			txtHelp.setVisible(false);
		}
		else
		{
			txtHelp.setVisible(true);
		}
	}
}
