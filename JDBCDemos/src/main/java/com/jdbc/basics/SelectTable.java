package com.jdbc.basics;

import java.sql.*;

public class SelectTable {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost.3306/voyatraining";
        String username = "root";
        String password = "root";
        String sql = "select * from employee";
        try (
                Connection connection = DriverManager.getConnection(url,username,password);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        ){
            while (resultSet.next()){
                String name=resultSet.getString("name");
                int employeeId=resultSet.getInt("employeeId");
                String city= resultSet.getString("city");
                System.out.println(name+" "+employeeId+" "+city);
            }
        }catch (Exception e){
            System.out.println();
            e.printStackTrace();
        }
    }
}
