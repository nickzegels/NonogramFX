package be.kdg.nonogram.view.game;

import be.kdg.nonogram.model.NonogramModel;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.WindowEvent;

import java.util.Random;

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
        view.getNewNonogram().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getNewNonogram().isHover()){
                    view.getNewNonogram().setText("Los nonogram op !");
                    if(view.nonogramLevel == 0){
                        view.getStatusText().setText("Je begint op level 1");

                        view.getButton01().setText("0");
                        view.getButton02().setText("2");
                        view.getButton03().setText("1");
                        view.getButton04().setText("1");
                        view.getButton05().setText("0");
                        view.getButton06().setText("0");
                        view.getButton10().setText("0");
                        view.getButton11().setText("0");
                        view.getButton12().setText("2");
                        view.getButton13().setText("2");
                        view.getButton14().setText("1");
                        view.getButton15().setText("1");
                        view.getButton16().setText("1");
                        view.getButton20().setText("0");
                        view.getButton21().setText("3");
                        view.getButton30().setText("0");
                        view.getButton31().setText("1");
                        view.getButton40().setText("0");
                        view.getButton41().setText("1");
                        view.getButton50().setText("0");
                        view.getButton51().setText("2");
                        view.getButton60().setText("0");
                        view.getButton61().setText("4");

                    }

                    if (view.nonogramLevel == 1){
                        view.getStatusText().setText("Goed gedaan, dit is level 2");

                        view.getButton01().setText("0");
                        view.getButton02().setText("0");
                        view.getButton03().setText("1");
                        view.getButton04().setText("0");
                        view.getButton05().setText("0");
                        view.getButton06().setText("0");
                        view.getButton10().setText("0");
                        view.getButton11().setText("0");
                        view.getButton12().setText("1");
                        view.getButton13().setText("1");
                        view.getButton14().setText("3");
                        view.getButton15().setText("3");
                        view.getButton16().setText("4");
                        view.getButton20().setText("0");
                        view.getButton21().setText("4");
                        view.getButton30().setText("0");
                        view.getButton31().setText("3");
                        view.getButton40().setText("1");
                        view.getButton41().setText("3");
                        view.getButton50().setText("0");
                        view.getButton51().setText("1");
                        view.getButton60().setText("0");
                        view.getButton61().setText("1");
                    }

                    if (view.nonogramLevel == 2){
                        view.getStatusText().setText("Super ! Dit is het laatste level");

                        view.getButton01().setText("0");
                        view.getButton02().setText("0");
                        view.getButton03().setText("1");
                        view.getButton04().setText("1");
                        view.getButton05().setText("0");
                        view.getButton06().setText("0");
                        view.getButton10().setText("0");
                        view.getButton11().setText("0");
                        view.getButton12().setText("1");
                        view.getButton13().setText("1");
                        view.getButton14().setText("3");
                        view.getButton15().setText("3");
                        view.getButton16().setText("4");
                        view.getButton20().setText("0");
                        view.getButton21().setText("3");
                        view.getButton30().setText("0");
                        view.getButton31().setText("1");
                        view.getButton40().setText("0");
                        view.getButton41().setText("3");
                        view.getButton50().setText("0");
                        view.getButton51().setText("3");
                        view.getButton60().setText("0");
                        view.getButton61().setText("4");
                    }
                }
            }
        });

        view.getCheck().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getCheck().isHover()){
                    int countRow1O = Integer.parseInt(view.getButton02().getText()) + Integer.parseInt(view.getButton12().getText());
                    int countRow2O = Integer.parseInt(view.getButton03().getText()) + Integer.parseInt(view.getButton13().getText());
                    int countRow3O = Integer.parseInt(view.getButton04().getText()) + Integer.parseInt(view.getButton14().getText());
                    int countRow4O = Integer.parseInt(view.getButton05().getText()) + Integer.parseInt(view.getButton15().getText());
                    int countRow5O = Integer.parseInt(view.getButton06().getText()) + Integer.parseInt(view.getButton16().getText());

                    int countColumn1O = Integer.parseInt(view.getButton20().getText()) + Integer.parseInt(view.getButton21().getText());
                    int countColumn2O = Integer.parseInt(view.getButton30().getText()) + Integer.parseInt(view.getButton31().getText());
                    int countColumn3O = Integer.parseInt(view.getButton40().getText()) + Integer.parseInt(view.getButton41().getText());
                    int countColumn4O = Integer.parseInt(view.getButton50().getText()) + Integer.parseInt(view.getButton51().getText());
                    int countColumn5O = Integer.parseInt(view.getButton60().getText()) + Integer.parseInt(view.getButton61().getText());

                    int countRow1A = 0;
                    int countRow2A = 0;
                    int countRow3A = 0;
                    int countRow4A = 0;
                    int countRow5A = 0;

                    int countColumn1A = 0;
                    int countColumn2A = 0;
                    int countColumn3A = 0;
                    int countColumn4A = 0;
                    int countColumn5A = 0;

                    if(view.getButton22().getText() == "X"){
                        countRow1A++;
                    }

                    if(view.getButton32().getText() == "X"){
                        countRow1A++;
                    }

                    if(view.getButton42().getText() == "X"){
                        countRow1A++;
                    }

                    if(view.getButton52().getText() == "X"){
                        countRow1A++;
                    }

                    if(view.getButton62().getText() == "X"){
                        countRow1A++;
                    }

                    if(view.getButton23().getText() == "X"){
                        countRow2A++;
                    }

                    if(view.getButton33().getText() == "X"){
                        countRow2A++;
                    }

                    if(view.getButton43().getText() == "X"){
                        countRow2A++;
                    }

                    if(view.getButton53().getText() == "X"){
                        countRow2A++;
                    }

                    if(view.getButton63().getText() == "X"){
                        countRow2A++;
                    }

                    if(view.getButton24().getText() == "X"){
                        countRow3A++;
                    }

                    if(view.getButton34().getText() == "X"){
                        countRow3A++;
                    }

                    if(view.getButton44().getText() == "X"){
                        countRow3A++;
                    }

                    if(view.getButton54().getText() == "X"){
                        countRow3A++;
                    }

                    if(view.getButton64().getText() == "X"){
                        countRow3A++;
                    }

                    if(view.getButton25().getText() == "X"){
                        countRow4A++;
                    }

                    if(view.getButton35().getText() == "X"){
                        countRow4A++;
                    }

                    if(view.getButton45().getText() == "X"){
                        countRow4A++;
                    }

                    if(view.getButton55().getText() == "X"){
                        countRow4A++;
                    }

                    if(view.getButton65().getText() == "X"){
                        countRow4A++;
                    }

                    if(view.getButton26().getText() == "X"){
                        countRow5A++;
                    }

                    if(view.getButton36().getText() == "X"){
                        countRow5A++;
                    }

                    if(view.getButton46().getText() == "X"){
                        countRow5A++;
                    }

                    if(view.getButton56().getText() == "X"){
                        countRow5A++;
                    }

                    if(view.getButton66().getText() == "X"){
                        countRow5A++;
                    }

                    if(view.getButton22().getText() == "X"){
                        countColumn1A++;
                    }

                    if(view.getButton23().getText() == "X"){
                        countColumn1A++;
                    }

                    if(view.getButton24().getText() == "X"){
                        countColumn1A++;
                    }

                    if(view.getButton25().getText() == "X"){
                        countColumn1A++;
                    }

                    if(view.getButton26().getText() == "X"){
                        countColumn1A++;
                    }

                    if(view.getButton32().getText() == "X"){
                        countColumn2A++;
                    }

                    if(view.getButton33().getText() == "X"){
                        countColumn2A++;
                    }

                    if(view.getButton34().getText() == "X"){
                        countColumn2A++;
                    }

                    if(view.getButton35().getText() == "X"){
                        countColumn2A++;
                    }

                    if(view.getButton36().getText() == "X"){
                        countColumn2A++;
                    }

                    if(view.getButton42().getText() == "X"){
                        countColumn3A++;
                    }

                    if(view.getButton43().getText() == "X"){
                        countColumn3A++;
                    }

                    if(view.getButton44().getText() == "X"){
                        countColumn3A++;
                    }

                    if(view.getButton45().getText() == "X"){
                        countColumn3A++;
                    }

                    if(view.getButton46().getText() == "X"){
                        countColumn3A++;
                    }

                    if(view.getButton52().getText() == "X"){
                        countColumn4A++;
                    }

                    if(view.getButton53().getText() == "X"){
                        countColumn4A++;
                    }

                    if(view.getButton54().getText() == "X"){
                        countColumn4A++;
                    }

                    if(view.getButton55().getText() == "X"){
                        countColumn4A++;
                    }

                    if(view.getButton56().getText() == "X"){
                        countColumn4A++;
                    }

                    if(view.getButton62().getText() == "X"){
                        countColumn5A++;
                    }

                    if(view.getButton63().getText() == "X"){
                        countColumn5A++;
                    }

                    if(view.getButton64().getText() == "X"){
                        countColumn5A++;
                    }

                    if(view.getButton65().getText() == "X"){
                        countColumn5A++;
                    }

                    if(view.getButton66().getText() == "X"){
                        countColumn5A++;
                    }

                    if(countRow1O == countRow1A && countRow2O == countRow2A
                    && countRow3O == countRow3A && countRow4O == countRow4A
                    && countRow5O == countRow5A && countColumn1O == countColumn1A
                    && countColumn2O == countColumn2A && countColumn3O == countColumn3A
                    && countColumn4O == countColumn4A && countColumn5O == countColumn5A){
                        if(view.nonogramLevel != 2) {
                            view.getStatusText().setText("Goed gedaan, volgend level is klaar");
                            view.getNewNonogram().setText("Volgend Level");
                            view.nonogramLevel++;
                        }else {
                            view.getStatusText().setText("Goed gedaan, je hebt alle levels gehaalt !");
                        }
                    } else {
                        System.out.println("Nog niet helemaal juist");
                        view.getStatusText().setText("Nog niet helemaal juist");
                    }
                }
            }
        });

        view.getButton22().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getButton22().isHover()){
                    if (view.getButton22().getText().equals("")) {
                        view.getButton22().setText("X");
                    } else {
                        view.getButton22().setText("");
                    }
                }
            }
        });

        view.getButton23().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getButton23().isHover()){
                    if (view.getButton23().getText().equals("")) {
                        view.getButton23().setText("X");
                    } else {
                        view.getButton23().setText("");
                    }
                }
            }
        });

        view.getButton24().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getButton24().isHover()){
                    if (view.getButton24().getText().equals("")) {
                        view.getButton24().setText("X");
                    } else {
                        view.getButton24().setText("");
                    }
                }
            }
        });

        view.getButton25().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getButton25().isHover()){
                    if (view.getButton25().getText().equals("")) {
                        view.getButton25().setText("X");
                    } else {
                        view.getButton25().setText("");
                    }
                }
            }
        });

        view.getButton26().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getButton26().isHover()){
                    if (view.getButton26().getText().equals("")) {
                        view.getButton26().setText("X");
                    } else {
                        view.getButton26().setText("");
                    }
                }
            }
        });

        view.getButton32().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getButton32().isHover()){
                    if (view.getButton32().getText().equals("")) {
                        view.getButton32().setText("X");
                    } else {
                        view.getButton32().setText("");
                    }
                }
            }
        });

        view.getButton33().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getButton33().isHover()){
                    if (view.getButton33().getText().equals("")) {
                        view.getButton33().setText("X");
                    } else {
                        view.getButton33().setText("");
                    }
                }
            }
        });

        view.getButton34().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getButton34().isHover()){
                    if (view.getButton34().getText().equals("")) {
                        view.getButton34().setText("X");
                    } else {
                        view.getButton34().setText("");
                    }
                }
            }
        });

        view.getButton35().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getButton35().isHover()){
                    if (view.getButton35().getText().equals("")) {
                        view.getButton35().setText("X");
                    } else {
                        view.getButton35().setText("");
                    }
                }
            }
        });

        view.getButton36().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getButton36().isHover()){
                    if (view.getButton36().getText().equals("")) {
                        view.getButton36().setText("X");
                    } else {
                        view.getButton36().setText("");
                    }
                }
            }
        });

        view.getButton42().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getButton42().isHover()){
                    if (view.getButton42().getText().equals("")) {
                        view.getButton42().setText("X");
                    } else {
                        view.getButton42().setText("");
                    }
                }
            }
        });

        view.getButton43().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getButton43().isHover()){
                    if (view.getButton43().getText().equals("")) {
                        view.getButton43().setText("X");
                    } else {
                        view.getButton43().setText("");
                    }
                }
            }
        });

        view.getButton44().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getButton44().isHover()){
                    if (view.getButton44().getText().equals("")) {
                        view.getButton44().setText("X");
                    } else {
                        view.getButton44().setText("");
                    }
                }
            }
        });

        view.getButton45().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getButton45().isHover()){
                    if (view.getButton45().getText().equals("")) {
                        view.getButton45().setText("X");
                    } else {
                        view.getButton45().setText("");
                    }
                }
            }
        });

        view.getButton46().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getButton46().isHover()){
                    if (view.getButton46().getText().equals("")) {
                        view.getButton46().setText("X");
                    } else {
                        view.getButton46().setText("");
                    }
                }
            }
        });

        view.getButton52().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getButton52().isHover()){
                    if (view.getButton52().getText().equals("")) {
                        view.getButton52().setText("X");
                    } else {
                        view.getButton52().setText("");
                    }
                }
            }
        });

        view.getButton53().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getButton53().isHover()){
                    if (view.getButton53().getText().equals("")) {
                        view.getButton53().setText("X");
                    } else {
                        view.getButton53().setText("");
                    }
                }
            }
        });

        view.getButton54().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getButton54().isHover()){
                    if (view.getButton54().getText().equals("")) {
                        view.getButton54().setText("X");
                    } else {
                        view.getButton54().setText("");
                    }
                }
            }
        });

        view.getButton55().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getButton55().isHover()){
                    if (view.getButton55().getText().equals("")) {
                        view.getButton55().setText("X");
                    } else {
                        view.getButton55().setText("");
                    }
                }
            }
        });

        view.getButton56().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getButton56().isHover()){
                    if (view.getButton56().getText().equals("")) {
                        view.getButton56().setText("X");
                    } else {
                        view.getButton56().setText("");
                    }
                }
            }
        });

        view.getButton62().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getButton62().isHover()){
                    if (view.getButton62().getText().equals("")) {
                        view.getButton62().setText("X");
                    } else {
                        view.getButton62().setText("");
                    }
                }
            }
        });

        view.getButton63().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getButton63().isHover()){
                    if (view.getButton63().getText().equals("")) {
                        view.getButton63().setText("X");
                    } else {
                        view.getButton63().setText("");
                    }
                }
            }
        });

        view.getButton64().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getButton64().isHover()){
                    if (view.getButton64().getText().equals("")) {
                        view.getButton64().setText("X");
                    } else {
                        view.getButton64().setText("");
                    }
                }
            }
        });

        view.getButton65().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getButton65().isHover()) {
                    if (view.getButton65().getText().equals("")) {
                        view.getButton65().setText("X");
                    } else {
                        view.getButton65().setText("");
                    }
                }
            }
        });

        view.getButton66().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(view.getButton66().isHover()){
                    if(view.getButton66().getText().equals("")){
                    view.getButton66().setText("X");
                } else {
                        view.getButton66().setText("");
                    }
                }
            }
        });
    }
}
