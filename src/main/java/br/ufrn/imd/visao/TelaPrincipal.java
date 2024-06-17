package br.ufrn.imd.visao;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

import java.io.IOException;
import java.net.URL;

public class TelaPrincipal extends Application {

    private Stage stage;
    private Pane tlPrincipal;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try  {
            stage = primaryStage;
            stage.setTitle("Exemplo Principal");
            initPrinciopal();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void initPrinciopal() throws IOException {
        URL fxmlLocation = getClass().getResource("/TelaPrincipal.fxml");
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(fxmlLocation);
        tlPrincipal = (Pane) loader.load();

        Scene scene = new Scene(tlPrincipal);
        stage.setScene(scene);
        stage.show();
    }
}
