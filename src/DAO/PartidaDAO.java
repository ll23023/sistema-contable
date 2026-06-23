package DAO;

import Conexion_BD.Conexion;
import Modelo.partidaDetalle;
import Modelo.Detalle;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PartidaDAO {
    
    private Conexion db;

    /*
        Metodo principal para guardar una partida diaria, con cada uno de sus detalles.
    */
    public boolean registrarPartidaCompleta(partidaDetalle partidaCompleta) {

        db = new Conexion(); // clase conexion propia con muchos metodos , no representa una Connection sql
        Connection con = db.getConexion(); // obteniendo una conexion propia de sql CONNECTION
        
        // CORRECCIÓN SQL: Removidos debe y haber de la cabecera. Añadidos debe y haber al detalle.
        String sqlPartida = "INSERT INTO partida (numero_partida, fecha, nota) VALUES (?, ?, ?)";
       String sqlDetalle = "INSERT INTO detalle (codigo_cuenta, numero_partida, nota_detalle, debe, haber) VALUES (?, ?, ?, ?, ?)";

        try {
            if (con == null) return false;
            
            // Para asegurarse que la partida quede completa, no se hara commit en cada insercion, sino hasta asegurarse que todo se ha ingresado sin fallos
            con.setAutoCommit(false);

            // Insertar la Cabecera (Partida)
            try (PreparedStatement psPartida = con.prepareStatement(sqlPartida)) {
                psPartida.setInt(1, partidaCompleta.partida().numeroPartida());
                // Convertimos LocalDate a java.sql.Date para la BD
                psPartida.setDate(2, java.sql.Date.valueOf(partidaCompleta.partida().fecha()));
                psPartida.setString(3, partidaCompleta.partida().nota());
                
                psPartida.executeUpdate();
            }

            // Insertar los Detalles (Bucle para la lista)
            try (PreparedStatement psDetalle = con.prepareStatement(sqlDetalle)) {
                for (Detalle det : partidaCompleta.detalles()) {
                    psDetalle.setInt(1, det.codigoCuenta());
                    psDetalle.setInt(2, det.numeroPartida());
                    psDetalle.setString(3, det.notaDetalle()); 
                    psDetalle.setDouble(4, det.debe());
                    psDetalle.setDouble(5, det.haber());
                    psDetalle.addBatch();
                }
                // Ejecutamos todos los detalles juntos
                psDetalle.executeBatch();
            }

            // Si todo llegó hasta aquí sin errores, guardamos de verdad en la BD
            con.commit();
            return true;

        } catch (SQLException e) {
            // si hubo un fallo, hacemos rollback para no guardar permanentem ninguna insercion.
            if (con != null) {
                try {
                    con.rollback();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            e.printStackTrace();
            return false;
        } finally {
            // Siempre cerramos la conexión al terminar
            if (con != null) {
                try { 
                    con.close(); 
                } 
                catch (SQLException e) { e.printStackTrace(); }
            }
        }
    }
    
    
    
    // obtener el numero de partida acutal
    public int obtenerSiguienteNumeroPartida() {
        String sql = "SELECT IFNULL(MAX(numero_partida), 0) + 1 AS siguiente FROM partida";
        db = new Conexion();
        try (Connection con = db.getConexion(); PreparedStatement ps = con.prepareStatement(sql); java.sql.ResultSet rs = ps.executeQuery()) {

            if (rs.next()) {
                return rs.getInt("siguiente");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 1; // Si hay error o está vacía, empieza en 1
    }
}
