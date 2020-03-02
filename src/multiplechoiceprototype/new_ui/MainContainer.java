/*
 */
package multiplechoiceprototype.new_ui;

import java.util.List;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import multiplechoiceprototype.controllers.DBController;
import multiplechoiceprototype.controllers.DBInterface;

/**
 *
 * @author MP
 */
public class MainContainer extends javafx.scene.layout.GridPane {
    
    private QuestionContainer questionCon;
    private AnswersContainer choicesCon;
    private String subject;
    
    public MainContainer() {
        
        subject = getSubject();
        setContainers();
    }
    
    private String getSubject() {
        
        return "";
    }
    
    private void setContainers() {

        MenuBar menubar = new MenuBar();
        Menu settings = new Menu("Settings");
        menubar.getMenus().add(settings);
        MenuItem random = new MenuItem("Random");
        settings.getItems().add(random);
        
        DBInterface dbcon = new DBController();
        int DEFAULT_INDEX = 0;
        
        List<String> questionsList = dbcon.getQuestions(subject);
        questionCon = new QuestionContainer(questionsList.get(DEFAULT_INDEX));
        questionCon.prefWidthProperty().bind(this.widthProperty());
        questionCon.prefHeightProperty().bind(this.heightProperty().divide(1.1));
        
        List<String[]> answersList = dbcon.getAnswers(subject);
        System.out.println("answersList: " + answersList);
        choicesCon = new AnswersContainer(answersList.get(DEFAULT_INDEX));
        choicesCon.prefWidthProperty().bind(this.widthProperty());
        choicesCon.prefHeightProperty().bind(this.heightProperty().divide(2));
        
        this.add(menubar, 0, 0);
        this.add(questionCon, 0, 1);
        this.add(choicesCon, 0, 2);
    }
}
