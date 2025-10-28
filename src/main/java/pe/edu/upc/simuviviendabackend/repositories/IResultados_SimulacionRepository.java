package pe.edu.upc.simuviviendabackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.simuviviendabackend.entities.Resultados_Simulacion;

@Repository
public interface IResultados_SimulacionRepository extends JpaRepository<Resultados_Simulacion,Integer> {
}
