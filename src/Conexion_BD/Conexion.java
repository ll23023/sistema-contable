package Conexion_BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexion {
    private final String url = "jdbc:mariadb://localhost:3306/sistema_contable";
    private final String login = "root"; 
    private final String password = "";  
    private Connection cnx = null;
    private Statement sttm = null;
    private ResultSet rst = null;

    private final String DRIVER = "org.mariadb.jdbc.Driver";

    public Conexion(){
        try {
            Class.forName(DRIVER);
            cnx = DriverManager.getConnection(url, login, password);
            System.out.println("¡Conexión exitosa a sistema_contable usando MariaDB Driver!");
        } catch (ClassNotFoundException | SQLException c) {
            JOptionPane.showMessageDialog(null, "ERROR DE CONEXIÓN: " + c.getMessage());
            System.exit(1); 
        }
    }

    public void UID(String sql) {
        try {
            if (cnx == null || cnx.isClosed()) {
                cnx = DriverManager.getConnection(url, login, password);
            }
            sttm = cnx.createStatement();
            sttm.executeUpdate(sql); 
        } catch (SQLException c) {
            JOptionPane.showMessageDialog(null, "ERROR EN ESCRITURA: " + c.getMessage());
        }
    }

    public ResultSet getValores(String sql) {
        try {
            if (cnx == null || cnx.isClosed()) {
                cnx = DriverManager.getConnection(url, login, password);
            }
            sttm = cnx.createStatement();
            rst = sttm.executeQuery(sql);  
        } catch (SQLException c) {
            JOptionPane.showMessageDialog(null, "ERROR EN CONSULTA: " + c.getMessage());
        }
        return rst;
    }

    public void cerrar() {
        try {
            if (cnx != null && !cnx.isClosed()) { cnx.close(); }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public Connection getConexion() { return this.cnx; }
}