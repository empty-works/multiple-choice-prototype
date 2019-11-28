/*
 * This class will handle generating questions which will include randomized
 * varying "components" of each question (i.e. varying names in programming
 * language questions or math questions).
 */
package multiplechoiceprototype.question_answer_processing;

import test_items.TestQuestionBean;

/**
 *
 * @author MP
 */
public class QuestionProcessor {
    
    public static String getQuestion(int index) {
        
        String question = "";
        
        if(index != QuestionAnswerGenerator.INVALID_QA) {
            
            question = TestQuestionBean.getQuestionList().get(index);
            System.out.println("Question: " + question);
        }

        return question;
    }
}
