package be.kdg.nonogram.view.game;

import be.kdg.nonogram.model.NonogramModel;
import be.kdg.nonogram.view.start.StartView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.input.MouseEvent;

public class GamePresenter {
    private NonogramModel model;
    private GameView view;

    public GamePresenter(NonogramModel model, GameView view){
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
        view.cell().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (view.cell().isHover()) {
                    view.cell().setText("Ingevuld");
                }
            }
        });
    }
}
