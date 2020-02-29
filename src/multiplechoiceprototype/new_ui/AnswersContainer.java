/*
 */
package multiplechoiceprototype.new_ui;

import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author MP
 */
public class AnswersContainer extends javafx.scene.layout.VBox {
    
    private AnswerButton choice1, choice2, choice3, choice4;
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
        
        choice1 = new AnswerButton(answers[0]);
        choice2 = new AnswerButton(answers[1]);
        choice3 = new AnswerButton(answers[2]);
        choice4 = new AnswerButton(answers[3]);
        
        choice1.prefWidthProperty().bind(this.widthProperty());
        choice2.prefWidthProperty().bind(this.widthProperty());
        choice3.prefWidthProperty().bind(this.widthProperty());
        choice4.prefWidthProperty().bind(this.widthProperty());
        
        ObservableList list = this.getChildren();
        list.addAll(choice1, choice2, choice3, choice4);
    }
}
