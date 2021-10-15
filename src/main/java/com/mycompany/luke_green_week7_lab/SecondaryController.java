package com.mycompany.luke_green_week7_lab;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class SecondaryController {
    
    @FXML
    private ImageView fishPic;

    @FXML
    private Label myCounterLabel;

    @FXML
    private Button secondaryButton;
    
    @FXML
    private Label pictureLabel;

    @FXML
    private void switchToPrimary() throws IOException {
        
        App.setRoot("primary");
    }
}