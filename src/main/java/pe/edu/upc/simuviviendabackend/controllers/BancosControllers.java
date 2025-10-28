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
import pe.edu.upc.simuviviendabackend.dtos.BancosDTO;
import pe.edu.upc.simuviviendabackend.entities.Bancos;
import pe.edu.upc.simuviviendabackend.serviceinterfaces.IBancosService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Bancos")
public class BancosControllers {
    @Autowired
    private IBancosService bS;
    @GetMapping
    public List<BancosDTO> listar(){
        return bS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,BancosDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void registrar(@RequestBody BancosDTO dto) {
        ModelMapper m = new ModelMapper();
        Bancos c = m.map(dto, Bancos.class);
        bS.insert(c);
    }

    @GetMapping("/{id}")
    public BancosDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        BancosDTO dto=m.map(bS.listId(id),BancosDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody BancosDTO dto) {
        ModelMapper m = new ModelMapper();
        Bancos c = m.map(dto, Bancos.class);
        bS.update(c);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        bS.delete(id);
    }
}
