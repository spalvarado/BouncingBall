/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bouncingball;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author pelon
 */
public class BouncingBall extends Application {
    
        CirclePane root = new CirclePane();
    @Override
    public void start(Stage primaryStage) {
        MyTimer timer = new MyTimer();
        root.setPrefSize(600, 600);
        Scene scene = new Scene(root, 100, 100);
        
        
        primaryStage.setTitle("Bouncing Ball");
        primaryStage.setScene(scene);
        timer.start();
        primaryStage.show();
    }
    
    public class MyTimer extends AnimationTimer{
        private long lastValue = 0;
        @Override
        public void handle(long nSec){
            if((nSec - lastValue)*1000000 > 10){
                root.move();
            }
            lastValue = nSec;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
