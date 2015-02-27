package controllers;

import models.login.Usuario;

public class Security extends Secure.Security {

    static Usuario usuario;

    static boolean authenticate(String username, String password) {
        if (Usuario.verificar(username, password)) {
            usuario = Usuario.find("byEmail", username).first();
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }

    }

    static void onAuthenticated() {
        Application.index();
    }

    static boolean check(String profile) {
        if ("admin".equals(profile)) {
            return true;
            //return User.find("byEmail", connected()).<User>first().isAdmin;
        }
        return false;
    }

}
