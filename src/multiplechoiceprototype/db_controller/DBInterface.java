/*
 */
package multiplechoiceprototype.db_controller;

import java.util.List;

/**
 *
 * @author MP
 */
public interface DBInterface {
    
    public List<String> getQuestion(String level);
    
    public List<String[]> getAnswers(String level);
}
