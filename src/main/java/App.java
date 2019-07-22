import controller.AppController;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class App extends Application {
	

    
    public static void main(String[] args) {
//    --module-path /usr/lib/jvm/javafx-sdk-11.0.2/lib/ --add-modules javafx.controls,javafx.fxml	
//    	System.getProperties().setProperty("module-path", "/usr/lib/jvm/javafx-sdk-11.0.2/lib/");
//    	System.getProperties().setProperty("add-modules", "javafx.controls,javafx.fxml");
        Application.launch(App.class, args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
//    	System.out.println(getClass().toString());
    	
    	AppController appCtrl = new AppController(primaryStage);
    	
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ui/main_win.fxml"));
        loader.setController(appCtrl);
        Parent root = loader.load();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("What are you gonna do?");
        primaryStage.show();
        appCtrl.fillTable();
        



    }
    


}