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
    private QuestionPanel qp;
    private ContinueButton continueButton;
    private ReasonButton reasonButton;
    private ReasonTextContainer reasonTextContainer;

    /**
     * 
     */
    public MainFrame() {
        initComponents();        
        this.setLocationRelativeTo(null);
        initAll();
        initContinueButton();
    }
    
    private void initAll() {
        
        getQACon();
        initQuestion();
        setAnswers();
        setMain();
        initReason();
        initReasonText();
    }
    
    public void resetAll() {
        
         clearAll();
         getQACon();
         setQuestion();
         setAnswers();
         setMain();
    }
    
    private void getQACon() {
        
        QACon = QuestionAnswerGenerator.getQACon();
    }

    private void initQuestion() {
        
        qp = new QuestionPanel();
        qp.setQuestion("<html>" + QACon.question + "</html>");
        QuestionContainer.add(qp);
    }
    
    private void setQuestion() {
        
        qp.setQuestion("<html>" + QACon.question + "</html>");
    }
    
    private void setAnswers() {
        
        AnswersContainer.add(new AnswerPanel(QACon));
    }
    
    private void setMain() {
        
        QACon.mainFrame = this;
    }
    
    private void initReason() {
        
        reasonButton = new ReasonButton(QACon);
        ReasonContainer.add(reasonButton);
        reasonButton.setVisible(false);
    }
    
    private void initReasonText() {
        
        reasonTextContainer = new ReasonTextContainer(QACon);
        ReasonTextLayer.add(reasonTextContainer);
        QACon.reasonTextContainer = reasonTextContainer;
        reasonTextContainer.setVisible(false);
    }
    
    public void showReasonButton(boolean show) {
        
        reasonButton.setVisible(show);
    }
    
    private void initContinueButton() {
        
        continueButton = new ContinueButton(QACon);
        ContinueContainer.add(continueButton);
        continueButton.setVisible(false);
    }
    
    public void showContinueButton(boolean show) {
        
        continueButton.setVisible(show);
    }

    private void clearAll() {
        
        AnswersContainer.removeAll();
        AnswersContainer.revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        MainContainer = new javax.swing.JPanel();
        QuestionContainer = new javax.swing.JPanel();
        BottomPanel = new javax.swing.JPanel();
        AnswerLayeredPane = new javax.swing.JLayeredPane();
        ReasonTextLayer = new javax.swing.JPanel();
        BottomLayer = new javax.swing.JPanel();
        ReasonContainer = new javax.swing.JPanel();
        AnswersContainer = new javax.swing.JPanel();
        ContinueContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 800));
        setPreferredSize(new java.awt.Dimension(700, 800));
        getContentPane().setLayout(new java.awt.GridLayout(1, 2));

        MainContainer.setToolTipText(null);
        MainContainer.setOpaque(false);
        MainContainer.setLayout(new java.awt.GridBagLayout());

        QuestionContainer.setBackground(new java.awt.Color(255, 255, 255));
        QuestionContainer.setToolTipText(null);
        QuestionContainer.setOpaque(false);
        QuestionContainer.setLayout(new java.awt.GridLayout(1, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.25;
        MainContainer.add(QuestionContainer, gridBagConstraints);

        BottomPanel.setBackground(new java.awt.Color(255, 255, 255));
        BottomPanel.setToolTipText(null);
        BottomPanel.setLayout(new java.awt.GridLayout(1, 0));

        AnswerLayeredPane.setLayout(new java.awt.GridBagLayout());

        ReasonTextLayer.setToolTipText(null);
        ReasonTextLayer.setOpaque(false);
        ReasonTextLayer.setLayout(new java.awt.GridLayout(1, 0));
        AnswerLayeredPane.setLayer(ReasonTextLayer, javax.swing.JLayeredPane.POPUP_LAYER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        AnswerLayeredPane.add(ReasonTextLayer, gridBagConstraints);

        BottomLayer.setToolTipText(null);
        BottomLayer.setOpaque(false);
        BottomLayer.setLayout(new java.awt.GridBagLayout());

        ReasonContainer.setToolTipText(null);
        ReasonContainer.setMinimumSize(new java.awt.Dimension(65, 10));
        ReasonContainer.setOpaque(false);
        ReasonContainer.setPreferredSize(new java.awt.Dimension(65, 100));
        ReasonContainer.setLayout(new java.awt.GridLayout(1, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        BottomLayer.add(ReasonContainer, gridBagConstraints);

        AnswersContainer.setToolTipText(null);
        AnswersContainer.setOpaque(false);
        AnswersContainer.setLayout(new java.awt.GridLayout(1, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 2.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        BottomLayer.add(AnswersContainer, gridBagConstraints);

        ContinueContainer.setToolTipText(null);
        ContinueContainer.setMinimumSize(new java.awt.Dimension(65, 0));
        ContinueContainer.setOpaque(false);
        ContinueContainer.setPreferredSize(new java.awt.Dimension(65, 100));
        ContinueContainer.setLayout(new java.awt.GridLayout(1, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        BottomLayer.add(ContinueContainer, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        AnswerLayeredPane.add(BottomLayer, gridBagConstraints);

        BottomPanel.add(AnswerLayeredPane);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        MainContainer.add(BottomPanel, gridBagConstraints);

        getContentPane().add(MainContainer);

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
    private javax.swing.JLayeredPane AnswerLayeredPane;
    private javax.swing.JPanel AnswersContainer;
    private javax.swing.JPanel BottomLayer;
    private javax.swing.JPanel BottomPanel;
    public javax.swing.JPanel ContinueContainer;
    private javax.swing.JPanel MainContainer;
    private javax.swing.JPanel QuestionContainer;
    private javax.swing.JPanel ReasonContainer;
    private javax.swing.JPanel ReasonTextLayer;
    // End of variables declaration//GEN-END:variables
}
