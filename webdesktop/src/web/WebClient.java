package web;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.awt.*;
import java.net.URL;

public class WebClient extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        stage.setWidth(screen.getWidth());
        stage.setHeight(screen.getHeight());
        WebView web = new WebView();
        web.setPrefSize(screen.getWidth(), screen.getHeight());
        AnchorPane pane = new AnchorPane();
        Scene scene = new Scene(pane, screen.getWidth(), screen.getHeight());
        WebEngine engine = web.getEngine();
        final URL google = new URL("https://www.github.com/jajavaa");
        engine.setJavaScriptEnabled(true);
        engine.load(google.toExternalForm());
        pane.getChildren().add(web);
        stage.setScene(scene);
        stage.show();
    }
}
