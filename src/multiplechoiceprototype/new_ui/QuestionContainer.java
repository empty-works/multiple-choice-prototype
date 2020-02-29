/*
 */
package multiplechoiceprototype.new_ui;

import java.util.List;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;

/**
 *
 * @author MP
 */
public class QuestionContainer extends javafx.scene.layout.HBox {
    
    private Label mainLabel = new Label();
    private String question;
    
    public QuestionContainer(String question) {
        
        this.question = question;
        this.setId("QuestionContainer");
        setLabel();
    }
    
    private void setLabel() {
        
        mainLabel.setText(question);
        mainLabel.setAlignment(Pos.TOP_LEFT);
        mainLabel.prefWidthProperty().bind(this.widthProperty());
        mainLabel.prefHeightProperty().bind(this.heightProperty());
        mainLabel.setPadding(new Insets(20));
        
        this.getChildren().add(mainLabel);
    }
}
