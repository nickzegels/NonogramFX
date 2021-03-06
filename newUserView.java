package be.kdg.nonogram.view.newUser;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class newUserView extends GridPane {
    public TextField gebruikersNaam;
    public TextField wachtwoord;
    public Text info;
    public TextField getGebruikersNaam() {
        return gebruikersNaam;
    }
    public TextField getWachtwoord() {
        return wachtwoord;
    }

    private Button nieuweGebruikerButton;

    public newUserView() {
        this.initialiseNodes();
        this.layoutNodes();
    }

    private void initialiseNodes() {
        this.gebruikersNaam = new TextField();
        this.wachtwoord = new TextField();

       this.nieuweGebruikerButton = new Button("Nieuw Acount !");
       this.info = new Text("Je mag maar 1 user per keer maken !");
    }

    private void layoutNodes() {
        //Background
        setBackground(new Background(new BackgroundFill(Color.LIGHTSALMON, CornerRadii.EMPTY, Insets.EMPTY)));

        //Window
        this.add(gebruikersNaam,     1, 1);
        gebruikersNaam.setText("Geef hier je nieuwe Gebruikersnaam in");
        setConstraints(gebruikersNaam, 1,1,1 ,1,  HPos.CENTER, VPos.CENTER);

        this.add(info,     1, 0);
        setConstraints(info, 1,0,1 ,1,  HPos.CENTER, VPos.CENTER);

        this.add(wachtwoord,     1, 1);
        wachtwoord.setText("Geef hier je nieuwe wachtwoord in");
        setConstraints(wachtwoord, 1,1 ,1 ,1,  HPos.CENTER, VPos.BOTTOM);

        this.add(nieuweGebruikerButton, 1, 2);
        nieuweGebruikerButton.setMaxSize(130, 50);
        nieuweGebruikerButton.setTextFill(Color.BLACK);
        nieuweGebruikerButton.setStyle("-fx-background-color: #D3D3D3; -fx-background-radius: 10");
        setConstraints(nieuweGebruikerButton, 1,2 ,1 ,1,  HPos.CENTER, VPos.CENTER);

        this.maxWidth(500);
        //this.setGridLinesVisible(true);

        this.setAlignment(Pos.CENTER);

        ColumnConstraints column1 = new ColumnConstraints(20);
        ColumnConstraints column2 = new ColumnConstraints(400);
        ColumnConstraints column3 = new ColumnConstraints(20);
        this.getColumnConstraints().addAll(column1, column2, column3);

        RowConstraints rowConstraints1= new RowConstraints(20);
        RowConstraints rowConstraints2= new RowConstraints(150);
        RowConstraints rowConstraints3= new RowConstraints(100);
        this.getRowConstraints().addAll(rowConstraints1,rowConstraints2,rowConstraints3);
    }

      Button getnieuweGebruikerButton(){ return nieuweGebruikerButton; }
}