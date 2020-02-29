/*
 */
package multiplechoiceprototype.new_ui;

import javafx.collections.ObservableList;

/**
 *
 * @author MP
 */
public class AnswersContainer extends javafx.scene.layout.HBox {
    
    private AnswerLabel choice1, choice2, choice3, choice4;
    private String[] answers = new String[4];
    
    public AnswersContainer(String[] answers) {
        
        this.setId("ChoicesContainer");
        System.out.println("Answers: " + answers);
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
