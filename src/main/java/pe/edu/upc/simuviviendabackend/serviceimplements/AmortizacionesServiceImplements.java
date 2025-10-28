package pe.edu.upc.simuviviendabackend.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.simuviviendabackend.entities.Amortizaciones;
import pe.edu.upc.simuviviendabackend.repositories.IAmortizacionesRepository;
import pe.edu.upc.simuviviendabackend.serviceinterfaces.IAmortizacionesService;

import java.util.List;

@Service
public class AmortizacionesServiceImplements implements IAmortizacionesService {
    @Autowired
    private IAmortizacionesRepository aR;

    @Override
    public void insert(Amortizaciones amortizaciones) {
        aR.save(amortizaciones);
    }

    @Override
    public List<Amortizaciones> list() {
        return aR.findAll();
    }

    @Override
    public void delete(int idamortizaciones) {
        aR.deleteById(idamortizaciones);
    }

    @Override
    public Amortizaciones listId(int idamortizaciones) {
        return aR.findById(idamortizaciones).orElse(new Amortizaciones());
    }

    @Override
    public void update(Amortizaciones amortizaciones) {
        aR.save(amortizaciones);
    }
}
