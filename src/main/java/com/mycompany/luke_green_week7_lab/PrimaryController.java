package com.mycompany.luke_green_week7_lab;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class PrimaryController {
    
    //i have some code for a secondary view, but ended up only using t5he primary view to acheive the goal
    
    int counter = 0;
    int rotateCounter = 0;
    
    @FXML
    Label myCounterLabel;
    
    @FXML
    private ImageView fishPic;
    
    @FXML
    private ImageView goosePic;

    @FXML
    private Label pictureLabel1;

    @FXML
    private Label pictureLabel2;

    @FXML
    private Button primaryButton;
    
    @FXML
    private Button rotateButton;

    @FXML
    private void switchToSecondary() throws IOException {
        counter++;
        myCounterLabel.setText(""+counter);
        App.setRoot("secondary");
    }
    
    //goose to fish
    @FXML
    private void switchPicture1() throws IOException {
        counter++;
        myCounterLabel.setText(""+counter);
        goosePic.setOpacity(0);
        fishPic.setOpacity(1);
    }
    
    //fish to goose
    @FXML
    private void switchPicture2() throws IOException {
        counter++;
        myCounterLabel.setText(""+counter);
        goosePic.setOpacity(1);
        fishPic.setOpacity(0);
    }
    
    //to rotate the picture
    @FXML
    private void rotatePicture() throws IOException {
        if(rotateCounter == 0) {
        counter++;
        myCounterLabel.setText(""+counter);
        rotateCounter++;
        goosePic.setRotate(25);
        fishPic.setRotate(25);
        }
        else {
        counter++;
        myCounterLabel.setText(""+counter);
        rotateCounter--;
        goosePic.setRotate(0);
        fishPic.setRotate(0);
        }
    }
}
