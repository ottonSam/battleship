package br.ufrn.imd.visao;

import br.ufrn.imd.modelo.Celula;
import br.ufrn.imd.controle.Jogo;
import br.ufrn.imd.modelo.Tipo;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

import java.io.IOException;
import java.net.URL;


public class TelaPrincipal extends Application {

    private Stage stage;
    private Pane tlPrincipal;
    private Jogo jogo;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try  {
            stage = primaryStage;
            stage.setTitle("Exemplo Principal");
            jogo = new Jogo();
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

        GridPane gridJogador = (GridPane) scene.lookup("#gridJogador");
        GridPane gridBot = (GridPane) scene.lookup("#gridBot");
        Label vitorias = (Label) scene.lookup("#vitorias");
        Label derrotas = (Label) scene.lookup("#derrotas");

        new AnimationTimer() {
            @Override public void handle(long currentNanoTime) {
                vitorias.setText(jogo.getVitorias().toString());
                derrotas.setText(jogo.getDerrotas().toString());
                for (Node child : gridJogador.getChildren()) {
                    if (child instanceof Rectangle) {
                        Rectangle rectangle = (Rectangle) child;
                        Integer x = GridPane.getColumnIndex(child);
                        Integer y = GridPane.getRowIndex(child);
                        Celula celula = jogo.getBoardJogador().getCelula(x, y);
                        if (celula.getAtingido()) {
                            rectangle.setFill(Color.RED);
                        } else if (celula.getTipo().equals(Tipo.AGUA)) {
                            rectangle.setFill(Color.BLUE);
                        } else if (celula.getTipo().equals(Tipo.NAVIO)) {
                            rectangle.setFill(Color.BLACK);
                        }
                    }
                }

                for (Node child : gridBot.getChildren()) {
                    if (child instanceof Rectangle) {
                        Rectangle rectangle = (Rectangle) child;
                        Integer x = GridPane.getColumnIndex(child);
                        Integer y = GridPane.getRowIndex(child);
                        Celula celula = jogo.getBoardBot().getCelula(x, y);
                        rectangle.setOnMouseClicked(event -> jogo.marcarCelulaBot(x, y));
                        if (!celula.getAtingido()) {
                            rectangle.setFill(Color.rgb(143,163,181));
                        }
                        if (celula.getAtingido() && celula.getTipo().equals(Tipo.AGUA)) {
                            rectangle.setFill(Color.BLUE);
                        } else if (celula.getAtingido() && celula.getTipo().equals(Tipo.NAVIO)) {
                            rectangle.setFill(Color.BLACK);
                        }
                    }
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    // Do nothing
                }
            }
        }.start();
    }
}
