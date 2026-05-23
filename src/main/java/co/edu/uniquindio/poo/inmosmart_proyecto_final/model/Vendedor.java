package co.edu.uniquindio.poo.inmosmart_proyecto_final.model;

import co.edu.uniquindio.poo.inmosmart_proyecto_final.model.enums.Clasificacion;
import co.edu.uniquindio.poo.inmosmart_proyecto_final.model.enums.TipoAlerta;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Vendedor extends Usuario {

    private ObservableList<Inmueble> listaInmuebles;

    public Vendedor(String id,
                    String nombre,
                    String identificacion,
                    String telefono,
                    String correo,
                    int puntosReputacion,
                    Clasificacion clasificacion,
                    TipoAlerta tipoAlerta) {

        super(id, nombre, identificacion, telefono, correo,
                puntosReputacion, clasificacion, tipoAlerta);

        listaInmuebles = FXCollections.observableArrayList();
    }

    @Override
    public double calcularBeneficio() {
        return getPuntosReputacion() * 0.1;
    }

    public void agregarInmueble(Inmueble inmueble){
        listaInmuebles.add(inmueble);
    }

    public ObservableList<Inmueble> getListaInmuebles() {
        return listaInmuebles;
    }
}