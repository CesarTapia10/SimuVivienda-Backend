package pe.edu.upc.simuviviendabackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.simuviviendabackend.entities.Simulaciones_Credito;

@Repository
public interface ISimulaciones_CreditoRepository extends JpaRepository<Simulaciones_Credito,Integer> {
}
