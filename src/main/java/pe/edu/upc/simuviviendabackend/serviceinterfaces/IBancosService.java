package pe.edu.upc.simuviviendabackend.serviceinterfaces;

import pe.edu.upc.simuviviendabackend.entities.Bancos;

import java.util.List;

public interface IBancosService {
    public void insert(Bancos bancos);
    public List<Bancos> list();
    public void delete(int idbancos);
    public Bancos listId(int idbancos);
    public void update(Bancos idbancos);
}
