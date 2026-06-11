package consultas_sql;

import Conexion_BD.Conexion;
import java.sql.ResultSet;

public class reporte {
    Conexion cn = new Conexion();
    /**
     * Método para insertar una nueva cuenta en el catálogo
     */
    public void insertar(int id_reporte, double saldo, String fecha, int numero_partida, int tipo_reporte) { 
        String sql = "INSERT INTO reporte (id_reporte, saldo, fecha, numero_partida, tipo_reporte) "
                   + "VALUES(" + id_reporte + ", '" + saldo + ", '" + fecha + ", '" + numero_partida + ", '" + tipo_reporte + ")";
        cn.UID(sql);
    }
    
    /**
     * Para buscar una sola cuenta específica por su código
     */
    public ResultSet buscar(int id_reporte) {
        String sql = """
    SELECT
        r.id_reporte,
        tr.nombre       AS tipo_reporte,
        r.fecha,
        r.saldo,
        p.numero_partida,
        p.nota,
        p.debe,
        p.haber
    FROM reporte r
    JOIN tipo_reporte tr ON tr.tipo_reporte = r.tipo_reporte
    JOIN partida p       ON p.numero_partida = r.numero_partida
    WHERE r.id_reporte = """ + id_reporte;
        return cn.getValores(sql);
    }
    
    /**
     * Trae todas las cuentas registradas 
     */
    public ResultSet obtenerTodas() {
        String sql = """
            SELECT
                r.id_reporte,
                tr.nombre       AS tipo_reporte,
                r.fecha,
                r.saldo,
                p.numero_partida,
                p.nota,
                p.debe,
                p.haber
            FROM reporte r
            JOIN tipo_reporte tr ON tr.tipo_reporte = r.tipo_reporte
            JOIN partida p      ON p.numero_partida = r.numero_partida
            ORDER BY r.fecha DESC;
            """;
        return cn.getValores(sql);
    }
}
