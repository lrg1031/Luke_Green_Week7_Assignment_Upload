package com.mycompany.luke_green_week7_lab;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {
    
    int counter = 0;

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    
    @FXML
    private char counter() {
        return (char)counter;
    }
}
