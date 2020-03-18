package be.kdg.nonogram.view.game;
import javafx.geometry.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import javax.management.timer.Timer;

public class GameView extends GridPane {
    //buttons
    private Button check;
    private Button sluitVenster;
    private Button cell;

    //Text
    private Text titel;

    //Timer
    private Timer timer1;

    //Rooster
    private GridPane rooster;

    public GameView() {
        this.initialiseNodes();
        this.layoutNodes();
    }

    private void initialiseNodes() {
        this.check = new Button("Check Game");
        this.sluitVenster = new Button("Sluit de game");
        this.timer1 = new Timer();
        this.rooster = new GridPane();
        this.titel = new Text("Nonogram");
        this.cell = new Button();
    }

    private void cellLayout(Button cell) {
        cell.setText("");
        cell.setPrefWidth(55);
        cell.setPrefHeight(55);
    }

    private void layoutNodes() {
        //Background
        setBackground(new Background(new BackgroundFill(Color.DODGERBLUE, CornerRadii.EMPTY, Insets.EMPTY)));

        //rooster
        this.setAlignment(Pos.CENTER);
        this.setGridLinesVisible(true);
        rooster.setGridLinesVisible(true);

        for (int a = 0; a < 7; a++) {
            for (int b = 0; b < 7; b++) {
                cell = new Button();
                cellLayout(cell);
                rooster.add(cell, a, b, 1, 1);
            }
        }
        this.add(rooster, 1, 1);

        //text

        this.add(titel, 1, 0);
        titel.setFont(new Font(60));
        setConstraints(titel, 1, 0, 1, 1, HPos.LEFT, VPos.CENTER);

        //buttons
        this.add(sluitVenster, 2, 1);
        setConstraints(sluitVenster, 2, 1, 1, 1, HPos.CENTER, VPos.BOTTOM);

        this.add(check, 2, 1);
        setConstraints(check, 2, 1, 1, 1, HPos.CENTER, VPos.CENTER);


        ColumnConstraints column1 = new ColumnConstraints(100);
        ColumnConstraints column2 = new ColumnConstraints(380);
        ColumnConstraints column3 = new ColumnConstraints(175);
        this.getColumnConstraints().addAll(column1, column2, column3);

        RowConstraints rowConstraints = new RowConstraints(150);
        RowConstraints rowConstraints2 = new RowConstraints(380);
        RowConstraints rowConstraints3 = new RowConstraints(150);
        this.getRowConstraints().addAll(rowConstraints, rowConstraints2, rowConstraints3);
    }

    Button getCell () { return cell; }
    Button getCheck() {return check; }

}
// TIMER
//    private static final int START_TICK_DURATION_MILLIS = 1000;
//
//    private int hours;
//    private int minutes;
//    private int seconds;
//    private int tickDurationMillis;
//
//
//    public void tick() {
//        this.seconds++;
//
//        if (this.seconds == 60) {
//            this.seconds = 0;
//            this.minutes++;
//
//           if (this.minutes == 60) {
//               this.minutes = 0;
//              this.hours++;
//            }
//        }
//   }
//
//    public int getHours() {
//        return hours;
//    }
//
//   public int getMinutes() {
//        return minutes;
//    }
//
//    public int getSeconds() {
//        return seconds;
//    }
//    public void reset() {
//        this.hours = 0;
//        this.minutes = 0;
//        this.seconds = 0;
//        if (this.tickDurationMillis > 100) {
//            this.tickDurationMillis -= 100;
//        }else {this.tickDurationMillis = 10;}
//    }
//
//    public int getTickDurationMillis() {
//        return tickDurationMillis;
//    }
//}
