package com.example.demo11;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
//import javafx.scene.media.Media;
//import javafx.scene.media.MediaPlayer;
//import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;

import static com.example.demo11.Admin.returnAdminObject;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        BloodBank bank = new BloodBank();
        // Get the screen dimensions
        Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
        double width = screenBounds.getWidth();
        double height = screenBounds.getHeight();

//        //login
//        // Load the video
//        //
//        String videoPath = "file:///C:/Users/Haier/Downloads/WhatsApp%20Video%202024-05-24%20at%202.42.17%20PM.mp4";
//        Media media = new Media(videoPath);
//        MediaPlayer mediaPlayer = new MediaPlayer(media);
//        MediaView mediaView = new MediaView(mediaPlayer);
//
//        mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
//        mediaPlayer.play();
//
//        // Create the header
//        Label headerl = new Label("Blood Management System");
//        headerl.setAlignment(Pos.CENTER);
//        headerl.setFont(Font.font("Times New Roman", FontWeight.BOLD, 50));
//        headerl.setStyle("-fx-text-fill : red; -fx-background-color: transparent; -fx-padding: 10;");
//
//        HBox header1 = new HBox(10, headerl);
//        header1.setAlignment(Pos.CENTER);
//        header1.setPadding(new Insets(10));
//        header1.setStyle("-fx-background-color: transparent");
//
//        // Create the login form
//        TextField username = new TextField();
//        username.setPromptText("Username");
//        username.setMaxHeight(200);
//        username.setMaxWidth(200);
//        username.setStyle("-fx-background-color: white; -fx-text-fill: red;");
//
//        PasswordField passwordField = new PasswordField();
//        passwordField.setPromptText("Password");
//        passwordField.setMaxHeight(200);
//        passwordField.setMaxWidth(200);
//        passwordField.setStyle("-fx-background-color: white; -fx-text-fill: red;");
//
//        Label welcome = new Label("WELCOME!");
//        welcome.setStyle("-fx-text-fill : red; -fx-background-color: transparent; -fx-padding: 10;");
//        welcome.setFont(Font.font("Times New Roman", FontWeight.BOLD, 25));
//        welcome.setPrefSize(200,40);
//
//        Label l1 = new Label("Don't have an account");
//        l1.setStyle("-fx-text-fill : red; -fx-background-color: transparent; -fx-padding: 10;");
//        l1.setFont(Font.font("Times New Roman", FontPosture.ITALIC, 20));
//        l1.setPrefSize(200,40);
//
//        Button b1 = new Button("Login");
//        b1.setStyle("-fx-background-color : red; -fx-text-fill: white;");
//        b1.setPrefSize(200, 40);
//        b1.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 12));
//
//
//        Button b2 = new Button("Signup");
//        b2.setStyle("-fx-background-color : red; -fx-text-fill: white;");
//        b2.setPrefSize(200, 40);
//        b2.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 12));
//
//        GridPane loginGrid = new GridPane();
//        loginGrid.setStyle("-fx-background-color: transparent");
//        loginGrid.setVgap(20);
//        loginGrid.setHgap(20);
//        loginGrid.setAlignment(Pos.CENTER);
//        loginGrid.add(welcome, 1, 0);
//        loginGrid.add(username, 1, 1);
//        loginGrid.add(passwordField, 1, 2);
//        loginGrid.add(b1, 1, 3);
//        loginGrid.add(b2, 1, 5);
//        loginGrid.add(l1, 1, 4);
//
//        VBox loginPane = new VBox();
//        loginPane.getChildren().addAll(header1, loginGrid);
//        loginPane.setPadding(new Insets(20));
//        loginPane.setStyle("-fx-background-color: transparent");
//        VBox.setVgrow(loginGrid, Priority.ALWAYS);
//
//        // Create an AnchorPane and position the video and login form
//        AnchorPane root = new AnchorPane();
//        root.setStyle("-fx-background-color: #C1E4F0;");
//
//        // Position the mediaView on the left side
//        mediaView.setPreserveRatio(true);
//        AnchorPane.setTopAnchor(mediaView, 0.0);
//        AnchorPane.setBottomAnchor(mediaView, 0.0);
//        AnchorPane.setLeftAnchor(mediaView, 0.0);
//        AnchorPane.setRightAnchor(mediaView, width *3); // adjust the width as needed
//
//        // Position the loginPane on the right side
//        AnchorPane.setTopAnchor(loginPane, 0.0);
//        AnchorPane.setBottomAnchor(loginPane, 0.0);
//        AnchorPane.setRightAnchor(loginPane, 0.0);
//        AnchorPane.setLeftAnchor(loginPane, width * 0.5); // adjust the width as needed
//
//        root.getChildren().addAll(mediaView, loginPane);
//
//        Scene loginscene = new Scene(root, width, height);
//        primaryStage.setScene(loginscene);
//        primaryStage.setTitle("Blood Management System");
//        primaryStage.show();
//
//        // Bind MediaView dimensions to the left side of the screen
//        mediaView.fitWidthProperty().bind(root.widthProperty().multiply(1.5));
//        mediaView.fitHeightProperty().bind(root.heightProperty());

//signup



        Label account = new Label("CREATE YOUR ACCOUNT");
        account.setFont(Font.font("Times New Roman",FontWeight.BOLD,28));
        account.setStyle("-fx-text-fill: #edf1f7;");

//       Label FirstName = new Label("First Name");
//        FirstName.setStyle("-fx-text-fill : #edf1f7 ");
//        FirstName.setFont(Font.font("Times New Roman",  FontPosture.ITALIC,22));
        TextField fn = new TextField();
        fn.setPromptText(" Name");
        fn.setStyle("-fx-text-fill: #45665c;");
        fn.setPrefSize(100,35);

//        Label SecondName = new Label("Second Name");
//        SecondName.setStyle("-fx-text-fill : #edf1f7 ");
//        SecondName.setFont(Font.font("Times New Roman", FontPosture.ITALIC,22));
        TextField sn = new TextField();
        sn.setPromptText("Username");
        sn.setStyle("-fx-text-fill: #45665c;");
        sn.setPrefSize(100,35);

//        Label Age = new Label("Age");
//        Age.setStyle("-fx-text-fill : #edf1f7 ");
//        Age.setFont(Font.font("Times New Roman", FontPosture.ITALIC,22));
        TextField ag = new TextField();
        ag.setPromptText("Age");
        ag.setStyle("-fx-text-fill: #45665c;");
        ag.setPrefSize(100,35);


//        Label password = new Label("Password");
//        password.setStyle("-fx-text-fill : #edf1f7 ");
//        password.setFont(Font.font("Times New Roman",FontPosture.ITALIC,22));
        PasswordField pass = new PasswordField();
        pass.setPromptText("Password");
        pass.setStyle("-fx-text-fill: #45665c;");
        pass.setPrefSize(100,35);

//        Label password2 = new Label("Confirm Password");
//        password2.setStyle("-fx-text-fill : #edf1f7 ");
//        password2.setFont(Font.font("Times New Roman", FontPosture.ITALIC,22));
        PasswordField pass2 = new PasswordField();
        pass2.setPromptText("Confirm Password");
        pass2.setStyle("-fx-text-fill: #45665c;");
        pass2.setPrefSize(100,35);

        Label account2 = new Label("Already have an account?");
        account2.setStyle("-fx-text-fill : #edf1f7; ");
        account2.setFont(Font.font("Times New Roman", FontPosture.ITALIC,22));

        Button login2 = new Button("Login");
        login2.setStyle("-fx-background-color :  #9fc9bd;");
        login2.setPrefSize(130,10);
        login2.setFont(Font.font("Times New Roman", FontPosture.ITALIC,22));
        Button signup2 = new Button("Sign up");
        signup2.setStyle("-fx-background-color :  #9fc9bd;");
        signup2.setPrefSize(130,10);
        signup2.setFont(Font.font("Times New Roman", FontPosture.ITALIC,22));
        VBox sign = new VBox();
        sign.getChildren().addAll(signup2,account2,login2);
        login2.setAlignment(Pos.CENTER);
        signup2.setAlignment(Pos.CENTER);
        sign.setPadding(new Insets(10));
        sign.setSpacing(10);

        GridPane signup = new GridPane();
        signup.setStyle("-fx-background-color: #45665c;");
        signup.setVgap(20);
        signup.setHgap(20);
        signup.setAlignment(Pos.CENTER);

        signup.add(account, 0, 0, 2, 1);
        signup.add(fn, 1, 1);
        signup.add(sn, 1, 2);
        signup.add(ag, 1, 3);
        signup.add(pass, 1, 4);
        signup.add(pass2, 1, 5);

        signup.setAlignment(Pos.CENTER);

        Image userIcon1 = new Image("file:\\C:\\Users\\Lenovo T480s\\Downloads\\UserAdmin-removebg-preview.png"); // Update the path to your user icon
        ImageView userIconView1 = new ImageView(userIcon1);
        userIconView1.setFitWidth(130); // Adjust the size as needed
        userIconView1.setFitHeight(140);
        userIconView1.setPreserveRatio(true);

        VBox s = new VBox();
        s.getChildren().addAll(userIconView1,signup,sign);
        s.setAlignment(Pos.CENTER);
        s.setPadding(new Insets(10));
        sign.setAlignment(Pos.CENTER);

        s.setStyle("-fx-background-color: #45665c");

        StackPane s1 = new StackPane();
        s1.getChildren().addAll(s);
        s1.setStyle("-fx-background-color: #45665c");
        Scene signupPane = new Scene(s1,screenBounds.getHeight(),screenBounds.getWidth());
        //primaryStage.setScene(signupPane);


        // Create the menu on the left side
        VBox menu = new VBox(3);

        menu.setStyle("-fx-background-color: #5c050c;");

        // Add a user icon to the menu
        Image userIcon = new Image("file:\\C:\\Users\\Lenovo T480s\\Downloads\\UserAdmin-removebg-preview.png"); // Update the path to your user icon
        ImageView userIconView = new ImageView(userIcon);
        userIconView.setFitWidth(130); // Adjust the size as needed
        userIconView.setFitHeight(140);
        userIconView.setPreserveRatio(true);

        // Add buttons to the menu
        Button donor = new Button("Donor");
        donor.setPrefWidth(150);
        donor.setPrefHeight(80);
        donor.setStyle("-fx-text-fill: faf9f7; -fx-background-color: #5c050c;");
        donor.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 18));

        Button recipients = new Button("Recipient");
        recipients.setPrefWidth(150);
        recipients.setPrefHeight(80);
        recipients.setStyle("-fx-text-fill: faf9f7; -fx-background-color: #5c050c;");
        recipients.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 18));

        Button bloodbank = new Button("Bloodbag");
        bloodbank.setStyle("-fx-text-fill: faf9f7; -fx-background-color: #5c050c;");
        bloodbank.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 18));
        bloodbank.setPrefWidth(150);
        bloodbank.setPrefHeight(80);

        Button viewDetails = new Button(" View Data");
        viewDetails.setStyle("-fx-text-fill: faf9f7; -fx-background-color: #5c050c;");
        viewDetails.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 18));
        viewDetails.setPrefWidth(150);
        viewDetails.setPrefHeight(80);

        Button PerformTransfusion = new Button(" Transfusion");
        PerformTransfusion.setStyle("-fx-text-fill: faf9f7; -fx-background-color: #5c050c;");
        PerformTransfusion.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 18));
        PerformTransfusion.setPrefWidth(150);
        PerformTransfusion.setPrefHeight(80);

        Button BloodRequest = new Button("Blood Request");
        BloodRequest.setStyle("-fx-text-fill: faf9f7; -fx-background-color: #5c050c;");
        BloodRequest.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 18));
        BloodRequest.setPrefWidth(150);
        BloodRequest.setPrefHeight(80);


        Button Logout = new Button(" Logout");
        Logout.setStyle("-fx-text-fill: faf9f7; -fx-background-color: #5c050c;");
        Logout.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 18));
        Logout.setPrefWidth(100);
        Logout.setPrefHeight(80);


        // Add the user icon and buttons to the VBox
        menu.getChildren().addAll(userIconView, donor, recipients, bloodbank, PerformTransfusion, BloodRequest, viewDetails, Logout);


        Image image = new Image("file:\\C:\\Users\\Lenovo T480s\\Downloads\\Main-removebg-preview.png");
        ImageView imageView = new ImageView(image);
        imageView.setPreserveRatio(true);
        imageView.setFitHeight(screenBounds.getHeight() - 200); // Adjust the height to fit the screen
        imageView.setFitWidth(screenBounds.getWidth() - 200); // Adjust width to fit screen, minus the menu width

        // Create a BorderPane to hold the menu and the image


        Text animatedText = new Text("Welcome to Blood Management System");
        animatedText.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 40));
        animatedText.setStyle("-fx-text-fill: #a81421;");


        // Set up the animation
        TranslateTransition transition = new TranslateTransition(Duration.seconds(2), animatedText);
        transition.setFromX(-animatedText.getLayoutBounds().getWidth()); // Start from off-screen
        transition.setToX(20); // Move to just left of center
        transition.setCycleCount(1);
        transition.setAutoReverse(false);
        transition.play();

        StackPane stackPane = new StackPane();
        // Add the animated text to the stack pane
        stackPane.getChildren().addAll(imageView, animatedText);
        StackPane.setAlignment(animatedText, Pos.TOP_CENTER);


        // Create a FadeTransition for the text

        AnchorPane leftpane = new AnchorPane();
        leftpane.setStyle("-fx-background-color: #5c050c;");
        leftpane.getChildren().add(menu);
        SplitPane splitPane = new SplitPane();
        StackPane rightpane = new StackPane();
        rightpane.getChildren().add(stackPane);
        splitPane.getItems().addAll(leftpane, rightpane);
        splitPane.setDividerPositions(0.235);
        // Create a StackPane to overlay the text on the image


        // Create the scene with the screen dimensions
        Scene sceneMenue = new Scene(splitPane, screenBounds.getWidth(), screenBounds.getHeight());


        // Set the stage to fit the entire screen
        primaryStage.setTitle("Blood Management System");
        primaryStage.setX(screenBounds.getMinX());
        primaryStage.setY(screenBounds.getMinY());
        primaryStage.setWidth(screenBounds.getWidth());
        primaryStage.setHeight(screenBounds.getHeight());


        // Show the stage
        primaryStage.show();


//MANAGE DONOR

        Label managedonor = new Label("Manage Donors");
        managedonor.setStyle("-fx-text-fill: #700f17;");
        managedonor.setFont(Font.font("Times New Roman", FontPosture.ITALIC, 40));

        Button adddonor = new Button(" Add Donor ");
        adddonor.setStyle("-fx-background-color: #700f17; -fx-text-fill: faf9f7;");
        adddonor.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 18));
        adddonor.setPrefWidth(200);
        adddonor.setPrefHeight(50);

        Button removedonor = new Button(" Remove Donor ");
        removedonor.setStyle("-fx-background-color: #700f17; -fx-text-fill: faf9f7;");
        removedonor.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 18));
        removedonor.setPrefWidth(200);
        removedonor.setPrefHeight(50);

        Button updatedonor = new Button(" Update Donor ");
        updatedonor.setStyle("-fx-background-color: #700f17; -fx-text-fill: faf9f7;");
        updatedonor.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 18));
        updatedonor.setPrefWidth(200);
        updatedonor.setPrefHeight(50);

        Button searchdonor = new Button(" Search Donor ");
        searchdonor.setStyle("-fx-background-color: #700f17; -fx-text-fill: faf9f7;");
        searchdonor.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 18));
        searchdonor.setPrefWidth(200);
        searchdonor.setPrefHeight(50);

        Button searchsamedonor = new Button(" Same Donor Search ");
        searchsamedonor.setStyle("-fx-background-color: #700f17; -fx-text-fill: white;");
        searchsamedonor.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 18));
        searchsamedonor.setPrefWidth(200);
        searchsamedonor.setPrefHeight(50);

        VBox donorbox = new VBox(20); // Add spacing between items
        donorbox.setAlignment(Pos.CENTER); // Center align VBox content
        donorbox.getChildren().addAll(managedonor, adddonor, removedonor, updatedonor, searchdonor, searchsamedonor);
        // Set background color of VBox
        Image hope = new Image("file:\\C:\\Users\\Lenovo T480s\\Downloads\\ManageDonors-removebg-preview.png");
        ImageView iv = new ImageView(hope);
        iv.setFitWidth(600); // Adjust the size as needed
        iv.setFitHeight(600);
        iv.setPreserveRatio(true);
        HBox hbox = new HBox();
        hbox.setAlignment(Pos.CENTER); // Center align HBox content
        hbox.getChildren().addAll(donorbox, iv);
        hbox.setStyle("-fx-background-color: white;");
// Create the StackPane to contain the HBox
        StackPane sp2 = new StackPane();
        sp2.getChildren().add(hbox);
        sp2.setStyle("-fx-background-color: white;");

// Set alignment of the HBox within the StackPane
        StackPane.setAlignment(hbox, Pos.CENTER);

// Create the scene with the StackPane as the root
        Scene scene1 = new Scene(sp2, screenBounds.getWidth(), screenBounds.getHeight());


