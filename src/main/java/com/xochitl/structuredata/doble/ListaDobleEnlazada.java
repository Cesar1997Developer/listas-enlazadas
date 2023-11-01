package com.xochitl.structuredata.doble;

public class ListaDobleEnlazada {

    Nodo cabecera;
    Nodo cola;

    public void agregarElemento(int dato){
        Nodo nuevoNodo = new Nodo(dato);
        if(cabecera == null){
            cabecera = nuevoNodo;
            cola = nuevoNodo;
        }else{
            nuevoNodo.anteriror = cola;
            cola.siguiente = nuevoNodo;
            cola = nuevoNodo;
        }

    }

    public void eliminarElemento(int dato){
        Nodo actual = cabecera;
        while (actual != null){

            if (actual.dato == dato) {
                if(actual == cabecera){
                    cabecera = actual.siguiente;
                    if(cabecera != null){
                        cabecera.anteriror = null;
                    }
                } else if (actual == cola) {
                    cola = actual.anteriror;
                    cola.siguiente = null;
                }else {
                    actual.anteriror.siguiente = actual.siguiente;
                    actual.siguiente.anteriror = actual.anteriror;
                }
                return;
            }
            actual = actual.siguiente;
        }
    }

    public boolean buscarElemento (int dato){
        Nodo actual = cabecera;

        while (actual != null){
            if(actual.dato == dato){
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    public void imprimirAscendente(){
        System.out.println("==== LISTA ASCENDENTE ====");
        Nodo actual = cabecera;
        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }

    public void imprimirDescendente(){
        System.out.println("==== LISTA DESCENDENTE ====");
        Nodo actual = cola;
        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.anteriror;
        }
    }
}
