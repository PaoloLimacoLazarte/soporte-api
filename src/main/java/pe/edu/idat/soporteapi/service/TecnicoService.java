package pe.edu.idat.soporteapi.service;

import pe.edu.idat.soporteapi.model.Tecnico;

import java.util.List;

public interface TecnicoService {

    List<Tecnico> listar();

    Tecnico buscarPorId(int id);

    Tecnico guardar(Tecnico tecnico);

    Tecnico actualizar(int id, Tecnico tecnico);

    void eliminar(int id);
}