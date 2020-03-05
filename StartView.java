package be.kdg.nonogram.view.start;

import be.kdg.nonogram.Main;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Side;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

public class StartView extends GridPane{
    private Canvas canvas1;
    private ImageView backgroundImage;
    private Image image;
    private TextField textVeld;
    private Button loginButton;

    public StartView() {
        this.initialiseNodes();
        this.layoutNodes();
    }

    private void initialiseNodes() {
        //Canvas
        this.canvas1 = new Canvas();

        //Image
        this.backgroundImage = new ImageView(image);
        this.image = new Image("/loginBackground.png");

        //Extra's
        this.textVeld = new TextField();
        this.loginButton = new Button("Login");
    }

    private void layoutNodes() {
        //Background
        BackgroundImage image2 = new BackgroundImage(this.image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, new BackgroundPosition(Side.LEFT, 0.0, false, Side.BOTTOM, 0.0, false), BackgroundSize.DEFAULT);
        this.setBackground(new Background(image2));

        //Text
        this.add(textVeld,     0, 0);
        textVeld.setText("Geef je email of gebruikersnaam");
        this.textVeld.setPrefSize(120, 20);

        //Button
        this.add(loginButton, 0, 1);
        this.loginButton.setPrefSize(120, 20);

        //Grid
        this.setGridLinesVisible(true);
        this.maxWidth(600);

        this.setAlignment(Pos.CENTER);

        ColumnConstraints column1 = new ColumnConstraints(500);
        
        ColumnConstraints column2 = new ColumnConstraints(150);

        this.getColumnConstraints().addAll(column1, column2);

        RowConstraints rowConstraints= new RowConstraints(150);
        RowConstraints rowConstraints1= new RowConstraints(150);
        RowConstraints rowConstraints2= new RowConstraints(150);
        RowConstraints rowConstraints3= new RowConstraints(150);
        this.getRowConstraints().addAll(rowConstraints, rowConstraints1,rowConstraints2,rowConstraints3);

        GridPane.setHalignment(loginButton, HPos.CENTER);

        setMargin(canvas1, new Insets(210, 300, 200, 200));


    }

}
