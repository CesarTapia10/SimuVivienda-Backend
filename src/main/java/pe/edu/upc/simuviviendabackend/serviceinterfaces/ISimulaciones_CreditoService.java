package pe.edu.upc.simuviviendabackend.serviceinterfaces;


import pe.edu.upc.simuviviendabackend.entities.Simulaciones_Credito;

import java.util.List;

public interface ISimulaciones_CreditoService {
    public void insert(Simulaciones_Credito simulaciones_credito);
    public List<Simulaciones_Credito> list();
    public void delete(int idsimulaciones_credito);
    public Simulaciones_Credito listId(int idsimulaciones_credito);
    public void update(Simulaciones_Credito idsimulaciones_credito);
}
