/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.utiles;

import com.google.gson.Gson;
import controlador.CadenaControlador;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author DEEPIN
 */
public class Utilidades {

    public static String DIRCARPDATA = "data";

    public static boolean guardarJSON(CadenaControlador aleatorios) {

        Gson gson = new Gson();
        String json = gson.toJson(aleatorios);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(DIRCARPDATA + File.separatorChar + "datos.json"))) {
            bw.write(json);
            bw.close();
            return true;
        } catch (Exception e) {
            System.out.println("Error" + e);
            return false;
        }

    }
}
