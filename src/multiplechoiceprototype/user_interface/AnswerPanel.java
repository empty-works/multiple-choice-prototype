/*
 */
package multiplechoiceprototype.user_interface;

import java.util.ArrayList;
import java.util.List;
import multiplechoiceprototype.question_answer_processing.QAContainer;

/**
 *
 * @author MP
 */
public class AnswerPanel extends javax.swing.JPanel {

    private QAContainer QACon;
    public static List<AnswerButton> buttonList = new ArrayList<>();
    public static AnswerButton correctAnswer = null;
    final private int MAX_NUM_ANSWERS = 4;
    
    /**
     * 
     */
    public AnswerPanel(QAContainer QACon) {
        initComponents();
        
        this.QACon = QACon;
        setAnswers();
        setReasonNext();
    }
    
    private void setAnswers() {
        
        for(int i = 0; i < MAX_NUM_ANSWERS; i++) {
            
            AnswerButton answer = new AnswerButton(QACon.correctAnswer, 
                    QACon.answers.get(i));
            TopPanel.add(answer);
            buttonList.add(answer);
            if(answer.isCorrectAnswer()) {
                
                correctAnswer = answer;
            }
        }
    }
    
    private void setReasonNext() {
        
        //BottomPanel.add(new ReasonNextPanel(QACon));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TopPanel = new javax.swing.JPanel();

        setToolTipText(null);
        setOpaque(false);
        setLayout(new java.awt.GridLayout(1, 1));

        TopPanel.setLayout(new java.awt.GridLayout(4, 1));
        add(TopPanel);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TopPanel;
    // End of variables declaration//GEN-END:variables
}