// MANAGE REC
        Label manage = new Label("Manage Recipient");
        manage.setStyle("-fx-text-fill: #0a0a45;");
        manage.setFont(Font.font("Times New Roman", FontPosture.ITALIC, 40));

        Button addrec = new Button(" Add Recipient ");
        addrec.setStyle("-fx-background-color: #0a0a45; -fx-text-fill: faf9f7;");
        addrec.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 18));
        addrec.setPrefWidth(200);
        addrec.setPrefHeight(50);

        Button removerec = new Button(" Remove Recipient ");
        removerec.setStyle("-fx-background-color: #0a0a45; -fx-text-fill: faf9f7;");
        removerec.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 18));
        removerec.setPrefWidth(200);
        removerec.setPrefHeight(50);

        Button updaterec = new Button(" Update Recipient ");
        updaterec.setStyle("-fx-background-color: #0a0a45; -fx-text-fill: faf9f7;");
        updaterec.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 18));
        updaterec.setPrefWidth(200);
        updaterec.setPrefHeight(50);

        Button searchrec = new Button(" Search Recipient ");
        searchrec.setStyle("-fx-background-color: #0a0a45; -fx-text-fill: white;");
        searchrec.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 18));
        searchrec.setPrefWidth(200);
        searchrec.setPrefHeight(50);

        VBox recbox = new VBox(20); // Add spacing between items
        recbox.setAlignment(Pos.CENTER); // Center align VBox content
        recbox.getChildren().addAll(manage, addrec, removerec, updaterec, searchrec);
        // Set background color of VBox
        Image recipeintIllustration = new Image("file:\\C:\\Users\\Lenovo T480s\\Downloads\\ManageRecipient-removebg-preview.png");
        ImageView iv2 = new ImageView(recipeintIllustration);
        iv2.setFitWidth(500); // Adjust the size as needed
        iv2.setFitHeight(500);
        iv2.setPreserveRatio(true);
        HBox hbox1 = new HBox();
        hbox1.setAlignment(Pos.CENTER); // Center align HBox content
        hbox1.getChildren().addAll(recbox, iv2);
        hbox1.setStyle("-fx-background-color: #faf9f7;");
// Create the StackPane to contain the HBox
        StackPane sp3 = new StackPane();
        sp3.getChildren().add(hbox1);
        sp3.setStyle("-fx-background-color: #faf9f7;");

// Set alignment of the HBox within the StackPane
        StackPane.setAlignment(hbox1, Pos.CENTER);

// Create the scene with the StackPane as the root
        Scene scene6 = new Scene(sp3, screenBounds.getWidth(), screenBounds.getHeight());


        // MANAGE BLOODBAG
        Label managebb = new Label("Manage BloodBag");
        managebb.setFont(Font.font("Times New Roman", FontPosture.ITALIC, 40));
        managebb.setStyle("-fx-text-fill:  #570a45; ");

        Button addBB = new Button(" Add BloodBag");
        addBB.setPrefWidth(200);
        addBB.setPrefHeight(50);
        addBB.setStyle("-fx-background-color: #570a45; -fx-text-fill: faf9f7;");
        addBB.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 18));

        Button removeBB = new Button(" Remove BloodBag");
        removeBB.setPrefWidth(200);
        removeBB.setPrefHeight(50);
        removeBB.setStyle("-fx-background-color: #570a45; -fx-text-fill: faf9f7;");
        removeBB.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 18));

        Button updateBB = new Button(" Update BloodBag");
        updateBB.setPrefWidth(200);
        updateBB.setPrefHeight(50);
        updateBB.setStyle("-fx-background-color: #570a45; -fx-text-fill: faf9f7;");
        updateBB.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 18));

        Button searchBB = new Button(" Search BloodBag");
        searchBB.setPrefWidth(200);
        searchBB.setPrefHeight(50);
        searchBB.setStyle("-fx-background-color: #570a45; -fx-text-fill: faf9f7;");
        searchBB.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 18));

        VBox bbbox = new VBox(20); // Add spacing between items
        bbbox.setAlignment(Pos.CENTER); // Center align VBox content
        bbbox.getChildren().addAll(managebb, addBB, removeBB, updateBB, searchBB);
        // Set background color of VBox
        Image bbIllustration = new Image("file:\\C:\\Users\\Lenovo T480s\\Downloads\\ManageBloodBag-removebg-preview.png");
        ImageView iv3 = new ImageView(bbIllustration);
        iv3.setFitWidth(500); // Adjust the size as needed
        iv3.setFitHeight(500);
        iv3.setPreserveRatio(true);
        HBox hbox2 = new HBox();
        hbox2.setAlignment(Pos.CENTER); // Center align HBox content
        hbox2.getChildren().addAll(bbbox, iv3);
        hbox2.setStyle("-fx-background-color: #faf9f7;");
// Create the StackPane to contain the HBox
        StackPane sp4 = new StackPane();
        sp4.getChildren().add(hbox2);
        sp4.setStyle("-fx-background-color: #faf9f7;");

// Set alignment of the HBox within the StackPane
        StackPane.setAlignment(hbox2, Pos.CENTER);

// Create the scene with the StackPane as the root
        Scene scene7 = new Scene(sp4, screenBounds.getWidth(), screenBounds.getHeight());

//manage reports

        Label manageReport = new Label("View Reports");
        manageReport.setFont(Font.font("Times New Roman", FontPosture.ITALIC, 40));
        manageReport.setStyle("-fx-text-fill:  #4f2c15; ");

        Button donorReport = new Button(" Donor Report");
        donorReport.setPrefWidth(200);
        donorReport.setPrefHeight(50);
        donorReport.setStyle("-fx-background-color: #4f2c15; -fx-text-fill: faf9f7;");
        donorReport.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 18));

        Button recReport = new Button(" Recipient Report");
        recReport.setPrefWidth(200);
        recReport.setPrefHeight(50);
        recReport.setStyle("-fx-background-color: #4f2c15; -fx-text-fill: faf9f7;");
        recReport.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 18));

        Button inventReport = new Button(" Inventory Report");
        inventReport.setPrefWidth(200);
        inventReport.setPrefHeight(50);
        inventReport.setStyle("-fx-background-color: #4f2c15; -fx-text-fill: faf9f7;");
        inventReport.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 18));

        Button requestedbloodreport = new Button("  Requests Report");
        requestedbloodreport.setPrefWidth(200);
        requestedbloodreport.setPrefHeight(50);
        requestedbloodreport.setStyle("-fx-background-color: #4f2c15; -fx-text-fill: faf9f7;");
        requestedbloodreport.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 18));


        VBox Rbox = new VBox(20); // Add spacing between items
        Rbox.setAlignment(Pos.CENTER); // Center align VBox content
        Rbox.getChildren().addAll(manageReport, donorReport, recReport, inventReport, requestedbloodreport);


        Image ReportIllustration = new Image("file:\\C:\\Users\\Lenovo T480s\\Downloads\\view_details-removebg-preview.png");
        ImageView iv4 = new ImageView(ReportIllustration);
        iv4.setFitWidth(600); // Adjust the size as needed
        iv4.setFitHeight(600);
        iv4.setPreserveRatio(true);
        HBox hbox3 = new HBox();
        hbox3.setAlignment(Pos.CENTER); // Center align HBox content
        hbox3.getChildren().addAll(Rbox, iv4);
        hbox3.setStyle("-fx-background-color: #faf9f7;");
// Create the StackPane to contain the HBox
        StackPane sp5 = new StackPane();
        sp5.getChildren().add(hbox3);
        sp5.setStyle("-fx-background-color: #faf9f7;");

// Set alignment of the HBox within the StackPane
        StackPane.setAlignment(hbox3, Pos.CENTER);

// Create the scene with the StackPane as the root
        Scene scene10 = new Scene(sp5, screenBounds.getWidth(), screenBounds.getHeight());

// ADD DONOR
        Label l2 = new Label("Add Donor Details");
        l2.setStyle("-fx-text-fill: #700f17; ");
        l2.setFont(Font.font("Times New Roman", FontPosture.ITALIC, 24));
        Label id = new Label("ID  ");
        id.setStyle("-fx-text-fill: #700f17; ");
        id.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 18));
        TextField id1 = new TextField();
        id1.setStyle("-fx-background-color: #700f17; -fx-text-fill: #fafbfc;");
        id1.setMaxHeight(900);
        id1.setMaxWidth(900);

        Label name = new Label("Name  ");
        name.setStyle("-fx-text-fill: #700f17; ");
        name.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 18));
        TextField name1 = new TextField();
        name1.setStyle("-fx-background-color: #700f17; -fx-text-fill: #fafbfc;");
        name1.setMaxHeight(900);
        name1.setMaxWidth(900);

        Label age = new Label("Age  ");
        age.setStyle("-fx-text-filhomel: #700f17; ");
        age.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 18));
        TextField age1 = new TextField();
        age1.setStyle("-fx-background-color: #700f17; -fx-text-fill: #fafbfc; ");
        age1.setMaxHeight(900);
        age1.setMaxWidth(900);

        Label country = new Label("Country  ");
        country.setStyle("-fx-text-fill: #700f17; ");
        country.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 18));
        TextField country1 = new TextField();
        country1.setStyle("-fx-background-color: #700f17; -fx-text-fill: #fafbfc; ");
        country1.setMaxHeight(900);
        country1.setMaxWidth(900);

        Label city = new Label("City  ");
        city.setStyle("-fx-text-fill: #700f17; ");
        city.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 18));

        TextField city1 = new TextField();
        city1.setStyle("-fx-background-color: #700f17; -fx-text-fill: #fafbfc;");
        city1.setMaxHeight(900);
        city1.setMaxWidth(900);

        Label phone = new Label("Phone  ");
        phone.setStyle("-fx-text-fill: #700f17; ");
        phone.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 18));
        TextField phone1 = new TextField();
        phone1.setStyle("-fx-background-color: #700f17; -fx-text-fill: #fafbfc;");
        phone1.setMaxHeight(900);
        phone1.setMaxWidth(900);

        Label email = new Label("Email  ");
        email.setStyle("-fx-text-fill: #700f17; ");
        email.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 18));
        TextField email1 = new TextField();
        email1.setStyle("-fx-background-color: #700f17; -fx-text-fill: #fafbfc; ");
        email1.setMaxHeight(900);
        email1.setMaxWidth(900);

        Label bg = new Label("BloodGroup  ");
        bg.setStyle("-fx-text-fill: #700f17; ");
        bg.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 18));
        ChoiceBox<String> bg1 = new ChoiceBox<>();
        bg1.getItems().addAll("A", "B", "AB", "O");
        bg1.setPrefSize(269, 37);
        bg1.setStyle("-fx-background-color: #700f17; ");



        Label rh = new Label("RH-Factor  ");
        rh.setStyle("-fx-text-fill: #700f17; ");
        rh.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 18));

        ChoiceBox<String> rh1 = new ChoiceBox<>();
        rh1.getItems().addAll("+", "-");
        rh1.setPrefSize(269, 37);
        rh1.setStyle("-fx-background-color: #570a45; ");
        rh1.setStyle("-fx-background-color: #700f17; ");
        rh1.setMaxHeight(900);
        rh1.setMaxWidth(900);


        Button addBTN = new Button("ADD");
        addBTN.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 18));
        addBTN.setStyle("-fx-text-fill: #edf1f7;  -fx-background-color: #700f17; ");


        GridPane donorGrid = new GridPane();
        donorGrid.setPadding(new Insets(20));
        donorGrid.setHgap(10);
        donorGrid.setVgap(10);
        donorGrid.add(l2, 0, 0, 2, 1);
        GridPane.setHalignment(l2, HPos.CENTER);
        donorGrid.add(id, 0, 1);
        donorGrid.add(id1, 1, 1);
        donorGrid.add(name, 0, 2);
        donorGrid.add(name1, 1, 2);
        donorGrid.add(age, 0, 3);
        donorGrid.add(age1, 1, 3);
        donorGrid.add(country, 0, 4);
        donorGrid.add(country1, 1, 4);
        donorGrid.add(city, 0, 5);
        donorGrid.add(city1, 1, 5);
        donorGrid.add(phone, 0, 6);
        donorGrid.add(phone1, 1, 6);
        donorGrid.add(email, 0, 7);
        donorGrid.add(email1, 1, 7);
        donorGrid.add(bg, 0, 8);
        donorGrid.add(bg1, 1, 8);
        donorGrid.add(rh, 0, 9);
        donorGrid.add(rh1, 1, 9);
        donorGrid.add(addBTN, 0, 10, 2, 1);
        donorGrid.setAlignment(Pos.CENTER_RIGHT);

// Create a VBox to contain the GridPane
        VBox Dbox = new VBox(20);
        Dbox.setAlignment(Pos.CENTER);
        Dbox.getChildren().add(donorGrid);

// Load the background image
        Image image4 = new Image("file:\\C:\\Users\\Lenovo T480s\\Downloads\\Donor-removebg-preview.png");
        ImageView imageview4 = new ImageView(image4);
        imageview4.setFitWidth(700); // Adjust the size as needed
        imageview4.setFitHeight(700);
        imageview4.setPreserveRatio(true);

// Create an HBox to position the VBox containing the donor grid
        HBox hbox4 = new HBox();
        hbox4.setAlignment(Pos.CENTER_RIGHT); // Align content to the right
        hbox4.getChildren().addAll(Dbox);
        hbox4.setPadding(new Insets(20)); // Optional: add padding if needed

// Create the StackPane to overlay the VBox on the image
        StackPane sp6 = new StackPane();
        sp6.getChildren().addAll(imageview4, hbox4);
        //sp6.setStyle("-fx-background-color: #cfa1a8;");

// Set alignment of the HBox within the StackPane
        StackPane.setAlignment(hbox4, Pos.TOP_CENTER);
        StackPane.setAlignment(imageview4, Pos.CENTER_LEFT);


// Create the scene with the StackPane as the root
        Scene scene2 = new Scene(sp6, screenBounds.getWidth(), screenBounds.getHeight());
// REMOVE DONOR

        Label instructionLabel = new Label("Enter the name of donor you want to remove:");
        instructionLabel.setStyle("-fx-text-fill: #700f17;");
        instructionLabel.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));


        Label dname1 = new Label("Name: ");
        dname1.setStyle("-fx-text-fill: #700f17; ");
        dname1.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));

        TextField dname2 = new TextField();
        dname2.setStyle("-fx-background-color: #700f17;  -fx-text-fill: #fafbfc;");
        dname2.setPrefWidth(157);
        dname2.setPrefHeight(30);

        Button dremove = new Button("Remove Donor");
        dremove.setStyle("-fx-text-fill:  #edf1f7; -fx-background-color: #700f17;");
        dremove.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 18));
        dremove.setPrefWidth(157);
        dremove.setPrefHeight(30);


        // GridPane configuration
        HBox namebox = new HBox();
        namebox.getChildren().addAll(dname1, dname2);
        namebox.setAlignment(Pos.CENTER_RIGHT);


        HBox btnbox = new HBox();
        btnbox.getChildren().add(dremove);
        btnbox.setAlignment(Pos.CENTER_RIGHT);

        VBox hbox5 = new VBox(20); // HBox for the VBox containing the label and text field and VBox containing buttons
        hbox5.setAlignment(Pos.CENTER_RIGHT); // Aligning to the extreme right
        hbox5.getChildren().addAll(instructionLabel, namebox, btnbox);
        hbox5.setPadding(new Insets(10, 60, 50, 80));

        Image image5 = new Image("file:\\C:\\Users\\Lenovo T480s\\Downloads\\Donor-removebg-preview.png");
        ImageView imageview5 = new ImageView(image5);
        imageview5.setFitWidth(700); // Adjust the size as needed
        imageview5.setFitHeight(700);
        imageview5.setPreserveRatio(true);


// Create the StackPane to overlay the VBox on the image
        StackPane sp8 = new StackPane();
        sp8.getChildren().addAll(imageview5, hbox5);
        // sp8.setStyle("-fx-background-color: #cfa1a8;");

// Set alignment of the HBox within the StackPane
        // Aligning hbox7 to the bottom right
        StackPane.setAlignment(hbox5, Pos.CENTER_RIGHT); // Aligning hbox5 to the baseline right
        StackPane.setAlignment(imageview5, Pos.CENTER_LEFT);

        Scene scene3 = new Scene(sp8, screenBounds.getHeight(), screenBounds.getWidth());
        //UPDATE DONOR

        //Label D1S = new Label("Update Donor");
        // D1S.setStyle("-fx-text-fill: #700f17; ");
        // D1S.setFont(Font.font("Times New Roman", FontPosture.ITALIC,28));

        Label D2S = new Label("Enter the name to update:");
        D2S.setStyle("-fx-text-fill: #700f17; ");
        D2S.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 26));

        VBox info = new VBox();
        info.getChildren().add(D2S);
        info.setAlignment(Pos.CENTER_RIGHT);

        Label DonorNameS = new Label("Name : ");
        DonorNameS.setStyle("-fx-text-fill: #700f17; ");
        DonorNameS.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 22));

        TextField DonorName1S = new TextField();
        DonorName1S.setStyle("-fx-background-color: #700f17;-fx-text-fill: #fafbfc; ");
        DonorName1S.setPrefHeight(20);
        DonorName1S.setPrefWidth(160);

        HBox info1 = new HBox(30);
        info1.getChildren().addAll(DonorNameS, DonorName1S);
        info1.setAlignment(Pos.CENTER_RIGHT);


        Label D3S = new Label("Write the info to update:");
        D3S.setStyle("-fx-text-fill: #700f17; ");
        D3S.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 26));

        Label DNameS = new Label("Name : ");
        DNameS.setStyle("-fx-text-fill: #700f17; ");
        DNameS.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 22));
        TextField DNameS1 = new TextField();
        DNameS1.setStyle("-fx-background-color: #700f17; -fx-text-fill: #fafbfc;");
        DNameS1.setMaxHeight(900);
        DNameS1.setMaxWidth(900);

        Label DonorAgeS = new Label("Age : ");
        DonorAgeS.setStyle("-fx-text-fill: #700f17; ");
        DonorAgeS.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 22));
        TextField DonorAgeS1 = new TextField();
        DonorAgeS1.setStyle("-fx-background-color: #700f17; -fx-text-fill: #fafbfc; ");
        DonorAgeS1.setMaxHeight(900);
        DonorAgeS1.setMaxWidth(900);


        Label DonorCityS = new Label("City: ");
        DonorCityS.setStyle("-fx-text-fill: #700f17; ");
        DonorCityS.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 22));
        TextField DonorCityS1 = new TextField();
        DonorCityS1.setStyle("-fx-background-color: #700f17; -fx-text-fill: #fafbfc;");
        DonorCityS1.setMaxHeight(900);
        DonorCityS1.setMaxWidth(900);

        Label DonorCountryS = new Label("Country: ");
        DonorCountryS.setStyle("-fx-text-fill: #700f17; ");
        DonorCountryS.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 22));
        TextField DonorCountryS1 = new TextField();
        DonorCountryS1.setStyle("-fx-background-color: #700f17; -fx-text-fill: #fafbfc;");
        DonorCountryS1.setMaxHeight(900);
        DonorCountryS1.setMaxWidth(900);


        Button addS3 = new Button("Update");
        addS3.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 22));
        addS3.setStyle("-fx-text-fill: #edf1f7;  -fx-background-color: #700f17; ");
