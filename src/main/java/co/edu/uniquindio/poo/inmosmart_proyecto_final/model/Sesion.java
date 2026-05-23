package co.edu.uniquindio.poo.inmosmart_proyecto_final.model;

public class Sesion {

    private Usuario usuarioAutenticado;

    public Sesion() {
    }

    public boolean iniciarSesion(Usuario usuario){

        if(usuario != null){
            usuarioAutenticado = usuario;
            return true;
        }

        return false;
    }

    public void cerrarSesion(){

        usuarioAutenticado = null;
    }

    public Usuario getUsuarioAutenticado() {
        return usuarioAutenticado;
    }
}