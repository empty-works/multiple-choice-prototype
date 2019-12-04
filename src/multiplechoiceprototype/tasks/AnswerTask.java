/*
 */
package multiplechoiceprototype.tasks;

import javafx.concurrent.Task;

/**
 *
 * @author MP
 */
public class AnswerTask extends Task<Integer> {
    
    public AnswerTask() {
        
        
    }

    @Override
    protected Integer call() throws Exception {
        
        if(isCancelled()) {
            
            
        }
        
        return 0;
    }
    
}
