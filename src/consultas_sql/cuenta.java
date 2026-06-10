/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consultas_sql;

import Conexion_BD.Conexion;
import java.sql.ResultSet;

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
    
    /**
     * Trae todas las cuentas registradas 
     */
    public ResultSet obtenerTodas() {
        String sql = "SELECT * FROM cuenta ORDER BY codigo_cuenta ASC";
        return cn.getValores(sql);
    }
}