// alert msg



        GridPane Grid = new GridPane();
        Grid.setPadding(new Insets(20));
        Grid.setHgap(10);
        Grid.setVgap(10);
        Grid.add(DNameS, 0, 1);
        Grid.add(DNameS1, 1, 1);
        Grid.add(DonorAgeS, 0, 2);
        Grid.add(DonorAgeS1, 1, 2);
        Grid.add(DonorCityS, 0, 3);
        Grid.add(DonorCityS1, 1, 3);
        Grid.add(DonorCountryS, 0, 4);
        Grid.add(DonorCountryS1, 1, 4);
        Grid.add(addS3, 0, 10, 1, 1);
        GridPane.setHalignment(addS3, HPos.CENTER);
        Grid.setAlignment(Pos.CENTER_RIGHT);
        Grid.setHgap(12);
        Grid.setVgap(12);

        VBox info2 = new VBox(20);
        info2.getChildren().addAll(info, info1, D3S, Grid);
        info2.setPadding(new Insets(10, 60, 50, 80));
        info2.setAlignment(Pos.CENTER_RIGHT);


        Image image6 = new Image("file:\\C:\\Users\\Lenovo T480s\\Downloads\\Donor-removebg-preview.png");
        ImageView imageview6 = new ImageView(image6);
        imageview6.setFitWidth(700); // Adjust the size as needed
        imageview6.setFitHeight(700);
        imageview6.setPreserveRatio(true);


// Create the StackPane to overlay the VBox on the image
        StackPane sp9 = new StackPane();
        sp9.getChildren().addAll(imageview6, info2);
        //sp9.setStyle("-fx-background-color: #cfa1a8;");


// Set alignment of the HBox within the StackPane
        StackPane.setAlignment(hbox5, Pos.CENTER_RIGHT);
        StackPane.setAlignment(imageview6, Pos.CENTER_LEFT);
        Scene scene3S = new Scene(sp9, screenBounds.getHeight(), screenBounds.getWidth());

//DONOR SEARCHHHH

        Label SearchDonorS1 = new Label("Search Donor");
        SearchDonorS1.setFont(Font.font("Times New Roman", FontPosture.ITALIC, 28));
        SearchDonorS1.setTextFill(Color.web("#700f17"));
        HBox search = new HBox();
        search.getChildren().add(SearchDonorS1);
        search.setAlignment(Pos.CENTER_RIGHT);


        Label DonorNameLabelS = new Label("Name:");
        DonorNameLabelS.setFont(Font.font("Times New Roman", 22));
        DonorNameLabelS.setTextFill(Color.web("#700f17"));

        TextField DonorNameLabelS1 = new TextField();
        DonorNameLabelS1.setStyle("-fx-background-color: #700f17; -fx-text-fill: #fafbfc; ");
        DonorNameLabelS1.setPrefHeight(30);
        DonorNameLabelS1.setPrefWidth(160);


        Button SearchS4 = new Button("Search");
        SearchS4.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));
        SearchS4.setStyle("-fx-text-fill: #edf1f7;  -fx-background-color: #700f17;  ");

//                alert msg

        Button homeS6 = new Button(" HOME");
        homeS6.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));
        homeS6.setStyle("-fx-text-fill: #edf1f7;  -fx-background-color: #700f17; ");
        HBox buttons = new HBox(40);
        buttons.getChildren().addAll(SearchS4, homeS6);
        buttons.setAlignment(Pos.CENTER_RIGHT);
        //buttons.setPadding(new Insets(30));
        HBox searchv = new HBox(20);
        searchv.getChildren().addAll(DonorNameLabelS, DonorNameLabelS1);
        searchv.setAlignment(Pos.CENTER_RIGHT);
        VBox together = new VBox(20);
        together.getChildren().addAll(search, searchv, buttons);
        together.setAlignment(Pos.CENTER_RIGHT);
        together.setPadding(new Insets(30));

        Image image7 = new Image("file:\\C:\\Users\\Lenovo T480s\\Downloads\\Donor-removebg-preview.png");
        ImageView imageview7 = new ImageView(image7);
        imageview7.setFitWidth(700); // Adjust the size as needed
        imageview7.setFitHeight(700);
        imageview7.setPreserveRatio(true);


// Create the StackPane to overlay the VBox on the image
        StackPane sp10 = new StackPane();
        sp10.getChildren().addAll(imageview7, together);
        //sp10.setStyle("-fx-background-color: #cfa1a8;");


// Set alignment of the HBox within the StackPane
        StackPane.setAlignment(together, Pos.CENTER_RIGHT);
        StackPane.setAlignment(imageview7, Pos.CENTER_LEFT);
        Scene scene6S = new Scene(sp10, screenBounds.getHeight(), screenBounds.getWidth());

        // DONOR SEARCH OUTPUTT
        Label DonorLabelS1 = new Label(" Donor ");
        DonorLabelS1.setStyle("-fx-text-fill: #700f17; ");
        DonorLabelS1.setFont(Font.font("Times New Roman", FontPosture.ITALIC, 30));
        DonorLabelS1.setAlignment(Pos.CENTER_RIGHT);


        Label DonoridLabelS = new Label("Donor ID : ");
        DonoridLabelS.setStyle("-fx-text-fill: #700f17; ");
        DonoridLabelS.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));
        DonoridLabelS.setAlignment(Pos.CENTER_RIGHT);

        Label DonoridLabelS1 = new Label();
        DonoridLabelS1.setStyle("-fx-text-fill: #700f17; ");
        DonoridLabelS1.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));
        DonoridLabelS1.setAlignment(Pos.CENTER_RIGHT);

        Label DonornameS = new Label("Name : ");
        DonornameS.setStyle("-fx-text-fill: #700f17; ");
        DonornameS.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));
        DonornameS.setAlignment(Pos.CENTER_RIGHT);


        Label DonornameS1 = new Label();
        DonornameS1.setStyle("-fx-text-fill: #700f17; ");
        DonornameS1.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));
        DonornameS1.setAlignment(Pos.CENTER_RIGHT);

        Label DonorBloodGrpS = new Label("Blood Group: ");
        DonorBloodGrpS.setStyle("-fx-text-fill: #700f17; ");
        DonorBloodGrpS.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));
        DonorBloodGrpS.setAlignment(Pos.CENTER_RIGHT);

        Label DonorBloodGrpS1 = new Label();
        DonorBloodGrpS1.setStyle("-fx-text-fill: #700f17; ");
        DonorBloodGrpS1.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));
        DonorBloodGrpS1.setAlignment(Pos.CENTER_RIGHT);

        Label DonorContactNumS = new Label("Contact Number: ");
        DonorContactNumS.setStyle("-fx-text-fill: #700f17; ");
        DonorContactNumS.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));
        DonorContactNumS.setAlignment(Pos.CENTER_RIGHT);

        Label DonorContactNumS1 = new Label();
        DonorContactNumS1.setStyle("-fx-text-fill: #700f17; ");
        DonorContactNumS1.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));
        DonorContactNumS1.setAlignment(Pos.CENTER_RIGHT);

        Label DonorEmailS = new Label("E-mail : ");
        DonorEmailS.setStyle("-fx-text-fill: #700f17; ");
        DonorEmailS.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));
        DonorEmailS.setAlignment(Pos.CENTER_RIGHT);

        Label DonorEmailS1 = new Label();
        DonorEmailS1.setStyle("-fx-text-fill: #700f17; ");
        DonorEmailS1.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));
        DonorEmailS1.setAlignment(Pos.CENTER_RIGHT);

        Label DonorAddressS = new Label("Address: ");
        DonorAddressS.setStyle("-fx-text-fill: #700f17; ");
        DonorAddressS.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));
        DonorAddressS.setAlignment(Pos.CENTER_RIGHT);

        Label DonorAddressS1 = new Label();
        DonorAddressS1.setStyle("-fx-text-fill: #700f17; ");
        DonorAddressS1.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));
        DonorAddressS1.setAlignment(Pos.CENTER_RIGHT);



        Button home9S = new Button(" HOME");
        home9S.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));
        home9S.setStyle("-fx-text-fill: #edf1f7;  -fx-background-color: #700f17; ");
        home9S.setAlignment(Pos.CENTER);



        GridPane gp9S = new GridPane();
        gp9S.add(DonorLabelS1, 0, 3);
        gp9S.add(DonornameS, 0, 5);
        gp9S.add(DonornameS1, 1, 5);
        gp9S.add(DonoridLabelS, 0, 6);
        gp9S.add(DonoridLabelS1, 1, 6);
        gp9S.add(DonorBloodGrpS, 0, 7);
        gp9S.add(DonorBloodGrpS1, 1, 7);
        gp9S.add(DonorContactNumS, 0, 8);
        gp9S.add(DonorContactNumS1, 1, 8);
        gp9S.add(DonorEmailS, 0, 9);
        gp9S.add(DonorEmailS1, 1, 9);
        gp9S.add(DonorAddressS, 0, 10);
        gp9S.add(DonorAddressS1, 1, 10);
        gp9S.add(home9S, 30, 14);
        gp9S.setHgap(12);
        gp9S.setVgap(12);
        gp9S.setPadding(new Insets(0));
        gp9S.setAlignment(Pos.CENTER_RIGHT);
        //gp9S.setAlignment(Pos.BOTTOM_RIGHT);
        Image image8 = new Image("file:\\C:\\Users\\Lenovo T480s\\Downloads\\Donor-removebg-preview.png");
        ImageView imageview8 = new ImageView(image8);
        imageview8.setFitWidth(200); // Adjust the size as needed
        imageview8.setFitHeight(200);
        imageview8.setPreserveRatio(true);


// Create the StackPane to overlay the VBox on the image
        StackPane sp11 = new StackPane();
        sp11.getChildren().addAll(imageview8, gp9S);
        //sp11.setStyle("-fx-background-color: #cfa1a8;");


// Set alignment of the HBox within the StackPane
        StackPane.setAlignment(gp9S, Pos.CENTER_RIGHT);
        StackPane.setAlignment(imageview8, Pos.CENTER_LEFT);


        Scene scene9S = new Scene(sp11, screenBounds.getHeight(), screenBounds.getWidth());
        // SAME DONOR SEARCHHHH

        // SAME DONOR SEARCHHHH

        GridPane gridPane6 = new GridPane();
        gridPane6.setStyle("-fx-background-color: #cfa1a8;");

        // Header
        Label headerLabel = new Label("Search Blood Bag");
        headerLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 22));
        headerLabel.setStyle("-fx-text-fill: #700f17;");
        gridPane6.add(headerLabel, 0, 0, 2, 1);

        Button sameBTN = new Button(" Search");
        sameBTN.setStyle("-fx-background-color: #700f17; -fx-text-fill: #edf1f7");
        sameBTN.setPrefHeight(40);
        sameBTN.setPrefWidth(120);

        // Sub-header
        Label subHeaderLabel = new Label("Enter blood group details.");
        subHeaderLabel.setFont(Font.font("Times New Roman ", 20));
        subHeaderLabel.setStyle("-fx-text-fill: #700f17;");
        gridPane6.add(subHeaderLabel, 0, 1, 2, 1);

        // Blood Group
        Label bloodGroupLabel = new Label("Blood Group:");
        bloodGroupLabel.setFont(Font.font("Times New Roman", 20));
        bloodGroupLabel.setStyle("-fx-text-fill: #700f17;");
        gridPane6.add(bloodGroupLabel, 0, 2);

        ChoiceBox<String> bloodGroupChoiceBoxS = new ChoiceBox<>();
        bloodGroupChoiceBoxS.getItems().addAll("A", "B", "AB", "O");
        bloodGroupChoiceBoxS.setStyle("-fx-background-color: #700f17;");
        bloodGroupChoiceBoxS.setPrefSize(269, 28);
        gridPane6.add(bloodGroupChoiceBoxS, 1, 2);
        gridPane6.add(sameBTN, 2, 3);

        // Rh Factor
        Label rhFactorLabel = new Label("Rh- Factor:");
        rhFactorLabel.setFont(Font.font("Times New Roman", 20));
        rhFactorLabel.setStyle("-fx-text-fill: #700f17;");
        gridPane6.add(rhFactorLabel, 0, 3);

        ChoiceBox<String> rhFactorChoiceBoxS = new ChoiceBox<>();
        rhFactorChoiceBoxS.getItems().addAll("+", "-");
        rhFactorChoiceBoxS.setPrefSize(269, 25);
        rhFactorChoiceBoxS.setStyle("-fx-background-color: #700f17;");
        gridPane6.add(rhFactorChoiceBoxS, 1, 3);

        // Table
        TableView<Donor> tableView = new TableView<>();
        tableView.setPrefHeight(238);
        tableView.setPrefWidth(683);

        TableColumn<Donor, String> bloodGroupColumn = new TableColumn<>("Blood group");
        bloodGroupColumn.setPrefWidth(75);
        tableView.getColumns().add(bloodGroupColumn);

        TableColumn<Donor, String> rhColumn = new TableColumn<>("Rh");
        rhColumn.setPrefWidth(75);
        tableView.getColumns().add(rhColumn);

        TableColumn<Donor, String> donorColumn = new TableColumn<>("Donor");
        donorColumn.setPrefWidth(75);
        tableView.getColumns().add(donorColumn);

        TableColumn<Donor, String> donorIdColumn = new TableColumn<>("Donor Id");
        donorIdColumn.setPrefWidth(75);
        tableView.getColumns().add(donorIdColumn);

        TableColumn<Donor, String> donorAgeColumn = new TableColumn<>("Donor Age");
        donorAgeColumn.setPrefWidth(75);
        tableView.getColumns().add(donorAgeColumn);

        TableColumn<Donor, String> donorContactColumn = new TableColumn<>("Donor Contact");
        donorContactColumn.setPrefWidth(102);
        tableView.getColumns().add(donorContactColumn);

        TableColumn<Donor, String> donorEmailColumn = new TableColumn<>("Donor Email Address");
        donorEmailColumn.setPrefWidth(196);
        tableView.getColumns().add(donorEmailColumn);


        gridPane6.add(tableView, 0, 4, 2, 1);
        gridPane6.setAlignment(Pos.CENTER);
        Image image9 = new Image("file:\\C:\\Users\\hp\\Downloads\\donorr-removebg-preview.png");
        ImageView imageview9 = new ImageView(image9);
        imageview9.setFitWidth(700); // Adjust the size as needed
        imageview9.setFitHeight(700);
        imageview9.setPreserveRatio(true);


// Create the StackPane to overlay the VBox on the image
        StackPane sp12 = new StackPane();
        sp12.getChildren().addAll(imageview9, gridPane6);
        // sp12.setStyle("-fx-background-color: #cfa1a8;");


