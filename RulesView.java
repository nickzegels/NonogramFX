package be.kdg.nonogram.view.rules;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class RulesView extends GridPane {
    private ImageView backgroundImage;
    private Image image;
    private Button loginButton;

    private Text Vraag1;
    private Text Vraag2;
    private Text Vraag3;
    private Text Vraag4;

    private Text Uitleg1;
    private Text Uitleg2;
    private Text Uitleg3;
    private Text Uitleg4;

    public RulesView() {
        this.initialiseNodes();
        this.layoutNodes();
        this.addEvenHandlers();
        this.updateView();
    }

    private void updateView() {

    }

    private void addEvenHandlers() {

    }

    private void initialiseNodes() {
        this.Vraag1 = new Text("Wat moet ik doen ?");
        this.Vraag2 = new Text("Waar zijn deze getallen voor ?");
        this.Vraag3 = new Text("Wat mag niet ?");
        this.Vraag4 = new Text("Regels");

        this.Uitleg1 = new Text("De aanwijzingen zijn de nummers aan het einde van rijen en kolommen. \n" +
                " Elk nummer is het aantal opeenvolgende zwarte vierkanten. \n" +
                " Twee aangrenzende blokken met opeenvolgende vierkanten worden \n" +
                " gescheiden door meer dan één witte vierkanten.");
        this.Uitleg2 = new Text("Elke nummer toont het aantal zwarte vierkantjes op elk pad in die rij/kolom.");
        this.Uitleg3 = new Text("Als er aan het begin van de kolom een 2 staat, \n" +
                " mag je geen 3 of meer opeenvolgende ingekleurde vakjes gebruiken !");
        this.Uitleg4 = new Text("Het doel van dit spel is om een diagram te ontdekken dat samengesteld is uit blauwe \n" +
                " en lege vakjes. Om dit te doen, moet je kijken naar de definities \n" +
                " van de regels en kolommen - getallen \n" +
                " die gekoppeld zijn aan iedere regel en kolom en die groepen \n" +
                " van aaneengesloten blauwe vakjes omschrijven. \n" +
                " De groepen zijn gescheiden door een leeg vakje.");

        Canvas canvas1 = new Canvas();
    }

    public void setStyleVraag(Text text){
        text.setFont(new Font(16));
        text.setFill(Color.WHITE);
        text.setUnderline(true);
    }

    public void setStyleUitleg(Text text){
        text.setFont(new Font(13));
        text.setFill(Color.WHITE);
    }

    private void layoutNodes() {
        //Background
        setBackground(new Background(new BackgroundFill(Color.LIGHTSALMON, CornerRadii.EMPTY, Insets.EMPTY)));

        //Stijl van tekst zetten
        setStyleVraag(Vraag1);
        setStyleVraag(Vraag2);
        setStyleVraag(Vraag3);
        setStyleVraag(Vraag4);
        setStyleUitleg(Uitleg1);
        setStyleUitleg(Uitleg2);
        setStyleUitleg(Uitleg3);
        setStyleUitleg(Uitleg4);

        //Vragen
        this.add(Vraag1, 0, 0);
        setConstraints(Vraag1, 0, 0, 1, 1, HPos.CENTER, VPos.TOP);

        this.add(Vraag2, 0, 1);
        setConstraints(Vraag2, 0, 1, 1, 1, HPos.CENTER, VPos.TOP);

        this.add(Vraag3, 0, 2);
        setConstraints(Vraag3, 0, 2, 1, 1, HPos.CENTER, VPos.TOP);

        this.add(Vraag4, 0, 3);
        setConstraints(Vraag4, 0, 3, 1, 1, HPos.CENTER, VPos.TOP);

        //Antwoorden
        this.add(Uitleg1, 0, 0);
        setConstraints(Uitleg1, 0, 0, 1, 1, HPos.CENTER, VPos.CENTER);

        this.add(Uitleg2, 0, 1);
        setConstraints(Uitleg2, 0, 1, 1, 1, HPos.CENTER, VPos.CENTER);

        this.add(Uitleg3, 0, 2);
        setConstraints(Uitleg3, 0, 2, 1, 1, HPos.CENTER, VPos.CENTER);

        this.add(Uitleg4, 0, 3);
        setConstraints(Uitleg4, 0, 3, 1, 1, HPos.CENTER, VPos.CENTER);

        //Grid
        //this.setGridLinesVisible(true);
        this.maxWidth(600);
        this.setAlignment(Pos.CENTER);

        ColumnConstraints column = new ColumnConstraints(500);
        this.getColumnConstraints().addAll(column);

        RowConstraints rowConstraints1 = new RowConstraints(150);
        RowConstraints rowConstraints2 = new RowConstraints(150);
        RowConstraints rowConstraints3 = new RowConstraints(150);
        RowConstraints rowConstraints4 = new RowConstraints(150);
        this.getRowConstraints().addAll(rowConstraints1, rowConstraints2, rowConstraints3, rowConstraints4);
    }
}
