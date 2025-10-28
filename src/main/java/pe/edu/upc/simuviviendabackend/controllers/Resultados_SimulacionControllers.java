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
import pe.edu.upc.simuviviendabackend.dtos.Resultados_SimulacionDTO;
import pe.edu.upc.simuviviendabackend.entities.Resultados_Simulacion;
import pe.edu.upc.simuviviendabackend.serviceinterfaces.IResultados_SimulacionService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Resultados_Simulacion")
public class Resultados_SimulacionControllers {
    @Autowired
    private IResultados_SimulacionService rS;
    @GetMapping
    public List<Resultados_SimulacionDTO> listar(){
        return rS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,Resultados_SimulacionDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void registrar(@RequestBody Resultados_SimulacionDTO dto) {
        ModelMapper m = new ModelMapper();
        Resultados_Simulacion c = m.map(dto, Resultados_Simulacion.class);
        rS.insert(c);
    }

    @GetMapping("/{id}")
    public Resultados_SimulacionDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        Resultados_SimulacionDTO dto=m.map(rS.listId(id),Resultados_SimulacionDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody Resultados_SimulacionDTO dto) {
        ModelMapper m = new ModelMapper();
        Resultados_Simulacion c = m.map(dto, Resultados_Simulacion.class);
        rS.update(c);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        rS.delete(id);
    }
}
