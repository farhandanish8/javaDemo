package com.api.serial;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerialDemo {
    public static void main(String[] args) {
        try(
                FileInputStream fileInputStream = new FileInputStream("stud.ser");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                ){
            Student student1 = (Student)objectInputStream.readObject();
            System.out.println(student1);
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
