package co.edu.uniquindio.poo.inmosmart_proyecto_final.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Empresa {

    private String nombre;

    private ObservableList<Usuario> usuarios;
    private ObservableList<Inmueble> inmuebles;
    private ObservableList<Publicacion> publicaciones;
    private ObservableList<Oferta> ofertas;
    private ObservableList<Transaccion> transacciones;

    public Empresa(String nombre) {

        this.nombre = nombre;

        usuarios = FXCollections.observableArrayList();
        inmuebles = FXCollections.observableArrayList();
        publicaciones = FXCollections.observableArrayList();
        ofertas = FXCollections.observableArrayList();
        transacciones = FXCollections.observableArrayList();
    }

    public void registrarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }

    public void registrarInmueble(Inmueble inmueble){
        inmuebles.add(inmueble);
    }

    public void crearPublicacion(Publicacion publicacion){
        publicaciones.add(publicacion);
    }

    public void registrarOferta(Oferta oferta){
        ofertas.add(oferta);
    }

    public void registrarTransaccion(Transaccion transaccion){
        transacciones.add(transaccion);
    }

    public String getNombre() {
        return nombre;
    }

    public ObservableList<Usuario> getUsuarios() {
        return usuarios;
    }

    public ObservableList<Inmueble> getInmuebles() {
        return inmuebles;
    }

    public ObservableList<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public ObservableList<Oferta> getOfertas() {
        return ofertas;
    }

    public ObservableList<Transaccion> getTransacciones() {
        return transacciones;
    }
}