package co.edu.uniquindio.poo.inmosmart_proyecto_final.model;

import co.edu.uniquindio.poo.inmosmart_proyecto_final.model.enums.TipoOperacion;

import java.time.LocalDate;

public class Transaccion {

    private String codigo;

    private Comprador comprador;

    private Vendedor vendedor;

    private Inmueble inmueble;

    private double valorFinal;

    private TipoOperacion tipoOperacion;

    private LocalDate fecha;

    public Transaccion(String codigo,
                       Comprador comprador,
                       Vendedor vendedor,
                       Inmueble inmueble,
                       double valorFinal,
                       TipoOperacion tipoOperacion,
                       LocalDate fecha) {

        this.codigo = codigo;
        this.comprador = comprador;
        this.vendedor = vendedor;
        this.inmueble = inmueble;
        this.valorFinal = valorFinal;
        this.tipoOperacion = tipoOperacion;
        this.fecha = fecha;
    }

    public double calcularValorFinal(){
        return valorFinal;
    }

    public String generarComprobante(){

        return "Transacción #" + codigo +
                " realizada exitosamente.";
    }

    public String getCodigo() {
        return codigo;
    }

    public Comprador getComprador() {
        return comprador;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public Inmueble getInmueble() {
        return inmueble;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public TipoOperacion getTipoOperacion() {
        return tipoOperacion;
    }

    public LocalDate getFecha() {
        return fecha;
    }
}