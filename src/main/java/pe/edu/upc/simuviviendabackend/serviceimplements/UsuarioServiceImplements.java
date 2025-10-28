package pe.edu.upc.simuviviendabackend.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.simuviviendabackend.entities.Usuario;
import pe.edu.upc.simuviviendabackend.repositories.IUsuarioRepository;
import pe.edu.upc.simuviviendabackend.serviceinterfaces.IUsuarioService;

import java.util.List;

@Service
public class UsuarioServiceImplements  implements IUsuarioService {

    @Autowired
    private IUsuarioRepository uR;

    @Override
    public Usuario insert(Usuario usuario) {
        return uR.save(usuario);
    }

    @Override
    public List<Usuario> list() {
        return uR.findAll();
    }

    @Override
    public void delete(Long idUsuario) {
        uR.deleteById(idUsuario);

    }

    @Override
    public Usuario listarId(Long idUsuario) {
        return uR.findById(idUsuario).orElse(new Usuario());
    }

    @Override
    public void updateUser(Usuario user) {
        uR.save(user);

    }

    @Override
    public List<Usuario> searchUser(String email) {
        return List.of();
    }

    @Override
    public List<Usuario> searchByMail(String email) {
        return List.of();
    }

    @Override
    public void insertarUsuarioConRol(String email, String password, String username) {
        uR.insertarUsuarioConRol(email,password,username);

    }

    @Override
    public List<Usuario> listByRole(String roleName) {
        return uR.findByRoleName(roleName);
    }

    @Override
    public Usuario finduser(String username) {
        return uR.findByUsername(username);
    }
}
