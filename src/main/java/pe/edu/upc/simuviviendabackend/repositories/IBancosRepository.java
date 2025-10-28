package pe.edu.upc.simuviviendabackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.simuviviendabackend.entities.Bancos;

@Repository
public interface IBancosRepository extends JpaRepository<Bancos,Integer> {
}
