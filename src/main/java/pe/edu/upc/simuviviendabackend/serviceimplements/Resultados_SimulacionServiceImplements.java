package pe.edu.upc.simuviviendabackend.serviceimplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.simuviviendabackend.entities.Resultados_Simulacion;
import pe.edu.upc.simuviviendabackend.repositories.IResultados_SimulacionRepository;
import pe.edu.upc.simuviviendabackend.serviceinterfaces.IResultados_SimulacionService;

import java.util.List;

@Service
public class Resultados_SimulacionServiceImplements implements IResultados_SimulacionService {
    @Autowired
    private IResultados_SimulacionRepository rsR;

    @Override
    public void insert(Resultados_Simulacion resultados_simulacion) {
        rsR.save(resultados_simulacion);
    }

    @Override
    public List<Resultados_Simulacion> list() {
        return rsR.findAll();
    }

    @Override
    public void delete(int idresultados_simulacion) {
        rsR.deleteById(idresultados_simulacion);
    }

    @Override
    public Resultados_Simulacion listId(int idresultados_simulacion) {
        return rsR.findById(idresultados_simulacion).orElse(new Resultados_Simulacion());
    }

    @Override
    public void update(Resultados_Simulacion resultados_simulacion) {
        rsR.save(resultados_simulacion);
    }
}