// Set alignment of the HBox within the StackPane
        StackPane.setAlignment(gridPane6, Pos.CENTER_RIGHT);
        StackPane.setAlignment(imageview9, Pos.TOP_RIGHT);


        // Set gaps
        gridPane6.setHgap(12);
        gridPane6.setVgap(12);

        Scene scene = new Scene(sp12, screenBounds.getHeight(), screenBounds.getWidth());

        // ADD RECIPIENT
        Label rec = new Label("Add Recipient Details");
        rec.setStyle("-fx-text-fill: #0a0a45; ");
        rec.setFont(Font.font("Times New Roman", FontPosture.ITALIC, 24));
        Label rid = new Label("ID  ");
        rid.setStyle("-fx-text-fill: #0a0a45; ");
        rid.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 18));
        TextField rid1 = new TextField();
        rid1.setStyle("-fx-background-color: #0a0a45; -fx-text-fill: #fafbfc; ");
        rid1.setMaxHeight(900);
        rid1.setMaxWidth(900);

        Label rname = new Label("Name  ");
        rname.setStyle("-fx-text-fill: #0a0a45; ");
        rname.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 18));
        TextField rname1 = new TextField();
        rname1.setStyle("-fx-background-color: #0a0a45; -fx-text-fill: #fafbfc;");
        rname1.setMaxHeight(900);
        rname1.setMaxWidth(900);

        Label rage = new Label("Age  ");
        rage.setStyle("-fx-text-fill: #0a0a45; ");
        rage.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 18));
        TextField rage1 = new TextField();
        rage1.setStyle("-fx-background-color: #0a0a45;-fx-text-fill: #fafbfc; ");
        rage1.setMaxHeight(900);
        rage1.setMaxWidth(900);

        Label rcountry = new Label("Country  ");
        rcountry.setStyle("-fx-text-fill: #0a0a45; ");
        rcountry.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 18));
        TextField rcountry1 = new TextField();
        rcountry1.setStyle("-fx-background-color: #0a0a45; -fx-text-fill: #fafbfc; ");
        rcountry1.setMaxHeight(900);
        rcountry1.setMaxWidth(900);

        Label rcity = new Label("City  ");
        rcity.setStyle("-fx-text-fill: #0a0a45; ");
        rcity.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 18));
        TextField rcity1 = new TextField();
        rcity1.setStyle("-fx-background-color: #0a0a45; -fx-text-fill: #fafbfc; ");
        rcity1.setMaxHeight(900);
        rcity1.setMaxWidth(900);

        Label rphone = new Label("Phone  ");
        rphone.setStyle("-fx-text-fill: #0a0a45; ");
        rphone.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 18));
        TextField rphone1 = new TextField();
        rphone1.setStyle("-fx-background-color: #0a0a45; -fx-text-fill: #fafbfc;");
        rphone1.setMaxHeight(900);
        rphone1.setMaxWidth(900);

        Label remail = new Label("Email  ");
        remail.setStyle("-fx-text-fill: #0a0a45; ");
        remail.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 18));
        TextField remail1 = new TextField();
        remail1.setStyle("-fx-background-color: #0a0a45; -fx-text-fill: #fafbfc; ");
        remail1.setMaxHeight(900);
        remail1.setMaxWidth(900);


        Button addr = new Button("ADD");
        addr.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 18));
        addr.setStyle("-fx-text-fill: #edf1f7;  -fx-background-color: #0a0a45; ");




        GridPane gp3 = new GridPane();
        gp3.setPadding(new Insets(20));
        gp3.setHgap(10);
        gp3.setVgap(10);
        gp3.add(rec, 0, 0, 2, 1);
        GridPane.setHalignment(rec, HPos.CENTER);
        gp3.add(rid, 0, 1);
        gp3.add(rid1, 1, 1);
        gp3.add(rname, 0, 2);
        gp3.add(rname1, 1, 2);
        gp3.add(rage, 0, 3);
        gp3.add(rage1, 1, 3);
        gp3.add(rcountry, 0, 4);
        gp3.add(rcountry1, 1, 4);
        gp3.add(rcity, 0, 5);
        gp3.add(rcity1, 1, 5);
        gp3.add(rphone, 0, 6);
        gp3.add(rphone1, 1, 6);
        gp3.add(remail, 0, 7);
        gp3.add(remail1, 1, 7);
        gp3.add(addr, 0, 8, 2, 1);
        GridPane.setHalignment(addr, HPos.CENTER);

// Create a VBox to contain the GridPane
        VBox Recbox = new VBox(20);
        Recbox.setAlignment(Pos.CENTER);
        Recbox.getChildren().add(gp3);

// Load the background image
        Image image10 = new Image("file:\\C:\\Users\\Lenovo T480s\\Downloads\\Recipient-removebg-preview.png");
        ImageView imageview10 = new ImageView(image10);
        imageview10.setFitWidth(500); // Adjust the size as needed
        imageview10.setFitHeight(500);
        imageview10.setPreserveRatio(true);

// Create an HBox to position the VBox containing the donor grid
        HBox hbox8 = new HBox();
        hbox8.setAlignment(Pos.CENTER_RIGHT); // Align content to the right
        hbox8.getChildren().addAll(Recbox);
        hbox8.setPadding(new Insets(20)); // Optional: add padding if needed

// Create the StackPane to overlay the VBox on the image
        StackPane sp13 = new StackPane();
        sp13.getChildren().addAll(imageview10, hbox8);
        // sp13.setStyle("-fx-background-color: #9797d1;");

// Set alignment of the HBox within the StackPane
        StackPane.setAlignment(hbox8, Pos.TOP_CENTER);
        StackPane.setAlignment(imageview10, Pos.CENTER_LEFT);


// Create the scene with the StackPane as the root
        Scene scene4 = new Scene(sp13, screenBounds.getWidth(), screenBounds.getHeight());


        //REMOVE RECIPIENT
        Label instructionLabelR = new Label("Enter the name of recipient you want to remove:");
        instructionLabelR.setStyle("-fx-text-fill: #0a0a45;");
        instructionLabelR.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));


        Label removerecname1 = new Label("Name: ");
        removerecname1.setStyle("-fx-text-fill: #0a0a45;");
        removerecname1.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));

        TextField removerecname2 = new TextField();
        removerecname2.setStyle("-fx-background-color: #0a0a45;-fx-text-fill: #fafbfc; ");
        removerecname2.setPrefWidth(157);
        removerecname2.setPrefHeight(30);

        Button rremove = new Button("Remove");
        rremove.setStyle("-fx-text-fill:  #edf1f7; -fx-background-color: #0a0a45;");
        rremove.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 18));
        rremove.setPrefWidth(157);
        rremove.setPrefHeight(30);


        // GridPane configuration
        HBox recbox1 = new HBox();
        recbox1.getChildren().addAll(removerecname1, removerecname2);
        recbox1.setAlignment(Pos.CENTER_RIGHT);


        HBox btnbox2 = new HBox();
        btnbox2.getChildren().add(rremove);
        btnbox2.setAlignment(Pos.CENTER_RIGHT);

        VBox hbox9 = new VBox(20); // HBox for the VBox containing the label and text field and VBox containing buttons
        hbox9.setAlignment(Pos.CENTER_RIGHT); // Aligning to the extreme right
        hbox9.getChildren().addAll(instructionLabelR, recbox1, btnbox2);
        hbox9.setPadding(new Insets(10, 60, 50, 80));

        Image image12 = new Image("file:\\C:\\Users\\Lenovo T480s\\Downloads\\Recipient-removebg-preview.png");
        ImageView imageview12 = new ImageView(image12);
        imageview12.setFitWidth(500); // Adjust the size as needed
        imageview12.setFitHeight(500);
        imageview12.setPreserveRatio(true);


// Create the StackPane to overlay the VBox on the image
        StackPane sp14 = new StackPane();
        sp14.getChildren().addAll(imageview12, hbox9);
        //sp14.setStyle("-fx-background-color: #9797d1;");

// Set alignment of the HBox within the StackPane
        // Aligning hbox7 to the bottom right
        StackPane.setAlignment(hbox9, Pos.CENTER_RIGHT); // Aligning hbox5 to the baseline right
        StackPane.setAlignment(imageview12, Pos.CENTER_LEFT);

        Scene scene5 = new Scene(sp14, screenBounds.getHeight(), screenBounds.getWidth());
        //UPDATE RECIPIENT
        Label R1S = new Label("Enter the name to update:");
        R1S.setStyle("-fx-text-fill: #0a0a45; ");
        R1S.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 26));

        VBox info3 = new VBox();
        info3.getChildren().add(R1S);
        info3.setAlignment(Pos.CENTER_RIGHT);

        Label RecipientNameS = new Label("Name : ");
        RecipientNameS.setStyle("-fx-text-fill: #0a0a45; ");
        RecipientNameS.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 22));

        TextField RecipientName1S = new TextField();
        RecipientName1S.setStyle("-fx-background-color: #0a0a45; -fx-text-fill: #fafbfc; ");
        RecipientName1S.setPrefHeight(20);
        RecipientName1S.setPrefWidth(160);

        HBox info4 = new HBox(30);
        info4.getChildren().addAll(RecipientNameS, RecipientName1S);
        info4.setAlignment(Pos.CENTER_RIGHT);


        Label R3S = new Label("Write the info to update:");
        R3S.setStyle("-fx-text-fill: #0a0a45; ");
        R3S.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 26));

        Label RNameS = new Label("Name : ");
        RNameS.setStyle("-fx-text-fill: #0a0a45; ");
        RNameS.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 22));
        TextField RNameS1 = new TextField();
        RNameS1.setStyle("-fx-background-color: #0a0a45; -fx-text-fill: #fafbfc; ");
        RNameS1.setMaxHeight(900);
        RNameS1.setMaxWidth(900);

        Label AgeS = new Label("Age : ");
        AgeS.setStyle("-fx-text-fill: #0a0a45; ");
        AgeS.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 22));
        TextField AgeS1 = new TextField();
        AgeS1.setStyle("-fx-background-color: #0a0a45; -fx-text-fill: #fafbfc;");
        AgeS1.setMaxHeight(900);
        AgeS1.setMaxWidth(900);


        Label CityS = new Label("City: ");
        CityS.setStyle("-fx-text-fill: #0a0a45; ");
        CityS.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 22));
        TextField CityS1 = new TextField();
        CityS1.setStyle("-fx-background-color: #0a0a45; -fx-text-fill: #fafbfc;");
        CityS1.setMaxHeight(900);
        CityS1.setMaxWidth(900);

        Label ContactS = new Label("Contact: ");
        ContactS.setStyle("-fx-text-fill: #0a0a45; ");
        ContactS.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 22));
        TextField ContactS1 = new TextField();
        ContactS1.setStyle("-fx-background-color: #0a0a45; -fx-text-fill: #fafbfc;");
        ContactS1.setMaxHeight(900);
        ContactS1.setMaxWidth(900);

        Label CountryS = new Label("Country: ");
        CountryS.setStyle("-fx-text-fill: #0a0a45; ");
        CountryS.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 22));
        TextField CountryS1 = new TextField();
        CountryS1.setStyle("-fx-background-color: #0a0a45;  -fx-text-fill: #fafbfc;");
        CountryS1.setMaxHeight(900);
        CountryS1.setMaxWidth(900);


        Button addS2 = new Button("Update");
        addS2.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 22));
        addS2.setStyle("-fx-text-fill: #edf1f7;  -fx-background-color: #0a0a45; ");
// alert msg




        GridPane Grid1 = new GridPane();
        Grid1.setPadding(new Insets(20));
        Grid1.setHgap(10);
        Grid1.setVgap(10);
        Grid1.add(RNameS, 0, 1);
        Grid1.add(RNameS1, 1, 1);
        Grid1.add(AgeS, 0, 2);
        Grid1.add(AgeS1, 1, 2);
        Grid1.add(ContactS, 0, 3);
        Grid1.add(ContactS1, 1, 3);
        Grid1.add(CityS, 0, 4);
        Grid1.add(CityS1, 1, 4);
        Grid1.add(CountryS, 0, 5);
        Grid1.add(CountryS1, 1, 5);
        Grid1.add(addS2, 0, 10, 1, 1);
        GridPane.setHalignment(addS2, HPos.CENTER);
        Grid1.setAlignment(Pos.CENTER_RIGHT);
        Grid1.setHgap(12);
        Grid1.setVgap(12);

        VBox info5 = new VBox(20);
        info5.getChildren().addAll(info3, info4, R3S, Grid1);
        info5.setPadding(new Insets(10, 60, 50, 80));
        info5.setAlignment(Pos.CENTER_RIGHT);


        Image image13 = new Image("file:\\C:\\Users\\Lenovo T480s\\Downloads\\Recipient-removebg-preview.png");
        ImageView imageview13 = new ImageView(image13);
        imageview13.setFitWidth(500); // Adjust the size as needed
        imageview13.setFitHeight(500);
        imageview13.setPreserveRatio(true);


// Create the StackPane to overlay the VBox on the image
        StackPane sp15 = new StackPane();
        sp15.getChildren().addAll(imageview13, info5);
        // sp15.setStyle("-fx-background-color: #9797d1;");


// Set alignment of the HBox within the StackPane
        StackPane.setAlignment(info5, Pos.CENTER_RIGHT);
        StackPane.setAlignment(imageview13, Pos.CENTER_LEFT);
        Scene scene2S = new Scene(sp15, screenBounds.getHeight(), screenBounds.getWidth());

        // SEARCH RECIPIENT

        Label SearchRecipientS1 = new Label("Search Recipient");
        SearchRecipientS1.setFont(Font.font("Times New Roman", FontPosture.ITALIC, 28));
        SearchRecipientS1.setTextFill(Color.web("#0a0a45"));
        HBox search1 = new HBox();
        search1.getChildren().add(SearchRecipientS1);
        search1.setAlignment(Pos.CENTER_RIGHT);


        Label RecipientNameLabelS = new Label("Name:");
        RecipientNameLabelS.setFont(Font.font("Times New Roman", 22));
        RecipientNameLabelS.setTextFill(Color.web("#0a0a45"));

        TextField RecipientNameLabelS1 = new TextField();
        RecipientNameLabelS1.setStyle("-fx-background-color: #0a0a45; -fx-text-fill: #fafbfc; ");
        RecipientNameLabelS1.setPrefHeight(30);
        RecipientNameLabelS1.setPrefWidth(160);


        Button SearchS3 = new Button("Search");
        SearchS3.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));
        SearchS3.setStyle("-fx-text-fill: #edf1f7;  -fx-background-color: #0a0a45;  ");

//                alert msg


        HBox buttons1 = new HBox(40);
        buttons1.getChildren().addAll(SearchS3);
        buttons1.setAlignment(Pos.CENTER_RIGHT);
        //buttons.setPadding(new Insets(30));
        HBox searchv1 = new HBox(20);
        searchv1.getChildren().addAll(RecipientNameLabelS, RecipientNameLabelS1);
        searchv1.setAlignment(Pos.CENTER_RIGHT);
        VBox together1 = new VBox(20);
        together1.getChildren().addAll(search1, searchv1, buttons1);
        together1.setAlignment(Pos.CENTER_RIGHT);
        together1.setPadding(new Insets(30));

        Image image15 = new Image("file:\\C:\\Users\\Lenovo T480s\\Downloads\\Recipient-removebg-preview.png");
        ImageView imageview15 = new ImageView(image15);
        imageview15.setFitWidth(500); // Adjust the size as needed
        imageview15.setFitHeight(500);
        imageview15.setPreserveRatio(true);


// Create the StackPane to overlay the VBox on the image
        StackPane sp16 = new StackPane();
        sp16.getChildren().addAll(imageview15, together1);
        // sp16.setStyle("-fx-background-color: #9797d1;");


// Set alignment of the HBox within the StackPane
        StackPane.setAlignment(together1, Pos.CENTER_RIGHT);
        StackPane.setAlignment(imageview15, Pos.CENTER_LEFT);
        Scene scene5S = new Scene(sp16, screenBounds.getHeight(), screenBounds.getWidth());


        // RECIPIENT SEARCH OUTPUTT
        Label RecipientLabelS1 = new Label(" Recipient ");
        RecipientLabelS1.setStyle("-fx-text-fill: #0a0a45; ");
        RecipientLabelS1.setFont(Font.font("Times New Roman", FontPosture.ITALIC, 30));


        Label RecipientidLabelS = new Label("Recipient ID : ");
        RecipientidLabelS.setStyle("-fx-text-fill: #0a0a45; ");
        RecipientidLabelS.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));

        Label RecipientidLabelS1 = new Label();
        RecipientidLabelS1.setStyle("-fx-text-fill: #0a0a45; ");
        RecipientidLabelS1.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));

        Label RecipientnameS = new Label("Name : ");
        RecipientnameS.setStyle("-fx-text-fill: #0a0a45; ");
        RecipientnameS.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));


        Label RecipientnameS1 = new Label();
        RecipientnameS1.setStyle("-fx-text-fill: #0a0a45; ");
        RecipientnameS1.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));

        Label RecipientAge = new Label("Age : ");
        RecipientAge.setStyle("-fx-text-fill: #0a0a45; ");
        RecipientAge.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));

        Label RecipientAgeS1 = new Label();
        RecipientAgeS1.setStyle("-fx-text-fill: #0a0a45; ");
        RecipientAgeS1.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));

        Label RecipientContactS = new Label("Contact Number: ");
        RecipientContactS.setStyle("-fx-text-fill: #0a0a45; ");
        RecipientContactS.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));

        Label RecipientContactS1 = new Label();
        RecipientContactS1.setStyle("-fx-text-fill: #0a0a45; ");
        RecipientContactS1.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));

        Label RecipientEmailS = new Label("E-mail : ");
        RecipientEmailS.setStyle("-fx-text-fill: #0a0a45; ");
        RecipientEmailS.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));

        Label RecipientEmailS1 = new Label();
        RecipientEmailS1.setStyle("-fx-text-fill: #0a0a45; ");
        RecipientEmailS1.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));

        Label RecAddressS = new Label("Address: ");
        RecAddressS.setStyle("-fx-text-fill: #0a0a45; ");
        RecAddressS.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));

        Label RecAddressS1 = new Label();
        RecAddressS1.setStyle("-fx-text-fill: #0a0a45; ");
        RecAddressS1.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));


        Button home8S = new Button(" HOME");
        home8S.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));
        home8S.setStyle("-fx-text-fill: #edf1f7;  -fx-background-color: #0a0a45; ");


        GridPane gp10S = new GridPane();
        gp10S.add(RecipientLabelS1, 0, 3);
        gp10S.add(RecipientnameS, 0, 5);
        gp10S.add(RecipientnameS1, 1, 5);
        gp10S.add(RecipientidLabelS, 0, 6);
        gp10S.add(RecipientidLabelS1, 1, 6);
        gp10S.add(RecipientAge, 0, 7);
        gp10S.add(RecipientAgeS1, 1, 7);
        gp10S.add(RecipientContactS, 0, 8);
        gp10S.add(RecipientContactS1, 1, 8);
        gp10S.add(RecipientEmailS, 0, 9);
        gp10S.add(RecipientEmailS1, 1, 9);
        gp10S.add(RecAddressS, 0, 10);
        gp10S.add(RecAddressS1, 1, 10);
        gp10S.add(home8S, 30, 14);
        gp10S.setHgap(12);
        gp10S.setVgap(12);
        gp10S.setPadding(new Insets(0));
        gp10S.setAlignment(Pos.CENTER_RIGHT);
        //gp9S.setAlignment(Pos.BOTTOM_RIGHT);
        Image image16 = new Image("file:\\C:\\Users\\Lenovo T480s\\Downloads\\Recipient-removebg-preview.png");
        ImageView imageview16 = new ImageView(image16);
        imageview16.setFitWidth(200); // Adjust the size as needed
        imageview16.setFitHeight(200);
        imageview16.setPreserveRatio(true);


