package be.kdg.nonogram.view.start;

import javafx.geometry.*;
import javafx.geometry.Insets;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

import java.io.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


import java.util.ArrayList;

public class StartView extends GridPane{
    private static ArrayList userList;
    //Text
    public TextField gebruikersNaam;
    public TextField wachtwoord;
    private Text titel;

    //get-text
    public TextField getGebruikersNaam() {
        return gebruikersNaam;
    }
    public TextField getWachtwoord() {
        return wachtwoord;
    }

    //Buttons
    private Button loginButton;
    private Button newUserButton;
    private Button gameStartButton;
    private Button aboutButton;
    private Button rulesButton;

    // Users bestand
    public static FileWriter userBestand;
    public static BufferedWriter out;
    public static BufferedReader reader;

    //Login
    public static Boolean loginBool;

    public StartView() {
        this.initialiseNodes();
        this.layoutNodes();
    }

    private void initialiseNodes() {
        //Canvas
        Canvas canvas1 = new Canvas();

        //Extra's
        this.gebruikersNaam = new TextField();
        this.wachtwoord = new TextField();
        this.titel = new Text("Nonogram");
        this.userList = new ArrayList<>();
        loginBool = Boolean.FALSE;

        //Buttons
        this.gameStartButton = new Button("Start Game !");
        this.loginButton = new Button("Login");
        this.aboutButton = new Button("About our Game");
        this.rulesButton = new Button("Nonogram Rules");
        this.newUserButton = new Button("Nieuwe gebruiker !");

        //Users bestand inlezen
        try {
            userBestand = new FileWriter("NonogramGame/resources/Files/Users.txt", true);
            out = new BufferedWriter(userBestand);

        } catch (Exception e) {
            e.printStackTrace();
        }

        //Users bestand uitlezen
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("/Files/Users.txt")));){

        String line;
        while ((line = reader.readLine()) != null)
            userList.add(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(userList);
    }

    public void ButtonLayout(Button button){
        button.setMaxSize(130, 50);
        button.setTextFill(Color.BLACK);
        button.setStyle("-fx-background-color: #D3D3D3; -fx-background-radius: 10");
    }

    private void layoutNodes() {
        //Background
        setBackground(new Background(new BackgroundFill(Color.LIGHTSALMON, CornerRadii.EMPTY, Insets.EMPTY)));

        // Text
        this.add(titel, 0, 0);
        titel.setFont(new Font(80));
        titel.setFill(Color.WHITESMOKE);
        setConstraints(titel, 0,0 ,1 ,1,  HPos.CENTER, VPos.CENTER);

        //TextVeld
        this.add(gebruikersNaam,     0, 0);
        gebruikersNaam.setText("Geef je email of gebruikersnaam");
        setConstraints(gebruikersNaam, 0,1,1 ,1,  HPos.CENTER, VPos.CENTER);

        this.add(wachtwoord,     0, 1);
        wachtwoord.setText("Geef je wachtwoord");
        setConstraints(wachtwoord, 0,1 ,1 ,1,  HPos.CENTER, VPos.BOTTOM);

        //Button
        ButtonLayout(gameStartButton);
        ButtonLayout(aboutButton);
        ButtonLayout(rulesButton);
        ButtonLayout(loginButton);
        ButtonLayout(gameStartButton);
        ButtonLayout(newUserButton);

        this.add(gameStartButton, 0, 3);
        setConstraints(gameStartButton, 0,3,1 ,1,  HPos.CENTER, VPos.TOP);

        this.add(aboutButton, 1, 1);
        setConstraints(aboutButton, 1,1 ,1 ,1,  HPos.CENTER, VPos.CENTER);

        this.add(newUserButton, 1, 2);
        setConstraints(newUserButton, 1,2 ,1 ,1,  HPos.CENTER, VPos.TOP);

        this.add(loginButton, 0, 2);
        setConstraints(loginButton, 0,2 ,1 ,1,  HPos.CENTER, VPos.CENTER);

        this.add(rulesButton, 1, 3);
        setConstraints(rulesButton, 1,2 ,1 ,1,  HPos.CENTER, VPos.BOTTOM);

        //Grid
        this.maxWidth(500);
        this.setAlignment(Pos.CENTER);

        ColumnConstraints column1 = new ColumnConstraints(400);
        ColumnConstraints column2 = new ColumnConstraints(200);

        this.getColumnConstraints().addAll(column1, column2);

        RowConstraints rowConstraints= new RowConstraints(150);
        RowConstraints rowConstraints1= new RowConstraints(150);
        RowConstraints rowConstraints2= new RowConstraints(150);
        RowConstraints rowConstraints3= new RowConstraints(150);
        this.getRowConstraints().addAll(rowConstraints, rowConstraints1,rowConstraints2,rowConstraints3);
    }

    Button getGameStartButton () {
        return gameStartButton;
    }

    Button getAboutButton () {
        return aboutButton;
    }

    Button getRulesButton () { return rulesButton; }

    Button getLoginButton(){ return loginButton;  }

    Button getnewUserButton(){ return newUserButton; }

    public static ArrayList<String> getUserList() { return  userList; }
}
