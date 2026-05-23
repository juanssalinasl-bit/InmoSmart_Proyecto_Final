package co.edu.uniquindio.poo.inmosmart_proyecto_final.model.services;

import co.edu.uniquindio.poo.inmosmart_proyecto_final.model.Comprador;
import co.edu.uniquindio.poo.inmosmart_proyecto_final.model.Inmueble;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ServicioRecomendacion {

    private ObservableList<Inmueble> inmuebles;

    public ServicioRecomendacion(ObservableList<Inmueble> inmuebles) {

        this.inmuebles = inmuebles;
    }

    public ObservableList<Inmueble> recomendarPorCiudad(String ciudad){

        ObservableList<Inmueble> recomendaciones =
                FXCollections.observableArrayList();

        for(Inmueble inmueble : inmuebles){

            if(inmueble.getCiudad().equalsIgnoreCase(ciudad)){
                recomendaciones.add(inmueble);
            }
        }

        return recomendaciones;
    }

    public ObservableList<Inmueble> recomendarPorPrecio(double precioMaximo){

        ObservableList<Inmueble> recomendaciones =
                FXCollections.observableArrayList();

        for(Inmueble inmueble : inmuebles){

            if(inmueble.getPrecio() <= precioMaximo){
                recomendaciones.add(inmueble);
            }
        }

        return recomendaciones;
    }

    public void analizarHistorialBusqueda(Comprador comprador){

        System.out.println("Analizando historial de búsqueda...");
    }
}