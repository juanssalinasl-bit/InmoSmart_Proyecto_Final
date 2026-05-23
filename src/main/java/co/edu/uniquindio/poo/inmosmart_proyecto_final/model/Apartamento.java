package co.edu.uniquindio.poo.inmosmart_proyecto_final.model;

import co.edu.uniquindio.poo.inmosmart_proyecto_final.model.enums.EstadoInmueble;

public class Apartamento extends Inmueble {

    private int numeroApartamento;
    private String bloque;
    private double administracion;

    public Apartamento(String codigo,
                       String direccion,
                       String ciudad,
                       double area,
                       double precio,
                       EstadoInmueble estado,
                       Vendedor vendedor,
                       int numeroApartamento,
                       String bloque,
                       double administracion) {

        super(codigo, direccion, ciudad, area, precio, estado, vendedor);

        this.numeroApartamento = numeroApartamento;
        this.bloque = bloque;
        this.administracion = administracion;
    }

    @Override
    public String mostrarInformacion() {
        return "Apartamento en " + getCiudad() +
                " bloque " + bloque;
    }

    public int getNumeroApartamento() {
        return numeroApartamento;
    }

    public String getBloque() {
        return bloque;
    }

    public double getAdministracion() {
        return administracion;
    }
}