package com.testdb1.testdb1.DBcon;

import java.sql.*;


public class DB_con {
    private static Connection conn = null;

    public DB_con() {
        try {
            String dbURL = "jdbc:postgresql://localhost:5432/test_db1";
            String user = "postgres";
            String pass = "CharlesBronson777$$$";
            conn = DriverManager.getConnection(dbURL, user, pass);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public ResultSet Select(String operation) throws SQLException {
        Statement st = conn.createStatement();
        return st.executeQuery(operation);
    }

    public void Insert(String operation) throws SQLException {
        Statement st = conn.createStatement();
        st.executeUpdate(operation);
    }

    public void Update(String operation) throws SQLException{
        Statement st = conn.createStatement();
        st.executeUpdate(operation);
    }

    public void Delete(String operation) throws SQLException{
        Statement st = conn.createStatement();
        st.executeUpdate(operation);
    }
}

