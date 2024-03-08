package com.java.prepared;

import java.sql.*;
import java.util.Date;
import java.util.Scanner;

public class PreSelectOne {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/voyatraining";
        String username = "root";
        String password = "root";
        String sql = "select * from cab where drop_loc=?";
        try (
                Connection connection = DriverManager.getConnection(url, username, password);
                PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            Scanner scanner = new Scanner(System.in);
            String dropLocation = scanner.next();
            statement.setString(1, dropLocation);


            try (ResultSet resultSet = statement.executeQuery()
            ) {

                while (resultSet.next()) {
                    int cabNumber = resultSet.getInt("cab_number");
                    String drop_Loc = resultSet.getString("drop_loc");
                    String pickupLoc = resultSet.getString("pickup_loc");
                    Time pickupTime = resultSet.getTime("pickup_time");
                    Date date = resultSet.getDate("pickup_date");
                    String driverName = resultSet.getString("driver_name");
                    System.out.println(cabNumber);
                    System.out.println(drop_Loc);
                    System.out.println(pickupLoc);
                    System.out.println(pickupTime);
                    System.out.println(date);
                    System.out.println(driverName);
                    System.out.println("---------------");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
