package pe.edu.upc.simuviviendabackend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.simuviviendabackend.dtos.Soporte_TicketsDTO;
import pe.edu.upc.simuviviendabackend.entities.Soporte_Tickets;
import pe.edu.upc.simuviviendabackend.serviceinterfaces.ISoporte_TicketsService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Soporte_Tickets")
public class Soporte_TicketsControllers {
    @Autowired
    private ISoporte_TicketsService sS;
    @GetMapping
    public List<Soporte_TicketsDTO> listar(){
        return sS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,Soporte_TicketsDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void registrar(@RequestBody Soporte_TicketsDTO dto) {
        ModelMapper m = new ModelMapper();
        Soporte_Tickets c = m.map(dto, Soporte_Tickets.class);
        sS.insert(c);
    }

    @GetMapping("/{id}")
    public Soporte_TicketsDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        Soporte_TicketsDTO dto=m.map(sS.listId(id),Soporte_TicketsDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody Soporte_TicketsDTO dto) {
        ModelMapper m = new ModelMapper();
        Soporte_Tickets c = m.map(dto, Soporte_Tickets.class);
        sS.update(c);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        sS.delete(id);
    }
}
