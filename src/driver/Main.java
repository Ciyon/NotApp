package driver;

import controller.MasterController;
import javafx.application.Application;
import javafx.stage.Stage;


/**
 * Created by Tim on 12/7/2017
 * Main program driver
 */
public class Main extends Application {

    private MasterController mc;

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Not App: Compare Appliances!");
        stage.setResizable(false);
        mc = new MasterController(stage);
    }
}
