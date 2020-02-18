package be.kdg.nonogram;
import be.kdg.nonogram.model.NonogramModel;
import be.kdg.nonogram.view.start.StartPresenter;

import be.kdg.nonogram.view.start.StartView;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Main extends Application{
    @Override
    public void start(Stage primarystage) {
        NonogramModel model =
                new NonogramModel();
        StartView view =
                new StartView();
        StartPresenter presenter =
                new StartPresenter(model, view);
        primarystage.setScene(new Scene(view));
        presenter.addWindowEventHandlers();
        primarystage.show();
    }

    public static void main(String[] args){
        Application.launch(args);
    }
}
