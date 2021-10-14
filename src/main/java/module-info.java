module com.mycompany.luke_green_week7_lab {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.luke_green_week7_lab to javafx.fxml;
    exports com.mycompany.luke_green_week7_lab;
}
