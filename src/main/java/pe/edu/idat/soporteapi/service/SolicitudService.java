package pe.edu.idat.soporteapi.service;

import pe.edu.idat.soporteapi.model.Solicitud;

import java.util.List;

public interface SolicitudService {

    List<Solicitud> listar();

    Solicitud buscarPorId(int id);

    Solicitud guardar(Solicitud solicitud);

    Solicitud actualizar(int id, Solicitud solicitud);

    void eliminar(int id);
}