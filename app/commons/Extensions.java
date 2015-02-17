package commons;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import play.templates.JavaExtensions;

public class Extensions extends JavaExtensions {

    public static String scapeJson(String texto) {

        try {

            if (texto.isEmpty()) {
                return "";
            }

            String textoR = texto.replaceAll("\"", "'").replaceAll("\n", "").replaceAll("\r", "");

            return textoR.replace("\\", "/");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "";

    }

    public static String checked(Object condicao, Object valor1, Object valor2) {

        if ((valor1 == null || valor1.toString().equals("")) && valor2 == null) {
            return "";
        } else {

            Object resultado = (valor1 == null || valor1.equals("")) ? valor2 : valor1;

            if (resultado == null || resultado.toString().equals("null")) {

                return "";
            } else {

                if (condicao != null && resultado.toString().toUpperCase().equals(condicao.toString().toUpperCase())) {

                    return " checked = \"checked\"  ";

                }

            }

        }

        return "";

    }

    public static String formatDefault(String data) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy  hh:mm:ss");
        return simpleDateFormat.format(data); 
    }
    
    public static String toMD5(String data) throws NoSuchAlgorithmException{         
        MessageDigest md = MessageDigest.getInstance("MD5");
 
        BigInteger hash = new BigInteger(1, md.digest(data.getBytes()));
 
        return String.format("%32x", hash);    
    }

}
