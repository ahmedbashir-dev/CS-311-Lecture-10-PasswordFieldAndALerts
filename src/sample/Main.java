package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main extends Application {
    private VBox root;
    private Button submitBtn;
    private PasswordField userPasswordPf;
    private TextField usernameTf;
    private Label usernameLb, passwordLb;
    @Override
    public void start(Stage primaryStage) throws Exception{
        usernameLb = new Label("Username");
        passwordLb = new Label("Password");
        submitBtn = new Button("Submit");
        usernameTf = new TextField();
        usernameTf.setPromptText("Enter Username");
//        usernameTf.setPrefHeight(200);
        userPasswordPf = new PasswordField();
        userPasswordPf.setPromptText("Enter Password");
        root = new VBox();
        root.setSpacing(18);
        root.setPadding(new Insets(20));
        root.getChildren().addAll(usernameLb,usernameTf,passwordLb,userPasswordPf,submitBtn);
        submitBtn.setOnAction(e -> {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("User Account Details");
            alert.setHeaderText("Following are the user account details: ");
            String output = "Username: " + usernameTf.getText() + "\n"
                     + "Password: " + userPasswordPf.getText();
            alert.setContentText(output);
            alert.showAndWait();
        });


        Scene scene = new Scene(root,400,400);
        primaryStage.setTitle("Simple Login Window");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
