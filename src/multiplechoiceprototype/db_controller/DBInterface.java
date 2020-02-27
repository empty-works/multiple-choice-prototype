/*
 */
package multiplechoiceprototype.db_controller;

import java.util.List;

/**
 *
 * @author MP
 */
public interface DBInterface {
    
    public String getQuestion();
    
    public List<String> getAnswers();
}
