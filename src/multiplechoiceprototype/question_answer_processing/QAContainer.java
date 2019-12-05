/*
 */
package multiplechoiceprototype.question_answer_processing;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import multiplechoiceprototype.user_interface.AnswerButton;

/**
 *
 * @author MP
 */
public class QAContainer {
  
    public String question;
    public List<String> answers = new ArrayList<>();
    
    
    // Answer
    public List<AnswerButton> buttonList = new ArrayList<>();
    public String correctAnswer; // For now, first element is the correct answer.
    public static AnswerButton correctAnswerButton = null;
    
    //UI
    public JPanel ContinueContainer = null;
}
