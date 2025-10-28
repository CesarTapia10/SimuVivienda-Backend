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
import pe.edu.upc.simuviviendabackend.dtos.AmortizacionesDTO;
import pe.edu.upc.simuviviendabackend.entities.Amortizaciones;
import pe.edu.upc.simuviviendabackend.serviceinterfaces.IAmortizacionesService;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/amortizaciones")
public class AmortizacionesControllers {
    @Autowired
    private IAmortizacionesService aS;
    @GetMapping
    public List<AmortizacionesDTO> listar(){
        return aS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,AmortizacionesDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void registrar(@RequestBody AmortizacionesDTO dto) {
        ModelMapper m = new ModelMapper();
        Amortizaciones c = m.map(dto, Amortizaciones.class);
        aS.insert(c);
    }

    @GetMapping("/{id}")
    public AmortizacionesDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        AmortizacionesDTO dto=m.map(aS.listId(id),AmortizacionesDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody AmortizacionesDTO dto) {
        ModelMapper m = new ModelMapper();
        Amortizaciones c = m.map(dto, Amortizaciones.class);
        aS.update(c);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        aS.delete(id);
    }
}
