/*
 */
package multiplechoiceprototype.new_ui;

import javafx.geometry.Insets;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author MP
 */
public class ChoiceLabel extends javafx.scene.control.Label {
    
    private String text;
    
    //TODO: finish ChoiceLabel
    public ChoiceLabel(String text) {
        
        this.setId("ChoiceLabel");
        this.text = text;
        this.setText(text);
        setProperties();
    }
    
    private void setProperties() {
        
        this.setPadding(new Insets(10));
        AnchorPane.setLeftAnchor(this, 10.0);
        AnchorPane.setRightAnchor(this, 10.0);
    }
}
