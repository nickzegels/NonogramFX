package be.kdg.nonogram.view.about;

import javafx.geometry.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class AboutView extends GridPane {
    public Text titel;
    public Text aboutText;
    FileInputStream inputstream;
    Image image;
    ImageView imageView;

    public AboutView() throws FileNotFoundException {
        this.initialiseNodes();
        this.layoutNodes();
    }

    private void initialiseNodes() throws FileNotFoundException {
        inputstream = new FileInputStream("NonogramGame/resources/Images/nonogram.png");
        image = new Image(inputstream);
        imageView = new ImageView(image);


        this.titel = new Text("Wat is een nonogram ?");
        this.aboutText = new Text("Een nonogram is een beeldpuzzel. De oplossing is\n" +
                " een tekening van gekleurde blokjes of pixels.\n" +
                " De lengte en breedte kunnen variëren van 5 tot 200 en meer.\n" +
                " Het aantal kleuren kan variëren van twee (zwart en wit) tot tien of meer (waaronder wit).\n" +
                "De gekleurde pixels vormen horizontaal en verticaal blokken van\n" +
                " meerdere aaneengesloten pixels met een enkele kleur.\n" +
                "De opgave is een leeg diagram. Getallen boven en links van het diagram\n" +
                " geven aan hoe lang de blokken zijn en welke kleur ze hebben.\n" +
                "De witte blokken worden niet aangegeven.\n" +
                " Elk getal staat voor één of meer aaneengesloten blokken van een\n" +
                " bepaalde kleur in de betreffende kolom of op de betreffende regel.\n" +
                " Door deze blokken kloppend in te kleuren,\n" +
                " vormt zich een afbeelding in het diagram: de oplossing van de puzzel.");
    }

    private void layoutNodes() {
        //Background
        setBackground(new Background(new BackgroundFill(Color.LIGHTSALMON, CornerRadii.EMPTY, Insets.EMPTY)));

        this.add(titel, 0, 0);
        titel.setFill(Color.WHITE);
        titel.setFont(new Font(60));
        titel.setUnderline(true);
        setConstraints(titel, 0,0 ,1 ,1,  HPos.CENTER, VPos.TOP);

        this.add(aboutText, 0 , 0);
        aboutText.setFill(Color.WHITE);
        aboutText.setFont(new Font(15));
        setConstraints(aboutText, 0, 0, 1, 1, HPos.CENTER, VPos.CENTER);

        this.add(imageView, 0 , 1);
        setConstraints(imageView, 0, 1, 1, 1, HPos.CENTER, VPos.TOP);

        ColumnConstraints column1 = new ColumnConstraints(700);
        this.getColumnConstraints().addAll(column1);

        RowConstraints rowConstraint1 = new RowConstraints(425);
        RowConstraints rowConstraint2 = new RowConstraints(300);
        this.getRowConstraints().addAll(rowConstraint1, rowConstraint2);
    }
}
