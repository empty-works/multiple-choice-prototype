/*
 */
package multiplechoiceprototype.user_interface;

/**
 *
 * @author MP
 */
public class AnswerButton extends javax.swing.JPanel {

    private boolean isCorrectAnswer = false;
    private String text = "";
    
    /**
     * 
     */
    public AnswerButton(String text) {
        initComponents();
        
        this.text = text;
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        ButtonLabel = new javax.swing.JLabel();

        setLayout(new java.awt.GridBagLayout());

        ButtonLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ButtonLabel.setText("jLabel1");
        ButtonLabel.setToolTipText(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(ButtonLabel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ButtonLabel;
    // End of variables declaration//GEN-END:variables
}
