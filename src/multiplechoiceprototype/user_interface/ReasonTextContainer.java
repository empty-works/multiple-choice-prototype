/*
 */
package multiplechoiceprototype.user_interface;

import multiplechoiceprototype.question_answer_processing.QAContainer;

/**
 *
 * @author MP
 */
public class ReasonTextContainer extends javax.swing.JPanel {

    private QAContainer QACon;
    
    /**
     * 
     */
    public ReasonTextContainer(QAContainer QACon) {
        initComponents();
    }
    
    public void setText(String text) {
        
        TextLabel.setText(text);
    }
    
    public void setVisible(boolean show) {
        
        this.setVisible(show);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        CloseButton = new javax.swing.JLabel();
        TextLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setToolTipText(null);
        setLayout(new java.awt.GridBagLayout());

        CloseButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        CloseButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CloseButton.setText("X");
        CloseButton.setToolTipText(null);
        CloseButton.setMaximumSize(new java.awt.Dimension(40, 40));
        CloseButton.setMinimumSize(new java.awt.Dimension(40, 40));
        CloseButton.setPreferredSize(new java.awt.Dimension(40, 40));
        CloseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CloseButtonMousePressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        add(CloseButton, gridBagConstraints);

        TextLabel.setBackground(new java.awt.Color(255, 255, 255));
        TextLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TextLabel.setText("Test text.");
        TextLabel.setToolTipText(null);
        TextLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        TextLabel.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(40, 5, 0, 5);
        add(TextLabel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void CloseButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseButtonMousePressed
        
        setVisible(false);
    }//GEN-LAST:event_CloseButtonMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CloseButton;
    private javax.swing.JLabel TextLabel;
    // End of variables declaration//GEN-END:variables
}
