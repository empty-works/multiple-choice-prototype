/*
 */
package multiplechoiceprototype.user_interface;

import multiplechoiceprototype.beans.MyColors;
import multiplechoiceprototype.question_answer_processing.QAContainer;

/**
 *
 * @author MP
 */
public class ReasonNextPanel extends javax.swing.JPanel {

    /**
     * 
     */
    public ReasonNextPanel(QAContainer QACon) {
        initComponents();
        
        setColors();
    }
    
    private void setColors() {
        
        ReasonButton.setBackground(MyColors.REASON_NEXT_COLOR);
        NextButton.setBackground(MyColors.REASON_NEXT_COLOR);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        ReasonButton = new javax.swing.JLabel();
        NextButton = new javax.swing.JLabel();

        setToolTipText(null);
        setOpaque(false);
        setLayout(new java.awt.GridBagLayout());

        ReasonButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ReasonButton.setForeground(new java.awt.Color(255, 255, 255));
        ReasonButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ReasonButton.setText("Why?");
        ReasonButton.setToolTipText(null);
        ReasonButton.setOpaque(true);
        ReasonButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReasonButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ReasonButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ReasonButtonMousePressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        add(ReasonButton, gridBagConstraints);

        NextButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        NextButton.setForeground(new java.awt.Color(255, 255, 255));
        NextButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NextButton.setText("Next");
        NextButton.setToolTipText(null);
        NextButton.setOpaque(true);
        NextButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NextButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NextButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NextButtonMousePressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 10, 10);
        add(NextButton, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void ReasonButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReasonButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_ReasonButtonMouseEntered

    private void ReasonButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReasonButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_ReasonButtonMouseExited

    private void ReasonButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReasonButtonMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReasonButtonMousePressed

    private void NextButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_NextButtonMouseEntered

    private void NextButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_NextButtonMouseExited

    private void NextButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextButtonMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_NextButtonMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NextButton;
    private javax.swing.JLabel ReasonButton;
    // End of variables declaration//GEN-END:variables
}
