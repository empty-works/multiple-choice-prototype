/*
 */
package multiplechoiceprototype.new_ui;

import javafx.geometry.Insets;

/**
 *
 * @author MP
 */
public class AnswerButton extends javafx.scene.control.Button {
    
    //TODO: Add mouse event handler
    private String text;
    
    public AnswerButton(String text) {
        
        this.setId("AnswerLabel");
        this.text = text;
        this.setText(text);
        setProperties();
    }
    
    private void setProperties() {
        
        this.setPadding(new Insets(10));
    }
}
