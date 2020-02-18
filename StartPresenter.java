package be.kdg.nonogram.view.start;

import be.kdg.nonogram.model.NonogramModel;
import javafx.scene.control.Alert;

public class StartPresenter {
    private NonogramModel model;
    private StartView view;

    public StartPresenter(NonogramModel model, StartView view){
        this.model = model;
        this.view = view;
        this.addEvenHandlers();
        this.updateView();
    }

    private void addEvenHandlers() {
        //
    }

    private void updateView() {
        //view.setWidth(250);
        //view.setHeight(400);
    }

    public void addWindowEventHandlers (){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("Welkom bij Nonogram!");
        alert.setTitle("Nonogram");
        alert.showAndWait();
    }
}
