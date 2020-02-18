/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bouncingball;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 *
 * @author pelon
 */
public class CirclePane extends Pane {

    private double radius = 5;
    private Circle circle = new Circle(radius);
    private int dy = 6;
    private int dx = 4;

    public CirclePane() {
        circle.setCenterX(300);
        circle.setCenterY(radius);
        circle.setStroke(Color.BLUE);
        circle.setFill(Color.GOLD);
        this.getChildren().add(circle);
    }

    public void moveDy() {
        circle.setCenterY(circle.getCenterY() + dy);
        if (dy > 0) {
            if (circle.getCenterY() + radius >= 600) {
                circle.setCenterY(598 - radius);
                dy = dy * -1;
            }
        }
        else{
            if(circle.getCenterY() - radius <= 0){
                circle.setCenterY(radius);
                dy = dy * -1;
            }
        }
    }

    public void moveDx() {
        circle.setCenterX(circle.getCenterX() + dx);
        if (dx > 0) {
            if (circle.getCenterX() + radius >= 600) {
                circle.setCenterX(598 - radius);
                dx = dx * -1;
            } 
        }
        else {
           if (circle.getCenterX() - radius <= 0) {
                circle.setCenterX(radius);
                dx = dx * -1;
            } 
        }
    }
    public void move(){
        moveDy();
        moveDx();
    }

}
