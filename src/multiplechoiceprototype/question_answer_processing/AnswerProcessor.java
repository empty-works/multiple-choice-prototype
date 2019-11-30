/*
 * This class will handle generating randomized answers. In the case of a 
 * programming language answer or math answer, the algorithms will generate
 * a pretty good number varying answers.
 */
package multiplechoiceprototype.question_answer_processing;

import java.util.Collections;
import test_items.TestAnswerBean;

/**
 *
 * @author MP
 */
public class AnswerProcessor {
    
    public static void setAnswers(QAContainer con, int index) {
        
        if(index != QuestionAnswerGenerator.INVALID_QA) {
            
            String answerString = TestAnswerBean.getAnswerList(index);
            String[] answers = answerString.split("-");
            con.correctAnswer = answers[0]; // For now, first element is correct answer.
            setAnswersList(con, answers);
            // Now randomize the answers list in the QAContainer.
            Collections.shuffle(con.answers);
        }
    }
    
    private static void setAnswersList(QAContainer con, String[] answerArray) {
        
        for(int i = 0; i < answerArray.length; i++) {
            
            con.answers.add(answerArray[i]);
        }
    }
}
