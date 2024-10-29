package com.sadman.simple_restaurant_pos;
import com.sadman.simple_restaurant_pos.db.DbConnection;

import com.sadman.simple_restaurant_pos.db.DbConnection;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() throws ClassNotFoundException {

        welcomeText.setText("Welcome to POS Application!");
        random();
    }

    void random() throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Statement stmt = null;
        try {
            String query = "Select * from items_menu";

            System.out.println(query);


            stmt = DbConnection.getStatement();

            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString("name");
                System.out.println(name);
            }
        } catch (SQLException e) {
            System.out.println("Exception: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}