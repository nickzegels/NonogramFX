package be.kdg.nonogram.view.game;


import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class GameView extends GridPane {
    private Button testButton;
    private GridPane rooster;
    private Text titel;
    private Button cell;


    public GameView() {
        this.initialiseNodes();
        this.layoutNodes();
    }

    private void initialiseNodes() {
        this.testButton = new Button("");
        this.rooster = new GridPane();
        this.titel = new Text();
        this.cell = new Button();
    }

    private void cellLayout(Button cell) {
        cell.setText("");
        cell.setPrefWidth(55);
        cell.setPrefHeight(55);
    }

    private void layoutNodes() {
        //Grid
        this.setAlignment(Pos.CENTER);
        this.titel = new Text("Nonogram");
        this.add(titel, 0, 0);
        titel.setFont(new Font(60));
        this.setConstraints(titel, 1,0 ,1 ,1,  HPos.LEFT, VPos.CENTER);


        this.setGridLinesVisible(true);
        rooster.setGridLinesVisible(true);

        for (int a = 0; a < 7; a++) {
            for (int b = 0; b < 7; b++) {
                Button cell = new Button();
                cellLayout(cell);
                rooster.add(cell, a, b, 1, 1);
            }
        }
        this.add(rooster, 1, 1);

        ColumnConstraints column1 = new ColumnConstraints(100);
        ColumnConstraints column2 = new ColumnConstraints(380);
        ColumnConstraints column3 = new ColumnConstraints(175);
        this.getColumnConstraints().addAll(column1, column2, column3);

        RowConstraints rowConstraints = new RowConstraints(150);
        RowConstraints rowConstraints2 = new RowConstraints(380);
        RowConstraints rowConstraints3 = new RowConstraints(150);
        this.getRowConstraints().addAll(rowConstraints, rowConstraints2, rowConstraints3);
    }

    Button cell(){ return cell;  }

}
