/*
 */
package multiplechoiceprototype.user_interface;

import javafx.concurrent.Task;

/**
 *
 * @author MP
 */
public class AnswerTask extends Task<Integer> {

    @Override
    protected Integer call() throws Exception {
        
        if(isCancelled()) {
            
            
        }
        
        return 0;
    }
    
}
