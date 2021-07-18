package com.example.web_customer_tracker;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

import java.io.PrintWriter;
import java.sql.* ;

@WebServlet(name = "Servlet", value = "/Servlet")
public class TestDbServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        setup connection
        String user = "springstudent" ;
        String pass = "springstudent" ;
        String url = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false&serverTimezone=UTC" ;
        String driver = "com.mysql.jdbc.Driver" ;

        try {
            PrintWriter out = response.getWriter();
            out.println("Connecting to database :"+url);
            Class.forName(driver);
            Connection myConn = DriverManager.getConnection(url,user,pass);
            out.println("Coneection successfull");
        } catch (Exception exc){
            exc.printStackTrace();
            throw new ServletException(exc);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
