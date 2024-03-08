package com.java.prepared;

import java.sql.*;
import java.util.Scanner;

public class PreInsert {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/voyatraining";
        String username = "root";
        String password = "root";
        String sql = "insert into cab values (?,?,?,?,?,?)";
        Connection connection =null;
        PreparedStatement statement =null;

        try {
            connection = DriverManager.getConnection(url, username, password);
            statement = connection.prepareStatement(sql);


            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < 6; i++) {
                System.out.println("cab number");
                int cabNumber = scanner.nextInt();
                System.out.println("drop");
                String drop = scanner.next();
                System.out.println("pickup");
                String pickup = scanner.next();
                String driverName = scanner.next();
                String date = scanner.next();
                String time1 = scanner.next();


                statement.setInt(1, cabNumber);
                statement.setString(2,drop);
                statement.setString(3,pickup);
                statement.setTime(4, Time.valueOf(time1));
                statement.setDate(5, Date.valueOf(date));
                statement.setString(6,driverName);
                boolean result = statement.execute();
                System.out.println(result);
            }


        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
