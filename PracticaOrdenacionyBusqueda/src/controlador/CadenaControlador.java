/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import controlador.listas.ListaEnlazada;

/**
 *
 * @author DEEPIN
 */
public class CadenaControlador {

    private ListaEnlazada<String> aleatorios = new ListaEnlazada<>();
    private String cadenaAleatoria;

    public CadenaControlador() {
    }

    public void generarStringAleatorio() {

        for (int aux = 0; aux < 20000; aux++) {
            final String cadena = "abcdefghijklmnopqrstuvwxyz";
            final int longitud = 5;

            StringBuilder sb = new StringBuilder(); //permite trabaja con cadenas de caracteres a la cuales se realizan modificaciones frecuentemente

            for (int i = 0; i < longitud; i++) {
                double aleatorio = Math.random() * cadena.length();
                int posicion = (int) aleatorio;
                char letra = cadena.charAt(posicion);
                sb.append(letra);
                cadenaAleatoria = sb.toString();

            }

//            System.out.print(cadenaAleatoria + "\n");
            aleatorios.insertar(cadenaAleatoria);
        }
//        aleatorios.imprimir();


    }

    

    public ListaEnlazada<String> getAleatorios() {
        return aleatorios;
    }

    public void setAleatorios(ListaEnlazada<String> aleatorios) {
        this.aleatorios = aleatorios;
    }

    public String getCadenaAleatoria() {
        return cadenaAleatoria;
    }

    public void setCadenaAleatoria(String cadenaAleatoria) {
        this.cadenaAleatoria = cadenaAleatoria;
    }

}
