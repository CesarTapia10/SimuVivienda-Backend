package pe.edu.upc.simuviviendabackend.serviceinterfaces;



import pe.edu.upc.simuviviendabackend.entities.Resultados_Simulacion;

import java.util.List;

public interface IResultados_SimulacionService {
    public void insert(Resultados_Simulacion resultados_simulacion);
    public List<Resultados_Simulacion> list();
    public void delete(int idresultados_simulacion);
    public Resultados_Simulacion listId(int idresultados_simulacion);
    public void update(Resultados_Simulacion idresultados_simulacion);
}
