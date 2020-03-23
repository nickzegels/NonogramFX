package be.kdg.nonogram.view.game;
import javafx.geometry.*;
import javafx.scene.control.Button;

import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import java.util.Timer;
import java.util.TimerTask;


public class GameView extends GridPane {
    //buttons
    private Button check;
    private Button timerStart;
    private Button newNonogram;
    public int nonogramLevel;

    //GameButtons
    private Button button00;
    private Button button01;
    private Button button02;
    private Button button03;
    private Button button04;
    private Button button05;
    private Button button06;
    private Button button10;
    private Button button11;
    private Button button12;
    private Button button13;
    private Button button14;
    private Button button15;
    private Button button16;
    private Button button20;
    private Button button21;
    private Button button22;
    private Button button23;
    private Button button24;
    private Button button25;
    private Button button26;
    private Button button30;
    private Button button31;
    private Button button32;
    private Button button33;
    private Button button34;
    private Button button35;
    private Button button36;
    private Button button40;
    private Button button41;
    private Button button42;
    private Button button43;
    private Button button44;
    private Button button45;
    private Button button46;
    private Button button50;
    private Button button51;
    private Button button52;
    private Button button53;
    private Button button54;
    private Button button55;
    private Button button56;
    private Button button60;
    private Button button61;
    private Button button62;
    private Button button63;
    private Button button64;
    private Button button65;
    private Button button66;

    //Text
    private Text titel;
    private Text statusText;

    public Text getStatusText(){ return statusText;}

    //Rooster
    private GridPane rooster;

    public GameView() {
        this.initialiseNodes();
        this.layoutNodes();
    }

    private void initialiseNodes() {
        this.check = new Button("Check je nonogram");
        this.newNonogram = new Button("Start de Game !");

        this.rooster = new GridPane();
        this.titel = new Text("Nonogram");
        this.statusText = new Text("Game nog bezig");
        this.nonogramLevel = 0;

        this.button00 = new Button("");
        this.button01 = new Button("");
        this.button02 = new Button("");
        this.button03 = new Button("");
        this.button04 = new Button("");
        this.button05 = new Button("");
        this.button06 = new Button("");
        this.button10 = new Button("");
        this.button11 = new Button("");
        this.button12 = new Button("");
        this.button13 = new Button("");
        this.button14 = new Button("");
        this.button15 = new Button("");
        this.button16 = new Button("");
        this.button20 = new Button("");
        this.button21 = new Button("");
        this.button22 = new Button("");
        this.button23 = new Button("");
        this.button24 = new Button("");
        this.button25 = new Button("");
        this.button26 = new Button("");
        this.button30 = new Button("");
        this.button31 = new Button("");
        this.button32 = new Button("");
        this.button33 = new Button("");
        this.button34 = new Button("");
        this.button35 = new Button("");
        this.button36 = new Button("");
        this.button40 = new Button("");
        this.button41 = new Button("");
        this.button42 = new Button("");
        this.button43 = new Button("");
        this.button44 = new Button("");
        this.button45 = new Button("");
        this.button46 = new Button("");
        this.button50 = new Button("");
        this.button51 = new Button("");
        this.button52 = new Button("");
        this.button53 = new Button("");
        this.button54 = new Button("");
        this.button55 = new Button("");
        this.button56 = new Button("");
        this.button60 = new Button("");
        this.button61 = new Button("");
        this.button62 = new Button("");
        this.button63 = new Button("");
        this.button64 = new Button("");
        this.button65 = new Button("");
        this.button66 = new Button("");
    }

    private void cellLayout(Button button) {
        button.setPrefWidth(55);
        button.setPrefHeight(55);
    }

    public void ButtonLayout(Button button){
        button.setMaxSize(130, 50);
        button.setTextFill(Color.BLACK);
        button.setStyle("-fx-background-color: #D3D3D3; -fx-background-radius: 10");
    }

