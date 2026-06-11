package consultas_sql;

import Conexion_BD.Conexion;
import java.sql.ResultSet;

public class sub_cuenta {
    Conexion cn = new Conexion();
    /**
     * Método para insertar una nueva cuenta en el catálogo
     */
    public void insertar(int cuenta_padre, int cuenta_hijo) { 
        String sql = "INSERT INTO sub_cuenta (cuenta_padre, cuenta_hijo) "
                   + "VALUES(" + cuenta_padre + ", '" + cuenta_hijo +  ")";
        cn.UID(sql);
    }
    
    /**
     * Para buscar una sola cuenta específica por su código
     */
    public ResultSet buscar(int cuenta_padre,int cuenta_hijo) {
        String sql = """
    SELECT
        c_padre.codigo_cuenta AS cod_padre,
        c_padre.nombre        AS nombre_padre,
        c_hijo.codigo_cuenta  AS cod_hijo,
        c_hijo.nombre         AS nombre_hijo
    FROM sub_cuenta sc
    JOIN cuenta c_padre ON sc.cuenta_padre = c_padre.codigo_cuenta
    JOIN cuenta c_hijo  ON sc.cuenta_hijo  = c_hijo.codigo_cuenta
    WHERE sc.cuenta_padre = """ + cuenta_padre +
                """ 
                AND sc.cuenta_hijo  = """ + cuenta_hijo;
        return cn.getValores(sql);
    }
    
    /**
     * Trae todas las cuentas registradas 
     */
    public ResultSet obtenerTodas() {
        String sql = """
            SELECT 
                c_padre.codigo_cuenta  AS cod_padre, 
                c_padre.nombre         AS nombre_padre, 
                c_hijo.codigo_cuenta   AS cod_hijo, 
                c_hijo.nombre          AS nombre_hijo, 
                c_hijo.monto
            FROM sub_cuenta sc
            JOIN cuenta c_padre ON sc.cuenta_padre = c_padre.codigo_cuenta
            JOIN cuenta c_hijo  ON sc.cuenta_hijo  = c_hijo.codigo_cuenta
            ORDER BY c_padre.codigo_cuenta, c_hijo.codigo_cuenta;
            """;
        return cn.getValores(sql);
    }
}
