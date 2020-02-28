/*
 */
package multiplechoiceprototype.db_controller;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MP
 */
public class DBController implements DBInterface {

    public DBController() {
        
        
    }
    
    @Override
    public List<String> getQuestions(String subject) {
        
        List<String> questions = new ArrayList<>();
        questions.add("Test1");
        questions.add("Test2");
        questions.add("Test3");
        questions.add("Test4");
        questions.add("Test5");
        
        return questions;
    }

    @Override
    public List<String[]> getAnswers(String subject) {
        
        return null;
    }
}
