package org.grp29.ase.service;

import org.grp29.ase.service.DataAccess;
import org.grp29.ase.model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.xml.catalog.Catalog;

/**
 * Implementation of DataAccess interface
 */
public class MySqlDAO implements DataAccess {
    private Connection conn() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        return DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/ase?useTimeZone=true&serverTimezone=UTC#&dummyparam=", 
            "muhazerin",    // your database username
            "CDW=$V6*BJ-M]gB"   // your database password
        );
    }

    public User getUser(String username, String password) {
        User newUser = null;

        try (Connection conn = conn()) {
            String cmd = String.format("SELECT username, password FROM users WHERE username = '%s' and password = '%s'",
                                        username, password);
            System.out.println("Query: " + cmd);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(cmd);

            while (rs.next()) {
                newUser = new User();
                newUser.setUserName(rs.getString("username"));
                newUser.setPassword(rs.getString("password"));
                break;
            }

            st.close();
            conn.close();
        }
        catch (Exception e) {
            System.out.println("Error msg: " + e.getLocalizedMessage());
            System.out.println("SQL not connected");
        }
        return newUser;
    }
}