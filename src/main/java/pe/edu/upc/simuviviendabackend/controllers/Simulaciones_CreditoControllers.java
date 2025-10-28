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
import pe.edu.upc.simuviviendabackend.dtos.Simulaciones_CreditoDTO;
import pe.edu.upc.simuviviendabackend.entities.Simulaciones_Credito;
import pe.edu.upc.simuviviendabackend.serviceinterfaces.ISimulaciones_CreditoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Simulaciones_Credito")
public class Simulaciones_CreditoControllers {
    @Autowired
    private ISimulaciones_CreditoService sS;
    @GetMapping
    public List<Simulaciones_CreditoDTO> listar(){
        return sS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,Simulaciones_CreditoDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void registrar(@RequestBody Simulaciones_CreditoDTO dto) {
        ModelMapper m = new ModelMapper();
        Simulaciones_Credito c = m.map(dto, Simulaciones_Credito.class);
        sS.insert(c);
    }

    @GetMapping("/{id}")
    public Simulaciones_CreditoDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        Simulaciones_CreditoDTO dto=m.map(sS.listId(id),Simulaciones_CreditoDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody Simulaciones_CreditoDTO dto) {
        ModelMapper m = new ModelMapper();
        Simulaciones_Credito c = m.map(dto, Simulaciones_Credito.class);
        sS.update(c);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        sS.delete(id);
    }

}
