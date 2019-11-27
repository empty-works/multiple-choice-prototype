/*
 */
package multiplechoiceprototype.question_answer_processing;

/**
 *
 * @author MP
 */
public class QuestionAnswerGenerator {
  
    public static QAContainer getQACon() {
        
        QAContainer con = new QAContainer();
        
        con.question = getQuestion();
        
        return con;
    }
    
    private static String getQuestion() {
        
        return QuestionProcessor.getQuestion();
    }
}
