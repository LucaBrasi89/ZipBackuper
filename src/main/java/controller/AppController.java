package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


public class AppController {
	
	
	private Stage primaryStage;
	private CfgParser cfgPar; 
	private ObservableList<CfgElem> data = FXCollections.observableArrayList() ;
	
	
	
	public AppController(Stage primaryStage) {

		this.primaryStage = primaryStage;
		
		cfgPar = new CfgParser("cfg.ini");
		cfgPar.fillElements();
		cfgPar.printElements();
	
	}


	public void quit(MouseEvent event) {

		
	    // Button was clicked, do something…
		this.primaryStage.close();
	}
	

	
	public void fillTable() {
		
		for (CfgElem cfgElem : cfgPar.getCfgElemets()) {
			data.add(cfgElem);
		}
		@SuppressWarnings("unchecked")
		TableView<CfgElem> tbl = (TableView<CfgElem>) primaryStage.getScene().lookup("#tbl1");
		tbl.setItems(data);
	}
	
}
