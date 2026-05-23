package co.edu.uniquindio.poo.inmosmart_proyecto_final.model;

import co.edu.uniquindio.poo.inmosmart_proyecto_final.model.enums.EstadoInmueble;

public abstract class Inmueble {

    private String codigo;
    private String direccion;
    private String ciudad;
    private double area;
    private double precio;

    private EstadoInmueble estado;

    private Vendedor vendedor;

    public Inmueble(String codigo,
                    String direccion,
                    String ciudad,
                    double area,
                    double precio,
                    EstadoInmueble estado,
                    Vendedor vendedor) {

        this.codigo = codigo;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.area = area;
        this.precio = precio;
        this.estado = estado;
        this.vendedor = vendedor;
    }

    public boolean validarDisponibilidad(){
        return estado == EstadoInmueble.DISPONIBLE;
    }

    public void cambiarEstado(EstadoInmueble nuevoEstado){
        this.estado = nuevoEstado;
    }

    public abstract String mostrarInformacion();

    public String getCodigo() {
        return codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public double getArea() {
        return area;
    }

    public double getPrecio() {
        return precio;
    }

    public EstadoInmueble getEstado() {
        return estado;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    @Override
    public String toString() {
        return codigo + " - " + ciudad;
    }
}
