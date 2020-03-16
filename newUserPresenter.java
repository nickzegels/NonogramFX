package be.kdg.nonogram.view.newUser;

import be.kdg.nonogram.model.NonogramModel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class newUserPresenter {
    private NonogramModel model;
    private newUserView userView;

    public newUserPresenter(NonogramModel model, newUserView userView) {
        this.model = model;
        this.userView = userView;
        this.addEvenHandlers();
        this.updateView();
    }

    private void updateView() {
    }

    private void addEvenHandlers() {
        userView.getnieuweGebruikerButton().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                userView.users.add(userView.getGebruikersNaam().getText() + "#" + userView.getWachtwoord().getText());
                System.out.println(userView.users.toString());
            }
        });
        System.out.println(userView.users.toString());
    }
}
