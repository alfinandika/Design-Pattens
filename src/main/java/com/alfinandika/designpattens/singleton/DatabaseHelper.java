package com.alfinandika.designpattens.singleton;

public class DatabaseHelper {

    private static Connection connection;

    public static Connection getConnection() {
        if(connection == null){
            connection = new Connection("Localhost", "root", "toor");
        }

        return connection;
    }
}
