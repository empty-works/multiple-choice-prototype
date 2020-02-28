/*
 */
package multiplechoiceprototype.db_controller;

import java.util.List;

/**
 *
 * @author MP
 */
public interface DBInterface {
    
    public List<String> getQuestions(String level);
    public List<String[]> getAnswers(String level);
}
