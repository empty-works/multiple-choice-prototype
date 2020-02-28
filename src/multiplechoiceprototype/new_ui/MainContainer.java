/*
 */
package multiplechoiceprototype.new_ui;

import java.util.List;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import multiplechoiceprototype.db_controller.DBController;
import multiplechoiceprototype.db_controller.DBInterface;

/**
 *
 * @author MP
 */
public class MainContainer extends javafx.scene.layout.GridPane {
    
    private QuestionContainer questionCon;
    private ChoicesContainer choicesCon;
    private String subject;
    
    public MainContainer() {
        
        subject = getSubject();
        setContainers();
    }
    
    private String getSubject() {
        
        return "";
    }
    
    private void setContainers() {
        
        DBInterface dbcon = new DBController();
        
        // Get questions
        List<String> questionsList = dbcon.getQuestions(subject);
        
        MenuBar menubar = new MenuBar();
        Menu settings = new Menu("Settings");
        menubar.getMenus().add(settings);
        MenuItem random = new MenuItem("Random");
        settings.getItems().add(random);
        
        questionCon = new QuestionContainer("KLJDÖLFKjlskdjfalkdjf");
        choicesCon = new ChoicesContainer();
        
        questionCon.prefWidthProperty().bind(this.widthProperty());
        choicesCon.prefWidthProperty().bind(this.widthProperty());
        
        questionCon.prefHeightProperty().bind(this.heightProperty().divide(1.1));
        choicesCon.prefHeightProperty().bind(this.heightProperty().divide(2));
        
        this.add(menubar, 0, 0);
        this.add(questionCon, 0, 1);
        this.add(choicesCon, 0, 2);
    }
}
