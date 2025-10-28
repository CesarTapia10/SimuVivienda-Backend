package pe.edu.upc.simuviviendabackend.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.simuviviendabackend.entities.Tasa_Interes;
import pe.edu.upc.simuviviendabackend.repositories.ITasa_InteresRepository;
import pe.edu.upc.simuviviendabackend.serviceinterfaces.ITasa_InteresService;

import java.util.List;

@Service
public class Tasa_InteresServiceImplements implements ITasa_InteresService {
    @Autowired
    private ITasa_InteresRepository tR;

    @Override
    public void insert(Tasa_Interes tasa_interes) {
        tR.save(tasa_interes);
    }

    @Override
    public List<Tasa_Interes> list() {
        return tR.findAll();
    }

    @Override
    public void delete(int idtasa_interes) {
        tR.deleteById(idtasa_interes);
    }

    @Override
    public Tasa_Interes listId(int idtasa_interes) {
        return tR.findById(idtasa_interes).orElse(new Tasa_Interes());
    }

    @Override
    public void update(Tasa_Interes tasa_interes) {
        tR.save(tasa_interes);
    }
}
