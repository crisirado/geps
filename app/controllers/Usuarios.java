package controllers;

import java.util.List;
import models.login.Usuario;
import play.db.jpa.Transactional;
import play.mvc.Controller;

public class Usuarios extends Controller {
    @Transactional(readOnly = true)
    public static void index() {
        List<Usuario> usuarios = Usuario.findAll();

        render(usuarios);
    }
    
    @Transactional(readOnly = true)
    public static void visualizar(Integer usuarioId){
        Usuario usuario = Usuario.findById(Long.valueOf(usuarioId.toString()));
        
        render(usuario);
    }
}
