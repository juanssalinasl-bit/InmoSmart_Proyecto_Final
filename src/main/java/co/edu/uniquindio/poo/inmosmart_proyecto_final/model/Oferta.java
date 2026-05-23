package co.edu.uniquindio.poo.inmosmart_proyecto_final.model;

import co.edu.uniquindio.poo.inmosmart_proyecto_final.model.enums.EstadoOferta;

import java.time.LocalDate;

public class Oferta {

    private String codigo;

    private Comprador comprador;

    private Inmueble inmueble;

    private double valorOferta;

    private LocalDate fechaOferta;

    private EstadoOferta estado;

    public Oferta(String codigo,
                  Comprador comprador,
                  Inmueble inmueble,
                  double valorOferta,
                  LocalDate fechaOferta,
                  EstadoOferta estado) {

        this.codigo = codigo;
        this.comprador = comprador;
        this.inmueble = inmueble;
        this.valorOferta = valorOferta;
        this.fechaOferta = fechaOferta;
        this.estado = estado;
    }

    public boolean validarOferta(){
        return valorOferta > 0;
    }

    public void aceptarOferta(){
        estado = EstadoOferta.ACEPTADA;
    }

    public void rechazarOferta(){
        estado = EstadoOferta.RECHAZADA;
    }

    public void cancelarOferta(){
        estado = EstadoOferta.CANCELADA;
    }

    public String getCodigo() {
        return codigo;
    }

    public Comprador getComprador() {
        return comprador;
    }

    public Inmueble getInmueble() {
        return inmueble;
    }

    public double getValorOferta() {
        return valorOferta;
    }

    public LocalDate getFechaOferta() {
        return fechaOferta;
    }

    public EstadoOferta getEstado() {
        return estado;
    }
}
