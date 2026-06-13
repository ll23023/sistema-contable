/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consultas_sql;

import Conexion_BD.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class cuenta {
    
    Conexion cn = new Conexion();
    /**
     * Método para insertar una nueva cuenta en el catálogo
     */
    public void insertar(int codigoCuenta, String nombre, double monto, int tipoCuenta, int claseCuenta) { 
        String sql = "INSERT INTO cuenta (codigo_cuenta, nombre, monto, tipo_cuenta, clase_cuenta) "
                   + "VALUES(" + codigoCuenta + ", '" + nombre + "', " + monto + ", " + tipoCuenta + ", " + claseCuenta + ")";
        cn.UID(sql);
    }
    
    /**
     * Para buscar una sola cuenta específica por su código
     */
    public ResultSet buscar(int codigoCuenta) {
        String sql = "SELECT * FROM cuenta WHERE codigo_cuenta = " + codigoCuenta;
        return cn.getValores(sql);
    }
    
     // Clase interna para representar una cuenta
    public static class CuentaData {
        private int codigoCuenta;
        private String nombre;
        private double monto;
        private int tipoCuenta;
        private int claseCuenta;
        
        public CuentaData(int codigoCuenta, String nombre, double monto, int tipoCuenta, int claseCuenta) {
            this.codigoCuenta = codigoCuenta;
            this.nombre = nombre;
            this.monto = monto;
            this.tipoCuenta = tipoCuenta;
            this.claseCuenta = claseCuenta;
        }
        
        // Getters
        public int getCodigoCuenta() { return codigoCuenta; }
        public String getNombre() { return nombre; }
        public double getMonto() { return monto; }
        public int getTipoCuenta() { return tipoCuenta; }
        public int getClaseCuenta() { return claseCuenta; }
        
        @Override
        public String toString() {
            return codigoCuenta + " " + nombre;
        }
    }
    
    /**
     * Trae todas las cuentas registradas como lista de objetos
     */
    public List<CuentaData> obtenerTodas() {
        List<CuentaData> cuentas = new ArrayList<>();
        String sql = "SELECT * FROM cuenta ORDER BY codigo_cuenta ASC";
        ResultSet rs = cn.getValores(sql);
        
        try {
            while (rs.next()) {
                cuentas.add(new CuentaData(
                    rs.getInt("codigo_cuenta"),
                    rs.getString("nombre"),
                    rs.getDouble("monto"),
                    rs.getInt("tipo_cuenta"),
                    rs.getInt("clase_cuenta")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try { if (rs != null) rs.close(); } catch (SQLException e) {}
        }
        return cuentas;
    }
}