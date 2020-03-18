package be.kdg.nonogram.view.about;

import javafx.geometry.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class AboutView extends GridPane {
    public Text titel;

    public AboutView() {
        this.initialiseNodes();
        this.layoutNodes();
    }

    private void initialiseNodes() {
        this.titel = new Text("Dit is de about page");
    }

    private void layoutNodes() {
        //Background
        setBackground(new Background(new BackgroundFill(Color.DODGERBLUE, CornerRadii.EMPTY, Insets.EMPTY)));

        this.add(titel, 0, 0);
        setConstraints(titel, 0,0 ,1 ,1,  HPos.CENTER, VPos.TOP);

        ColumnConstraints column1 = new ColumnConstraints(400);
        this.getColumnConstraints().addAll(column1);

        RowConstraints rowConstraint1 = new RowConstraints(400);
        this.getRowConstraints().addAll(rowConstraint1);
    }
}
