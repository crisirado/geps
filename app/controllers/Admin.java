package controllers;
 
import models.login.Usuario;
import play.mvc.*;
 
 
 
@With(Secure.class)
@CRUD.For(Usuario.class)
public class Admin extends CRUD {
    
    @Before
    static void setConnectedUser() {
        if(Security.isConnected()) {
            //User user = User.find("byEmail", Security.connected()).first();
            Usuario usuario = Usuario.find("byEmail","admin@suaempresa.com").first();
            
            renderArgs.put("user", usuario != null ?usuario.nome: "");
        }
    }
    
    
}