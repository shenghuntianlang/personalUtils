package com.customutils.fornormal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtils {
    //        private static final String URL = "jdbc:mysql://127.0.0.1:3306/mingjia?serverTimezone=GMT%2B8";
//    private static final String USER_NAME = "root";
//    private static final String PASSWORD = "Root";
//    private static final String URL = "jdbc:mysql://120.78.147.27:3306/mingjia?serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=UTF-8";
//    private static final String USER_NAME = "wangke";
//    private static final String PASSWORD = "wangke0310";
//    jdbc:mysql://120.78.165.214:3306/mingjia
    private static String URL = new String();
    private static final String REQUESTPARAMETER = "?serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=UTF-8";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "MySQL-7cb1dc18";

    public JDBCUtils(String url) {
        URL = url + REQUESTPARAMETER;
    }

    private static Connection connection;

    /**
     * 加载数据库驱动,并创建数据库连接
     */

    public static Connection getConnection() {
        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

}
