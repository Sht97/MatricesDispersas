/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices.dispersas;

/**
 *
 * @author danie
 */
public class Tripleta {
   private int fila,columna;
    private Object dato;
    
    public Tripleta(int x,int y, Object dato)
    {
    this.fila=x;
    this.columna=y;
    this.dato=dato;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }
   
}
