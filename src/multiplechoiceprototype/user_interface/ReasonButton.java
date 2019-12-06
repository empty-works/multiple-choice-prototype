/*
 */
package multiplechoiceprototype.user_interface;

import multiplechoiceprototype.beans.MyColors;
import multiplechoiceprototype.question_answer_processing.QAContainer;

/**
 *
 * @author MP
 */
public class ReasonButton extends javax.swing.JPanel {

    private QAContainer QACon;
    
    /**
     * 
     */
    public ReasonButton(QAContainer QACon) {
        initComponents();
        this.QACon = QACon;
        setColors();
    }
    
    private void setColors() {
        
        MainLabel.setBackground(MyColors.REASON_COLOR);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainLabel = new javax.swing.JLabel();

        setToolTipText(null);
        setLayout(new java.awt.GridLayout());

        MainLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        MainLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MainLabel.setText("Why?");
        MainLabel.setToolTipText(null);
        MainLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MainLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MainLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MainLabelMousePressed(evt);
            }
        });
        add(MainLabel);
    }// </editor-fold>//GEN-END:initComponents

    private void MainLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainLabelMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_MainLabelMouseEntered

    private void MainLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainLabelMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_MainLabelMouseExited

    private void MainLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainLabelMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_MainLabelMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MainLabel;
    // End of variables declaration//GEN-END:variables
}
