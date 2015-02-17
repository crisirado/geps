package models.login;

import play.data.validation.Email;
import play.db.jpa.Model;


public class Usuario extends Model{

    public String login;
    public String password;
    @Email
    public String email;
    
    public Boolean admin = Boolean.FALSE;
}
