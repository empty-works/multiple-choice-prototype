/*
 */
package multiplechoiceprototype.user_interface;

import multiplechoiceprototype.question_answer_processing.QAContainer;
import multiplechoiceprototype.question_answer_processing.QuestionAnswerGenerator;

/**
 *
 * @author MP
 */
public class MultipleChoicePrototype extends javax.swing.JFrame {

    private QAContainer QACon;
    private AnswerButton correctAnswer = null;
    
    /**
     * 
     */
    public MultipleChoicePrototype() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        initAll();
    }
    
    public void initAll() {
        
        getQACon();
        setQuestion();
        setAnswers();
    }
    
    private void getQACon() {
        
        QACon = QuestionAnswerGenerator.getQACon();
    }
    
    private void setQuestion() {
        
        QuestionPanel qp = new QuestionPanel();
        qp.setQuestion("<html>" + QACon.question + "</html>");
        TopPanel.add(qp);
    }
    
    public AnswerButton getCorrectAnswerButton() {
        
        return correctAnswer;
    }
    
    private void setAnswers() {
        
        for(int i = 0; i < 4; i++) {
            
            AnswerButton answer = new AnswerButton(QACon.correctAnswer, QACon.answers.get(i));
            BottomPanel.add(answer);
            if(answer.isCorrectAnswer()) {
                
                correctAnswer = answer;
                QACon.correctAnswerButton = answer;
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        QuizContainer = new javax.swing.JPanel();
        TopPanel = new javax.swing.JPanel();
        BottomPanel = new javax.swing.JPanel();
        InfoContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 640));
        getContentPane().setLayout(new java.awt.GridLayout(1, 2));

        QuizContainer.setToolTipText(null);
        QuizContainer.setOpaque(false);
        QuizContainer.setLayout(new java.awt.GridLayout(2, 1));

        TopPanel.setToolTipText(null);
        TopPanel.setOpaque(false);
        TopPanel.setLayout(new java.awt.GridLayout(1, 0));
        QuizContainer.add(TopPanel);

        BottomPanel.setToolTipText(null);
        BottomPanel.setOpaque(false);
        BottomPanel.setLayout(new java.awt.GridLayout(4, 1));
        QuizContainer.add(BottomPanel);

        getContentPane().add(QuizContainer);

        InfoContainer.setToolTipText(null);
        InfoContainer.setOpaque(false);
        InfoContainer.setLayout(new java.awt.GridLayout(1, 0));
        getContentPane().add(InfoContainer);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MultipleChoicePrototype.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MultipleChoicePrototype.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MultipleChoicePrototype.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MultipleChoicePrototype.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MultipleChoicePrototype().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BottomPanel;
    private javax.swing.JPanel InfoContainer;
    private javax.swing.JPanel QuizContainer;
    private javax.swing.JPanel TopPanel;
    // End of variables declaration//GEN-END:variables
}
