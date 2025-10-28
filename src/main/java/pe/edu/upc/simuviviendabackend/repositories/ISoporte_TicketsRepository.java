package pe.edu.upc.simuviviendabackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.simuviviendabackend.entities.Soporte_Tickets;

@Repository
public interface ISoporte_TicketsRepository extends JpaRepository<Soporte_Tickets,Integer> {
}
