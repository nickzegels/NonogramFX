package be.kdg.nonogram.view.start;

import javafx.geometry.*;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.effect.Reflection;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.shape.Path;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class StartView extends GridPane{
    private Canvas canvas1;

    private ImageView backgroundImage;

    private Image image;

    private TextField gebruikersNaam;
    private TextField textVeld1;

    private Text titel;

    private Button loginButton;
    private Button nieuweGebruikerButton;
    private Button gameStartButton;
    private Button aboutButton;
    private Button rulesButton;

    public StartView() {
        this.initialiseNodes();
        this.layoutNodes();
    }

    private void initialiseNodes() {
        //Canvas
        this.canvas1 = new Canvas();

        //Image
        this.backgroundImage = new ImageView(image);
        this.image = new Image("/Images/loginBackground.png");

        //Extra's
        this.gebruikersNaam = new TextField();
        this.textVeld1 = new TextField();
        this.gameStartButton = new Button("Start Game !");
        this.loginButton = new Button("Login");
        this.aboutButton = new Button("About our Game");
        this.rulesButton = new Button("Nonogram Rules");
        this.titel = new Text("Nonogram");
        this.nieuweGebruikerButton = new Button("Nieuwe gebruiker !");
    }

    private void layoutNodes() {
        //Background
        BackgroundImage image2 = new BackgroundImage(this.image, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, new BackgroundPosition(Side.LEFT, 0.0, false, Side.BOTTOM, 0.0, false), BackgroundSize.DEFAULT);
        this.setBackground(new Background(image2));

        //Text
        this.add(titel, 0, 0);
        titel.setFont(new Font(80));
        this.setConstraints(titel, 0,0 ,1 ,1,  HPos.CENTER, VPos.CENTER);

        //TextVeld
        this.add(gebruikersNaam,     0, 0);
        gebruikersNaam.setText("Geef je email of gebruikersnaam");
        setConstraints(gebruikersNaam, 0,1,1 ,1,  HPos.CENTER, VPos.CENTER);

        this.add(textVeld1,     0, 1);
        textVeld1.setText("Geef je wachtwoord");
        setConstraints(textVeld1, 0,1 ,1 ,1,  HPos.CENTER, VPos.BOTTOM);

        //Button
        this.add(gameStartButton, 0, 3);
        gameStartButton.setMaxSize(300, 100);
        setConstraints(gameStartButton, 0,3,1 ,1,  HPos.CENTER, VPos.TOP);

        this.add(aboutButton, 1, 1);
        aboutButton.setMaxSize(125, 60);
        setConstraints(aboutButton, 1,1 ,1 ,1,  HPos.CENTER, VPos.CENTER);

        this.add(rulesButton, 1, 3);
        rulesButton.setMaxSize(125, 60);
        setConstraints(rulesButton, 1,3 ,1 ,1,  HPos.CENTER, VPos.CENTER);

        this.add(nieuweGebruikerButton, 1, 2);
        nieuweGebruikerButton.setMaxSize(125, 60);
        setConstraints(nieuweGebruikerButton, 1,2 ,1 ,1,  HPos.CENTER, VPos.CENTER);

        this.add(loginButton, 0, 2);
        loginButton.setMaxSize(125, 60);
        setConstraints(loginButton, 0,2 ,1 ,1,  HPos.CENTER, VPos.CENTER);

        //Files

        //Grid
        //this.setGridLinesVisible(true);
        this.maxWidth(700);

        this.setAlignment(Pos.CENTER);

        ColumnConstraints column1 = new ColumnConstraints(500);

        ColumnConstraints column2 = new ColumnConstraints(200);

        this.getColumnConstraints().addAll(column1, column2);

        RowConstraints rowConstraints= new RowConstraints(175);
        RowConstraints rowConstraints1= new RowConstraints(175);
        RowConstraints rowConstraints2= new RowConstraints(175);
        RowConstraints rowConstraints3= new RowConstraints(175);
        this.getRowConstraints().addAll(rowConstraints, rowConstraints1,rowConstraints2,rowConstraints3);

        //setMargin(canvas1, new Insets(500, 500, 500, 500));
    }

    Button getGameStartButton () {
        return gameStartButton;
    }

    Button getAboutButton () {
        return aboutButton;
    }

    Button getRulesButton () { return rulesButton; }

    TextField getGebruikersnaam(){ return gebruikersNaam; }
}
