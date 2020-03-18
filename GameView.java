package be.kdg.nonogram.view.game;

import javafx.geometry.*;
import javafx.scene.layout.*;
import javafx.scene.text.Text;

public class GameView extends GridPane {
    public Text titel;

    public GameView() {
        this.initialiseNodes();
        this.layoutNodes();
    }

    private void initialiseNodes() {
        this.titel = new Text("Dit is de Game page");
    }

    private void layoutNodes() {

        this.add(titel, 0, 0);
        setConstraints(titel, 0,0 ,1 ,1,  HPos.CENTER, VPos.TOP);

        ColumnConstraints column1 = new ColumnConstraints(400);
        this.getColumnConstraints().addAll(column1);

        RowConstraints rowConstraint1 = new RowConstraints(400);
        this.getRowConstraints().addAll(rowConstraint1);
    }
}








// TIMER

//    private static final int START_TICK_DURATION_MILLIS = 1000;
//
//    private int hours;
//    private int minutes;
//    private int seconds;
//
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
//            if (this.minutes == 60) {
//                this.minutes = 0;
//                this.hours++;
//            }
//        }
//    }
//
//    public int getHours() {
//        return hours;
//    }
//
//    public int getMinutes() {
//        return minutes;
//    }
//
//    public int getSeconds() {
//        return seconds;
//    }
//
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