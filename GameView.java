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
    private GridPane rooster;


    public GameView() {
        this.initialiseNodes();
        this.layoutNodes();
    }

    private void initialiseNodes() {
        //this.foto = new Image("/background.jpg");
        this.testButton = new Button("");
        this.rooster = new GridPane();

    }

    private void layoutNodes() {
        //this.achtergrondgrootte = new BackgroundSize(0, 0, true, true, true, true);
        //this.setBackground(new Background(new BackgroundImage(foto, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, achtergrondgrootte)));

        //Grid
        this.setGridLinesVisible(true);
        this.setWidth(300);
        //this.minWidth(250);
        this.maxHeight(300);

        this.setAlignment(Pos.CENTER);

        ColumnConstraints column1 = new ColumnConstraints(350);
        ColumnConstraints column2 = new ColumnConstraints(350);
        this.getColumnConstraints().addAll(column1, column2);


        RowConstraints rowConstraints = new RowConstraints(350);
        RowConstraints rowConstraints2 = new RowConstraints(350);
        this.getRowConstraints().addAll(rowConstraints, rowConstraints2);

        


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
