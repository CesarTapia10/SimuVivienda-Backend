package pe.edu.upc.simuviviendabackend.serviceinterfaces;



import pe.edu.upc.simuviviendabackend.entities.Soporte_Tickets;

import java.util.List;

public interface ISoporte_TicketsService {
    public void insert(Soporte_Tickets soporte_tickets);
    public List<Soporte_Tickets> list();
    public void delete(int idsoporte_tickets);
    public Soporte_Tickets listId(int idsoporte_tickets);
    public void update(Soporte_Tickets idsoporte_tickets);
}