// Create the StackPane to overlay the VBox on the image
        StackPane sp17 = new StackPane();
        sp17.getChildren().addAll(imageview16, gp10S);
        // sp17.setStyle("-fx-background-color: #9797d1;");


// Set alignment of the HBox within the StackPane
        StackPane.setAlignment(gp10S, Pos.CENTER_RIGHT);
        StackPane.setAlignment(imageview16, Pos.CENTER_LEFT);


        Scene scene8S = new Scene(sp17, screenBounds.getHeight(), screenBounds.getWidth());
        // ADD BLOODBAG

        // ADD BLOODBAG

        Label bb = new Label("Add BloodBag Details");
        bb.setStyle("-fx-text-fill: #570a45; ");
        bb.setFont(Font.font("Times New Roman", FontPosture.ITALIC, 24));
        Label bid = new Label("ID  ");
        bid.setStyle("-fx-text-fill: #570a45; ");
        bid.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 18));
        TextField bid1 = new TextField();
        bid1.setStyle("-fx-background-color: #570a45; -fx-text-fill: #fafbfc;");
        bid1.setMaxHeight(900);
        bid1.setMaxWidth(900);

        Label bgroup = new Label("BloodGroup ");
        bgroup.setStyle("-fx-text-fill: #570a45; ");
        bgroup.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 18));
        ChoiceBox<String> bloodgrpBox = new ChoiceBox<>();
        bloodgrpBox.getItems().addAll("A", "B", "AB", "O");
        bloodgrpBox.setPrefSize(269, 37);
        bloodgrpBox.setStyle("-fx-background-color: #570a45; ");

        Label RHbg = new Label("RH-Factor ");
        RHbg.setFont(Font.font("Times New Roman", 18));
        RHbg.setStyle("-fx-text-fill: #570a45; ");


        ChoiceBox<String> rhFactorChoiceBox = new ChoiceBox<>();
        rhFactorChoiceBox.getItems().addAll("+", "-");
        rhFactorChoiceBox.setPrefSize(269, 37);
        rhFactorChoiceBox.setStyle("-fx-background-color: #570a45; ");


        Label quantity = new Label("Quantity  ");
        quantity.setStyle("-fx-text-fill: #570a45; ");
        quantity.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 18));
        TextField quantity1 = new TextField();
        quantity1.setStyle("-fx-background-color: #570a45; -fx-text-fill: #fafbfc; ");
        quantity1.setMaxHeight(900);
        quantity1.setMaxWidth(900);

        Label ddate = new Label("Donation Date ");
        ddate.setStyle("-fx-text-fill: #570a45; ");
        ddate.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 18));
        DatePicker datePicker1 = new DatePicker();
        datePicker1.setStyle("-fx-background-color: #570a45; ");
        datePicker1.setMaxHeight(900);
        datePicker1.setMaxWidth(900);


        Label expiryDate = new Label("Expiry Date  ");
        expiryDate.setStyle("-fx-text-fill: #0a0a45; ");
        expiryDate.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 18));
        DatePicker datePicker2 = new DatePicker();
        datePicker2.setStyle("-fx-background-color: #570a45; ");
        datePicker2.setMaxHeight(900);
        datePicker2.setMaxWidth(900);


        Button addBloodBag = new Button("ADD");
        addBloodBag.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 18));
        addBloodBag.setStyle("-fx-text-fill: #edf1f7;  -fx-background-color: #570a45; ");
        addBloodBag.setPrefSize(200, 20);


        GridPane gp7 = new GridPane();
        gp7.setPadding(new Insets(20));
        gp7.setHgap(10);
        gp7.setVgap(10);
        gp7.add(bb, 0, 0, 2, 1);
        GridPane.setHalignment(bb, HPos.CENTER);
        gp7.add(bid, 0, 1);
        gp7.add(bid1, 1, 1);
        gp7.add(bgroup, 0, 2);
        gp7.add(bloodgrpBox, 1, 2);
        gp7.add(RHbg, 0, 3);
        gp7.add(rhFactorChoiceBox, 1, 3);
        gp7.add(quantity, 0, 4);
        gp7.add(quantity1, 1, 4);
        gp7.add(ddate, 0, 5);
        gp7.add(datePicker1, 1, 5);
        gp7.add(expiryDate, 0, 6);
        gp7.add(datePicker2, 1, 6);
        gp7.add(addBloodBag, 0, 8, 2, 1);
        GridPane.setHalignment(addBloodBag, HPos.CENTER);

// Create a VBox to contain the GridPane
        VBox Bagbox = new VBox(20);
        Bagbox.setAlignment(Pos.CENTER);
        Bagbox.getChildren().add(gp7);

// Load the background image
        Image image17 = new Image("file:\\C:\\Users\\Lenovo T480s\\Downloads\\BloodBank-removebg-preview.png");
        ImageView imageview17 = new ImageView(image17);
        imageview17.setFitWidth(500); // Adjust the size as needed
        imageview17.setFitHeight(500);
        imageview17.setPreserveRatio(true);

// Create an HBox to position the VBox containing the donor grid
        HBox hbox11 = new HBox();
        hbox11.setAlignment(Pos.CENTER_RIGHT); // Align content to the right
        hbox11.getChildren().addAll(Bagbox);
        hbox11.setPadding(new Insets(20)); // Optional: add padding if needed

// Create the StackPane to overlay the VBox on the image
        StackPane sp19 = new StackPane();
        sp19.getChildren().addAll(imageview17, hbox11);
        // sp19.setStyle("-fx-background-color: #edbee2;");

// Set alignment of the HBox within the StackPane
        StackPane.setAlignment(hbox11, Pos.TOP_CENTER);
        StackPane.setAlignment(imageview17, Pos.CENTER_LEFT);


// Create the scene with the StackPane as the root
        Scene scene9 = new Scene(sp19, screenBounds.getWidth(), screenBounds.getHeight());


        //REMOVE BLOODBAG

        Label instructionLabelB = new Label("Enter the ID of BloodBag you want to remove:");
        instructionLabelB.setStyle("-fx-text-fill: #570a45;");
        instructionLabelB.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));


        Label removebb1 = new Label("ID ");
        removebb1.setStyle("-fx-text-fill: #570a45;");
        removebb1.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));

        TextField removebb2 = new TextField();
        removebb2.setStyle("-fx-background-color: #570a45; -fx-text-fill: #fafbfc;");
        removebb2.setPrefWidth(157);
        removebb2.setPrefHeight(30);

        Button bbremove = new Button("Remove");
        bbremove.setStyle("-fx-text-fill:  #edf1f7; -fx-background-color: #570a45;");
        bbremove.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 18));
        bbremove.setPrefWidth(157);
        bbremove.setPrefHeight(30);


        // GridPane configuration
        HBox bbbox1 = new HBox();
        bbbox1.getChildren().addAll(removebb1, removebb2);
        bbbox1.setAlignment(Pos.CENTER_RIGHT);


        HBox btnbox3 = new HBox();
        btnbox3.getChildren().add(bbremove);
        btnbox3.setAlignment(Pos.CENTER_RIGHT);

        VBox hbox12 = new VBox(20); // HBox for the VBox containing the label and text field and VBox containing buttons
        hbox12.setAlignment(Pos.CENTER_RIGHT); // Aligning to the extreme right
        hbox12.getChildren().addAll(instructionLabelB, bbbox1, btnbox3);
        hbox12.setPadding(new Insets(10, 60, 50, 80));

        Image image18 = new Image("file:\\C:\\Users\\Lenovo T480s\\Downloads\\BloodBank-removebg-preview.png");
        ImageView imageview18 = new ImageView(image18);
        imageview18.setFitWidth(500); // Adjust the size as needed
        imageview18.setFitHeight(500);
        imageview18.setPreserveRatio(true);


// Create the StackPane to overlay the VBox on the image
        StackPane sp20 = new StackPane();
        sp20.getChildren().addAll(imageview18, hbox12);
        //sp20.setStyle("-fx-background-color: #edbee2;");

// Set alignment of the HBox within the StackPane
        // Aligning hbox7 to the bottom right
        StackPane.setAlignment(hbox12, Pos.CENTER_RIGHT); // Aligning hbox5 to the baseline right
        StackPane.setAlignment(imageview18, Pos.CENTER_LEFT);

        Scene scene8 = new Scene(sp20, screenBounds.getHeight(), screenBounds.getWidth());

        //UPDATE BLOODBAG

        Label b1S = new Label("Update BloodBag:");
        b1S.setStyle("-fx-text-fill: #570a45; ");
        b1S.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 26));

        VBox info6 = new VBox();
        info6.getChildren().add(b1S);
        info6.setAlignment(Pos.CENTER_RIGHT);

        Label BBID = new Label("ID ");
        BBID.setStyle("-fx-text-fill: #570a45; ");
        BBID.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 22));

        TextField BBID1 = new TextField();
        BBID1.setStyle("-fx-background-color: #570a45; -fx-text-fill: #fafbfc; ");
        BBID1.setPrefSize(160,40);

        HBox info7 = new HBox(30);
        info7.getChildren().addAll(BBID, BBID1);
        info7.setAlignment(Pos.CENTER_RIGHT);


        Label b3S = new Label("Write the updated information of BloodBag:");
        b3S.setStyle("-fx-text-fill: #570a45; ");
        b3S.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 22));

        Label bNameS = new Label("Quantity ");
        bNameS.setStyle("-fx-text-fill: #570a45; ");
        bNameS.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 22));
        TextField BNameS1 = new TextField();
        BNameS1.setStyle("-fx-background-color: #570a45; -fx-text-fill: #fafbfc; ");
        BNameS1.setPrefSize(160,40);

//        Label EDATES = new Label("Donation Date ");
//        EDATES.setStyle("-fx-text-fill: #570a45; ");
//        EDATES.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 22));
//        DatePicker dp = new DatePicker();
//        dp.setStyle("-fx-background-color: #570a45; ");
//        dp.setMaxHeight(900);
//        dp.setMaxWidth(900);


//        Label DDateS = new Label("Expiry Date ");
//        DDateS.setStyle("-fx-text-fill: #570a45; ");
//        DDateS.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 22));
//        DatePicker dp1 = new DatePicker();
//        dp1.setStyle("-fx-background-color: #570a45; ");
//        dp1.setMaxHeight(900);
//        dp1.setMaxWidth(900);


        Button addS = new Button("Update");
        addS.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 22));
        addS.setStyle("-fx-text-fill: #edf1f7;  -fx-background-color: #570a45; ");
        addS.setPrefSize(160,40);
// alert msg
        HBox q = new HBox();
        q.getChildren().addAll(bNameS,BNameS1);
        q.setAlignment(Pos.CENTER_RIGHT);

        VBox um = new VBox(b1S,info7, b3S, q, addS);
        um.setAlignment(Pos.CENTER_RIGHT);
        um.setSpacing(20);
        um.setPadding(new Insets(30));


//        GridPane Grid3 = new GridPane();
//        Grid3.setPadding(new Insets(20));
//        Grid3.setHgap(10);
//        Grid3.setVgap(10);
//        Grid3.add(bNameS, 0, 1);
//        Grid3.add(BNameS1, 1, 1);
//        Grid3.add(DDateS, 0, 2);
//        Grid3.add(dp, 1, 2);
//        Grid3.add(EDATES, 0, 3);
//        Grid3.add(dp1, 1, 3);
//        Grid3.add(addS, 0, 8, 1, 1);
//        addS.setAlignment(Pos.CENTER_RIGHT);
//        Grid3.setAlignment(Pos.CENTER_RIGHT);
//        Grid3.setHgap(12);
//        Grid3.setVgap(12);

        VBox info8 = new VBox(20);
        info8.getChildren().addAll(um);
        info8.setPadding(new Insets(10, 60, 50, 80));
        info8.setAlignment(Pos.CENTER_RIGHT);


        Image image20 = new Image("file:\\C:\\Users\\Lenovo T480s\\Downloads\\BloodBank-removebg-preview.png");
        ImageView imageview20 = new ImageView(image20);
        imageview20.setFitWidth(500); // Adjust the size as needed
        imageview20.setFitHeight(500);
        imageview20.setPreserveRatio(true);


// Create the StackPane to overlay the VBox on the image
        StackPane sp21 = new StackPane();
        sp21.getChildren().addAll(imageview20, um);
        //sp21.setStyle("-fx-background-color: #edbee2;");


// Set alignment of the HBox within the StackPane
        StackPane.setAlignment(info8, Pos.CENTER_RIGHT);
        StackPane.setAlignment(imageview20, Pos.CENTER_LEFT);
        Scene scene1S = new Scene(sp21, screenBounds.getHeight(), screenBounds.getWidth());
//SEARCH BLOODBAG
        //SEARCH BLOODBAG
        Label SearchbbS1 = new Label("Search BloodBag");
        SearchbbS1.setFont(Font.font("Times New Roman", FontPosture.ITALIC, 28));
        SearchbbS1.setTextFill(Color.web("#570a45"));
        HBox searchBB1 = new HBox();
        searchBB1.getChildren().add(SearchbbS1);
        searchBB1.setAlignment(Pos.CENTER_RIGHT);


        Label BloodGroupLabelS = new Label("BloodGroup ");
        BloodGroupLabelS.setFont(Font.font("Times New Roman", 22));
        BloodGroupLabelS.setTextFill(Color.web("#570a45"));

        ChoiceBox<String> bloodGroupChoiceBox = new ChoiceBox<>();
        bloodGroupChoiceBox.getItems().addAll("A", "B", "AB", "O");
        bloodGroupChoiceBox.setStyle("-fx-background-color: #570a45;");
        bloodGroupChoiceBox.setPrefSize(269, 37);

        Label RHLabelS = new Label("RH-Factor ");
        RHLabelS.setFont(Font.font("Times New Roman", 22));
        RHLabelS.setTextFill(Color.web("#570a45"));

        ChoiceBox<String> rhFactorChoiceBoxBG = new ChoiceBox<>();
        rhFactorChoiceBoxBG.getItems().addAll("+", "-");
        rhFactorChoiceBoxBG.setStyle("-fx-background-color: #570a45;");
        rhFactorChoiceBoxBG.setPrefSize(269, 37);


        Button SearchS2 = new Button("Search");
        SearchS2.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));
        SearchS2.setStyle("-fx-text-fill: #edf1f7;  -fx-background-color: #570a45;  ");

//                alert msg

        HBox buttons3 = new HBox(40);
        buttons3.getChildren().addAll(SearchS2);
        buttons3.setAlignment(Pos.CENTER_RIGHT);
        //buttons.setPadding(new Insets(30));
        HBox searchb1 = new HBox(20);
        searchb1.getChildren().addAll(RHLabelS, rhFactorChoiceBoxBG);
        searchb1.setAlignment(Pos.CENTER_RIGHT);
        HBox searchb2 = new HBox(20);
        searchb2.getChildren().addAll(BloodGroupLabelS, bloodGroupChoiceBox);
        searchb2.setAlignment(Pos.CENTER_RIGHT);
        VBox together3 = new VBox(20);
        together3.getChildren().addAll(searchBB1, searchb2, searchb1, buttons3);
        together3.setAlignment(Pos.CENTER_RIGHT);
        together3.setPadding(new Insets(30));

        Image image22 = new Image("file:\\C:\\Users\\Lenovo T480s\\Downloads\\BloodBank-removebg-preview.png");
        ImageView imageview22 = new ImageView(image22);
        imageview22.setFitWidth(500); // Adjust the size as needed
        imageview22.setFitHeight(500);
        imageview22.setPreserveRatio(true);


// Create the StackPane to overlay the VBox on the image
        StackPane sp22 = new StackPane();
        sp22.getChildren().addAll(imageview22, together3);
        // sp22.setStyle("-fx-background-color: #edbee2;");


