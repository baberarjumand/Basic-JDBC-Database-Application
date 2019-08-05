/**
 * This project is a tutorial demo for basic CRUD operations using JDBC
 *
 * - Class Description -
 *
 * Author: Baber Arjumand
 * Date:   Aug 04 2019
 * Time:   11:18 PM
 */

package com.baberarjumand.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnectionManager {

    private final String url;
    private final Properties properties;

    public DatabaseConnectionManager (String host, String databaseName, String username, String password) {
        this.url = "jdbc:postgresql://" + host + "/" + databaseName;
        this.properties = new Properties();
        this.properties.setProperty("user", username);
        this.properties.setProperty("password", password);
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(this.url, this.properties);
    }

}
