package co.edu.uniquindio.poo.inmosmart_proyecto_final.model;

import co.edu.uniquindio.poo.inmosmart_proyecto_final.model.enums.EstadoInmueble;

public class LocalComercial extends Inmueble {

    private String tipoNegocio;

    public LocalComercial(String codigo,
                          String direccion,
                          String ciudad,
                          double area,
                          double precio,
                          EstadoInmueble estado,
                          Vendedor vendedor,
                          String tipoNegocio) {

        super(codigo, direccion, ciudad, area, precio, estado, vendedor);

        this.tipoNegocio = tipoNegocio;
    }

    @Override
    public String mostrarInformacion() {
        return "Local comercial para " + tipoNegocio;
    }

    public String getTipoNegocio() {
        return tipoNegocio;
    }
}