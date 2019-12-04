/*
 */
package multiplechoiceprototype.user_interface;

import java.awt.Color;
import javax.swing.BorderFactory;
import multiplechoiceprototype.beans.MyColors;

/**
 *
 * @author MP
 */
public class AnswerButton extends javax.swing.JPanel {

    private boolean isCorrectAnswer = false;
    private String text = "";
    private String correctAnswer;
    private boolean isClickable = true;
    
    public AnswerButton(String correctAnswer, String text) {
        initComponents();
        
        this.correctAnswer = correctAnswer;
        this.text = text;
        setVisualProperties();
        setText();
        setAsCorrectAnswer();
    }
    
    private void setVisualProperties() {
        
        ButtonLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
    }
    
    private void setText() {
        
        ButtonLabel.setText(text);
    }
    
    private void setAsCorrectAnswer() {
        
        if(correctAnswer.equals(text)) {
            
            isCorrectAnswer = true;
        }
    }
    
    public boolean isCorrectAnswer() {
        
        return isCorrectAnswer;
    }
    
    public void setIsClickable(boolean canClick) {
        
        isClickable = canClick;
    }
    
    private void setButtonColor(Color color) {
        
        if(isClickable) {
            
            ButtonLabel.setBackground(color);
        }
    }
    
    private void setAnswerButtonsUnclickable() {
        
        for(AnswerButton button : AnswerPanel.buttonList) {
            
            button.setIsClickable(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        ButtonLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setToolTipText(null);
        setLayout(new java.awt.GridBagLayout());

        ButtonLabel.setBackground(new java.awt.Color(255, 255, 255));
        ButtonLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ButtonLabel.setForeground(new java.awt.Color(0, 0, 0));
        ButtonLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ButtonLabel.setText("jLabel1");
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
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        add(ButtonLabel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonLabelMouseEntered
        
        setButtonColor(Color.ORANGE);
    }//GEN-LAST:event_ButtonLabelMouseEntered

    private void ButtonLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonLabelMouseExited
        
        setButtonColor(Color.WHITE);
    }//GEN-LAST:event_ButtonLabelMouseExited

    private void ButtonLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonLabelMousePressed
        
        if(isCorrectAnswer) {
            
            setButtonColor(MyColors.CORRECT_COLOR);
        }
        else {
            
            setButtonColor(MyColors.INCORRECT_COLOR);
        }
        setAnswerButtonsUnclickable();
    }//GEN-LAST:event_ButtonLabelMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ButtonLabel;
    // End of variables declaration//GEN-END:variables
}
