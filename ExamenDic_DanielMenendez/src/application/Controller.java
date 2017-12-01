package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

public class Controller implements Initializable{
	@FXML
    private AnchorPane pane1;

    @FXML
    private AnchorPane pane2;

    @FXML
    private ImageView Fotele;


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		translateAnimation(0.1,pane2,600);

	}

	public void rotateAnimation(){
		RotateTransition rotacion = new RotateTransition(Duration.seconds(60),Fotele);
		rotacion.setByAngle(360*11);
		rotacion.play();
		}


	public void translateAnimation(double duracion, Node node, double distancia) {
		TranslateTransition translate = new TranslateTransition(Duration.seconds(duracion), node);
		translate.setByY(distancia);
		translate.play();
	}

	int slideActual=1;
	@FXML
	void nextAction(){
		if(slideActual==1){
			translateAnimation(0.5,pane2,-600);
			slideActual++;
		}else if(slideActual==2){
			System.out.println("no hay más slides");

		}
	}

	@FXML
	void backAction(){
		if(slideActual==1){
			System.out.println("no hay más slides");
		}else if ( slideActual==2){
			translateAnimation(0.5,pane2,600);
			slideActual--;
		}

	}


}
