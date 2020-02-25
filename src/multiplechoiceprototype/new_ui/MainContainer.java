/*
 */
package multiplechoiceprototype.new_ui;

/**
 *
 * @author MP
 */
public class MainContainer extends javafx.scene.layout.HBox {
    
    private QuestionContainer questionCon;
    private ChoicesContainer choicesCon;
    
    public MainContainer() {
        
        setContainers();
    }
    
    private void setContainers() {
        
        questionCon = new QuestionContainer();
        choicesCon = new ChoicesContainer();
        
        questionCon.prefWidthProperty().bind(this.widthProperty());
        choicesCon.prefWidthProperty().bind(this.widthProperty());
        
        questionCon.prefHeightProperty().bind(this.heightProperty().divide(2));
        choicesCon.prefHeightProperty().bind(this.heightProperty().divide(1));
        
        this.getChildren().addAll(questionCon, choicesCon);
    }
}
