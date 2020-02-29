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
        
        List<String[]> answers = new ArrayList<>();
        answers.add(new String[]{"Test1Answer1", "Test1Answer2", "Test1Answer3", "Test1Answer4"});
        answers.add(new String[]{"Test2Answer1", "Test2Answer2", "Test2Answer3", "Test2Answer4"});
        answers.add(new String[]{"Test3Answer1", "Test3Answer2", "Test3Answer3", "Test3Answer4"});
        answers.add(new String[]{"Test4Answer1", "Test4Answer2", "Test4Answer3", "Test4Answer4"});
        answers.add(new String[]{"Test5Answer1", "Test5Answer2", "Test5Answer3", "Test5Answer4"});
        
        return answers;
    }
}
