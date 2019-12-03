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
    
    /**
     * 
     */
    public AnswerPanel(QAContainer QACon) {
        initComponents();
        
        this.QACon = QACon;
    }
    
    public void setAnswers() {
        
        for(int i = 0; i < 4; i++) {
            
            AnswerButton answer = new AnswerButton(QACon.correctAnswer, QACon.answers.get(i));
            TopPanel.add(answer);
            buttonList.add(answer);
            if(answer.isCorrectAnswer()) {
                
                correctAnswer = answer;
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TopPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setToolTipText(null);
        setOpaque(false);
        setLayout(new java.awt.GridLayout(2, 1));

        TopPanel.setLayout(new java.awt.GridLayout());
        add(TopPanel);

        jPanel2.setLayout(new java.awt.GridLayout());
        add(jPanel2);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TopPanel;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
