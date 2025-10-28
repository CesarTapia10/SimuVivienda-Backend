package pe.edu.upc.simuviviendabackend.serviceinterfaces;



import pe.edu.upc.simuviviendabackend.entities.Tasa_Interes;

import java.util.List;

public interface ITasa_InteresService {
    public void insert(Tasa_Interes tasa_interes);
    public List<Tasa_Interes> list();
    public void delete(int idtasa_interes);
    public Tasa_Interes listId(int idtasa_interes);
    public void update(Tasa_Interes idtasa_interes);
}
