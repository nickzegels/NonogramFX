package be.kdg.nonogram.view.start;

import be.kdg.nonogram.model.NonogramModel;
import be.kdg.nonogram.view.about.AboutPresenter;
import be.kdg.nonogram.view.about.AboutView;
//import be.kdg.nonogram.view.game.GamePresenter;
import be.kdg.nonogram.view.game.GamePresenter;
import be.kdg.nonogram.view.game.GameView;
import be.kdg.nonogram.view.newUser.newUserPresenter;
import be.kdg.nonogram.view.newUser.newUserView;

import be.kdg.nonogram.view.rules.RulesPresenter;
import be.kdg.nonogram.view.rules.RulesView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class StartPresenter {
    private final NonogramModel model;
    private final StartView view;

    public StartPresenter(NonogramModel model, StartView view){
        this.model = model;
        this.view = view;
        this.addEvenHandlers();
        this.updateView();
    }

    private void addEvenHandlers() {
        view.getRulesButton().setOnAction(new EventHandler<>() {
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

        view.getAboutButton().setOnAction(new EventHandler<>() {
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

        view.getnewUserButton().setOnAction(new EventHandler<>() {
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
        view.getLoginButton().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                StringBuilder loginGegevens = new StringBuilder();
                loginGegevens.append(view.getGebruikersNaam().getText()).append(view.getWachtwoord().getText());

                boolean login = false;
                StartView.loginBool = false;

                for (Object o : view.getUserList()) {
                    if (o.toString().equals(loginGegevens.toString())) {
                        StartView.loginBool = true;
                        System.out.println("Login gelukt");
                    }
                }
                //System.out.println(StartView.loginBool.toString());
            }
        });

        view.getGameStartButton().setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (StartView.loginBool) {
                    GameView gameView = new GameView();
                    GamePresenter gamePresenter = new GamePresenter(model, gameView);
                    Stage GameStage = new Stage();
                    GameStage.initOwner(view.getScene().getWindow());
                    GameStage.initModality(Modality.APPLICATION_MODAL);
                    GameStage.setScene(
                            new Scene(gameView));
                    GameStage.setX(view.getScene().getWindow().getX() + 100);
                    GameStage.setY(view.getScene().getWindow().getY() + 100);
                    GameStage.showAndWait();
                }
            }
        });


        //        view.getScene().getWindow().setOnCloseRequest(new EventHandler<WindowEvent>() {
        //            @Override
        //            public
        //            void handle(WindowEvent event) {
        //                Alert alert = new Alert(Alert.AlertType.WARNING);
        //                alert.setHeaderText("Je wilt het spel sluiten?");
        //                alert.setContentText("Weet je het zeker?");
        //                alert.setTitle("Opgelet!");
        //                alert.getButtonTypes().clear();
        //                ButtonType neen = new ButtonType("Neen");
        //                ButtonType ja = new ButtonType("Ja");
        //                alert.getButtonTypes().addAll(neen, ja);
        //                alert.showAndWait();
        //                if (alert.getResult() == null || alert.getResult().equals(neen)) {
        //                    event.consume();
        //                }
        //            }
        //        });
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
