package com.jdbc.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/voyatraining";
        String username = "root";
        String password = "root";
        try(
                Connection connection = DriverManager.getConnection(url, username, password);
                Statement statement = connection.createStatement();){
            String sql = "update into employee values('Sri',2,'Tumkur')";
            boolean result = statement.execute(sql);
            System.out.println("Data updated " + !result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();

        }
        System.out.println("Done");

    }

    }