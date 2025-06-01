package Controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;

public class DAO {
    
    
    Connection con;
    ResultSet rs;
    PreparedStatement pstmt;

    public void getConnection() throws Exception{

        String url = "jdbc:mysql://localhost:3306/projeto";
        String user = "root";
        String password = "";

        Class.forName("com.mysql.cj.jdbc.Driver");

        con = DriverManager.getConnection(url, user, password);
    }
    
}
