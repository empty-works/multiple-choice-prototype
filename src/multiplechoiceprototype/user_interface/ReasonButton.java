/*
 */
package multiplechoiceprototype.user_interface;

import java.awt.Color;
import javax.swing.BorderFactory;
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
        
        ButtonLabel.setBackground(MyColors.CONTINUE_REASON_COLOR);
        ButtonLabel.setBorder(BorderFactory.createLineBorder(Color.black, 1));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        ButtonLabel = new javax.swing.JLabel();

        setToolTipText(null);
        setOpaque(false);
        setLayout(new java.awt.GridBagLayout());

        ButtonLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ButtonLabel.setForeground(new java.awt.Color(255, 255, 255));
        ButtonLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ButtonLabel.setText("Why?");
        ButtonLabel.setToolTipText(null);
        ButtonLabel.setOpaque(true);
        ButtonLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ButtonLabelMousePressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 10, 0);
        add(ButtonLabel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonLabelMouseEntered
        
        ButtonLabel.setBackground(Color.white);
        ButtonLabel.setForeground(MyColors.CONTINUE_REASON_COLOR);
        this.setCursor(QACon.handCursor);
    }//GEN-LAST:event_ButtonLabelMouseEntered

    private void ButtonLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonLabelMouseExited
        
        ButtonLabel.setBackground(MyColors.CONTINUE_REASON_COLOR);
        ButtonLabel.setForeground(Color.white);
        this.setCursor(QACon.defaultCursor);
    }//GEN-LAST:event_ButtonLabelMouseExited

    private void ButtonLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonLabelMousePressed
        
        QACon.reasonTextContainer.setVisible(true);
    }//GEN-LAST:event_ButtonLabelMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ButtonLabel;
    // End of variables declaration//GEN-END:variables
}
