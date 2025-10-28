package pe.edu.upc.simuviviendabackend.serviceinterfaces;

import java.util.List;

import pe.edu.upc.simuviviendabackend.entities.roles;

public interface IrolesService {

    public void insert(roles rol);

    public List<roles> list();
    public void update(roles role);

    public void delete(Long idRol);

    public roles listarId(Long idRol);

    public List<roles> buscar(String rol);
}