// Set alignment of the HBox within the StackPane
        StackPane.setAlignment(together3, Pos.CENTER_RIGHT);
        StackPane.setAlignment(imageview22, Pos.CENTER_LEFT);
        Scene scene4S = new Scene(sp22, screenBounds.getHeight(), screenBounds.getWidth());


        // BLOODBAG SEARCH OUTPUTT
        Label BBLabelS1 = new Label(" BloodBag Details ");
        BBLabelS1.setStyle("-fx-text-fill: #570a45; ");
        BBLabelS1.setFont(Font.font("Times New Roman", FontPosture.ITALIC, 30));
        BBLabelS1.setAlignment(Pos.CENTER_RIGHT);


        Label bbS = new Label("BloodBag ID  ");
        bbS.setStyle("-fx-text-fill: #570a45; ");
        bbS.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));
        bbS.setAlignment(Pos.CENTER_RIGHT);

        Label bbLabelS1 = new Label();
        bbLabelS1.setStyle("-fx-text-fill: #570a45; ");
        bbLabelS1.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));
        bbLabelS1.setAlignment(Pos.CENTER_RIGHT);

        Label BBS = new Label("BloodGroup ");
        BBS.setStyle("-fx-text-fill: #570a45; ");
        BBS.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));
        BBS.setAlignment(Pos.CENTER_RIGHT);


        Label bbnameS1 = new Label();
        bbnameS1.setStyle("-fx-text-fill: #570a45; ");
        bbnameS1.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));
        bbnameS1.setAlignment(Pos.CENTER_RIGHT);

        Label Rhfctor = new Label("RH-Facctor");
        Rhfctor.setStyle("-fx-text-fill: #570a45; ");
        Rhfctor.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));
        Rhfctor.setAlignment(Pos.CENTER_RIGHT);

        Label rhfactor1 = new Label();
        rhfactor1.setStyle("-fx-text-fill: #570a45; ");
        rhfactor1.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));
        rhfactor1.setAlignment(Pos.CENTER_RIGHT);

        Label quantityS = new Label("Quantity: ");
        quantityS.setStyle("-fx-text-fill: #570a45; ");
        quantityS.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));
        quantityS.setAlignment(Pos.CENTER_RIGHT);


        Label quantityS1 = new Label();
        quantityS1.setStyle("-fx-text-fill: #570a45; ");
        quantityS1.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));
        quantityS1.setAlignment(Pos.CENTER_RIGHT);

        Label DDDATES = new Label("Donation Date ");
        DDDATES.setStyle("-fx-text-fill: #570a45; ");
        DDDATES.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));
        DDDATES.setAlignment(Pos.CENTER_RIGHT);

        Label DDATES1 = new Label();
        DDATES1.setStyle("-fx-text-fill: #570a45; ");
        DDATES1.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));
        DDATES1.setAlignment(Pos.CENTER_RIGHT);

        Label EXDATES = new Label("Expiry Date ");
        EXDATES.setStyle("-fx-text-fill: #570a45; ");
        EXDATES.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));
        EXDATES.setAlignment(Pos.CENTER_RIGHT);

        Label EXDATES1 = new Label();
        EXDATES1.setStyle("-fx-text-fill: #570a45; ");
        EXDATES1.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));
        EXDATES1.setAlignment(Pos.CENTER_RIGHT);


        Label BloodBagStatusS = new Label("Status: ");
        BloodBagStatusS.setStyle("-fx-text-fill: #570a45; ");
        BloodBagStatusS.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));
        BloodBagStatusS.setAlignment(Pos.CENTER_RIGHT);

        Label BloodBagStatusS1 = new Label("Availiable");
        BloodBagStatusS1.setStyle("-fx-text-fill: #570a45; ");
        BloodBagStatusS1.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));
        BloodBagStatusS1.setAlignment(Pos.CENTER_RIGHT);


        Button home7S = new Button(" HOME");
        home7S.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 22));
        home7S.setStyle("-fx-text-fill: #edf1f7;  -fx-background-color: #570a45; ");
        home7S.setAlignment(Pos.CENTER_RIGHT);


        GridPane gp11S = new GridPane();
        gp11S.add(BBLabelS1, 0, 3);
        gp11S.add(BBS, 0, 5);
        gp11S.add(bbnameS1, 1, 5);
        gp11S.add(bbS, 0, 6);
        gp11S.add(bbLabelS1, 1, 6);
        gp11S.add(Rhfctor, 0, 7);
        gp11S.add(rhfactor1, 1, 7);
        gp11S.add(quantityS, 0, 8);
        gp11S.add(quantityS1, 1, 8);
        gp11S.add(DDDATES, 0, 9);
        gp11S.add(DDATES1, 1, 9);
        gp11S.add(EXDATES, 0, 10);
        gp11S.add(EXDATES1, 1, 10);
        gp11S.add(BloodBagStatusS, 0, 11);
        gp11S.add(BloodBagStatusS1, 1, 11);
        gp11S.add(home7S, 30, 14);
        gp11S.setHgap(12);
        gp11S.setVgap(12);
        gp11S.setPadding(new Insets(0));
        gp11S.setAlignment(Pos.CENTER_RIGHT);
        //gp9S.setAlignment(Pos.BOTTOM_RIGHT);
        Image image23 = new Image("file:\\C:\\Users\\Lenovo T480s\\Downloads\\BloodBank-removebg-preview.png");
        ImageView imageview23 = new ImageView(image23);
        imageview23.setFitWidth(200); // Adjust the size as needed
        imageview23.setFitHeight(200);
        imageview23.setPreserveRatio(true);


// Create the StackPane to overlay the VBox on the image
        StackPane sp23 = new StackPane();
        sp23.getChildren().addAll(imageview23, gp11S);
        // sp23.setStyle("-fx-background-color: #edbee2;");


// Set alignment of the HBox within the StackPane
        StackPane.setAlignment(gp11S, Pos.CENTER_RIGHT);
        StackPane.setAlignment(imageview23, Pos.CENTER_LEFT);


        Scene scene7S = new Scene(sp23, screenBounds.getHeight(), screenBounds.getWidth());

        //TRANSFUSION
        Label trans = new Label("Blood Transfusion");
        trans.setStyle("-fx-text-fill: #114026;");
        trans.setFont(Font.font("Times New Roman", FontPosture.ITALIC, 29));
        trans.setAlignment(Pos.CENTER_RIGHT);


        Label transID = new Label("ID ");
        transID.setStyle("-fx-text-fill: #114026;");
        transID.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));

        TextField transID2 = new TextField();
        transID2.setStyle("-fx-background-color: #114026; -fx-text-fill: #fafbfc; ");
        transID2.setPrefSize(269, 37);

        Label bloodgrouptrans = new Label("BloodGroup ");
        bloodgrouptrans.setStyle("-fx-text-fill: #114026;");
        bloodgrouptrans.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 22));
        bloodgrouptrans.setPrefSize(269, 37);
        bloodgrouptrans.setAlignment(Pos.CENTER_RIGHT);

        ChoiceBox<String> bloodTransChoiceBox = new ChoiceBox<>();
        bloodTransChoiceBox.getItems().addAll("A", "B", "AB", "O");
        bloodTransChoiceBox.setPrefSize(269, 37);
        bloodTransChoiceBox.setStyle("-fx-background-color: #114026");

        Label RHTrans = new Label("RH-Factor ");
        RHTrans.setFont(Font.font("Times New Roman", 22));
        RHTrans.setTextFill(Color.web("#114026"));

        ChoiceBox<String> rhFactortransChoiceBox = new ChoiceBox<>();
        rhFactortransChoiceBox.getItems().addAll("+", "-");
        rhFactortransChoiceBox.setPrefSize(269, 37);
        rhFactortransChoiceBox.setStyle("-fx-background-color: #114026");

        Label quantityRequires = new Label("Quantity");
        quantityRequires.setFont(Font.font("Times New Roman", 22));
        quantityRequires.setStyle("-fx-text-fill: #114026;");
        TextField quantityrequired = new TextField();
        quantityrequired.setStyle("-fx-background-color: #114026; -fx-text-fill: #fafbfc;");
        quantityrequired.setPrefSize(269, 37);


        // GridPane configuration
        HBox transbox1 = new HBox();
        transbox1.getChildren().addAll(transID, transID2);
        transbox1.setAlignment(Pos.CENTER_RIGHT);


        HBox transbox2 = new HBox();
        transbox2.getChildren().addAll(bloodgrouptrans, bloodTransChoiceBox);
        transbox2.setAlignment(Pos.CENTER_RIGHT);

        HBox transbox3 = new HBox();
        transbox3.getChildren().addAll(RHTrans, rhFactortransChoiceBox);
        transbox3.setAlignment(Pos.CENTER_RIGHT);

        HBox qt = new HBox();
        qt.getChildren().addAll(quantityRequires, quantityrequired);
        qt.setAlignment(Pos.CENTER_RIGHT);

        Button transfuseblood = new Button("Transfuse");
        transfuseblood.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 22));
        transfuseblood.setStyle("-fx-text-fill: #edf1f7;  -fx-background-color: #114026; ");
        transfuseblood.setAlignment(Pos.CENTER_RIGHT);


        VBox hbox15 = new VBox(20); // HBox for the VBox containing the label and text field and VBox containing buttons
        hbox15.setAlignment(Pos.CENTER); // Aligning to the extreme right
        hbox15.getChildren().addAll(trans, transbox1, transbox2, transbox3, qt, transfuseblood);
        hbox15.setPadding(new Insets(10, 60, 50, 80));

        Image image24 = new Image("file:\\C:\\Users\\Lenovo T480s\\Downloads\\Transfusion-removebg-preview.png");
        ImageView imageview24 = new ImageView(image24);
        imageview24.setFitWidth(500); // Adjust the size as needed
        imageview24.setFitHeight(500);
        imageview24.setPreserveRatio(true);


        // Create the StackPane to overlay the VBox on the image
        StackPane sp24 = new StackPane();
        sp24.getChildren().addAll(imageview24, hbox15);
        sp24.setStyle("-fx-background-color: #68b088;");

        // Set alignment of the HBox within the StackPane
        // Aligning hbox7 to the bottom right
        StackPane.setAlignment(hbox15, Pos.CENTER_RIGHT); // Aligning hbox5 to the baseline right
        StackPane.setAlignment(imageview24, Pos.CENTER_LEFT);

        Scene performTransfusion = new Scene(sp24, screenBounds.getHeight(), screenBounds.getWidth());

        //INVENTORY REPORTT
        //INVENTORY REPORTT

        // Create the GridPane
        GridPane gridPane2 = new GridPane();
        gridPane2.setStyle("-fx-background-color: #4f2c15;");
        gridPane2.setPrefSize(673, 484);

        // Configure column constraints for layout
        ColumnConstraints column11 = new ColumnConstraints();
        ColumnConstraints column22 = new ColumnConstraints();
        column11.setHgrow(Priority.ALWAYS);
        column22.setHgrow(Priority.ALWAYS);
        gridPane2.getColumnConstraints().addAll(column11, column22);

        // Create the Label
        Label label2 = new Label("Inventory Report");
        label2.setFont(Font.font("Times New Roman", FontPosture.ITALIC, 28));
        label2.setStyle("-fx-text-fill: #d0d6b0");
        label2.setAlignment(Pos.CENTER);
        gridPane2.add(label2, 0, 0, 2, 1); // Span across two columns

        // Create the TableView
        TableView<BloodBag> tableView2 = new TableView<>();
        tableView2.setPrefSize(673, 415);

        // Create TableColumns
        TableColumn<BloodBag, String> bagIdColumn2 = new TableColumn<>("Bag ID");


        TableColumn<BloodBag, String> bloodGroupColumn2 = new TableColumn<>("Blood Group ");
        bloodGroupColumn2.setPrefWidth(86);


        TableColumn<BloodBag, String> rhFactorColumn2 = new TableColumn<>("RH factor");
        rhFactorColumn2.setPrefWidth(79);


        TableColumn<BloodBag, String> quantityColumn2 = new TableColumn<>("Quantity");
        quantityColumn2.setPrefWidth(97);


        TableColumn<BloodBag, String> donationDateColumn2 = new TableColumn<>("Donation Date");
        donationDateColumn2.setPrefWidth(119);


        TableColumn<BloodBag, String> expiryDateColumn2 = new TableColumn<>("Expiry Date");
        expiryDateColumn2.setPrefWidth(101);


        TableColumn<BloodBag, String> availabilityColumn2 = new TableColumn<>("Availability");
        availabilityColumn2.setPrefWidth(101);


        // Add columns to the TableView
        tableView2.getColumns().addAll(bagIdColumn2, bloodGroupColumn2, rhFactorColumn2, quantityColumn2, donationDateColumn2, expiryDateColumn2, availabilityColumn2);

        // Add the TableView to the GridPane
        GridPane.setColumnSpan(tableView2, 2); // Span across two columns
        gridPane2.add(tableView2, 0, 1);
        gridPane2.setAlignment(Pos.CENTER);
        GridPane.setHalignment(label2, HPos.CENTER);
        GridPane.setValignment(label2, VPos.CENTER);
        gridPane2.setStyle("-fx-background-color: #4f2c15;");

        // Create and set the scene
        Scene sceneI = new Scene(gridPane2);
