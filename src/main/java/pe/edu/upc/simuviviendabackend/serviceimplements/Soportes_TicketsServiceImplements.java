package pe.edu.upc.simuviviendabackend.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.simuviviendabackend.entities.Soporte_Tickets;
import pe.edu.upc.simuviviendabackend.repositories.ISoporte_TicketsRepository;
import pe.edu.upc.simuviviendabackend.serviceinterfaces.ISoporte_TicketsService;

import java.util.List;

@Service
public class Soportes_TicketsServiceImplements implements ISoporte_TicketsService {
    @Autowired
    private ISoporte_TicketsRepository sR;

    @Override
    public void insert(Soporte_Tickets soporte_tickets) {
        sR.save(soporte_tickets);
    }

    @Override
    public List<Soporte_Tickets> list() {
        return sR.findAll();
    }

    @Override
    public void delete(int idsoporte_tickets) {
        sR.deleteById(idsoporte_tickets);
    }

    @Override
    public Soporte_Tickets listId(int idsoporte_tickets) {
        return sR.findById(idsoporte_tickets).orElse(new Soporte_Tickets());
    }

    @Override
    public void update(Soporte_Tickets soporte_tickets) {
        sR.save(soporte_tickets);
    }
}
