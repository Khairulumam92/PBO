package org.example.codelab;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.geometry.Pos;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        GridPane panelLogin = createPanelLogin(primaryStage);
        VBox vbox = new VBox(10);
        vbox.setAlignment(Pos.CENTER);
        vbox.setPadding(new Insets(30, 30, 30, 30));
        Label titleLabel = new Label("Halaman Login");
        titleLabel.setStyle("-fx-font-size: 25px; -fx-font-weight: bold;");
        vbox.getChildren().addAll(titleLabel, panelLogin);
        Scene loginScene = new Scene(vbox, 500, 300);
        primaryStage.setTitle("Form Login");
        primaryStage.setScene(loginScene);
        primaryStage.show();
    }

    private final String USERNAME = "khairul umam";
    private final String PASSWORD = "admin123";

    private GridPane createPanelLogin(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(30, 30, 30, 30));

        Label userNameLabel = new Label("UserName:");
        grid.add(userNameLabel, 0, 1);

        TextField userNameField = new TextField();
        grid.add(userNameField, 1, 1);

        Label passwordLabel = new Label("Password:");
        grid.add(passwordLabel, 0, 2);

        PasswordField passwordField = new PasswordField();
        grid.add(passwordField, 1, 2);

        Label errorMessage = new Label();
        errorMessage.setStyle("-fx-text-fill: red;");
        grid.add(errorMessage, 1, 4);

        Button signInButton = new Button("Sign in");
        grid.add(signInButton, 1, 3);

        signInButton.setOnAction(e -> {
            String username = userNameField.getText();
            String password = passwordField.getText();

            if (username.equals(USERNAME) && password.equals(PASSWORD)) {
                showWelcomePage(primaryStage, username);
            } else {
                errorMessage.setText("Password Atau Username Anda Salah!!");
            }
        });

        return grid;
    }

    private void showWelcomePage(Stage primaryStage, String username) {
        VBox vbox = new VBox(25);
        vbox.setAlignment(Pos.CENTER);
        vbox.setPadding(new Insets(30, 30, 30, 30));

        Label welcomeLabel = new Label("Halo selamat datang kembali " + username);
        Button backButton = new Button("Kembali");

        backButton.setOnAction(e -> primaryStage.setScene(new Scene(createPanelLogin(primaryStage), 400, 200)));

        vbox.getChildren().addAll(welcomeLabel, backButton);

        Scene welcomeScene = new Scene(vbox, 500, 300);
        primaryStage.setScene(welcomeScene);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
