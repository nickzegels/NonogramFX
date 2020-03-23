package be.kdg.nonogram.view.splash;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class SplashView extends GridPane {
    //Text
    private Text titel;
    private Text tekst;

    //Buttons
    private Button startButton;

    public SplashView() {
        this.initialiseNodes();
        this.layoutNodes();
    }

    private void initialiseNodes() {
        //Canvas
        Canvas canvas1 = new Canvas();

        //titel
        this.titel = new Text("Nonogram!");
        this.startButton = new Button("Start Nonogram");
        this.tekst = new Text("Welkom, ben jij klaar voor dit leuke spel?\nWij dagen jou uit voor deze puzzels op te lossen! Succes!");
    }

    private void layoutNodes() {
        //Background
        setBackground(new Background(new BackgroundFill(Color.LIGHTSALMON, CornerRadii.EMPTY, Insets.EMPTY)));

        //Button
        this.add(startButton, 1, 3);
        startButton.setMaxSize(200, 300);
        startButton.setTextFill(Color.BLACK);
        startButton.setStyle("-fx-background-color: #D3D3D3; -fx-background-radius: 10");
        setConstraints(startButton, 0, 2, 2, 1, HPos.CENTER, VPos.TOP);

        // Text
        this.add(titel, 1, 0);
        titel.setFont(new Font(80));
        titel.setFill(Color.WHITESMOKE);
        setConstraints(titel, 0,0 ,2 ,1,  HPos.CENTER, VPos.CENTER);

        this.add(tekst, 1,2);
        tekst.setFont(new Font(20));
        tekst.setFill(Color.WHITESMOKE);
        setConstraints(tekst, 0,0 ,2 ,3,  HPos.CENTER, VPos.CENTER);

        //Grid
        this.maxWidth(500);
        this.setAlignment(Pos.CENTER);

        ColumnConstraints column1 = new ColumnConstraints(400);
        ColumnConstraints column2 = new ColumnConstraints(200);

        this.getColumnConstraints().addAll(column1, column2);

        RowConstraints rowConstraints = new RowConstraints(150);
        RowConstraints rowConstraints1 = new RowConstraints(150);
        RowConstraints rowConstraints2 = new RowConstraints(150);
        RowConstraints rowConstraints3 = new RowConstraints(150);
        this.getRowConstraints().addAll(rowConstraints, rowConstraints1, rowConstraints2, rowConstraints3);
    }

    Button getStartButton() {
        return startButton;
    }

}
