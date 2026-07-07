package pe.edu.idat.soporteapi.service;

import org.springframework.stereotype.Service;
import pe.edu.idat.soporteapi.model.Tecnico;
import pe.edu.idat.soporteapi.exception.RecursoNoEncontradoException;

import java.util.ArrayList;
import java.util.List;

@Service
public class TecnicoServiceImpl implements TecnicoService {

    private List<Tecnico> tecnicos = new ArrayList<>();


    @Override
    public List<Tecnico> listar() {
        return tecnicos;
    }


    @Override
    public Tecnico buscarPorId(int id) {

        for (Tecnico tecnico : tecnicos) {

            if (tecnico.getId() == id) {
                return tecnico;
            }
        }

        throw new RecursoNoEncontradoException(
                "El técnico con id " + id + " no existe"
        );
    }


    @Override
    public Tecnico guardar(Tecnico tecnico) {

        tecnicos.add(tecnico);
        return tecnico;
    }


    @Override
    public Tecnico actualizar(int id, Tecnico tecnico) {

        for (int i = 0; i < tecnicos.size(); i++) {

            if (tecnicos.get(i).getId() == id) {

                tecnicos.set(i, tecnico);
                return tecnico;
            }
        }

        throw new RecursoNoEncontradoException(
                "El técnico con id " + id + " no existe"
        );
    }


    @Override
    public void eliminar(int id) {

        tecnicos.removeIf(tecnico -> tecnico.getId() == id);
    }
}