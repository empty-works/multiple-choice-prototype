/*
 */
package multiplechoiceprototype.question_answer_processing;

import java.awt.Cursor;
import java.util.ArrayList;
import java.util.List;
import multiplechoiceprototype.user_interface.AnswerButton;
import multiplechoiceprototype.user_interface.MainFrame;

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
    public AnswerButton correctAnswerButton = null;
    
    //UI
    public MainFrame mainFrame;
    public Cursor defaultCursor = new Cursor(Cursor.DEFAULT_CURSOR);
    public Cursor handCursor = new Cursor(Cursor.HAND_CURSOR);
}
