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
public class MatrizEnTripletas {

    private Tripleta[] v;

    public MatrizEnTripletas(Tripleta t) {
        int p = (t.getFila() * t.getColumna()) + 2;
        v = new Tripleta[p];
        v[0] = t;

        for (int i = 2; i <= p; i++) {
            v[i] = null;
        }
    }

    /*   MatrizEnTripletas construyeMatriz(Object[][] m){
    MatrizEnTripletas a;
    
    return a;
    }*/
    void asignaTripleta(Tripleta a, int i) {
        v[i] = a;
    }

    void asignaNumeroTripletas(int a) {
        v[0].setDato(a);
    }

    int getFilas() {
        return v[0].getFila();
    }

    int getColumna() {
        return v[0].getColumna();
    }

    int getNumTripletas() {
        Object p = v[0].getDato();
        int i = (Integer) p;
        return i;
    }

    Tripleta getTripleta(int i) {
        return v[i];
    }

    void muestraMatrizEnTripletas() {
        for (int i = 1; i <= getNumTripletas(); i++) {
            Tripleta t = v[i];
            System.out.println(t.getFila()+""+ t.getColumna()+""+ t.getDato());
        }

    }
    
    void insertaTripleta(Tripleta t)
    {
    int datos=getNumTripletas();
    int i=1;
    
    }
}

 