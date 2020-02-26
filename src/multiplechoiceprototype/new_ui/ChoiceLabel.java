/*
 */
package multiplechoiceprototype.new_ui;

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
    }
}
