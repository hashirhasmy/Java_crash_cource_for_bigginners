package com.lao.javalearning.exersice;
import java.sql.*;

public class jdbc {

    public static void main(String[] args) {
        Connection connection = null;
        try {
            // Connect to the database
            connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "password");

            // Insert data
            String insertQuery = "INSERT INTO users (name, age) VALUES (?, ?)";
            PreparedStatement insertStmt = connection.prepareStatement(insertQuery);
            insertStmt.setString(1, "John");
            insertStmt.setInt(2, 25);
            int insertedRows = insertStmt.executeUpdate();
            System.out.println(insertedRows + " rows inserted.");

            // Read data
            String selectQuery = "SELECT * FROM users";
            PreparedStatement selectStmt = connection.prepareStatement(selectQuery);
            ResultSet resultSet = selectStmt.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                System.out.println("Name: " + name + ", Age: " + age);
            }

            // Update data
            String updateQuery = "UPDATE users SET name = ? WHERE name = ?";
            PreparedStatement updateStmt = connection.prepareStatement(updateQuery);
            updateStmt.setString(1, "Jack");
            updateStmt.setString(2, "John");
            int updatedRows = updateStmt.executeUpdate();
            System.out.println(updatedRows + " rows updated.");

            // Delete data
            String deleteQuery = "DELETE FROM users WHERE name = ?";
            PreparedStatement deleteStmt = connection.prepareStatement(deleteQuery);
            deleteStmt.setString(1, "Jack");
            int deletedRows = deleteStmt.executeUpdate();
            System.out.println(deletedRows + " rows deleted.");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}


