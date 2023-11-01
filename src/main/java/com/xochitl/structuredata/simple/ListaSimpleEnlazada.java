package com.xochitl.structuredata.simple;

public class ListaSimpleEnlazada {

    Nodo cabecera;


    public void agregarElemento(int dato) {
        Nodo nodo = new Nodo(dato);
        if (cabecera == null) {
            cabecera = nodo;
        } else {
            Nodo actual = cabecera;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nodo;
        }
    }

    public void eliminarElemento(int dato) {
        if (cabecera == null) {
            return;
        }
        if (cabecera.dato == dato) {
            cabecera = cabecera.siguiente;
            return;
        }
        Nodo actual = cabecera;
        while (actual.siguiente != null) {
            if (actual.siguiente.dato == dato) {
                actual.siguiente = actual.siguiente.siguiente;
                return;
            }
            actual = actual.siguiente;
        }
    }


    public boolean buscarElemento(int dato) {
        Nodo actual = cabecera;
        while (actual != null) {
            if (actual.dato == dato) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    public void imprimirLista() {
        System.out.println("========== LISTA =========");
        Nodo actual = cabecera;
        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }

}
