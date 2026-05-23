package co.edu.uniquindio.poo.inmosmart_proyecto_final.model;

import co.edu.uniquindio.poo.inmosmart_proyecto_final.model.enums.EstadoInmueble;

public class Terreno extends Inmueble {

    private String usoSuelo;

    public Terreno(String codigo,
                   String direccion,
                   String ciudad,
                   double area,
                   double precio,
                   EstadoInmueble estado,
                   Vendedor vendedor,
                   String usoSuelo) {

        super(codigo, direccion, ciudad, area, precio, estado, vendedor);

        this.usoSuelo = usoSuelo;
    }

    @Override
    public String mostrarInformacion() {
        return "Terreno con uso de suelo: " + usoSuelo;
    }

    public String getUsoSuelo() {
        return usoSuelo;
    }
}