package pe.edu.upc.simuviviendabackend.serviceinterfaces;

import pe.edu.upc.simuviviendabackend.entities.Amortizaciones;

import java.util.List;

public interface IAmortizacionesService {
    public void insert(Amortizaciones amortizaciones);
    public List<Amortizaciones> list();
    public void delete(int idamortizaciones);
    public Amortizaciones listId(int idamortizaciones);
    public void update(Amortizaciones idamortizaciones);
}
