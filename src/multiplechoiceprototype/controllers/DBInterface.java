/*
 */
package multiplechoiceprototype.controllers;

import java.util.List;

/**
 *
 * @author MP
 */
public interface DBInterface {
    
    public List<String> getQuestions(String subject);
    public List<String[]> getAnswers(String subject);
}
