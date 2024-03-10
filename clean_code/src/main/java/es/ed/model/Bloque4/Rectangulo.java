package es.ed.model.Bloque4;

//BLOQUE 4: OBJETOS Y ESTRUCTURAS DE DATOS
//17. Diferencias entre objetos y estructuras de datos

public class Rectangulo {
    private int ancho;
    private int alto;
  
    public Rectangulo(int ancho, int alto) {
      this.ancho = ancho;
      this.alto = alto;
    }
  
    public int area() {
      return ancho * alto;
    }
  
    public int perimetro() {
      return 2 * (ancho + alto);
    }
  }
