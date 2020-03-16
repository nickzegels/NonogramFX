package be.kdg.nonogram.view.start;

import be.kdg.nonogram.model.NonogramModel;
import be.kdg.nonogram.view.about.AboutPresenter;
import be.kdg.nonogram.view.about.AboutView;
import be.kdg.nonogram.view.game.GamePresenter;
import be.kdg.nonogram.view.game.GameView;
import be.kdg.nonogram.view.newUser.newUserPresenter;
import be.kdg.nonogram.view.newUser.newUserView;
import be.kdg.nonogram.view.start.StartView;

import be.kdg.nonogram.view.rules.RulesPresenter;
import be.kdg.nonogram.view.rules.RulesView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

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
        view.getRulesButton().setOnAction(new EventHandler<ActionEvent>() {
              @Override
              public void handle(ActionEvent event) {
                  if (view.getRulesButton().isHover()) {
                      RulesView rulesView = new RulesView();
                      RulesPresenter rulesPresenter = new RulesPresenter(model, rulesView);
                      Stage rulesStage = new Stage();
                      rulesStage.initOwner(view.getScene().getWindow());
                      rulesStage.initModality(Modality.APPLICATION_MODAL);
                      rulesStage.setScene(
                              new Scene(rulesView));
                      rulesStage.setX(view.getScene().getWindow().getX() + 100);
                      rulesStage.setY(view.getScene().getWindow().getY() + 100);
                      rulesStage.showAndWait();
                  }
              }
          }
        );

        view.getAboutButton().setOnAction(new EventHandler<ActionEvent>() {
              @Override
              public void handle(ActionEvent event) {
              if (view.getAboutButton().isHover()) {
                  AboutView aboutView = new AboutView();
                  AboutPresenter aboutPresenter = new AboutPresenter(model, aboutView);
                  Stage aboutStage = new Stage();
                  aboutStage.initOwner(view.getScene().getWindow());
                  aboutStage.initModality(Modality.APPLICATION_MODAL);
                  aboutStage.setScene(
                          new Scene(aboutView));
                  aboutStage.setX(view.getScene().getWindow().getX() + 100);
                  aboutStage.setY(view.getScene().getWindow().getY() + 100);
                  aboutStage.showAndWait();
              }
            }
        });

        view.getnewUserButton().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (view.getnewUserButton().isHover()) {
                    newUserView newUserView = new newUserView();
                    newUserPresenter newUserPresenter = new newUserPresenter(model, newUserView);
                    Stage newUserStage = new Stage();
                    newUserStage.initOwner(view.getScene().getWindow());
                    newUserStage.initModality(Modality.APPLICATION_MODAL);
                    newUserStage.setScene(
                            new Scene(newUserView));
                    newUserStage.setX(view.getScene().getWindow().getX() + 100);
                    newUserStage.setY(view.getScene().getWindow().getY() + 100);
                    newUserStage.showAndWait();
                }
            }
        });

        //login
        view.getLoginButton().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                StringBuilder loginGegevens = new StringBuilder();
                loginGegevens.append(view.getGebruikersNaam().getText().toString()).append("#").append(view.getWachtwoord().getText().toString()).append("\n");

                if ("a" == "b"){
                    view.getLoginButton().setText("Login gelukt !");
                } else{
                    view.getLoginButton().setText("Login mislukt !");
                }
            }
        });

        view.getGameStartButton().setOnAction(
                actionEvent -> {
                    if (view.getGameStartButton().isHover() && view.getGebruikersNaam().getText().equals("user") && view.getWachtwoord().getText().equals("pass")) {
                        GameView GameView = new GameView();
                        GamePresenter gamePresenter = new GamePresenter(model, GameView);
                        view.getScene().setRoot(GameView);
                        GameView.getScene().getWindow().sizeToScene();
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
