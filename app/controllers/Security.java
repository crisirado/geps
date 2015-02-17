package controllers;

public class Security extends Secure.Security {

    static boolean authenticate(String username, String password) {
        //User user = User.find("byEmail", username).first();
        //return user != null && user.password.equals(password);
        return Boolean.TRUE;
    }

    static void onAuthenticated() {
        Application.index();
    }
    
    static boolean check(String profile) {
    if("admin".equals(profile)) {
        return true;
        //return User.find("byEmail", connected()).<User>first().isAdmin;
    }
    return false;
}
}
