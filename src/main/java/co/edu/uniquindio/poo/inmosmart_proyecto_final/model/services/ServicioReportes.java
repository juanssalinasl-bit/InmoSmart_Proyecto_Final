package co.edu.uniquindio.poo.inmosmart_proyecto_final.model.services;

import co.edu.uniquindio.poo.inmosmart_proyecto_final.model.Inmueble;
import co.edu.uniquindio.poo.inmosmart_proyecto_final.model.Transaccion;
import co.edu.uniquindio.poo.inmosmart_proyecto_final.model.Usuario;
import co.edu.uniquindio.poo.inmosmart_proyecto_final.model.interfaces.IReportable;

import javafx.collections.ObservableList;

public class ServicioReportes implements IReportable {

    private ObservableList<Usuario> usuarios;
    private ObservableList<Inmueble> inmuebles;
    private ObservableList<Transaccion> transacciones;

    public ServicioReportes(ObservableList<Usuario> usuarios,
                            ObservableList<Inmueble> inmuebles,
                            ObservableList<Transaccion> transacciones) {

        this.usuarios = usuarios;
        this.inmuebles = inmuebles;
        this.transacciones = transacciones;
    }

    @Override
    public String generarReporteInmuebles() {

        return "Cantidad de inmuebles: " + inmuebles.size();
    }

    @Override
    public String generarReporteVentas() {

        return "Cantidad de transacciones: " + transacciones.size();
    }

    @Override
    public String generarReporteUsuarios() {

        return "Cantidad de usuarios: " + usuarios.size();
    }

    public String generarReporteCiudades(){

        return "Reporte de ciudades generado.";
    }

    public String calcularEstadisticas(){

        return "Estadísticas calculadas correctamente.";
    }
}