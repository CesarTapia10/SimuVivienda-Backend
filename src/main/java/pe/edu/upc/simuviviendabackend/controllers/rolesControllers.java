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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upc.simuviviendabackend.serviceinterfaces.IrolesService;
import pe.edu.upc.simuviviendabackend.dtos.rolesDTO;
import pe.edu.upc.simuviviendabackend.entities.roles;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/roles")
public class rolesControllers {
    @Autowired
    private IrolesService rS;

    @GetMapping
    public List<rolesDTO> listar(){
        return rS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, rolesDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/NoAuth")
    public void registrarNoAuth(@RequestBody rolesDTO dto) {
        ModelMapper m = new ModelMapper();
        roles r = m.map(dto, roles.class);
        rS.insert(r);
    }

    @PostMapping
    public void registrar(@RequestBody rolesDTO dto) {
        ModelMapper m = new ModelMapper();
        roles r = m.map(dto, roles.class);
        rS.insert(r);

    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Long id) {
        rS.delete(id);
    }

    @GetMapping("/{id}")
    public rolesDTO listarId(@PathVariable("id") Long id) {
        ModelMapper m=new ModelMapper();
        rolesDTO dto=m.map(rS.listarId(id),rolesDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody rolesDTO dto) {
        ModelMapper m = new ModelMapper();
        roles d = m.map(dto, roles.class);
        rS.update(d);
    }

    @GetMapping("/buscarRol")
    public List<rolesDTO> buscar(@RequestParam String rol) {
        return rS.buscar(rol).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,rolesDTO.class);
        }).collect(Collectors.toList());
    }
}
