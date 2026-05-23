package co.edu.uniquindio.poo.inmosmart_proyecto_final.model;

import co.edu.uniquindio.poo.inmosmart_proyecto_final.model.enums.Clasificacion;
import co.edu.uniquindio.poo.inmosmart_proyecto_final.model.enums.TipoAlerta;

public abstract class Usuario {

    private String id;
    private String nombre;
    private String identificacion;
    private String telefono;
    private String correo;

    private int puntosReputacion;

    private Clasificacion clasificacion;
    private TipoAlerta tipoAlerta;

    public Usuario(String id,
                   String nombre,
                   String identificacion,
                   String telefono,
                   String correo,
                   int puntosReputacion,
                   Clasificacion clasificacion,
                   TipoAlerta tipoAlerta) {

        this.id = id;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.telefono = telefono;
        this.correo = correo;
        this.puntosReputacion = puntosReputacion;
        this.clasificacion = clasificacion;
        this.tipoAlerta = tipoAlerta;
    }

    public abstract double calcularBeneficio();

    public void actualizarPuntos(int puntos){
        this.puntosReputacion += puntos;
    }

    public void recibirNotificacion(String mensaje){
        System.out.println(mensaje);
    }

    public void clasificarUsuario(){

        if(puntosReputacion <= 100){
            clasificacion = Clasificacion.PRINCIPIANTE;

        } else if (puntosReputacion <= 500) {
            clasificacion = Clasificacion.INVERSIONISTA;

        } else if (puntosReputacion <= 2000) {
            clasificacion = Clasificacion.EXPERTO;

        } else {
            clasificacion = Clasificacion.MAGNATE;
        }
    }

    // GETTERS Y SETTERS

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public int getPuntosReputacion() {
        return puntosReputacion;
    }

    public Clasificacion getClasificacion() {
        return clasificacion;
    }

    public TipoAlerta getTipoAlerta() {
        return tipoAlerta;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTipoAlerta(TipoAlerta tipoAlerta) {
        this.tipoAlerta = tipoAlerta;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
