/*
 */
package multiplechoiceprototype.new_ui;

/**
 *
 * @author MP
 */
public class MainContainer extends javafx.scene.layout.GridPane {
    
    private QuestionContainer questionCon;
    private ChoicesContainer choicesCon;
    
    public MainContainer() {
        
        setContainers();
    }
    
    private void setContainers() {
        
        questionCon = new QuestionContainer("KLJDÖLFKjlskdjfalkdjf");
        choicesCon = new ChoicesContainer();
        
        questionCon.prefWidthProperty().bind(this.widthProperty());
        choicesCon.prefWidthProperty().bind(this.widthProperty());
        
        questionCon.prefHeightProperty().bind(this.heightProperty().divide(1.1));
        choicesCon.prefHeightProperty().bind(this.heightProperty().divide(2));
        
        this.add(questionCon, 0, 0);
        this.add(choicesCon, 0, 1);
    }
}
