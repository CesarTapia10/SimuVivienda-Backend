package pe.edu.upc.simuviviendabackend.serviceimplements;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.simuviviendabackend.repositories.IrolesRepository;
import pe.edu.upc.simuviviendabackend.serviceinterfaces.IrolesService;
import pe.edu.upc.simuviviendabackend.entities.roles;
import java.util.List;

@Service
public class rolesServiceImplements implements IrolesService {
    @Autowired
    private IrolesRepository rR;

    @Override
    public void insert(roles rol) {
        rR.save(rol);
    }

    @Override
    public void update(roles rol) {
        rR.save(rol);
    }

    @Override
    public List<roles> list() {
        return rR.findAll();
    }

    @Override
    public void delete(Long idRol) {
        rR.deleteById(idRol);
    }

    @Override
    public roles listarId(Long idRol) {
        return rR.findById(idRol).orElse(new roles());
    }

    @Override
    public List<roles> buscar(String rol) {
        return rR.buscarRol(rol);
    }
}
