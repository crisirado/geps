package controllers;

import play.*;
import play.mvc.*;

@Check("admin")
@With(Secure.class)
public class Application extends Controller {

    public static void index() {
        render();
    }

}