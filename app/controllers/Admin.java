package controllers;
 
import play.mvc.*;
 
 
 
@With(Secure.class)
public class Admin extends Controller {
    
    @Before
    static void setConnectedUser() {
        if(Security.isConnected()) {
            //User user = User.find("byEmail", Security.connected()).first();
            renderArgs.put("user", "Cristiano Blans");
        }
    }
 
    public static void index() {
        render();
    }
    
}