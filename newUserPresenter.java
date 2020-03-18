package be.kdg.nonogram.view.newUser;

import be.kdg.nonogram.model.NonogramModel;
import be.kdg.nonogram.view.start.StartView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.io.IOException;

public class newUserPresenter {
    private NonogramModel model;
    private final newUserView userView;

    public newUserPresenter(NonogramModel model, newUserView userView) {
        this.model = model;
        this.userView = userView;
        this.addEvenHandlers();
        this.updateView();
    }

    private void updateView() {
    }

    private void addEvenHandlers() {
        userView.getnieuweGebruikerButton().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String loginGegevens = (userView.getGebruikersNaam().getText() + userView.getWachtwoord().getText());

                try {
                    StartView.out.write(loginGegevens);
                    StartView.out.newLine();
                    System.out.println("User info written Successfully");
                    StartView.out.close();
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            }
        });
    }
}
