/*
 */
package multiplechoiceprototype.new_ui;

import multiplechoiceprototype.db_controller.DBController;
import multiplechoiceprototype.db_controller.DBInterface;

/**
 *
 * @author MP
 */
public class MainContainer extends javafx.scene.layout.GridPane {
    
    private QuestionContainer questionCon;
    private ChoicesContainer choicesCon;
    private String level;
    
    public MainContainer() {
        
        level = getLevel();
        setContainers(level);
    }
    
    private String getLevel() {
        
        
    }
    
    private void setContainers(String level) {
        
        DBInterface dbcon = new DBController();
        
        // Get questions
        List<String> questionsList = dbcon.getQuestions(level);
        
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
