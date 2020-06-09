package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbBean {
    String user="sa";
    String password="abc123";
    String url="jdbc:sqlserver://localhost:1433;databaserName=rsgl";

    Connection conn=null;
    Statement stmt=null;
    ResultSet rs=null;
    public DbBean(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLSeverDriver");
            conn= DriverManager.getConnection(url,user,password);
            conn.setAutoCommit(true);
            stmt=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        }catch (Exception e)
        {
            System.err.println("数据库连接错误："+e.getMessage());
        }
    }

    public boolean equals() {
    }
}
