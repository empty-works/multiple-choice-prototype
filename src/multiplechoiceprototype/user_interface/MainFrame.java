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
        setReasonNext();
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
        
        AnswerButtonContainer.add(new AnswerPanel(QACon));
    }
    
    private void setReasonNext() {
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        LeftContainer = new javax.swing.JPanel();
        QuestionContainer = new javax.swing.JPanel();
        AnswerButtonContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 800));
        setPreferredSize(new java.awt.Dimension(700, 800));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(1, 2));

        LeftContainer.setToolTipText(null);
        LeftContainer.setOpaque(false);
        LeftContainer.setLayout(new java.awt.GridBagLayout());

        QuestionContainer.setBackground(new java.awt.Color(255, 255, 255));
        QuestionContainer.setToolTipText(null);
        QuestionContainer.setOpaque(false);
        QuestionContainer.setLayout(new java.awt.GridLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.25;
        LeftContainer.add(QuestionContainer, gridBagConstraints);

        AnswerButtonContainer.setBackground(new java.awt.Color(255, 255, 255));
        AnswerButtonContainer.setToolTipText(null);
        AnswerButtonContainer.setOpaque(false);
        AnswerButtonContainer.setLayout(new java.awt.GridLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        LeftContainer.add(AnswerButtonContainer, gridBagConstraints);

        getContentPane().add(LeftContainer);

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
    private javax.swing.JPanel AnswerButtonContainer;
    private javax.swing.JPanel LeftContainer;
    private javax.swing.JPanel QuestionContainer;
    // End of variables declaration//GEN-END:variables
}
