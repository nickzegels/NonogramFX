package be.kdg.nonogram.view.newUser;

import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

public class newUserView extends GridPane {
    public TextField gebruikersNaam;
    public TextField wachtwoord;
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
    }

    private void layoutNodes() {

        this.add(gebruikersNaam,     1, 1);
        gebruikersNaam.setText("Geef hier je nieuwe Gebruikersnaam in");
        setConstraints(gebruikersNaam, 1,1,1 ,1,  HPos.CENTER, VPos.CENTER);

        this.add(wachtwoord,     1, 1);
        wachtwoord.setText("Geef hier je nieuwe wachtwoord in");
        setConstraints(wachtwoord, 1,1 ,1 ,1,  HPos.CENTER, VPos.BOTTOM);

        this.add(nieuweGebruikerButton, 1, 2);
        nieuweGebruikerButton.setMaxSize(130, 50);
        setConstraints(nieuweGebruikerButton, 1,2 ,1 ,1,  HPos.CENTER, VPos.CENTER);

        this.maxWidth(500);
        this.setGridLinesVisible(true);

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