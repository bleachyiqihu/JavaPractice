package com.bleachyiqihu.javapractice.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Paul on 2019-03-09
 */
class QueryMySql {

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/mytest?useSSL=true&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PWD = "";

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    String selectAndUpdate(Integer id) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            System.out.println("Connecting db...");
            conn = DriverManager.getConnection(URL, USER, PWD);

            System.out.println("Creating statement...");
            stmt = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);
            String sql = String.format("select * from jdbc_test where id = %s", id);
            rs = stmt.executeQuery(sql);
            List<String> nameList = new ArrayList<>();
            while (rs.next()) {
                String name = rs.getString("name");
                rs.updateString("name", "wuguan");
                rs.updateRow();
                nameList.add(name);
            }
            rs.close();
            stmt.close();
            conn.close();
            return nameList.get(0);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("goodbye");
        return "";
    }

}
