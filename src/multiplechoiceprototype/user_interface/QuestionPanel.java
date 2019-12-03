/*
 */
package multiplechoiceprototype.user_interface;

/**
 *
 * @author MP
 */
public class QuestionPanel extends javax.swing.JPanel {

    private String question;
    
    /**
     * 
     */
    public QuestionPanel() {
        initComponents();
    }
    
    public void setQuestion(String question) {
        
        QuestionLabel.setText(question);
        ReasonNextContainer.add(new ReasonNextPanel());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        QuestionLabel = new javax.swing.JLabel();
        ReasonNextContainer = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setToolTipText(null);
        setLayout(new java.awt.GridBagLayout());

        QuestionLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        QuestionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QuestionLabel.setToolTipText(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(20, 30, 20, 30);
        add(QuestionLabel, gridBagConstraints);

        ReasonNextContainer.setToolTipText(null);
        ReasonNextContainer.setMinimumSize(new java.awt.Dimension(10, 100));
        ReasonNextContainer.setOpaque(false);
        ReasonNextContainer.setLayout(new java.awt.GridLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(ReasonNextContainer, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel QuestionLabel;
    private javax.swing.JPanel ReasonNextContainer;
    // End of variables declaration//GEN-END:variables
}
