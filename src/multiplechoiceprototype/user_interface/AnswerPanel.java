/*
 */
package multiplechoiceprototype.user_interface;

import multiplechoiceprototype.question_answer_processing.QAContainer;

/**
 *
 * @author MP
 */
public class AnswerPanel extends javax.swing.JPanel {

    private QAContainer QACon;
    final private int MAX_NUM_ANSWERS = 4;
    
    /**
     * 
     */
    public AnswerPanel(QAContainer QACon) {
        initComponents();
        
        this.QACon = QACon;
        setAnswers();
    }
    
    private void setAnswers() {
        
        for(int i = 0; i < MAX_NUM_ANSWERS; i++) {
            
            AnswerButton answer = new AnswerButton(QACon, QACon.answers.get(i));
            TopPanel.add(answer);
            QACon.buttonList.add(answer);
            if(answer.isCorrectAnswer()) {
                
                QACon.correctAnswerButton = answer;
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        TopPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setToolTipText(null);
        setLayout(new java.awt.GridBagLayout());

        TopPanel.setBackground(new java.awt.Color(255, 255, 255));
        TopPanel.setToolTipText(null);
        TopPanel.setLayout(new java.awt.GridLayout(4, 1));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.8;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        add(TopPanel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TopPanel;
    // End of variables declaration//GEN-END:variables
}
