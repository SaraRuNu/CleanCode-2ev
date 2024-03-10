package es.ed;

import es.ed.model.Bloque4.Rectangulo;
import es.ed.model.Bloque4.Rectangulo2;
import es.ed.model.Bloque4.Ventana;
import es.ed.model.Bloque5.Calculadora;
import es.ed.model.Bloque7.Usuario;

public class Main {

    public static void main(String[] args) {

        // BLOQUE 4: OBJETOS Y ESTRUCTURAS DE DATOS
        // 17. Diferencias entre objetos y estructuras de datos

        Rectangulo rectangulo = new Rectangulo(2, 6);

        System.out.println("Área del rectángulo: " + rectangulo.area());
        System.out.println("Perímetro del of rectángulo: " + rectangulo.perimetro());

        // BLOQUE 4: OBJETOS Y ESTRUCTURAS DE DATOS
        // 18. La Ley de Demeter

        Rectangulo2 rectangulo2 = new Rectangulo2(3, 4);

        Ventana ventana = new Ventana(rectangulo2); // mismos nums q el rectángulo

        System.out.println("Área del rectángulo: " + rectangulo2.calcularArea());
        System.out.println("Área de la ventana: " + ventana.calcularArea());

        // ------------------------------------------------------------------------------------
        // BLOQUE 5: MANEJO DE ERRORES

        Calculadora calculadora = new Calculadora();
        try {
            int resultado = calculadora.dividir(10, 0);
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        }

        //-------------------------------------------------------------------------------------
        //BLOQUE 7: CLASES
        
        final String NOMBRE = "Sara";
        final String APELLIDOS = "Ruiz Núñez";
        final String EMAIL = "correo@example.com";
        final int EDAD = 18;

        Usuario user = new Usuario(NOMBRE, APELLIDOS, EMAIL, EDAD);

        System.out.println("Nombre: " + user.getNombre());
        System.out.println("Apellidos: " + user.getApellidos());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Edad: " + user.getEdad());

    
}
}

