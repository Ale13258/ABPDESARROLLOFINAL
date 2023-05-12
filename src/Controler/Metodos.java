/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Usuario;
import model.Inventario;
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

    @SuppressWarnings("unchecked")
    public void Escribir(JSONObject datos, String key, String nombreFile) {
        JSONArray array = new JSONArray();
        JSONObject json = new JSONObject();

        if (leerArchivo(nombreFile)) {
            array.add(datos);
            json.put(key, array);
        } else {
            array = ArrayJson(key, nombreFile);
            array.add(datos);
            json.put(key, array);
        }

        // Convertir objeto JSON a cadena
        String jsonString = json.toString();

        try {
            BufferedWriter archivo = new BufferedWriter(new FileWriter("src/File/" + nombreFile + ".txt"));
            archivo.write(jsonString);
            archivo.flush();

        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo", "EROOR!!!", JOptionPane.ERROR_MESSAGE);
        }

    }

    public boolean leerArchivo(String nombreFile) {
        boolean flag = false;
        BufferedReader archivo = null;

        try {
            archivo = new BufferedReader(new FileReader("src/File/" + nombreFile + ".txt"));
            if (archivo.readLine() == null) {
                flag = true;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }

    public JSONArray ArrayJson(String key, String nombreFile) {
        JSONArray array = null;
        try {
            JSONParser Parser = new JSONParser();
            BufferedReader archivo = new BufferedReader(new FileReader("src/File/" + nombreFile + ".txt"));
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
        JSONArray array = ArrayJson("Personas", "Usuarios");
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

    public List<Inventario> obtenerEquipos() {
        List<Inventario> equipos = new ArrayList<>();
        if (!leerArchivo("Inventario")) {
            JSONArray array = ArrayJson("Inventario", "Inventario");
            for (Object object : array) {
                Gson gson = new Gson();
                Inventario nuevo = gson.fromJson(object.toString(), Inventario.class);

                equipos.add(nuevo);
            }
        }
        return equipos;
    }

}
