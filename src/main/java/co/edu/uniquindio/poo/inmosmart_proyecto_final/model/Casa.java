package co.edu.uniquindio.poo.inmosmart_proyecto_final.model;

import co.edu.uniquindio.poo.inmosmart_proyecto_final.model.enums.EstadoInmueble;

public class Casa extends Inmueble {

    private int numeroHabitaciones;
    private int numeroBanos;
    private int pisos;

    public Casa(String codigo,
                String direccion,
                String ciudad,
                double area,
                double precio,
                EstadoInmueble estado,
                Vendedor vendedor,
                int numeroHabitaciones,
                int numeroBanos,
                int pisos) {

        super(codigo, direccion, ciudad, area, precio, estado, vendedor);

        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBanos = numeroBanos;
        this.pisos = pisos;
    }

    @Override
    public String mostrarInformacion() {
        return "Casa ubicada en " + getCiudad();
    }
}
