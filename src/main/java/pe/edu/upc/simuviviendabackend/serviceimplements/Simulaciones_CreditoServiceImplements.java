package pe.edu.upc.simuviviendabackend.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.simuviviendabackend.entities.Simulaciones_Credito;
import pe.edu.upc.simuviviendabackend.repositories.ISimulaciones_CreditoRepository;
import pe.edu.upc.simuviviendabackend.serviceinterfaces.ISimulaciones_CreditoService;

import java.util.List;

@Service
public class Simulaciones_CreditoServiceImplements implements ISimulaciones_CreditoService {
    @Autowired
    private ISimulaciones_CreditoRepository scR;

    @Override
    public void insert(Simulaciones_Credito simulaciones_credito) {
        scR.save(simulaciones_credito);
    }

    @Override
    public List<Simulaciones_Credito> list() {
        return scR.findAll();
    }

    @Override
    public void delete(int idsimulaciones_credito) {
        scR.deleteById(idsimulaciones_credito);
    }

    @Override
    public Simulaciones_Credito listId(int idsimulaciones_credito) {
        return scR.findById(idsimulaciones_credito).orElse(new Simulaciones_Credito());
    }

    @Override
    public void update(Simulaciones_Credito simulaciones_credito) {
        scR.save(simulaciones_credito);
    }
}
