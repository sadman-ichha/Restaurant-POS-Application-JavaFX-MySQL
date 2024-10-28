module com.sadman.simple_restaurant_pos {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.sadman.simple_restaurant_pos to javafx.fxml;
    exports com.sadman.simple_restaurant_pos;
}