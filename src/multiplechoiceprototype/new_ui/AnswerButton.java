/*
 */
package multiplechoiceprototype.new_ui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author MP
 */
public class AnswerButton extends javafx.scene.control.Button {
    
    private String text;
    private DropShadow shadow = new DropShadow();
    
    public AnswerButton(String text) {
        
        this.setId("AnswerLabel");
        this.text = text;
        this.setText(text);
        setProperties();
        setAction();
    }
    
    private void setProperties() {
        
        this.setPadding(new Insets(10));
    }
    
    private void setAction() {
        
        this.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                
                AnswerButton.this.setEffect(shadow);
            }
        });
        
        this.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                
                AnswerButton.this.setEffect(null);
            }
        });
        
        this.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                
                
            }
        });
    }
}
