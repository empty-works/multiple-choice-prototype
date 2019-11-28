/*
 * This class will handle generating randomized answers. In the case of a 
 * programming language answer or math answer, the algorithms will generate
 * a pretty good number varying answers.
 */
package multiplechoiceprototype.question_answer_processing;

import java.util.ArrayList;
import java.util.List;
import test_items.TestAnswerBean;

/**
 *
 * @author MP
 */
public class AnswerProcessor {
    
    public static List<String> getAnswers(int index) {
        
        List<String> answers = new ArrayList<>();
        
        if(index != QuestionAnswerGenerator.INVALID_QA) {
            
            answers = TestAnswerBean.getAnswerList();
        }
        
        return answers;
    }
}
