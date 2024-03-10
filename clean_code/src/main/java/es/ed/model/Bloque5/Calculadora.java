package es.ed.model.Bloque5;

//BLOQUE 5: MANEJO DE ERRORES

public class Calculadora {
    public int dividir(int dividendo, int divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("El divisior no puede ser 0");
        }
        return dividendo / divisor;
    }
}
