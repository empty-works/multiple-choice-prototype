/*
 */
package multiplechoiceprototype.question_answer_processing;

import java.util.List;

/**
 *
 * @author MP
 */
public class QuestionAnswerGenerator {
  
    public static QAContainer getQACon() {
        
        QAContainer con = new QAContainer();
        
        int randomIndex = getRandomIndex();
        con.question = getQuestion(randomIndex);
        con.answers = getAnswers(randomIndex);
        
        return con;
    }
    
    private static int getRandomIndex() {
        
        int num = 0;
        
        return num;
    }
    
    private static String getQuestion(int index) {
        
        return QuestionProcessor.getQuestion(index);
    }
    
    private static List<String> getAnswers(int index) {
        
        return AnswerProcessor.getAnswers(index);
    }
}
