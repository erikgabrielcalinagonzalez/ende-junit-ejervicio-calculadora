package es.etg.dax.testing;

import es.etg.dax.testing.exception.OperacionNoValidaException;

public class Calculadora {
    

    public static int sumar(int a, int b){
        return a+b;
    }

    public static int restar(int a, int b){
        return a-b;
    }

    public static int multiplicar(int a, int b){
        return a*b;
    }

    public static int dividir(int a, int b) throws OperacionNoValidaException{
        if (b==0)
            throw new OperacionNoValidaException();
        else
            return a/b;
    }

}


