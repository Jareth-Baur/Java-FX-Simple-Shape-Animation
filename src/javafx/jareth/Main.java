/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package javafx.jareth;

import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * @author Jareth
 * @since October 1 2024
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Polygon hexagon = new Polygon();
        
        hexagon.getPoints().addAll(new Double[]{
            200.0, 50.0,
            400.0, 50.0,
            450.0, 150.0,
            400.0, 250.0,
            200.0, 250.0,
            150.0, 150.0
        });
        
        hexagon.setFill(Color.BLUE);
        
        RotateTransition rt = new RotateTransition();
        rt.setDuration(Duration.millis(1000));
        rt.setNode(hexagon);
        rt.setByAngle(360);
        rt.setCycleCount(50);
        rt.setAutoReverse(false);
        rt.play();
        Group root = new Group(hexagon);
        
        Scene scene = new Scene(root, 600, 300);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
