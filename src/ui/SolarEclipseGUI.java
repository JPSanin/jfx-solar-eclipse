package ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import model.Moon;
import thread.SolarEclipseThread;

public class SolarEclipseGUI {

    @FXML
    private Pane sky;

    @FXML
    private Circle moon;
    @FXML
    private Button buttonMove;

    @FXML
    private Button buttonStop;
    @FXML
    private Circle crater1;

    @FXML
    private Circle crater3;

    @FXML
    private Circle crater2;

    @FXML
    private Slider slider;
    
    private Moon[] moons;
    
    private Stage stage;
    
    
    public SolarEclipseGUI(Stage stage) {
    	this.stage=stage;
    	moons= new Moon[4];
    }

    @FXML
    public void moveMoon(ActionEvent event) {
    	
    	SolarEclipseThread set= new SolarEclipseThread(moons, this);
    	for (int i = 0; i < moons.length; i++) {
    		moons[i].setMoving(true);
    		int slideValue=(int) slider.getValue();
    		Long sleep=(long) slideValue;
    		moons[i].setSleep(sleep);
        	moons[i].setMax(stage.getWidth());	
		}
    	set.start();
    	buttonStop.setDisable(false);
    	buttonMove.setDisable(true);


    }

    @FXML
    public void stopMoon(ActionEvent event) {
    	for (int i = 0; i < moons.length; i++) {
    		moons[i].setMoving(false);
		}
    	buttonStop.setDisable(true);
    	buttonMove.setDisable(false);
    	slider.setDisable(false);


    }
    
   
    
    public void initialize() {
    	
    	moons[0]= new Moon(moon.getLayoutX(),100L,stage.getWidth(),moon.getRadius(),0);
    	moons[1]= new Moon(crater1.getLayoutX(),100L,stage.getWidth(),crater1.getRadius(),moon.getRadius()+35);
    	moons[2]= new Moon(crater2.getLayoutX(),100L,stage.getWidth(),crater2.getRadius(),moon.getRadius()+35);
    	moons[3]= new Moon(crater3.getLayoutX(),100L,stage.getWidth(),crater3.getRadius(),moon.getRadius()+44);
    	buttonStop.setDisable(true);
    	
    }

	public void updateGUI() {
		moon.setLayoutX(moons[0].getX());
		crater1.setLayoutX(moons[1].getX());
		crater2.setLayoutX(moons[2].getX());
		crater3.setLayoutX(moons[3].getX());
		slider.setDisable(true);
	}

	
    
    

}