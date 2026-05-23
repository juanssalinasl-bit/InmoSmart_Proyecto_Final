package co.edu.uniquindio.poo.inmosmart_proyecto_final.model.services;

import co.edu.uniquindio.poo.inmosmart_proyecto_final.model.Inmueble;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ServicioBuscarInmueble {

    private ObservableList<Inmueble> inmuebles;

    public ServicioBuscarInmueble(ObservableList<Inmueble> inmuebles) {

        this.inmuebles = inmuebles;
    }

    public ObservableList<Inmueble> buscarPorCiudad(String ciudad){

        ObservableList<Inmueble> resultados =
                FXCollections.observableArrayList();

        for(Inmueble inmueble : inmuebles){

            if(inmueble.getCiudad().equalsIgnoreCase(ciudad)){
                resultados.add(inmueble);
            }
        }

        return resultados;
    }

    public ObservableList<Inmueble> buscarPorPrecio(double precioMaximo){

        ObservableList<Inmueble> resultados =
                FXCollections.observableArrayList();

        for(Inmueble inmueble : inmuebles){

            if(inmueble.getPrecio() <= precioMaximo){
                resultados.add(inmueble);
            }
        }

        return resultados;
    }

    public ObservableList<Inmueble> listarDisponibles(){

        ObservableList<Inmueble> disponibles =
                FXCollections.observableArrayList();

        for(Inmueble inmueble : inmuebles){

            if(inmueble.validarDisponibilidad()){
                disponibles.add(inmueble);
            }
        }

        return disponibles;
    }
}