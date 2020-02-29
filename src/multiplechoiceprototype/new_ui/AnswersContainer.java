/*
 */
package multiplechoiceprototype.new_ui;

import java.util.List;
import javafx.scene.control.Label;

/**
 *
 * @author MP
 */
public class AnswersContainer extends javafx.scene.layout.HBox {
    
    //TODO Create Label objects.
    private String[] answers;
    
    public AnswersContainer(String[] answers) {
        
        this.setId("ChoicesContainer");
        setLocalArray(answers);
    }
    
    private void setLocalArray(String[] answers) {
        
        for(int i = 0; i < answers.length; i++) {
            
            this.answers[i] = answers[i];
        }
    }
    
    private void setLabels() {
        
        
    }
}
