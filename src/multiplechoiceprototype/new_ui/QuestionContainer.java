/*
 */
package multiplechoiceprototype.new_ui;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;

/**
 *
 * @author MP
 */
public class QuestionContainer extends javafx.scene.layout.HBox {
    
    private Label mainLabel = new Label();
    private String text;
    
    public QuestionContainer(String text) {
        
        this.text = text;
        this.setId("QuestionContainer");
        setLabel();
    }
    
    private void setLabel() {
        
        mainLabel.setText(text);
        mainLabel.setAlignment(Pos.TOP_LEFT);
        mainLabel.prefWidthProperty().bind(this.widthProperty());
        mainLabel.prefHeightProperty().bind(this.heightProperty());
        mainLabel.setPadding(new Insets(20));
        
        this.getChildren().add(mainLabel);
    }
}
