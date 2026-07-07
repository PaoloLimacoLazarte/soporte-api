package pe.edu.idat.soporteapi.service;

import org.springframework.stereotype.Service;
import pe.edu.idat.soporteapi.model.Cliente;
import pe.edu.idat.soporteapi.exception.RecursoNoEncontradoException;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    private List<Cliente> clientes = new ArrayList<>();


    @Override
    public List<Cliente> listar() {
        return clientes;
    }


    @Override
    public Cliente buscarPorId(int id) {

        for (Cliente cliente : clientes) {

            if (cliente.getId() == id) {
                return cliente;
            }
        }

        throw new RecursoNoEncontradoException(
                "El cliente con id " + id + " no existe"
        );
    }


    @Override
    public Cliente guardar(Cliente cliente) {

        clientes.add(cliente);
        return cliente;
    }


    @Override
    public Cliente actualizar(int id, Cliente cliente) {

        for (int i = 0; i < clientes.size(); i++) {

            if (clientes.get(i).getId() == id) {

                clientes.set(i, cliente);
                return cliente;
            }
        }

        throw new RecursoNoEncontradoException(
                "El cliente con id " + id + " no existe"
        );
    }

    @Override
    public void eliminar(int id) {

        clientes.removeIf(cliente -> cliente.getId() == id);
    }
}