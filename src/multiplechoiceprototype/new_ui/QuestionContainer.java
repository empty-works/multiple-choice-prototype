/*
 */
package multiplechoiceprototype.new_ui;

import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author MP
 */
public class QuestionContainer extends javafx.scene.layout.HBox {
    
    private Label mainLabel = new Label();
    
    public QuestionContainer() {
        
        this.setId("QuestionContainer");
        setLabel();
    }
    
    private void setLabel() {
        
        mainLabel.prefWidthProperty().bind(this.widthProperty());
        mainLabel.prefHeightProperty().bind(this.heightProperty());
        
        this.getChildren().add(mainLabel);
    }
}
