package be.kdg.nonogram.view.game;


import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

public class GameView extends GridPane {
    private Image foto;
    private Background achtergrond;
    private BackgroundSize achtergrondgrootte;
    private Canvas canvas1;
    private Image image;
    private Button testButton;
    private GridPane rooster;

    public GameView() {
        this.initialiseNodes();
        this.layoutNodes();
    }

    private void initialiseNodes() {
        this.testButton = new Button("");
        this.rooster = new GridPane();
    }

    private void cellLayout(Label cell) {
        cell.setText("Cell");
        cell.setPrefWidth(100);
        cell.setPrefHeight(100);
    }

    private void layoutNodes() {
        //Grid
        this.setGridLinesVisible(true);
        rooster.setGridLinesVisible(true);

        for (int a = 0; a < 7; a++) {
            for (int b = 0; b < 7; b++) {
                Label cell = new Label("ha");
                cellLayout(cell);
                rooster.add(cell, a, b, 1, 1);
            }
        }
        this.add(rooster, 1, 1);

        this.setAlignment(Pos.CENTER);

        ColumnConstraints column1 = new ColumnConstraints(50);
        ColumnConstraints column2 = new ColumnConstraints(480);
        ColumnConstraints column3 = new ColumnConstraints(125);
        this.getColumnConstraints().addAll(column1, column2, column3);


        RowConstraints rowConstraints = new RowConstraints(150);
        RowConstraints rowConstraints2 = new RowConstraints(480);
        RowConstraints rowConstraints3 = new RowConstraints(50);
        this.getRowConstraints().addAll(rowConstraints, rowConstraints2, rowConstraints3);
    }
}
