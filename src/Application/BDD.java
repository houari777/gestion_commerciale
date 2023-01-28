
package Application;

import java.net.Socket;
import java.sql.*;
import javax.swing.JOptionPane;


public class BDD {

    Connection conn;
    Statement st;
    String sql;

    String url;
    String username;
    String password;
    Socket client;
    int port;
    String host;

    public BDD(String url, String username, String password, String host, int port) {
        this.url = url;
        this.username = username;
        this.password = password;
        this.port = port;
        this.host = host;
    }

    public Connection connexionDatabase() {

        try {
            Class.forName("com.mysql.jdcb.Driver");
            conn = DriverManager.getConnection(url, username, password);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }return conn;
     
    }





}