    private void layoutNodes() {
        //Background
        setBackground(new Background(new BackgroundFill(Color.LIGHTSALMON, CornerRadii.EMPTY, Insets.EMPTY)));
        cellLayout(button00);
        cellLayout(button01);
        cellLayout(button02);
        cellLayout(button03);
        cellLayout(button04);
        cellLayout(button05);
        cellLayout(button06);
        cellLayout(button10);
        cellLayout(button11);
        cellLayout(button12);
        cellLayout(button13);
        cellLayout(button14);
        cellLayout(button15);
        cellLayout(button16);
        cellLayout(button20);
        cellLayout(button21);
        cellLayout(button22);
        cellLayout(button23);
        cellLayout(button24);
        cellLayout(button25);
        cellLayout(button26);
        cellLayout(button30);
        cellLayout(button31);
        cellLayout(button32);
        cellLayout(button33);
        cellLayout(button34);
        cellLayout(button35);
        cellLayout(button36);
        cellLayout(button40);
        cellLayout(button41);
        cellLayout(button42);
        cellLayout(button43);
        cellLayout(button44);
        cellLayout(button45);
        cellLayout(button46);
        cellLayout(button50);
        cellLayout(button51);
        cellLayout(button52);
        cellLayout(button53);
        cellLayout(button54);
        cellLayout(button55);
        cellLayout(button56);
        cellLayout(button60);
        cellLayout(button61);
        cellLayout(button62);
        cellLayout(button63);
        cellLayout(button64);
        cellLayout(button65);
        cellLayout(button66);

        //rooster
        this.setAlignment(Pos.CENTER);
        //this.setGridLinesVisible(true);

        this.add(rooster, 1, 1);
        //buttons
        rooster.add(button00, 0, 0);
        rooster.add(button01, 0, 1);
        rooster.add(button02, 0, 2);
        rooster.add(button03, 0, 3);
        rooster.add(button04, 0, 4);
        rooster.add(button05, 0, 5);
        rooster.add(button06, 0, 6);
        rooster.add(button10, 1, 0);
        rooster.add(button11, 1, 1);
        rooster.add(button12, 1, 2);
        rooster.add(button13, 1, 3);
        rooster.add(button14, 1, 4);
        rooster.add(button15, 1, 5);
        rooster.add(button16, 1, 6);
        rooster.add(button20, 2, 0);
        rooster.add(button21, 2, 1);
        rooster.add(button22, 2, 2);
        rooster.add(button23, 2, 3);
        rooster.add(button24, 2, 4);
        rooster.add(button25, 2, 5);
        rooster.add(button26, 2, 6);
        rooster.add(button30, 3, 0);
        rooster.add(button31, 3, 1);
        rooster.add(button32, 3, 2);
        rooster.add(button33, 3, 3);
        rooster.add(button34, 3, 4);
        rooster.add(button35, 3, 5);
        rooster.add(button36, 3, 6);
        rooster.add(button40, 4, 0);
        rooster.add(button41, 4, 1);
        rooster.add(button42, 4, 2);
        rooster.add(button43, 4, 3);
        rooster.add(button44, 4, 4);
        rooster.add(button45, 4, 5);
        rooster.add(button46, 4, 6);
        rooster.add(button50, 5, 0);
        rooster.add(button51, 5, 1);
        rooster.add(button52, 5, 2);
        rooster.add(button53, 5, 3);
        rooster.add(button54, 5, 4);
        rooster.add(button55, 5, 5);
        rooster.add(button56, 5, 6);
        rooster.add(button60, 6, 0);
        rooster.add(button61, 6, 1);
        rooster.add(button62, 6, 2);
        rooster.add(button63, 6, 3);
        rooster.add(button64, 6, 4);
        rooster.add(button65, 6, 5);
        rooster.add(button66, 6, 6);

        //text
        this.add(titel, 1, 0);
        titel.setFont(new Font(80));
        titel.setFill(Color.WHITESMOKE);
        setConstraints(titel, 1, 0, 1, 1, HPos.LEFT, VPos.CENTER);

        this.add(statusText, 1, 2);
        statusText.setFont(new Font(25));
        statusText.setFill(Color.WHITESMOKE);
        setConstraints(statusText, 1, 2, 1, 1, HPos.LEFT, VPos.CENTER);

        //buttons
        ButtonLayout(check);
        ButtonLayout(newNonogram);

        this.add(check, 2, 1);
        setConstraints(check, 2, 1, 1, 1, HPos.CENTER, VPos.CENTER);

        this.add(newNonogram, 2, 1);
        setConstraints(newNonogram, 2, 1, 1, 1, HPos.CENTER, VPos.TOP);


        ColumnConstraints column1 = new ColumnConstraints(100);
        ColumnConstraints column2 = new ColumnConstraints(380);
        ColumnConstraints column3 = new ColumnConstraints(175);
        this.getColumnConstraints().addAll(column1, column2, column3);

        RowConstraints rowConstraints = new RowConstraints(150);
        RowConstraints rowConstraints2 = new RowConstraints(380);
        RowConstraints rowConstraints3 = new RowConstraints(150);
        this.getRowConstraints().addAll(rowConstraints, rowConstraints2, rowConstraints3);
    }
    Button getCheck() {return check; }
    Button getNewNonogram() {return newNonogram; }

    Button getButton01() {return button01;}
    Button getButton02() {return button02;}
    Button getButton03() {return button03;}
    Button getButton04() {return button04;}
    Button getButton05() {return button05;}
    Button getButton06() {return button06;}
    Button getButton10() {return button10;}
    Button getButton11() {return button11;}
    Button getButton12() {return button12;}
    Button getButton13() {return button13;}
    Button getButton14() {return button14;}
    Button getButton15() {return button15;}
    Button getButton16() {return button16;}
    Button getButton20() {return button20;}
    Button getButton21() {return button21;}
    Button getButton22() {return button22;}
    Button getButton23() {return button23;}
    Button getButton24() {return button24;}
    Button getButton25() {return button25;}
    Button getButton26() {return button26;}
    Button getButton30() {return button30;}
    Button getButton31() {return button31;}
    Button getButton32() {return button32;}
    Button getButton33() {return button33;}
    Button getButton34() {return button34;}
    Button getButton35() {return button35;}
    Button getButton36() {return button36;}
    Button getButton40() {return button40;}
    Button getButton41() {return button41;}
    Button getButton42() {return button42;}
    Button getButton43() {return button43;}
    Button getButton44() {return button44;}
    Button getButton45() {return button45;}
    Button getButton46() {return button46;}
    Button getButton50() {return button50;}
    Button getButton51() {return button51;}
    Button getButton52() {return button52;}
    Button getButton53() {return button53;}
    Button getButton54() {return button54;}
    Button getButton55() {return button55;}
    Button getButton56() {return button56;}
    Button getButton60() {return button60;}
    Button getButton61() {return button61;}
    Button getButton62() {return button62;}
    Button getButton63() {return button63;}
    Button getButton64() {return button64;}
    Button getButton65() {return button65;}
    Button getButton66() {return button66;}
}