//            stage.setScene(scene2);
//            stage.setTitle("Inventory Report");
//            stage.show()

        //DONOR REPORT

        // Create the GridPane
        GridPane gridPane3 = new GridPane();
        gridPane3.setStyle("-fx-background-color: #4f2c15;");
        gridPane3.setPrefSize(683, 458);

        // Configure column constraints for layout
        ColumnConstraints column55 = new ColumnConstraints();
        ColumnConstraints column66 = new ColumnConstraints();
        column55.setHgrow(Priority.ALWAYS);
        column66.setHgrow(Priority.ALWAYS);
        gridPane3.getColumnConstraints().addAll(column55, column66);

        // Create the Label
        Label label3 = new Label("Donor Report");
        label3.setFont(Font.font("Times New Roman", FontPosture.ITALIC, 28));
        label3.setStyle("-fx-text-fill: #d0d6b0");
        label3.setAlignment(Pos.CENTER);
        gridPane3.add(label3, 0, 0, 2, 1); // Span across two columns

        // Create the TableView
        TableView<Donor> tableView3 = new TableView<>();
        tableView3.setPrefSize(60, 380);

        // Create TableColumns with updated names
        TableColumn<Donor, Integer> idColumn3 = new TableColumn<>(" ID");
        idColumn3.setPrefWidth(49);


        TableColumn<Donor, String> nameColumn3 = new TableColumn<>(" Name");
        nameColumn3.setPrefWidth(104);


        TableColumn<Donor, Integer> ageColumn3 = new TableColumn<>(" Age");
        ageColumn3.setPrefWidth(42);

        TableColumn<Donor, String> phoneColumn3 = new TableColumn<>("Contact");
        phoneColumn3.setPrefWidth(89);


        TableColumn<Donor, String> emailColumn3 = new TableColumn<>("Email");
        emailColumn3.setPrefWidth(88);


        TableColumn<Donor, String> bgColumn3 = new TableColumn<>("Blood Group");
        bgColumn3.setPrefWidth(87);





        TableColumn<Donor, String> cityColumn3 = new TableColumn<>("City");
        cityColumn3.setPrefWidth(70);


        TableColumn<Donor, String> countryColumn3 = new TableColumn<>("Country");
        countryColumn3.setPrefWidth(87);



        // Add columns to the TableView
        tableView3.getColumns().addAll(idColumn3, nameColumn3,bgColumn3, ageColumn3, phoneColumn3, emailColumn3, cityColumn3, countryColumn3);

        // Add the TableView to the GridPane
        GridPane.setColumnSpan(tableView3, 2); // Span across two columns
        gridPane3.add(tableView3, 0, 1);
        gridPane3.setAlignment(Pos.CENTER);
        GridPane.setHalignment(label3, HPos.CENTER);
        GridPane.setValignment(label3, VPos.CENTER);

        // Create and set the scene
        Scene sceneD = new Scene(gridPane3);

        //REC REPORT
        // Create the GridPane
        GridPane gridPane1 = new GridPane();
        gridPane1.setStyle("-fx-background-color: #4f2c15;");
        gridPane1.setPrefSize(683, 458);

        // Configure column constraints for layout
        ColumnConstraints column1 = new ColumnConstraints();
        ColumnConstraints column2 = new ColumnConstraints();
        column1.setHgrow(Priority.ALWAYS);
        column2.setHgrow(Priority.ALWAYS);
        gridPane1.getColumnConstraints().addAll(column1, column2);

        // Create the Label
        Label label1 = new Label("Recepient Report");
        label1.setFont(Font.font("Times New Roman", FontWeight.BOLD, 28));
        label1.setStyle("-fx-text-fill: d0d6b0");
        label1.setAlignment(Pos.CENTER);
        gridPane1.add(label1, 0, 0, 2, 1); // Span across two columns

        // Create the TableView
        TableView<Recipient> tableView1 = new TableView<>();
        tableView1.setPrefSize(683, 398);

        // Create TableColumns
        TableColumn<Recipient, Integer> idColumn1 = new TableColumn<>("Id");
        idColumn1.setPrefWidth(46);
        idColumn1.setStyle("-fx-background-color: #d0d6b0;");
        idColumn1.setStyle("-fx-text-fill: 4f2c15");

        TableColumn<Recipient, String> nameColumn1 = new TableColumn<>("Name");
        nameColumn1.setPrefWidth(104);
        nameColumn1.setStyle("-fx-background-color: #8f805e;");
        nameColumn1.setStyle("-fx-text-fill: 4f2c15");

        TableColumn<Recipient, Integer> ageColumn1 = new TableColumn<>("Age");
        ageColumn1.setPrefWidth(42);
        ageColumn1.setStyle("-fx-background-color: #d0d6b0;");
        ageColumn1.setStyle("-fx-text-fill: 4f2c15");

        TableColumn<Recipient, String> phoneColumn1 = new TableColumn<>("Phone No");
        phoneColumn1.setPrefWidth(89);
        phoneColumn1.setStyle("-fx-background-color: #d0d6b0;");
        ageColumn1.setStyle("-fx-text-fill: 4f2c15");

        TableColumn<Recipient, String> emailColumn1 = new TableColumn<>("Email");
        emailColumn1.setPrefWidth(88);
        emailColumn1.setStyle("-fx-background-color: #d0d6b0;");
        emailColumn1.setStyle("-fx-text-fill: 4f2c15");

        TableColumn<Recipient, String> cityColumn1 = new TableColumn<>("City");
        cityColumn1.setPrefWidth(67);
        cityColumn1.setStyle("-fx-background-color: #d0d6b0;");
        cityColumn1.setStyle("-fx-text-fill: 4f2c15");

        TableColumn<Recipient, String> countryColumn1 = new TableColumn<>("Country");
        countryColumn1.setPrefWidth(90);
        countryColumn1.setStyle("-fx-background-color: #8f805e;");
        countryColumn1.setStyle("-fx-text-fill: 4f2c15");


        // Add columns to the TableView
        tableView1.getColumns().addAll(idColumn1, nameColumn1, ageColumn1, phoneColumn1, emailColumn1,  cityColumn1, countryColumn1);

        // Add the TableView to the GridPane
        gridPane1.add(tableView1, 0, 1, 2, 1); // Span across two columns
        gridPane1.setAlignment(Pos.CENTER);
        gridPane1.setStyle("-fx-background-color: #4f2c15;");
        GridPane.setValignment(label1, VPos.CENTER);
        GridPane.setHalignment(label1, HPos.CENTER);

        // Create and set the scene
        Scene sceneR = new Scene(gridPane1);



        //BLOOD REQUEST
        Label bloodrequest = new Label("Blood Request");
        bloodrequest.setStyle("-fx-text-fill: #a30d4c;");
        bloodrequest.setFont(Font.font("Times New Roman", FontPosture.ITALIC, 28));


        Label reqID = new Label("Name ");
        reqID.setStyle("-fx-text-fill: #a30d4c;");
        reqID.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));

        TextField reqID2 = new TextField();
        reqID2.setStyle("-fx-background-color: #a30d4c; -fx-text-fill: #fafbfc;");
        reqID2.setPrefSize(269, 37);

        Label bloodgroupreq = new Label("BloodGroup");
        bloodgroupreq.setStyle("-fx-text-fill:  #a30d4c;");
        bloodgroupreq.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));

        Label Contact = new Label("Phone");
        Contact.setStyle("-fx-text-fill:  #a30d4c; ");
        Contact.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));

        TextField contt = new TextField();
        contt.setStyle("-fx-background-color: #a30d4c; -fx-text-fill: #fafbfc; ");
        contt.setPrefSize(269, 37);


        ChoiceBox<String> bloodreqChoiceBox = new ChoiceBox<>();
        bloodreqChoiceBox.getItems().addAll("A", "B", "AB", "O");
        bloodreqChoiceBox.setPrefSize(269, 37);
        bloodreqChoiceBox.setStyle("-fx-background-color: #a30d4c; ");

        Label RHreq = new Label("RH-Factor ");
        RHreq.setFont(Font.font("Times New Roman", 20));
        RHreq.setStyle("-fx-text-fill: #a30d4c; ");

        ChoiceBox<String> rhFactorreqChoiceBox = new ChoiceBox<>();
        rhFactorreqChoiceBox.getItems().addAll("+", "-");
        rhFactorreqChoiceBox.setPrefSize(269, 37);
        rhFactorreqChoiceBox.setStyle("-fx-background-color: #a30d4c; ");

        Label quantityRequired1 = new Label("Quantity");
        quantityRequired1.setFont(Font.font("Times New Roman", 20));
        quantityRequired1.setStyle("-fx-text-fill: #a30d4c; ");

        TextField quantityrequired2 = new TextField();
        quantityrequired2.setStyle("-fx-background-color: #a30d4c; -fx-text-fill: #fafbfc; ");
        quantityrequired2.setPrefSize(269, 37);


        // GridPane configuration
        HBox reqbox1 = new HBox();
        reqbox1.getChildren().addAll(reqID, reqID2);
        reqbox1.setAlignment(Pos.CENTER_RIGHT);


        HBox reqbox2 = new HBox();
        reqbox2.getChildren().addAll(bloodgroupreq, bloodreqChoiceBox);
        reqbox2.setAlignment(Pos.CENTER_RIGHT);

        HBox contactbox = new HBox();
        contactbox.getChildren().addAll(Contact, contt);
        contactbox.setAlignment(Pos.CENTER_RIGHT);

        HBox reqbox3 = new HBox();
        reqbox3.getChildren().addAll(RHreq, rhFactorreqChoiceBox);
        reqbox3.setAlignment(Pos.CENTER_RIGHT);

        HBox qt1 = new HBox();
        qt1.getChildren().addAll(quantityRequired1, quantityrequired2);
        qt1.setAlignment(Pos.CENTER_RIGHT);



        Button request = new Button("Request");
        request.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 22));
        request.setStyle("-fx-text-fill: #edf1f7 ;  -fx-background-color: #a30d4c; ");


        VBox hbox16 = new VBox(20); // HBox for the VBox containing the label and text field and VBox containing buttons
        hbox16.setAlignment(Pos.CENTER_RIGHT); // Aligning to the extreme right
        hbox16.getChildren().addAll(bloodrequest, reqbox1, reqbox2,contactbox, reqbox3, qt1, request);
        hbox16.setPadding(new Insets(10, 60, 50, 80));

        Image image25 = new Image("file:\\C:\\Users\\Lenovo T480s\\Downloads\\BloodRequest-removebg-preview.png");
        ImageView imageview25 = new ImageView(image25);
        imageview25.setFitWidth(500); // Adjust the size as needed
        imageview25.setFitHeight(500);
        imageview25.setPreserveRatio(true);


// Create the StackPane to overlay the VBox on the image
        StackPane sp27 = new StackPane();
        sp27.getChildren().addAll(imageview25, hbox16);
        sp27.setStyle("-fx-background-color: #d19fb4;");

