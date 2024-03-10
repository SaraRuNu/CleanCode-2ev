package es.ed.model.Bloque4;

//BLOQUE 4: OBJETOS Y ESTRUCTURAS DE DATOS
//18. La Ley de Demeter

public class Ventana {
    private Rectangulo2 marco;

    public Ventana(Rectangulo2 marco) {
        this.marco = marco;
    }

    public double calcularArea() {
        return marco.calcularArea();
    }
}