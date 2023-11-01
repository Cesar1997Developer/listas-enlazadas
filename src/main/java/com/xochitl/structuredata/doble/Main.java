package com.xochitl.structuredata.doble;

public class Main {

    public static void main(String[] args) {

        ListaDobleEnlazada lista = new ListaDobleEnlazada();

        lista.agregarElemento(10);
        lista.agregarElemento(20);
        lista.agregarElemento(30);
        lista.agregarElemento(40);

        lista.imprimirAscendente();
        lista.imprimirDescendente();

        lista.eliminarElemento(10);
        lista.imprimirAscendente();

        int numeroABuscar = 20;
        boolean existe  = lista.buscarElemento(numeroABuscar);
        System.out.println("El número "+ numeroABuscar + " existe ? " +  ((existe ? "si existe" : "no existe")));



    }
}
