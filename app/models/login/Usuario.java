package models.login;

import commons.Extensions;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import play.data.validation.Email;
import play.data.validation.Password;
import play.db.jpa.Model;

@Entity
@Table(schema = "GEPS", name = "USUARIOS")
public class Usuario extends Model {

    public String nome;
    @Password
    @Column(name = "senha")
    public String password;
    @Email
    public String email;

    //public Boolean admin = Boolean.FALSE;
    public static Boolean verificar(String usuario, String senha) {
        String md5Senha = null;
        Usuario logado;
        try {
            md5Senha = Extensions.toMD5(senha);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        logado = Usuario.find("byEmailAndPassword", usuario, md5Senha).first();
        if (logado != null) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }
}
