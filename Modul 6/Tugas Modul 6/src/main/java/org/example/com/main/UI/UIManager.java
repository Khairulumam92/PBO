package org.example.com.main.UI;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
import org.example.com.main.data.Admin;
import java.io.IOException;

public class UIManager{
    private static Scene previousLayout;
    private static int width = 500;
    private static int height = 420;
    public static void setPreviousLayout(Scene scene) {
        previousLayout = scene;
    }
    public static Scene getPreviousLayout() {
        return previousLayout;
    }

    public static void showError(Text actionTarget, String message) {
        actionTarget.setFill(Color.FIREBRICK);
        actionTarget.setText(message);

        // Create a Timeline to clear the message after 5 seconds
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(7), ae -> actionTarget.setText("")));
        timeline.setCycleCount(1); // Run only once
        timeline.play();
    }
    public static void showSuccess(Text actionTarget, String message) {
        actionTarget.setFill(Color.GREEN);
        actionTarget.setText(message);

        // Create a Timeline to clear the message after 5 seconds
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(7), ae -> actionTarget.setText("")));
        timeline.setCycleCount(1); // Run only once
        timeline.play();
    }

    public static int getWidth() {
        return width;
    }

    public static int getHeight() {
        return height;
    }
}
