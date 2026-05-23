package co.edu.uniquindio.poo.inmosmart_proyecto_final.model;

import co.edu.uniquindio.poo.inmosmart_proyecto_final.model.enums.Clasificacion;
import co.edu.uniquindio.poo.inmosmart_proyecto_final.model.enums.TipoAlerta;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Comprador extends Usuario {

    private ObservableList<String> historialBusquedas;

    public Comprador(String id,
                     String nombre,
                     String identificacion,
                     String telefono,
                     String correo,
                     int puntosReputacion,
                     Clasificacion clasificacion,
                     TipoAlerta tipoAlerta) {

        super(id, nombre, identificacion, telefono, correo,
                puntosReputacion, clasificacion, tipoAlerta);

        historialBusquedas = FXCollections.observableArrayList();
    }

    @Override
    public double calcularBeneficio() {
        return getPuntosReputacion() * 0.05;
    }

    public void agregarBusqueda(String busqueda){
        historialBusquedas.add(busqueda);
    }

    public ObservableList<String> getHistorialBusquedas() {
        return historialBusquedas;
    }
}