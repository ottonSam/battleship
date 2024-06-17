package br.ufrn.imd;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/**
 * A classe Main é a classe principal que estende a classe Application do JavaFX.
 *  @version 1.0
 */
public class Main extends Application  {

    /**
     * O método start é chamado quando a aplicação é iniciada.
     * @param stage O palco principal da aplicação, onde os elementos visuais são exibidos
     */
    @Override
    public void start(Stage stage) {
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        Label l = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        Scene scene = new Scene(new StackPane(l), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * O método main é o ponto de entrada da aplicação.
     * @param args Os argumentos da linha de comando
     */
    public static void main(String[] args) {
        launch();
    }
}
