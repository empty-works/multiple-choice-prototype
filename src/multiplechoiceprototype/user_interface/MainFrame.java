/*
 */
package multiplechoiceprototype.user_interface;

import multiplechoiceprototype.question_answer_processing.QAContainer;
import multiplechoiceprototype.question_answer_processing.QuestionAnswerGenerator;

/**
 *
 * @author MP
 */
public class MainFrame extends javax.swing.JFrame {

    private QAContainer QACon;

    /**
     * 
     */
    public MainFrame() {
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
        QuestionContainer.add(qp);
    }

    private void setAnswers() {
        
        AnswerContainer.add(new AnswerPanel(QACon));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        QuestionContainer = new javax.swing.JPanel();
        AnswerContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 640));
        getContentPane().setLayout(new java.awt.GridLayout(1, 2));

        QuestionContainer.setToolTipText(null);
        QuestionContainer.setOpaque(false);
        QuestionContainer.setLayout(new java.awt.GridLayout(1, 0));
        getContentPane().add(QuestionContainer);

        AnswerContainer.setToolTipText(null);
        AnswerContainer.setOpaque(false);
        AnswerContainer.setLayout(new java.awt.GridLayout(4, 1));
        getContentPane().add(AnswerContainer);

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AnswerContainer;
    private javax.swing.JPanel QuestionContainer;
    // End of variables declaration//GEN-END:variables
}
