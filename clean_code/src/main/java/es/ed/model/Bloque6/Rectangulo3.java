package es.ed.model.Bloque6;

//BLOQUE 6: TESTS UNITARIOS

public class Rectangulo3 {
  public Rectangulo3(double d, double e) {
    //TODO Auto-generated constructor stub
  }

  public class Rectangulo {
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        if (ancho <= 0 || alto <= 0) {
            throw new IllegalArgumentException("Ancho y alto deben ser mayores a cero");
        }
        this.ancho = ancho;
        this.alto = alto;
    }

    public double area() {
        return ancho * alto;
    }

    public double perimetro() {
        return 2 * (ancho + alto);
    }
}

public Integer area() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'area'");
}

public Integer perimetro() {
  // TODO Auto-generated method stub
  throw new UnsupportedOperationException("Unimplemented method 'perimetro'");
}
}
