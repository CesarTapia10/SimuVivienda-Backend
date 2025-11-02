package pe.edu.upc.simuviviendabackend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.simuviviendabackend.dtos.UsersNoPassDTO;
import pe.edu.upc.simuviviendabackend.dtos.UsuarioDTO;
import pe.edu.upc.simuviviendabackend.entities.Usuario;
import pe.edu.upc.simuviviendabackend.serviceinterfaces.IUsuarioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UsuarioControllers {
    @Autowired
    private IUsuarioService uS;
    @Autowired
    private PasswordEncoder passwordEncoder;


    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Long id) {
        uS.delete(id);
    }

    @GetMapping("/{id}")
    public UsuarioDTO listarId(@PathVariable("id") Long id) {
        ModelMapper m = new ModelMapper();
        UsuarioDTO dto = m.map(uS.listarId(id), UsuarioDTO.class);
        return dto;
    }

    @GetMapping
    public List<UsuarioDTO> listar() {
        return uS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UsuarioDTO.class);
        }).collect(Collectors.toList());
    }

    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    @GetMapping("/buscarUsuario")
    public List<UsuarioDTO> buscarUsuario(@RequestParam String email){
        return uS.searchUser(email).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, UsuarioDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/NoAuth/{email}")
    public List<UsersNoPassDTO> buscarUsuarioNoAuth(@PathVariable String email){
        return uS.searchUser(email).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, UsersNoPassDTO.class);
        }).collect(Collectors.toList());
    }


    @GetMapping("/role/{roleName}")
    public List<UsuarioDTO> listByRole(@PathVariable("roleName") String roleName) {
        return uS.listByRole(roleName).stream().map(y -> {
            ModelMapper m = new ModelMapper();
            return m.map(y, UsuarioDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/nombreusuario")
    public UsuarioDTO encontraruser(@RequestParam String nombreuser){
        ModelMapper m = new ModelMapper();
        UsuarioDTO dto = m.map(uS.finduser(nombreuser), UsuarioDTO.class);
        return dto;
    }
    @PostMapping("/create")
    public ResponseEntity<String> createUser(@RequestBody UsuarioDTO dto) {
        ModelMapper mapper = new ModelMapper();
        Usuario user = mapper.map(dto, Usuario.class);

        // Codificar la contraseña
        String encodedPassword = passwordEncoder.encode(user.getPassword());

        // Llamar al procedimiento almacenado a través del repositorio
        uS.insertarUsuarioConRol(user.getEmail(), encodedPassword, user.getUsername());

        return ResponseEntity.ok("Usuario creado con rol correctamente");
    }


    @PostMapping("/registroNoAuth")
    public void registrarNoAuth(@RequestBody UsuarioDTO dto) {
        ModelMapper m = new ModelMapper();
        Usuario u = m.map(dto, Usuario.class);
        String encodedPassword = passwordEncoder.encode(u.getPassword());
        u.setPassword(encodedPassword);
        uS.insert(u);
    }

    @PostMapping
    public ResponseEntity<UsuarioDTO> registrar(@RequestBody UsuarioDTO dto) {
        ModelMapper m = new ModelMapper();
        Usuario us = m.map(dto, Usuario.class);
        String encodedPassword = passwordEncoder.encode(us.getPassword());
        us.setPassword(encodedPassword);
        Usuario newUser = uS.insert(us);
        UsuarioDTO userResponse = m.map(newUser, UsuarioDTO.class);
        return new ResponseEntity<>(userResponse, HttpStatus.CREATED);
    }
    @PutMapping
    public void modificar(@RequestBody UsuarioDTO dto) {
        ModelMapper m = new ModelMapper();
        Usuario u = m.map(dto, Usuario.class);
        String encodedPassword = passwordEncoder.encode(u.getPassword());
        u.setPassword(encodedPassword);
        uS.updateUser(u);
    }
}
