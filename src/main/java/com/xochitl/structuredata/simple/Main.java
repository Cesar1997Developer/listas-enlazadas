package com.xochitl.structuredata.simple;

public class Main {

    public static void main(String[] args) {

        ListaSimpleEnlazada list = new ListaSimpleEnlazada();

        list.agregarElemento(10);
        list.agregarElemento(20);
        list.agregarElemento(30);
        list.agregarElemento(40);

        list.imprimirLista();

        list.eliminarElemento(20);
        list.imprimirLista();

        int numeroABuscar = 40;
        boolean existe = list.buscarElemento(numeroABuscar);
        System.out.println("Elemento " + numeroABuscar + " existe ? " + (existe ? "si existe" : "no existe"));

    }
}
