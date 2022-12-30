/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.modelo;

import controlador.listas.ListaEnlazada;
import controlador.listas.excepciones.ListaNullException;
import controlador.listas.excepciones.PosicionNoEncontradaException;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author DEEPIN
 */
public class ModeloTablaAleatorio extends AbstractTableModel {

    private ListaEnlazada<String> aleatorios = new ListaEnlazada<>();

    public ListaEnlazada<String> getAleatorios() {
        return aleatorios;
    }

    public void setAleatorios(ListaEnlazada<String> aleatorios) {
        this.aleatorios = aleatorios;
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public int getRowCount() {
        return aleatorios.getSize();
    }

    @Override
    public String getColumnName(int column) {

        switch (column) {
            case 0:
                return "Nro";
            case 1:
                return "String";

            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String c = null;
        try {
            c = aleatorios.obtener(rowIndex);
        } catch (ListaNullException | PosicionNoEncontradaException e) {
            System.out.println(e.getMessage());
        }
        switch (columnIndex) {
            case 0:
                return (rowIndex + 1);
            case 1:
                return (c != null) ? c.toString() : "No registrado";

            default:
                return null;
        }
    }
}
