/*The Installator (C) Init Studios 2019. All rights reserved.

We're cool with you using our code. Just abide by the terms set out by the Apache  2.0 license included in the project. :)
*/

package application;
	
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class Installator extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			Group root = new Group();
			ObservableList<Node> list = root.getChildren();
			Scene scene = new Scene(root,750,450);
			
			ImageView logo = new ImageView(new Image("https://initstudios.github.io/initmc.github.io/installator/res/init.png"));
			logo.setLayoutX(140);
			logo.setLayoutY(50);
			logo.setPreserveRatio(true);
			logo.setSmooth(true);
			logo.setCache(true);
			logo.setFitWidth(500);
			logo.setFitHeight(200);
			
			Line border = new Line();
			border.setStartX(0);
			border.setEndX(750);
			border.setStartY(30);
			border.setEndY(30);
			border.setOpacity(0.125);
			
			ObservableList<String> options = 
				    FXCollections.observableArrayList(
				        "Initiative Mod",
				        "MCReconfigured"
				    );
			ComboBox<String> comboBox = new ComboBox<String>();
			comboBox.setItems(options);
			comboBox.setPrefSize(130, 25);
			comboBox.setLayoutX(215);
			comboBox.setLayoutY(225);
			
			Button install = new Button();
			install.setText("Install");
			install.setLayoutX(375);
			install.setLayoutY(225);
			install.setPrefSize(50, 25);
			
			Text title = new Text();
			title.setText("Installator");
			title.setStroke(Color.BLACK);
			title.setStrokeWidth(0.75);
			title.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 16));
			title.setX(10);
			title.setY(25);
			
			list.add(title);
			list.add(border);
			list.add(comboBox);
			list.add(install);
			list.add(logo);
			
			scene.setFill(Color.LIGHTGREY);
			
			primaryStage.initStyle(StageStyle.UNDECORATED);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
