/*
 */
package multiplechoiceprototype.tasks;

import javafx.concurrent.Task;
import multiplechoiceprototype.beans.MyColors;
import multiplechoiceprototype.question_answer_processing.QAContainer;

/**
 *
 * @author MP
 */
public class AnswerTask extends Task<Boolean> {
    
    private QAContainer QACon;
    
    public AnswerTask(QAContainer QACon) {
        
        this.QACon = QACon;
    }

    @Override
    protected Boolean call() throws Exception {
        
        // Search for the correct answer
        QACon.correctAnswerButton.setButtonColor(MyColors.CORRECT_COLOR);
        
        if(isCancelled()) {
            
            
        }
        
        return true;
    }
    
}
