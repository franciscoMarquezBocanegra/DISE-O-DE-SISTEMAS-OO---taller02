package edu.escuelaing.arsw.calculator;

import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

import edu.escuelaing.arsw.LinkedList.linkedlist;

import java.io.BufferedReader;

public class Reader {
    
    Double media;
    Double desviacion;

    public void readFile(FileReader file) throws IOException {
        linkedlist ln = new linkedlist();
        String listaNumeros;
        BufferedReader bf = new BufferedReader(file);
        while ((listaNumeros = bf.readLine()) != null) {
            Double element = Double.parseDouble(listaNumeros);
            ln.agregar(element);
        }
        

        Calculos calculos = new Calculos();
        media = calculos.calcularMedia(ln);
        desviacion = calculos.calcularDesviacion(ln);

    }
    
    public Double getMedia() {
        return media;
    }
    
    public Double getDesviacionEstandar() {
        return desviacion;
    }
    
}