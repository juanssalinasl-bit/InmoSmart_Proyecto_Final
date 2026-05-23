package co.edu.uniquindio.poo.inmosmart_proyecto_final.model;

import java.time.LocalDate;

public class Publicacion {

    private String codigo;
    private LocalDate fechaPublicacion;
    private String descripcion;

    private Inmueble inmueble;

    public Publicacion(String codigo,
                       LocalDate fechaPublicacion,
                       String descripcion,
                       Inmueble inmueble) {

        this.codigo = codigo;
        this.fechaPublicacion = fechaPublicacion;
        this.descripcion = descripcion;
        this.inmueble = inmueble;
    }

    public void editarDescripcion(String nuevaDescripcion){
        this.descripcion = nuevaDescripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Inmueble getInmueble() {
        return inmueble;
    }
}
