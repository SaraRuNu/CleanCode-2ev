package es.ed.model.Bloque4;

//BLOQUE 4: OBJETOS Y ESTRUCTURAS DE DATOS
//18. La Ley de Demeter

public class Rectangulo2 {
    private int ladoIzquierdo;
    private int ladoDerecho;

    public Rectangulo2(int ladoIzquierdo, int ladoDerecho) {
        this.ladoIzquierdo = ladoIzquierdo;
        this.ladoDerecho = ladoDerecho;
    }

    public double calcularArea() {
        return ladoIzquierdo * ladoDerecho;
    }
}