// Set alignment of the HBox within the StackPane
        // Aligning hbox7 to the bottom right
        StackPane.setAlignment(hbox16, Pos.CENTER_RIGHT); // Aligning hbox5 to the baseline right
        StackPane.setAlignment(imageview25, Pos.CENTER_LEFT);

        Scene scene27 = new Scene(sp27, screenBounds.getHeight(), screenBounds.getWidth());

        //BLOOD REQUEST TABLE
        GridPane gridPaneforRequest= new GridPane();
        gridPaneforRequest.setStyle("-fx-background-color: #4f2c15;");
        gridPaneforRequest.setPrefSize(683, 458);

        // Configure column constraints for layout
        ColumnConstraints columnrequests = new ColumnConstraints();
        ColumnConstraints columnrequestss = new ColumnConstraints();
        columnrequests.setHgrow(Priority.ALWAYS);
        columnrequestss.setHgrow(Priority.ALWAYS);
        //gridPaneforRequest.getColumnConstraints().addAll(columnrequests, columnrequestss);

        // Create the Label
        Label labelr = new Label("Blood Requests");
        labelr.setFont(Font.font("Times New Roman",FontPosture.ITALIC,28));
        labelr.setStyle("-fx-text-fill: #d0d6b0");
        labelr.setAlignment(Pos.CENTER);
        gridPaneforRequest.add(labelr, 0, 0, 2, 1); // Span across two columns

        // Create the TableView
        TableView<BloodRequest> tableView5 = new TableView<>();
        tableView5.setPrefSize(700, 389);

        // Create TableColumns with updated names
        TableColumn<BloodRequest, String> idrequest = new TableColumn<>(" ID");
        idrequest.setPrefWidth(100);

        TableColumn<BloodRequest, String> namerequest = new TableColumn<>(" Name");
        namerequest.setPrefWidth(104);

        TableColumn<BloodRequest, String> phonerequest = new TableColumn<>(" Phone ");
        phonerequest.setPrefWidth(102);

        TableColumn<BloodRequest, String> Bloodtyperequest = new TableColumn<>("BloodType");
        Bloodtyperequest.setPrefWidth(100);


        TableColumn<BloodRequest, String> Quantityrequest = new TableColumn<>("Quantity");
        Quantityrequest.setPrefWidth(100);


        // Add columns to the TableView
        tableView5.getColumns().addAll(idrequest,namerequest,phonerequest,Bloodtyperequest,Quantityrequest);

        // Add the TableView to the GridPane
        GridPane.setColumnSpan(tableView5, 2); // Span across two columns
        gridPaneforRequest.add(tableView5, 0, 1);
        gridPaneforRequest.setAlignment(Pos.CENTER);
        GridPane.setHalignment(labelr, HPos.CENTER);
        GridPane.setValignment(labelr, VPos.CENTER);

        // Create and set the scene
        Scene sceneReq = new Scene(gridPaneforRequest);


        donor.setOnAction(e -> {
            menu.setStyle("-fx-background-color: #700f17; -fx-text-fill: #faf9f7;");
            leftpane.setStyle("-fx-background-color: #700f17; -fx-text-fill: #faf9f7;");
            donor.setStyle("-fx-background-color: #700f17; -fx-text-fill: #faf9f7;");
            recipients.setStyle("-fx-background-color: #700f17; -fx-text-fill: #faf9f7;");
            bloodbank.setStyle("-fx-background-color: #700f17; -fx-text-fill: #faf9f7;");
            viewDetails.setStyle("-fx-background-color: #700f17; -fx-text-fill: #faf9f7;");
            PerformTransfusion.setStyle("-fx-background-color: #700f17; -fx-text-fill: #faf9f7;");
            BloodRequest.setStyle("-fx-background-color: #700f17; -fx-text-fill: #faf9f7;");
            Logout.setStyle("-fx-background-color: #700f17; -fx-text-fill: #faf9f7;");
            rightpane.getChildren().clear();
            rightpane.getChildren().add(sp2);
        });
        adddonor.setOnAction(e -> {
            rightpane.getChildren().clear();
            rightpane.getChildren().add(sp6);
        });
        addBTN.setOnAction( e-> {
            int donorid = Integer.parseInt(id1.getText());
            String namedonor = name1.getText();
            String cityy =city1.getText();
            String Country= country1.getText() ;
            int agge= Integer.parseInt( age1.getText());
            String phonee=phone1.getText();
            String emaill=email1.getText();
            String btype=bg1.getValue();
            String brh =rh1.getValue();
            BloodGroup donorbg = new BloodGroup(btype,brh);
            Address donorAddress = new Address(cityy,Country);
            Contact donorContact = new Contact(phonee,emaill);
            Donor d = new Donor(donorid, namedonor,agge,donorAddress,donorContact,donorbg);
            try {
                bank.addDonor(d);
                showAlert(Alert.AlertType.INFORMATION,"Success","Donor has been added successfully");
                id1.clear();
                name1.clear();
                city1.clear();
                country1.clear();
                age1.clear();
                phone1.clear();
                email1.clear();

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        removedonor.setOnAction(e -> {
            rightpane.getChildren().clear();
            rightpane.getChildren().add(sp8);
        });

        dremove.setOnAction(e-> {
            String donorToRemove = dname2.getText();
            try {
                bank.deleteDonor(donorToRemove);
                showAlert(Alert.AlertType.INFORMATION,"Success","Donor has been removed successfully");
                dname2.clear();
            } catch (DonorNotFoundException ex) {
                showAlert(Alert.AlertType.ERROR,"Failure", ex.getMessage());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        updatedonor.setOnAction(e -> {
            rightpane.getChildren().clear();
            rightpane.getChildren().add(sp9);
        });

        addS3.setOnAction(e-> {
            String donortoupdate = DonorName1S.getText();
            String newdonorname = DNameS1.getText();
            int newdonorage = Integer.parseInt(DonorAgeS1.getText());

            String dnewCity = DonorCityS1.getText();
            String dnewCountry = DonorCountryS1.getText();
            Address dnewAdd = new Address(dnewCity, dnewCountry);

            try {
                bank.updateDonor(donortoupdate, newdonorname, dnewAdd, newdonorage);
                showAlert(Alert.AlertType.INFORMATION, "Success", "Donor Updated Successfully");
                DonorName1S.clear();
                DNameS1.clear();
                DonorAgeS1.clear();
                DonorCityS1.clear();
                DonorCountryS1.clear();
            } catch (DonorNotFoundException
                    ex) {
                showAlert(Alert.AlertType.ERROR, "Failure", ex.getMessage());
            }
        });


        searchdonor.setOnAction(e -> {
            rightpane.getChildren().clear();
            rightpane.getChildren().add(sp10);
        });

        SearchS4.setOnAction(e->{
                    String name9 = DonorNameLabelS1.getText();
                    try {
                        int i = bank.searchDonor(name9);
                        showAlert(Alert.AlertType.INFORMATION,"Success","Donor found");
                        DonorNameLabelS1.clear();
                        rightpane.getChildren().clear();
                        rightpane.getChildren().add(sp11); //scene9S
                        DonoridLabelS1.setText(Integer.toString(bank.getDonor().get(i).getId()));
                        DonornameS1.setText( bank.getDonor().get(i).getName());
                        DonorBloodGrpS1.setText( bank.getDonor().get(i).getBloodGroup().getType()+bank.getDonor().get(i).getBloodGroup().getRhFactor());
                        DonorContactNumS1.setText( bank.getDonor().get(i).getContact().getPhoneNo());
                        DonorEmailS1.setText( bank.getDonor().get(i).getContact().getEmail());
                        DonorAddressS1.setText( bank.getDonor().get(i).getAddress().getCity()+bank.getDonor().get(i).getAddress().getCountry());

                    } catch (DonorNotFoundException ex) {
                        showAlert(Alert.AlertType.ERROR,"Failure",ex.getMessage());
                    }
                }
        );



        searchsamedonor.setOnAction(e -> {
            rightpane.getChildren().clear();
            rightpane.getChildren().add(gridPane6);
        });
        sameBTN.setOnAction(e->{
            String tyoeofblood =bloodGroupChoiceBoxS.getValue();
            String rhfactorofblood = rhFactorChoiceBoxS.getValue();
            BloodGroup khoon = new BloodGroup(tyoeofblood,rhfactorofblood);
            ArrayList<Donor> tableofsamedonorslist =bank.searchDonorsOfSameBloodType(khoon);
            ObservableList<Donor> donorslist = FXCollections.observableArrayList(tableofsamedonorslist);
            tableView.setItems(donorslist);
            tableView.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
            donorColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
            bloodGroupColumn.setCellValueFactory(cellData ->
                    new SimpleStringProperty(cellData.getValue().getBloodGroup().getType()));
            rhColumn.setCellValueFactory(cellData ->
                    new SimpleStringProperty(cellData.getValue().getBloodGroup().getRhFactor()));
            donorIdColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
            donorAgeColumn.setCellValueFactory(new PropertyValueFactory<>("age"));
            donorContactColumn.setCellValueFactory(cellData ->
                    new SimpleStringProperty(cellData.getValue().getContact().getPhoneNo()));
            donorEmailColumn.setCellValueFactory(cellData ->
                    new SimpleStringProperty(cellData.getValue().getContact().getEmail()));
        });
        recipients.setOnAction(e ->
        {
            menu.setStyle("-fx-background-color: #0a0a45; -fx-text-fill: #faf9f7;");
            leftpane.setStyle("-fx-background-color: #0a0a45; -fx-text-fill: #faf9f7;");
            donor.setStyle("-fx-background-color: #0a0a45; -fx-text-fill: #faf9f7;");
            recipients.setStyle("-fx-background-color: #0a0a45; -fx-text-fill: #faf9f7;");
            viewDetails.setStyle("-fx-background-color: #0a0a45; -fx-text-fill: #faf9f7;");
            bloodbank.setStyle("-fx-background-color: #0a0a45; -fx-text-fill: #faf9f7;");
            PerformTransfusion.setStyle("-fx-background-color: #0a0a45; -fx-text-fill: #faf9f7;");
            BloodRequest.setStyle("-fx-background-color: #0a0a45; -fx-text-fill: #faf9f7;");
            Logout.setStyle("-fx-background-color: #0a0a45; -fx-text-fill: #faf9f7;");
            rightpane.getChildren().clear();
            rightpane.getChildren().add(sp3);
        });
        addrec.setOnAction(e -> {
            rightpane.getChildren().clear();
            rightpane.getChildren().add(sp13);
        });


        removerec.setOnAction(e -> {
            rightpane.getChildren().clear();
            rightpane.getChildren().add(sp14);
        });
        rremove.setOnAction(e-> {
            String recipientToRemove = removerecname2 .getText();
            try {
                bank.removeRecipient(recipientToRemove);
                showAlert(Alert.AlertType.CONFIRMATION,"Success","Recipient removed Successfully");
                removerecname2.clear();
            } catch (RecepientNotFoundException ex) {
                showAlert(Alert.AlertType.ERROR,"Failure", ex.getMessage());
            }
        });

        updaterec.setOnAction(e -> {
            rightpane.getChildren().clear();
            rightpane.getChildren().add(sp15);
        });

        addS2.setOnAction(e->{
            String recetoupdate=  RecipientName1S.getText();
            String  newname = RNameS1.getText();
            int newage =Integer.parseInt(AgeS1.getText());
            String PHONE=ContactS1.getText();
            String newCity=  CityS1.getText();
            String newCountry= CountryS1.getText();
            Address NEWADD= new Address(newCity,newCountry);
            Contact C = new Contact(PHONE);
            try {
                bank.updateRecipient(recetoupdate,newname,C,NEWADD,newage);
                showAlert(Alert.AlertType.INFORMATION,"Success","Recepient Updated Successfully");
                RecipientName1S.clear();
                RNameS1.clear();
                AgeS1.clear();
                ContactS1.clear();
                CityS1.clear();
            } catch (RecepientNotFoundException ex) {
                showAlert(Alert.AlertType.ERROR,"Failure",ex.getMessage());
            }


        });

        searchrec.setOnAction(e -> {
            rightpane.getChildren().clear();
            rightpane.getChildren().add(sp16);});

        SearchS3.setOnAction(e -> {
            String name10= RecipientNameLabelS1.getText();
            try {
                int i = bank.searchRecepient(name10);
                showAlert(Alert.AlertType.INFORMATION,"Success","Recipient found");
                RecipientNameLabelS1.clear();
                rightpane.getChildren().clear();
                rightpane.getChildren().add(sp17);
                RecipientidLabelS1.setText(Integer.toString(bank.getRecipient().get(i).getId()));
                RecipientnameS1.setText( bank.getRecipient().get(i).getName());
                RecipientAgeS1.setText(Integer.toString(bank.getRecipient().get(i).getAge()));
                RecipientContactS1.setText( bank.getRecipient().get(i).getContact().getPhoneNo());
                RecipientEmailS1.setText( bank.getRecipient().get(i).getContact().getEmail());
                RecAddressS1.setText( bank.getRecipient().get(i).getAddress().getCity()+bank.getRecipient().get(i).getAddress().getCountry());

            } catch (RecepientNotFoundException ex) {
                showAlert(Alert.AlertType.ERROR,"Failure",ex.getMessage());
            }

        });


        addr.setOnAction(e-> {
            int recipientid = Integer.parseInt(rid1.getText());
            String namerecipient = rname1.getText();
            int agerecipient = Integer.parseInt(rage1.getText());
            String cityreciepient = rcity1.getText();
            String Countryrecipient = rcountry1.getText();
            String phonerecipient = rphone1.getText();
            String emaillrecipient = remail1.getText();
            Address recipientAddress = new Address(cityreciepient, Countryrecipient);
            Contact recipientContact = new Contact(phonerecipient, emaillrecipient);
            Recipient r = new Recipient(recipientid, namerecipient, agerecipient, recipientAddress, recipientContact);
            bank.addRecipient(r);
            showAlert(Alert.AlertType.CONFIRMATION, "Success", "Recipient has been added successfully");
            rid1.clear();
            rname1.clear();
            rage1.clear();
            rcity1.clear();
            rcountry1.clear();
            rphone1.clear();
            remail1.clear();
        });

        bloodbank.setOnAction(e -> {
            menu.setStyle("-fx-background-color: #570a45; -fx-text-fill: #faf9f7;");
            leftpane.setStyle("-fx-background-color: #570a45; -fx-text-fill: #faf9f7;");
            donor.setStyle("-fx-background-color: #570a45; -fx-text-fill: #faf9f7;");
            recipients.setStyle("-fx-background-color: #570a45; -fx-text-fill: #faf9f7;");
            viewDetails.setStyle("-fx-background-color: #570a45; -fx-text-fill: #faf9f7;");
            bloodbank.setStyle("-fx-background-color: #570a45; -fx-text-fill: #faf9f7;");
            PerformTransfusion.setStyle("-fx-background-color: #570a45; -fx-text-fill: #faf9f7;");
            BloodRequest.setStyle("-fx-background-color: #570a45; -fx-text-fill: #faf9f7;");
            Logout.setStyle("-fx-background-color: #570a45; -fx-text-fill: #faf9f7;");
            rightpane.getChildren().clear();
            rightpane.getChildren().add(sp4);

        });
        addBB.setOnAction(E-> {
            rightpane.getChildren().clear();
            rightpane.getChildren().add(sp19);
        });
        addBloodBag.setOnAction(e -> { //DONE
            rightpane.getChildren().clear();
            rightpane.getChildren().add(sp19);
            String bloodBagid = bid1.getText();
            String Bloodgroup =  bloodgrpBox .getValue();
            String rhFactor =rhFactorChoiceBox.getValue();
            int bbquantity= Integer.parseInt( quantity1.getText());
            LocalDate donationLocalDate=datePicker1.getValue();
            LocalDate  expiryLocalDate =datePicker2.getValue();
            Date donationDate = Date.from(donationLocalDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
            Date expiryyDate = Date.from(expiryLocalDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
            BloodGroup bloodG = new BloodGroup(Bloodgroup,rhFactor );
            BloodBag bloodBag= new BloodBag(bloodBagid,bloodG ,bbquantity,donationDate,expiryyDate);
            bank.addBloodBag(bloodBag);
            showAlert(Alert.AlertType.CONFIRMATION,"Success","Blood Bag has been added successfully");
            bid1.clear();
            quantity1.clear();


        });
        removeBB.setOnAction(e -> {
            rightpane.getChildren().clear();
            rightpane.getChildren().add(sp20);
        });
        bbremove.setOnAction(e-> {
            String bagToRemove=removebb2.getText() ;
            try {
                bank.removeBloodBag(bagToRemove);
                showAlert(Alert.AlertType.INFORMATION,"Success","Bag removed Successfully");
                removebb2.clear();
            } catch (BloodBagNotFoundException ex) {
                showAlert(Alert.AlertType.ERROR,"Failure", ex.getMessage());
            }
        });

        updateBB.setOnAction(e -> {//
            rightpane.getChildren().clear();
            rightpane.getChildren().add(sp21);
        });

        addS.setOnAction(e->{
            String idbb= BBID1.getText();
            int bbquantity= Integer.parseInt(BNameS1.getText());
            try {
                bank.updateBloodBag(idbb,bbquantity);
                showAlert(Alert.AlertType.INFORMATION,"Success","Blood Bag Updated Succesfully");
                BBID1.clear();
                BNameS1.clear();
            } catch (BloodBagNotFoundException ex){
                showAlert(Alert.AlertType.INFORMATION,"Failure", ex.getMessage());
            }
        });

        searchBB.setOnAction(e -> {//Done
            rightpane.getChildren().clear();
            rightpane.getChildren().add(sp22);
        });

        SearchS2.setOnAction(e -> {


            String bloodtype = bloodGroupChoiceBox.getValue();
            String rhFactor= rhFactorChoiceBox.getValue();
            BloodGroup bloodg = new BloodGroup(bloodtype,rhFactor);
            try {

                int i = bank.searchBloodBag(bloodg);
                showAlert(Alert.AlertType.INFORMATION,"Success","Blood bag found");
                rightpane.getChildren().clear();
                rightpane.getChildren().add(sp23); //scene7s
                bbLabelS1.setText(bank.getInventory().get(i).getBagId());
                bbnameS1.setText(  bank.getInventory().get(i).getBloodGroup().getType());
                rhfactor1.setText( bank.getInventory().get(i).getBloodGroup().getRhFactor());
                quantityS1.setText(Integer.toString(bank.getInventory().get(i).getQuantity()));
                DDATES1.setText(bank.getInventory().get(i).getDonationDate().toString() );
                EXDATES1.setText( bank.getInventory().get(i).getExpiryDate().toString());


            } catch (BloodBagNotFoundException ex) {
                showAlert(Alert.AlertType.ERROR,"Failure",ex.getMessage());
            }

        });

        viewDetails.setOnAction(e -> {
            menu.setStyle("-fx-background-color: #4f2c15; -fx-text-fill: #faf9f7;");
            leftpane.setStyle("-fx-background-color: #4f2c15; -fx-text-fill: #faf9f7;");
            donor.setStyle("-fx-background-color: #4f2c15; -fx-text-fill: #faf9f7;");
            recipients.setStyle("-fx-background-color: #4f2c15; -fx-text-fill: #faf9f7;");
            bloodbank.setStyle("-fx-background-color: #4f2c15; -fx-text-fill: #faf9f7;");
            viewDetails.setStyle("-fx-background-color: #4f2c15; -fx-text-fill: #faf9f7;");
            PerformTransfusion.setStyle("-fx-background-color: #4f2c15; -fx-text-fill: #faf9f7;");
            BloodRequest.setStyle("-fx-background-color: #4f2c15; -fx-text-fill: #faf9f7;");
            Logout.setStyle("-fx-background-color: #4f2c15; -fx-text-fill: #faf9f7;");
            rightpane.getChildren().clear();
            rightpane.getChildren().add(sp5);
        });
        inventReport.setOnAction(e -> {//DONE
            rightpane.getChildren().clear();
            rightpane.getChildren().add(gridPane2);
            ObservableList<BloodBag> BloodBaglist = FXCollections.observableArrayList(bank.getInventoryReport());
            tableView2.setItems(BloodBaglist);
            tableView2.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
            bagIdColumn2.setCellValueFactory(new PropertyValueFactory<>("bagId"));
            bloodGroupColumn2.setCellValueFactory(cellData ->
                    new SimpleStringProperty(cellData.getValue().getBloodGroup().getType()));
            rhFactorColumn2.setCellValueFactory(cellData ->
                    new SimpleStringProperty(cellData.getValue().getBloodGroup().getRhFactor()));
            quantityColumn2.setCellValueFactory(new PropertyValueFactory<>("quantity"));
            donationDateColumn2.setCellValueFactory(new PropertyValueFactory<>("donationDate"));
            expiryDateColumn2.setCellValueFactory(new PropertyValueFactory<>("expiryDate"));
            tableView2.refresh();
        });
        donorReport.setOnAction(e -> {//DONE
            rightpane.getChildren().clear();
            rightpane.getChildren().add(gridPane3);
            ObservableList<Donor> donorlist = FXCollections.observableArrayList(bank.getDonor());
            tableView3.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
            tableView3.setItems(donorlist);
            nameColumn3.setCellValueFactory(new PropertyValueFactory<>("name"));
            bgColumn3.setCellValueFactory(cellData ->
                    new SimpleStringProperty(cellData.getValue().getBloodGroup().getType() + cellData.getValue().getBloodGroup().getRhFactor()));
            idColumn3.setCellValueFactory(new PropertyValueFactory<>("id"));
            ageColumn3.setCellValueFactory(new PropertyValueFactory<>("age"));
            phoneColumn3.setCellValueFactory(cellData ->
                    new SimpleStringProperty(cellData.getValue().getContact().getPhoneNo()));
            emailColumn3.setCellValueFactory(cellData ->
                    new  SimpleStringProperty(cellData.getValue().getContact().getEmail()));
            cityColumn3.setCellValueFactory(cellData ->
                    new SimpleStringProperty(cellData.getValue().getAddress().getCity()));
            countryColumn3.setCellValueFactory(cellData ->
                    new SimpleStringProperty(cellData.getValue().getAddress().getCountry()));
        });
        recReport.setOnAction(e -> {
            rightpane.getChildren().clear();
            rightpane.getChildren().add(gridPane1);

            // Create ObservableList from the recipients report
            ObservableList<Recipient> Recipientlist = FXCollections.observableArrayList(bank.getRecipientsReport());
            tableView1.setItems(Recipientlist);
            tableView1.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

            idColumn1.setCellValueFactory(new PropertyValueFactory<>("id"));
            nameColumn1.setCellValueFactory(new PropertyValueFactory<>("name"));
            ageColumn1.setCellValueFactory(new PropertyValueFactory<>("age"));
            phoneColumn1.setCellValueFactory(cellData ->
                    new SimpleStringProperty(cellData.getValue().getContact().getPhoneNo()));
            emailColumn1.setCellValueFactory(cellData ->
                    new SimpleStringProperty(cellData.getValue().getContact().getEmail()));
            cityColumn1.setCellValueFactory(cellData ->
                    new SimpleStringProperty(cellData.getValue().getAddress().getCity()));
            countryColumn1.setCellValueFactory(cellData ->
                    new SimpleStringProperty(cellData.getValue().getAddress().getCountry()));

            // Optional: refresh the table view to ensure it updates
            tableView1.refresh();
        });


        BloodRequest.setOnAction(e -> {//DONE
            menu.setStyle("-fx-background-color: #a30d4c; -fx-text-fill: #faf9f7;");
            leftpane.setStyle("-fx-background-color: #a30d4c; -fx-text-fill: #faf9f7;");
            donor.setStyle("-fx-background-color: #a30d4c; -fx-text-fill: #faf9f7;");
            recipients.setStyle("-fx-background-color: #a30d4c; -fx-text-fill: #faf9f7;");
            bloodbank.setStyle("-fx-background-color: #a30d4c; -fx-text-fill: #faf9f7;");
            viewDetails.setStyle("-fx-background-color: #a30d4c; -fx-text-fill: #faf9f7;");
            PerformTransfusion.setStyle("-fx-background-color: #a30d4c; -fx-text-fill: #faf9f7;");
            BloodRequest.setStyle("-fx-background-color: #a30d4c; -fx-text-fill: #faf9f7;");
            Logout.setStyle("-fx-background-color: #a30d4c; -fx-text-fill: #faf9f7;");

            rightpane.getChildren().clear();
            rightpane.getChildren().add(sp27);
        });

        request.setOnAction(e->{//Done
            String NAME = reqID2.getText();
            String Phone = contt.getText();
            String BloodGROUP = bloodreqChoiceBox.getValue();
            String rhh = rhFactorChoiceBox.getValue();
            int Quantity = Integer.parseInt(quantityrequired2.getText());
            BloodRequest REQ = new BloodRequest(NAME,new Contact(Phone),Quantity,new BloodGroup(BloodGROUP,rhh));
            bank.makeaRequest(REQ);

        });
        PerformTransfusion.setOnAction(e -> {//dONE
            menu.setStyle("-fx-background-color: #114026; -fx-text-fill: #faf9f7;");
            leftpane.setStyle("-fx-background-color: #114026; -fx-text-fill: #faf9f7;");
            donor.setStyle("-fx-background-color: #114026; -fx-text-fill: #faf9f7;");
            bloodbank.setStyle("-fx-background-color: #114026; -fx-text-fill: #faf9f7;");
            recipients.setStyle("-fx-background-color: #114026; -fx-text-fill: #faf9f7;");
            viewDetails.setStyle("-fx-background-color: #114026; -fx-text-fill: #faf9f7;");
            PerformTransfusion.setStyle("-fx-background-color: #114026; -fx-text-fill: #faf9f7;");
            BloodRequest.setStyle("-fx-background-color: #114026; -fx-text-fill: #faf9f7;");
            Logout.setStyle("-fx-background-color: #114026; -fx-text-fill: #faf9f7;");

            rightpane.getChildren().clear();
            rightpane.getChildren().add(sp24);
        });
        transfuseblood.setOnAction(E->{//Done
            int idrece = Integer.parseInt(transID2.getText());
            String Btype = bloodTransChoiceBox.getValue();
            String Brh = rhFactortransChoiceBox.getValue();
            BloodGroup blood = new BloodGroup(Btype,Brh);
            int quantityblood = Integer.parseInt(quantityrequired.getText());
            boolean result = false;
            try {
                result = bank.performTransfusion(idrece,blood,quantityblood);
                if(result){
                    showAlert(Alert.AlertType.INFORMATION,"Success","Blood is transfused successfully");
                }
            }catch (RecepientNotFoundException e){
                showAlert(Alert.AlertType.ERROR,"Failed",e.getMessage());
            }catch (InsufficientBloodException e){
                showAlert(Alert.AlertType.ERROR,"Failed",e.getMessage());
            }
        });

        home7S.setOnAction(e->{
            rightpane.getChildren().clear();
            rightpane.getChildren().add(sp22);
        });
        home8S.setOnAction(e->{
            rightpane.getChildren().clear();
            rightpane.getChildren().add(sp16);
        });
        home9S.setOnAction(e->{
            rightpane.getChildren().clear();
            rightpane.getChildren().add(sp10);
        });
        requestedbloodreport.setOnAction(e->{
            rightpane.getChildren().clear();
            rightpane.getChildren().add(gridPaneforRequest);
            ObservableList<BloodRequest> requestslist=FXCollections.observableArrayList(bank.getBloodRequests());
            tableView5.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
            tableView5.setItems(requestslist);
            namerequest.setCellValueFactory(new PropertyValueFactory<>("name"));
            idrequest.setCellValueFactory(new PropertyValueFactory<>("id"));
            phonerequest.setCellValueFactory(cellData ->
                    new javafx.beans.property.SimpleStringProperty(cellData.getValue().getPhone().getPhoneNo()));
            Quantityrequest.setCellValueFactory(new PropertyValueFactory<>("quantity"));
            Bloodtyperequest.setCellValueFactory(cellData ->
                    new javafx.beans.property.SimpleStringProperty(cellData.getValue().getBloodgroup().getType() + cellData.getValue().getBloodgroup().getType()));
            tableView5.refresh();
        });

//        Logout.setOnAction( e-> {
//           primaryStage.setScene(loginscene);
//       });
        signup2.setOnAction(e->{
            primaryStage.setScene(sceneMenue);
        });
//      login2.setOnAction(e->{primaryStage.setScene(loginscene);
//        });
//        b1.setOnAction(e->{
//           String userNaam = username.getText();
//            String Password = passwordField.getText();
//            boolean adminz=false;
//           try {
//                adminz = returnAdminObject(userNaam,Password);
//               primaryStage.setScene(sceneMenue);
//                username.clear();
//                passwordField.clear();
//
//            } catch (WrongCredentialsException ex) {
//                showAlert(Alert.AlertType.ERROR,"Failure",ex.getMessage());
//            }
//
//
//       });
//        b2.setOnAction(e->{
//           primaryStage.setScene(loginscene);
//        });
        homeS6.setOnAction(e->{
            rightpane.getChildren().clear();
            rightpane.getChildren().add(sp2);
        });
        primaryStage.setScene(signupPane);
        primaryStage.show();
    }


    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


