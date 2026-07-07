package pe.edu.idat.soporteapi.service;

import org.springframework.stereotype.Service;

import pe.edu.idat.soporteapi.exception.RecursoNoEncontradoException;
import pe.edu.idat.soporteapi.model.Solicitud;

import java.util.ArrayList;
import java.util.List;

@Service
public class SolicitudServiceImpl implements SolicitudService {

    private List<Solicitud> solicitudes = new ArrayList<>();

    @Override
    public List<Solicitud> listar() {
        return solicitudes;
    }

    @Override
    public Solicitud buscarPorId(int id) {

        for (Solicitud solicitud : solicitudes) {

            if (solicitud.getId() == id) {
                return solicitud;
            }
        }

        throw new RecursoNoEncontradoException(
                "La solicitud con id " + id + " no existe"
        );
    }

    @Override
    public Solicitud guardar(Solicitud solicitud) {

        solicitudes.add(solicitud);
        return solicitud;
    }

    @Override
    public Solicitud actualizar(int id, Solicitud solicitud) {

        for (int i = 0; i < solicitudes.size(); i++) {

            if (solicitudes.get(i).getId() == id) {

                solicitudes.set(i, solicitud);
                return solicitud;
            }
        }

        throw new RecursoNoEncontradoException(
                "La solicitud con id " + id + " no existe"
        );
    }

    @Override
    public void eliminar(int id) {

        solicitudes.removeIf(solicitud -> solicitud.getId() == id);
    }
}