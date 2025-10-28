package pe.edu.upc.simuviviendabackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.simuviviendabackend.entities.Amortizaciones;

@Repository
public interface IAmortizacionesRepository extends JpaRepository<Amortizaciones,Integer> {
}
