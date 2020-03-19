package be.kdg.nonogram.view.game;

import be.kdg.nonogram.model.NonogramModel;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.WindowEvent;

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
        view.getCheck().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getCheck().isHover()){
                    if(view.getButton22().getText().equals("X") &&
                       view.getButton23().getText().equals("X") &&
                       view.getButton24().getText().equals("X")&&
                       view.getButton25().getText().equals("")&&
                       view.getButton26().getText().equals("")&&
                       view.getButton32().getText().equals("X")&&
                       view.getButton33().getText().equals("")&&
                       view.getButton34().getText().equals("")&&
                       view.getButton35().getText().equals("")&&
                       view.getButton36().getText().equals("")&&
                       view.getButton42().getText().equals("")&&
                       view.getButton43().getText().equals("")&&
                       view.getButton44().getText().equals("")&&
                       view.getButton45().getText().equals("")&&
                       view.getButton46().getText().equals("X")&&
                       view.getButton52().getText().equals("X")&&
                       view.getButton53().getText().equals("X")&&
                       view.getButton54().getText().equals("")&&
                       view.getButton55().getText().equals("")&&
                       view.getButton56().getText().equals("")&&
                       view.getButton62().getText().equals("X")&&
                       view.getButton63().getText().equals("X")&&
                       view.getButton64().getText().equals("X")&&
                       view.getButton65().getText().equals("X")&&
                       view.getButton66().getText().equals("")){
                       System.out.println("Gewonnen !");
                       view.getCheck().setText("Gewonnen !");
                    } else {
                        System.out.println("Nog niet helemaal");
                    }
                }
            }
        });

        view.getButton22().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getButton22().isHover()){
                    view.getButton22().setText("X");
                }
            }
        });

        view.getButton23().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getButton23().isHover()){
                    view.getButton23().setText("X");
                }
            }
        });

        view.getButton24().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getButton24().isHover()){
                    view.getButton24().setText("X");
                }
            }
        });

        view.getButton25().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getButton25().isHover()){
                    view.getButton25().setText("X");
                }
            }
        });

        view.getButton26().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getButton26().isHover()){
                    view.getButton26().setText("X");
                }
            }
        });

        view.getButton32().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getButton32().isHover()){
                    view.getButton32().setText("X");
                }
            }
        });

        view.getButton33().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getButton33().isHover()){
                    view.getButton33().setText("X");
                }
            }
        });

        view.getButton34().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getButton34().isHover()){
                    view.getButton34().setText("X");
                }
            }
        });

        view.getButton35().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getButton35().isHover()){
                    view.getButton35().setText("X");
                }
            }
        });

        view.getButton36().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getButton36().isHover()){
                    view.getButton36().setText("X");
                }
            }
        });

        view.getButton42().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getButton42().isHover()){
                    view.getButton42().setText("X");
                }
            }
        });

        view.getButton43().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getButton43().isHover()){
                    view.getButton43().setText("X");
                }
            }
        });

        view.getButton44().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getButton44().isHover()){
                    view.getButton44().setText("X");
                }
            }
        });

        view.getButton45().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getButton45().isHover()){
                    view.getButton45().setText("X");
                }
            }
        });

        view.getButton46().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getButton46().isHover()){
                    view.getButton46().setText("X");
                }
            }
        });

        view.getButton52().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getButton52().isHover()){
                    view.getButton52().setText("X");
                }
            }
        });

        view.getButton53().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getButton53().isHover()){
                    view.getButton53().setText("X");
                }
            }
        });

        view.getButton54().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getButton54().isHover()){
                    view.getButton54().setText("X");
                }
            }
        });

        view.getButton55().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getButton55().isHover()){
                    view.getButton55().setText("X");
                }
            }
        });

        view.getButton56().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getButton56().isHover()){
                    view.getButton56().setText("X");
                }
            }
        });

        view.getButton62().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getButton62().isHover()){
                    view.getButton62().setText("X");
                }
            }
        });

        view.getButton63().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getButton63().isHover()){
                    view.getButton63().setText("X");
                }
            }
        });

        view.getButton64().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getButton64().isHover()){
                    view.getButton64().setText("X");
                }
            }
        });

        view.getButton65().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getButton65().isHover()){
                    view.getButton65().setText("X");
                }
            }
        });

        view.getButton66().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getButton66().isHover()){
                    view.getButton66().setText("X");
                }
            }
        });
    }
}
