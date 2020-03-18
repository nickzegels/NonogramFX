package be.kdg.nonogram.view.game;

import be.kdg.nonogram.model.NonogramModel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class GamePresenter{
    private NonogramModel model;
    private GameView view;

    public GamePresenter(NonogramModel model, GameView gameView) {
        this.model = model;
        this.view = gameView;
        this.addEvenHandlers();
        this.updateView();
    }

    private void updateView() {
    }

    private void addEvenHandlers() {
        view.getCell().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getCell().isHover()){
                    System.out.println("gelukt");
                    view.getCell().setText("Geklikt");
                }
            }
        });

        view.getCheck().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getCheck().isHover()){
                    System.out.println("gelukt");;
                }
            }
        });
    }
}
