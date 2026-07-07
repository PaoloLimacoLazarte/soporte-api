package pe.edu.idat.soporteapi.service;

import pe.edu.idat.soporteapi.model.Cliente;

import java.util.List;

public interface ClienteService {

    List<Cliente> listar();

    Cliente buscarPorId(int id);

    Cliente guardar(Cliente cliente);

    Cliente actualizar(int id, Cliente cliente);

    void eliminar(int id);
}