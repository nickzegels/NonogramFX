package be.kdg.nonogram.view.splash;

import be.kdg.nonogram.model.NonogramModel;
import be.kdg.nonogram.view.start.StartPresenter;
import be.kdg.nonogram.view.start.StartView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class SplashPresenter {
    private final NonogramModel model;
    private final SplashView view;

    public SplashPresenter(NonogramModel model, SplashView view){
        this.model = model;
        this.view = view;
        this.addEvenHandlers();
        this.updateView();
    }

    private void updateView() {
    }

    public void addWindowEventHandlers () {
    }

    private void addEvenHandlers() {
        view.getStartButton().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                StartView startview = new StartView();
                StartPresenter startPresenter = new StartPresenter(model, startview);
                Stage startStage = new Stage();
                startStage.initOwner(view.getScene().getWindow());
                startStage.initModality(Modality.APPLICATION_MODAL);
                startStage.setScene(
                        new Scene(startview));
                startStage.setX(view.getScene().getWindow().getX() + 100);
                startStage.setY(view.getScene().getWindow().getY() + 100);
                startStage.showAndWait();
                startStage.close();
            }
        });
    }
}
