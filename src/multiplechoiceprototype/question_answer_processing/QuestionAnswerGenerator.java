/*
 */
package multiplechoiceprototype.question_answer_processing;

import java.util.Random;
import test_items.TestAnswerBean;
import test_items.TestQuestionBean;

/**
 *
 * @author MP
 */
public class QuestionAnswerGenerator {
  
    private static QAContainer con;
    
    public static QAContainer getQACon() {
        
        con = new QAContainer(); // Instanstiated here to reset.
        int randomIndex = getRandomIndex();
        con.question = QuestionProcessor.getQuestion(randomIndex);
        TestAnswerBean.setAnswerList();
        AnswerProcessor.setAnswers(con, randomIndex);
        
        return con;
    }
    
    final public static int INVALID_QA = -1;
    private static int getRandomIndex() {
        
        int num = INVALID_QA;
        
        if(TestQuestionBean.numQuestions == TestAnswerBean.numQuestions) {
            
            Random random = new Random();
            num = random.nextInt(TestQuestionBean.numQuestions - 0) + 0;
            System.out.println("Randon index: " + num);
        }
        
        return num;
    }
}
