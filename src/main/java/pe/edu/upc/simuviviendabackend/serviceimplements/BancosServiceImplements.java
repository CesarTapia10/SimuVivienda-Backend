package pe.edu.upc.simuviviendabackend.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.simuviviendabackend.entities.Bancos;
import pe.edu.upc.simuviviendabackend.repositories.IBancosRepository;
import pe.edu.upc.simuviviendabackend.serviceinterfaces.IAmortizacionesService;
import pe.edu.upc.simuviviendabackend.serviceinterfaces.IBancosService;

import java.util.List;

@Service
public class BancosServiceImplements implements IBancosService {
    @Autowired
    private IBancosRepository bR;

    @Override
    public void insert(Bancos bancos) {
        bR.save(bancos);
    }

    @Override
    public List<Bancos> list() {
        return bR.findAll();
    }

    @Override
    public void delete(int idbancos) {
        bR.deleteById(idbancos);
    }

    @Override
    public Bancos listId(int idbancos) {
        return bR.findById(idbancos).orElse(new Bancos());
    }

    @Override
    public void update(Bancos bancos) {
        bR.save(bancos);
    }
}
