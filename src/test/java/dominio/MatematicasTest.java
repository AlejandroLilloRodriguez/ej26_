package dominio;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MatematicasTest {

    @org.junit.jupiter.api.Test
    void suma0() {
        assertEquals(0, Matematicas.suma(0));
    }
    @org.junit.jupiter.api.Test
    void suma30() {
        assertEquals(455, Matematicas.suma(30));
    }


    @org.junit.jupiter.api.Test
    void fac0() {
        assertEquals(1, Matematicas.fac(0));
    }
    @org.junit.jupiter.api.Test
    void fac10() {
        assertEquals(3628800, Matematicas.fac(10));
    }

    @org.junit.jupiter.api.Test
    void potencianelevadoa0() {
        assertEquals(1, Matematicas.potencia(7, 0));
    }
    @org.junit.jupiter.api.Test
    void potencianelevadoam() {
        assertEquals(343, Matematicas.potencia(7, 3));
    }@org.junit.jupiter.api.Test
    void sumaLista0() {
        int[] lista = {};
        assertEquals(0, Matematicas.sumaLista(lista , 0));
    }
    @org.junit.jupiter.api.Test
    void sumaLista5() {
        int[] lista = {1,2,3,4,5};
        assertEquals(14, Matematicas.sumaLista(lista , 4));
    }
    @org.junit.jupiter.api.Test
    void media0() {
        int[] lista = {};
        assertEquals(0, Matematicas.media(lista, 0));

    }
    @org.junit.jupiter.api.Test
    void media5() {
        int[] lista = {1,2,3,4,5};
        assertEquals(3, Matematicas.media(lista, 4));

    }

    @org.junit.jupiter.api.Test
    void alcuadrado() {

    }

    @org.junit.jupiter.api.Test
    void sumaPares8() {
        assertEquals(12, Matematicas.sumaPares(8));
    }
    @org.junit.jupiter.api.Test
    void sumaPares0() {
        assertEquals(0, Matematicas.sumaPares(0));
    }

    @org.junit.jupiter.api.Test
    void sumas5() {
        int [] lista = {1,2,3,4,5};
        assertEquals(6, Matematicas.sumas(lista, 4));
    }
    @org.junit.jupiter.api.Test
    void sumas0() {
        int [] lista = {};
        assertEquals(0, Matematicas.sumas(lista, 0));
    }

    @org.junit.jupiter.api.Test
    void suma5() {
        int [] lista = {1,2,3,4,5};
        ArrayList<Integer> lista2 = new ArrayList<Integer>();
        lista2.add(2);
        lista2.add(4);
        ArrayList<Integer> lista3 = new ArrayList<Integer>();
        assertEquals(lista2, Matematicas.suma1(lista,lista3, 4));
    }
    @org.junit.jupiter.api.Test
    void sumal0() {
        int [] lista = {};
        ArrayList<Integer> lista2 = new ArrayList<Integer>();
        assertEquals(lista2, Matematicas.suma1(lista,lista2, 0));
    }

    @org.junit.jupiter.api.Test
    void listaPar() {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        assertEquals(lista, Matematicas.listaPar(lista, 0));
    }
    @org.junit.jupiter.api.Test
    void listaPares() {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(2);
        lista.add(4);
        lista.add(6);
        assertEquals(lista, Matematicas.listaPar(lista, 6));
    }

    @org.junit.jupiter.api.Test
    void calcularProductoEscalar5() {
        int[] lista1 = {1,2,3,4,5};
        int[] lista2 = {1,2,3,4,5};
        assertEquals(11, Matematicas.calcularProductoEscalar(lista1, lista2, 5));
    }
    @org.junit.jupiter.api.Test
    void calcularProductoEscalar0() {
        int[] lista1 = {};
        int[] lista2 = {};
        assertEquals(0, Matematicas.calcularProductoEscalar(lista1, lista2, 0));
    }


    @org.junit.jupiter.api.Test
    void fibonacci0() {
        assertEquals(0, Matematicas.fibonacci(0));
    }
    @org.junit.jupiter.api.Test
    void fibonacci5() {
        assertEquals(21, Matematicas.fibonacci(8));
    }


    @org.junit.jupiter.api.Test
    void fibonacci12() {
    }

    @org.junit.jupiter.api.Test
    void fibonacci13() {
    }

    @org.junit.jupiter.api.Test
    void relacionAurea() {
    }
}