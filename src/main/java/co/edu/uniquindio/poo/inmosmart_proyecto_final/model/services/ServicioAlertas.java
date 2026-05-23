package co.edu.uniquindio.poo.inmosmart_proyecto_final.model.services;

import co.edu.uniquindio.poo.inmosmart_proyecto_final.model.Usuario;

public class ServicioAlertas {

    public void enviarAlerta(Usuario usuario, String mensaje){

        usuario.recibirNotificacion(mensaje);
    }

    public void notificarOfertaAceptada(Usuario usuario){

        enviarAlerta(usuario,
                "Tu oferta ha sido aceptada.");
    }

    public void notificarCambioPrecio(Usuario usuario){

        enviarAlerta(usuario,
                "El precio del inmueble ha cambiado.");
    }

    public void notificarNuevoInmueble(Usuario usuario){

        enviarAlerta(usuario,
                "Hay un nuevo inmueble disponible.");
    }
}