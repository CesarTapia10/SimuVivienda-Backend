package pe.edu.upc.simuviviendabackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.simuviviendabackend.entities.Tasa_Interes;

@Repository
public interface ITasa_InteresRepository extends JpaRepository<Tasa_Interes,Integer> {
}
