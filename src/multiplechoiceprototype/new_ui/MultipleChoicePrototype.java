/*
 */
package multiplechoiceprototype.new_ui;

import java.net.URL;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author MP
 */
public class MultipleChoicePrototype extends Application {

    private Scene scene;
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        // Set root.
        MainContainer mainCon = new MainContainer();
        
        // Set scene.
        scene = new Scene(mainCon);
        URL stylesheetURL = getClass().getResource("multipleChoiceStylesheet.css");
        scene.getStylesheets().add(stylesheetURL.toExternalForm());
        
        // Set stage.
        setPrimaryStage(primaryStage);
    }
    
    private void setPrimaryStage(Stage primaryStage) {
        
        primaryStage.setTitle("Multiple Choice Prototype");
        primaryStage.initStyle(StageStyle.UNIFIED);
        primaryStage.setMinWidth(700);
        primaryStage.setWidth(700);
        primaryStage.setHeight(800);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        
        launch(args);
    }
}
