/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Usuario;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import vista.LoginVista;
import vista.Menu;

/**
 *
 * @author Wilme
 */
public class Metodos {

    public Boolean flags = false;

    public void Escribir(JSONObject datos, String key) {
        JSONArray array = ArrayJson(key);
        array.add(datos);
        JSONObject json = new JSONObject();
        json.put(key, array);

        // Convertir objeto JSON a cadena
        String jsonString = json.toString();

        try {
            BufferedWriter archivo = new BufferedWriter(new FileWriter("src/File/Usuarios.txt"));
            archivo.write(jsonString);
            archivo.flush();

        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public JSONArray ArrayJson(String key) {
        JSONArray array = null;
        try {
            JSONParser Parser = new JSONParser();
            InputStream resourceStream = this.getClass().getResourceAsStream("/File/Usuarios.txt");
            BufferedReader archivo = new BufferedReader(new InputStreamReader(resourceStream, "UTF-8"));
            JSONObject pJsonObj = (JSONObject) Parser.parse(archivo);
            array = (JSONArray) pJsonObj.get(key);
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no encontrado");
        } catch (UnsupportedEncodingException ex) {
            java.util.logging.Logger.getLogger(LoginVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IOException | ParseException ex) {
            java.util.logging.Logger.getLogger(LoginVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return array;
    }

    public List<Usuario> ReadUser() {
        List<Usuario> uss = new ArrayList<>();
        JSONArray array = ArrayJson("Personas");
        for (Object object : array) {
            String dts = object.toString();
            Gson gson = new Gson();
            Usuario usu = gson.fromJson(dts, Usuario.class);
            uss.add(usu);
        }

        return uss;
    }

    public boolean Login(Usuario datos) {
        List<Usuario> lista = ReadUser();
        Menu menu = new Menu();
        lista.forEach(res -> {
            if (res.usuario.equals(datos.usuario) && res.contrasena.equals(datos.contrasena)) {
                menu.setVisible(true);
                this.flags = true;
            }
        });

        if (!flags) {
            JOptionPane.showMessageDialog(null, "Datos Incorrectos");
        }

        return flags;

    }

}