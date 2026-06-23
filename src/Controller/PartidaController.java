/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.PartidaDAO;
import Modelo.Detalle;
import Modelo.Partida;
import Modelo.partidaDetalle;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author severus
 */
public class PartidaController {
    
    private final PartidaDAO partidaDAO;
    
    // es necesario crear un objeto PartidaController en vista, este controller se comunicara con dao para LAS CONSULTAS SQL.
    public PartidaController(){
        this.partidaDAO = new PartidaDAO();
    }
    
    /**
     * Intenta procesar y registrar una partida en el sistema aplicando las reglas contables.
     * @return String mensaje de exito o el error específico que ocurrió.
     */
    public String procesarRegistroPartida(int numero, LocalDate fecha, String nota, double totalDebe, double totalHaber, List<Detalle> detalles) {
        
        /*
            Validaciones logicas, reglas contables (dejando la mayoria de validaciones de campos vacio para la clase pnlAdministrarCuentas.
        */
      
        if (nota == null || nota.trim().isEmpty()) {
            return "El concepto o nota de la partida no puede estar vacío.";
        }
        
        // regla contable, una partida debe afectar al menos dos cuentas
        if (detalles == null || detalles.size() < 2) {
            return "Una partida debe afectar al menos a dos cuentas (Partida Doble).";
        }
       
        // regla contable: debe = haber (deben ser iguales)
        if (Double.compare(totalDebe, totalHaber) != 0) {
            return "Error: La partida no está cuadrada. El Debe (" + totalDebe + ") debe ser igual al Haber (" + totalHaber + ")."; 
        }
        
        // Cabecera de la partida usando el nuevo Record sin montos totales
        Partida cabecera = new Partida(numero, fecha, nota);
        
        // Agrupamos todo en el Record contenedor que creaste (partidaDetalle)
        partidaDetalle paqueteCompleto = new partidaDetalle(cabecera, detalles);

        // guardar el completo de la partida usando DAO.
        boolean exito = partidaDAO.registrarPartidaCompleta(paqueteCompleto);
        
        if (exito) {
            return "EXITO: La partida #" + numero + " fue registrada correctamente.";
        } else {
            return "ERROR: No se pudo guardar la partida en la base de datos. Verifique los logs.";
        }
    }
}