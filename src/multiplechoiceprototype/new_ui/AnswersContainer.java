/*
 */
package multiplechoiceprototype.new_ui;

import java.util.List;
import javafx.collections.ObservableList;
import javafx.scene.control.Label;

/**
 *
 * @author MP
 */
public class AnswersContainer extends javafx.scene.layout.HBox {
    
    private AnswerLabel choice1, choice2, choice3, choice4;
    private String[] answers;
    
    public AnswersContainer(String[] answers) {
        
        this.setId("ChoicesContainer");
        setLocalArray(answers);
        setLabels();
    }
    
    private void setLocalArray(String[] answers) {
        
        for(int i = 0; i < answers.length; i++) {
            
            this.answers[i] = answers[i];
        }
    }
    
    private void setLabels() {
        
        choice1 = new AnswerLabel(answers[0]);
        choice2 = new AnswerLabel(answers[1]);
        choice3 = new AnswerLabel(answers[2]);
        choice4 = new AnswerLabel(answers[3]);
        
        ObservableList list = this.getChildren();
        list.addAll(choice1, choice2, choice3, choice4);
    }
}
