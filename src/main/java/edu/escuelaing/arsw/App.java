package edu.escuelaing.arsw;

import java.io.FileReader;
import java.io.IOException;

import edu.escuelaing.arsw.calculator.Reader;


public class App 
{
    public static void main( String[] args ) throws IOException
    {
        FileReader fr = new FileReader(args[0]);
        Reader reader = new Reader();
        reader.readFile(fr);
        System.out.println("La media es: " + reader.getMedia());
        System.out.println("La desviacion estandar es: " + reader.getDesviacionEstandar());
    }
}
