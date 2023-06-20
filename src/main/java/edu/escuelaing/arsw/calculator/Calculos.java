package edu.escuelaing.arsw.calculator;

import java.util.List;

import edu.escuelaing.arsw.LinkedList.linkedlist;

public class Calculos {

    public Double calcularMedia(linkedlist ln) {
        if (ln.getSize() <= 0) {
            return 0.0;
        }

        double suma = 0;
        for (int i = 0; i < ln.getSize(); i++) {
            suma += ln.get(i).getData();
        }
        return (double) Math.round((suma/ln.getSize()) * 100) / 100;
    }

    public Double calcularDesviacion(linkedlist ln) {
        if (ln.getSize() < 2) {
            return 0.0;
        }

        double value = 0.0;
        double media = calcularMedia(ln);

        for (int i = 0; i < ln.getSize(); i++) {
            value += Math.pow((ln.get(i).getData() - media), 2);
        }
        double desviacionEstandar = Math.sqrt(value / (ln.getSize() - 1));
        return (double) Math.round(desviacionEstandar * 100) / 100;
    }
}