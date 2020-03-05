package be.kdg.nonogram.view.start;

import be.kdg.nonogram.model.NonogramModel;
import be.kdg.nonogram.view.game.GamePresenter;
import be.kdg.nonogram.view.game.GameView;
import be.kdg.nonogram.view.start.*;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
        view.getLoginButton().setOnAction(
                new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        if(view.getLoginButton().isHover()){
                            GameView GameView = new GameView();
                            GamePresenter gamePresenter = new GamePresenter(model, GameView);
                            view.getScene().setRoot(GameView);
                            GameView.getScene().getWindow().sizeToScene();
                        }
                    }
                }
        );
    }

    private void updateView() {
        //view.setWidth(250);
        //view.setHeight(400);
    }

    public void addWindowEventHandlers (){
        //Alert alert = new Alert(Alert.AlertType.INFORMATION);
        //alert.setHeaderText("Welkom bij Nonogram!");
        //alert.setTitle("Nonogram");
        //alert.showAndWait();
    }
}
