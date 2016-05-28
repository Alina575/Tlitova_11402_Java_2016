package sample;

import javafx.animation.*;
import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Alina Tlitova
 *         11-402
 *         26.05.2016
 */

public class BerryKoala extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public AnimationTimer animationTimer;
    public static int score = 0;
    public static long lastNanoTime;
    private static final Integer STARTTIME = 0;
    private Timeline timeline;
    private Label timerLabel = new Label();
    private IntegerProperty timeSeconds = new SimpleIntegerProperty(STARTTIME);

    @Override
    public void start(Stage stage) {
        stage.setTitle("Berry Koala");
        Group r = new Group();
        Scene sc = new Scene(r);
        stage.setScene(sc);

        timerLabel.textProperty().bind(timeSeconds.asString());
        timerLabel.setTextFill(Color.RED);
        timerLabel.setStyle("-fx-font-size: 5em;");
        r.getChildren().add(timerLabel);

//        if (timeline != null) {
//            timeline.stop();
//        }
        timeSeconds.set(STARTTIME);
        timeline = new Timeline();
        timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(STARTTIME + 1),
                new KeyValue(timeSeconds, 0)));
        timeline.playFromStart();


        Canvas canvas = new Canvas(512, 512);
        r.getChildren().add(canvas);

        ArrayList<String> input = new ArrayList<String>();

        sc.setOnKeyPressed(
                new EventHandler<KeyEvent>() {
                    public void handle(KeyEvent e) {
                        String code = e.getCode().toString();
                        if (!input.contains(code))
                            input.add(code);
                    }
                });

        sc.setOnKeyReleased(
                new EventHandler<KeyEvent>() {
                    public void handle(KeyEvent e) {
                        String code = e.getCode().toString();
                        input.remove(code);
                    }
                });

        GraphicsContext grafCon = canvas.getGraphicsContext2D();

        Font theFont = Font.font("Helvetica", FontWeight.BOLD, 24);
        grafCon.setFont(theFont);
        grafCon.setFill(Color.BLACK);
        grafCon.setStroke(Color.RED);
        grafCon.setLineWidth(1);

        Element koala = new Element();
        koala.setImage("images/koala.png");
        koala.setPosition(200, 0);

        ArrayList<Element> elements = new ArrayList<>();
        ArrayList<Element> fooElements = new ArrayList<>();


        for (int i = 0; i < 5; i++) {
            Element foo = new Element();
            foo.setImage("images/foo.png");
            foo.setPosition(350 * Math.random() + 50, 350 * Math.random() + 50);
            fooElements.add(foo);
        }


        int k = 0;
        while (k < 4) {
            for (int i = 1; i < 7; i++) {
                Element berry = new Element();
                String img = "images/berry" + i + ".png";
                berry.setImage(img);
                berry.setPosition(350 * Math.random() + 50, 350 * Math.random() + 50);
                elements.add(berry);
            }
            k++;
        }

        lastNanoTime = System.nanoTime();

        animationTimer = new AnimationTimer() {
            public void handle(long currentNanoTime) {

                double elapsedTime = (currentNanoTime - lastNanoTime) / 1000000000.0;
                lastNanoTime = currentNanoTime;

                koala.setVelocity(0, 0);
                if (input.contains("LEFT"))
                    koala.addVelocity(-100, 0);
                if (input.contains("RIGHT"))
                    koala.addVelocity(100, 0);
                if (input.contains("UP"))
                    koala.addVelocity(0, -100);
                if (input.contains("DOWN"))
                    koala.addVelocity(0, 100);

                koala.update(elapsedTime);


                Iterator<Element> berryIt = elements.iterator();
                Iterator<Element> fooIt = fooElements.iterator();

                while (berryIt.hasNext()) {
                    Element berry = berryIt.next();
                    if (koala.intersects(berry)) {
                        berryIt.remove();
                        score++;
                    }
                }

                while (fooIt.hasNext()) {
                    Element foo = fooIt.next();
                    if (koala.intersects(foo)) {
                        fooIt.remove();
                        score -= 10;
                    }
                }


                grafCon.clearRect(0, 0, 512, 512);
                koala.render(grafCon);

                for (Element koala : elements)
                    koala.render(grafCon);

                for (Element koala : fooElements)
                    koala.render(grafCon);

                if (score < 0) {
                    animationTimer.stop();
                    String win = "GAME OVER!:(";

                    HBox hBox = new HBox();
                    hBox.setTranslateX(50);
                    hBox.setTranslateY(100);
                    r.getChildren().add(hBox);

                    for (int i = 0; i < win.toCharArray().length; i++) {
                        char letter = win.charAt(i);

                        Text text = new Text(String.valueOf(letter));
                        text.setFont(Font.font(38));
                        text.setOpacity(0);

                        hBox.getChildren().add(text);

                        FadeTransition ft = new FadeTransition(Duration.seconds(0.50), text);
                        ft.setToValue(1);
                        ft.setDelay(Duration.seconds(i * 0.10));
                        ft.play();
                    }
                } else if (timeSeconds.intValue() == 20) {
                    animationTimer.stop();
                    String win = "YOUR TIME IS OVER!:(";

                    HBox hBox = new HBox();
                    hBox.setTranslateX(50);
                    hBox.setTranslateY(100);
                    r.getChildren().add(hBox);

                    for (int i = 0; i < win.toCharArray().length; i++) {
                        char letter = win.charAt(i);

                        Text text = new Text(String.valueOf(letter));
                        text.setFont(Font.font(38));
                        text.setOpacity(0);

                        hBox.getChildren().add(text);

                        FadeTransition ft = new FadeTransition(Duration.seconds(0.50), text);
                        ft.setToValue(1);
                        ft.setDelay(Duration.seconds(i * 0.10));
                        ft.play();
                    }
                } else {
                    if (elements.isEmpty()) {
                        animationTimer.stop();
                        String win = "CONGRATULATIONS!";

                        HBox hBox = new HBox();
                        hBox.setTranslateX(50);
                        hBox.setTranslateY(100);
                        r.getChildren().add(hBox);

                        for (int i = 0; i < win.toCharArray().length; i++) {
                            char letter = win.charAt(i);

                            Text text = new Text(String.valueOf(letter));
                            text.setFont(Font.font(38));
                            text.setOpacity(0);

                            hBox.getChildren().add(text);

                            FadeTransition ft = new FadeTransition(Duration.seconds(0.50), text);
                            ft.setToValue(1);
                            ft.setDelay(Duration.seconds(i * 0.10));
                            ft.play();
                        }
                    } else {
                        String res = "Score: " + (100 * score);
                        grafCon.fillText(res, 370, 30);
                        grafCon.strokeText(res, 370, 30);
                    }
                }
            }
        };

        startAnimation(r);
        animationTimer.start();
        stage.getScene().getStylesheets().add("css/style.css");
        stage.show();
    }


    private void startAnimation(final Group root) {
        final Circle red = new Circle(250, 250, 50);
        final Circle orange = new Circle(250, 250, 50);
        final Circle green = new Circle(250, 250, 50);
        red.setFill(Color.RED);
        orange.setFill(Color.ORANGE);
        green.setFill(Color.GREEN);
        red.setOpacity(0.0);
        orange.setOpacity(0.0);
        green.setOpacity(0.0);

        final FadeTransition REDin = new FadeTransition(new Duration(500));
        REDin.setNode(red);
        REDin.setToValue(1.0);

        final ScaleTransition REDscale = new ScaleTransition(new Duration(1000));
        REDscale.setNode(red);
        REDscale.setFromX(1.0);
        REDscale.setFromY(1.0);
        REDscale.setToX(5.0);
        REDscale.setToY(5.0);
        REDscale.setAutoReverse(true);
        REDscale.setCycleCount(2);

        final FadeTransition REDout = new FadeTransition(new Duration(500));
        REDout.setNode(red);
        REDout.setToValue(0.0);
        REDout.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                root.getChildren().remove(red);
            }
        });

        final FadeTransition ORANGEin = new FadeTransition(new Duration(3000));
        ORANGEin.setNode(orange);
        ORANGEin.setToValue(1.0);

        final ScaleTransition ORANGEscale = new ScaleTransition(new Duration(3500));
        ORANGEscale.setNode(orange);
        ORANGEscale.setFromX(1.0);
        ORANGEscale.setFromY(1.0);
        ORANGEscale.setToX(4.0);
        ORANGEscale.setToY(4.0);
        ORANGEscale.setAutoReverse(true);
        ORANGEscale.setCycleCount(2);

        final FadeTransition ORANGEout = new FadeTransition(new Duration(3000));
        ORANGEout.setNode(orange);
        ORANGEout.setToValue(0.0);
        ORANGEout.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                root.getChildren().remove(orange);
            }
        });

        final FadeTransition GREENin = new FadeTransition(new Duration(500));
        GREENin.setNode(green);
        GREENin.setToValue(1.0);

        final ScaleTransition GREENscale = new ScaleTransition(new Duration(3500));
        GREENscale.setNode(green);
        GREENscale.setFromX(1.0);
        GREENscale.setFromY(1.0);
        GREENscale.setToX(4.0);
        GREENscale.setToY(4.0);
        GREENscale.setAutoReverse(true);
        GREENscale.setCycleCount(2);

        final FadeTransition GREENout = new FadeTransition(new Duration(3000));
        GREENout.setNode(green);
        GREENout.setToValue(0.0);
        GREENout.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                root.getChildren().remove(orange);
            }
        });


        Timeline timeline = new Timeline(
                new KeyFrame(new Duration(1000), new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        root.getChildren().add(red);
                        REDin.play();
                    }
                }),

                new KeyFrame(new Duration(1500), new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        REDscale.play();
                    }
                }),

                new KeyFrame(new Duration(3000), new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        REDout.play();
                    }
                }),

                new KeyFrame(new Duration(3500), new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        ORANGEin.play();
                    }
                }),

                new KeyFrame(new Duration(4000), new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        ORANGEscale.play();
                    }
                }),

                new KeyFrame(new Duration(8000), new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        ORANGEout.play();
                    }
                })
        );

        timeline.play();

    }
}