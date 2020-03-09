package be.kdg.nonogram.view.game;


import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

public class GameView extends GridPane {
    //

    private Image foto;
    private Background achtergrond;
    private BackgroundSize achtergrondgrootte;
    private Canvas canvas1;
    private Image image;
    private Button testButton;


    public GameView() {
        this.initialiseNodes();
        this.layoutNodes();
    }

    private void initialiseNodes() {
        //this.foto = new Image("/background.jpg");
        this.testButton = new Button("");
    }

    private void layoutNodes() {
        //this.achtergrondgrootte = new BackgroundSize(0, 0, true, true, true, true);
        //this.setBackground(new Background(new BackgroundImage(foto, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, achtergrondgrootte)));

        //Grid
        this.setGridLinesVisible(true);
        this.maxWidth(600);

        this.setAlignment(Pos.CENTER);

        ColumnConstraints column1 = new ColumnConstraints(50);
        this.getColumnConstraints().addAll(column1, column1, column1, column1, column1, column1, column1, column1,
                column1, column1, column1, column1, column1, column1, column1, column1, column1, column1);


        RowConstraints rowConstraints = new RowConstraints(50);

        this.getRowConstraints().addAll(rowConstraints, rowConstraints, rowConstraints, rowConstraints, rowConstraints,
                rowConstraints,rowConstraints, rowConstraints, rowConstraints, rowConstraints, rowConstraints, rowConstraints,
                rowConstraints, rowConstraints, rowConstraints, rowConstraints, rowConstraints, rowConstraints);


//        for (int i = 0; i<10;i++) {
//            for (int j = 0; j<10; j++) {
//                //this.getColumnConstraints().addAll(column1);
//                //this.getRowConstraints().addAll(rowConstraints);
//                //Button
//                this.add(testButton, i, j);
//                this.testButton.setPrefSize(50, 50);
//            }
//        }


    }

}
