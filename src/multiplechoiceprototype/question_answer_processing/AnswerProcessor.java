/*
 * This class will handle generating randomized answers. In the case of a 
 * programming language answer or math answer, the algorithms will generate
 * a pretty good number varying answers.
 */
package multiplechoiceprototype.question_answer_processing;

import test_items.TestAnswerBean;

/**
 *
 * @author MP
 */
public class AnswerProcessor {
    
    public static void setAnswers(QAContainer con, int index) {
        
        con.correctAnswer = con.answers.get(0); // For now, first element is correct answer.
        
        if(index != QuestionAnswerGenerator.INVALID_QA) {
            
            con.answers = TestAnswerBean.getAnswerList();
        }
    }
}
