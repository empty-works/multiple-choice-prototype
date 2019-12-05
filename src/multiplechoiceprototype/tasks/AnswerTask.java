/*
 */
package multiplechoiceprototype.tasks;

import javafx.concurrent.Task;

/**
 *
 * @author MP
 */
public class AnswerTask extends Task<Boolean> {
    
    public AnswerTask() {
        
        
    }

    @Override
    protected Boolean call() throws Exception {
        
        
        
        if(isCancelled()) {
            
            
        }
        
        return true;
    }
    
}
