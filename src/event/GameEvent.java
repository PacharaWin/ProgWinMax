package event;

//
//Decompiled by Procyon v0.5.36
//

import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.event.Event;
import javafx.scene.input.KeyEvent;
import javafx.event.EventHandler;
import java.util.HashMap;
import javafx.geometry.Point2D;
import javafx.scene.input.KeyCode;
import java.util.Map;
import javafx.scene.Scene;

public class GameEvent
{
 private Scene scene;
 private Map<KeyCode, Integer> keyHolding;
 private boolean mouseClick;
 private Point2D mousePosition;
 
 public GameEvent(final Scene scene) {
     this.scene = scene;
     (this.keyHolding = new HashMap<KeyCode, Integer>()).put(KeyCode.W, 0);
     this.keyHolding.put(KeyCode.A, 0);
     this.keyHolding.put(KeyCode.S, 0);
     this.keyHolding.put(KeyCode.D, 0);
     this.mouseClick = false;
     this.mousePosition = new Point2D(0.0, 0.0);
     this.assign();
 }
 
 public void assign() {
     this.scene.setOnMousePressed((EventHandler)new EventHandler<MouseEvent>() {
         public void handle(final MouseEvent e) {
             if (e.getButton() == MouseButton.PRIMARY) {
                 GameEvent.this.mouseClick = true;
             }
         }
     });
     this.scene.setOnMouseReleased((EventHandler)new EventHandler<MouseEvent>() {
         public void handle(final MouseEvent e) {
             if (e.getButton() == MouseButton.PRIMARY) {
                 GameEvent.this.mouseClick = false;
             }
         }
     });
     this.scene.setOnMouseMoved((EventHandler)new EventHandler<MouseEvent>() {
         public void handle(final MouseEvent event) {
             GameEvent.this.mousePosition = new Point2D(event.getX(), event.getY());
         }
     });
     this.scene.setOnMouseDragged((EventHandler)new EventHandler<MouseEvent>() {
         public void handle(final MouseEvent event) {
             GameEvent.this.mousePosition = new Point2D(event.getX(), event.getY());
         }
     });
 }
 
 public int getHorizontal() {
     return this.keyHolding.get(KeyCode.D) - this.keyHolding.get(KeyCode.A);
 }
 
 public int getVertical() {
     return this.keyHolding.get(KeyCode.S) - this.keyHolding.get(KeyCode.W);
 }
 
 public boolean getMouseClick() {
     return this.mouseClick;
 }
 
 public Point2D getMousePosition() {
     return this.mousePosition;
 }
}
