package be.kdg.nonogram.view.start;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

public class StartView extends BorderPane{
    //
    private Button login;
    private TextArea email;
    private BorderPane root;
    private ImageView backgroundImage;

    public StartView() {
        this.initialiseNodes();
        this.layoutNodes();
    }

    private void initialiseNodes() {
        //
        login = new Button("Lees voor");
        email = new TextArea("bla bla");
        root = new BorderPane();

        this.setCenter(email);
        this.setBottom(login);

        root.setCenter(email);
        root.setBottom(login);

        backgroundImage = new ImageView(new Image("/loginBackground.png"));
    }

    private void layoutNodes() {
        //
        BorderPane.setAlignment(login, Pos.CENTER);
        BorderPane.setMargin(login, new Insets(10, 10, 10, 10));
    }

}
