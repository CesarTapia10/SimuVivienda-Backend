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
import pe.edu.upc.simuviviendabackend.dtos.Tasa_InteresDTO;
import pe.edu.upc.simuviviendabackend.entities.Tasa_Interes;
import pe.edu.upc.simuviviendabackend.serviceinterfaces.ITasa_InteresService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Tasa_Interes")
public class Tasa_InteresControllers {
    @Autowired
    private ITasa_InteresService tS;
    @GetMapping
    public List<Tasa_InteresDTO> listar(){
        return tS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,Tasa_InteresDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void registrar(@RequestBody Tasa_InteresDTO dto) {
        ModelMapper m = new ModelMapper();
        Tasa_Interes c = m.map(dto, Tasa_Interes.class);
        tS.insert(c);
    }

    @GetMapping("/{id}")
    public Tasa_InteresDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        Tasa_InteresDTO dto=m.map(tS.listId(id),Tasa_InteresDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody Tasa_InteresDTO dto) {
        ModelMapper m = new ModelMapper();
        Tasa_Interes c = m.map(dto, Tasa_Interes.class);
        tS.update(c);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        tS.delete(id);
    }
}
