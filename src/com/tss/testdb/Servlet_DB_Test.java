package com.tss.testdb;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

@WebServlet("/Servlet_DB_Test")
public class Servlet_DB_Test extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        String user = "springstudent";
        String password = "springstudent";
        String jdbcUrl = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false&serverTimezone=UTC";
        String driver = "com.mysql.cj.jdbc.Driver";

        try {
            PrintWriter writer = response.getWriter();
            writer.println("Connecting to: " + jdbcUrl);
            Class.forName(driver);
            Connection myConn = DriverManager.getConnection(jdbcUrl, user, password);
            writer.println("Connected.");
            myConn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
