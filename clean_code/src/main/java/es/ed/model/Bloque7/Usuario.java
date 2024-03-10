package es.ed.model.Bloque7;

//BLOQUE 7: CLASES

public class Usuario {

    public static final int MAX_CARACTERES_NOMBRE = 50;
    public static final int MAX_CARACTERES_APELLIDOS = 100;
    public static final int MAX_CARACTERES_EMAIL = 100;

    private static final int MIN_EDAD = 18;

    private String nombre;
    private String apellidos;
    private String email;
    private int edad;

    public Usuario(String nombre, String apellidos, String email, int edad) {
        this.setNombre(nombre);
        this.setApellidos(apellidos);
        this.setEmail(email);
        this.setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.length() > MAX_CARACTERES_NOMBRE) {
            throw new IllegalArgumentException(
                    "El nombre no puede tener más de " + MAX_CARACTERES_NOMBRE + " caracteres.");
        }
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        if (apellidos.length() > MAX_CARACTERES_APELLIDOS) {
            throw new IllegalArgumentException(
                    "Los apellidos no pueden tener más de " + MAX_CARACTERES_APELLIDOS + " caracteres.");
        }
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (!email.matches("\\w+@\\w+\\.\\w+")) {
            throw new IllegalArgumentException("El email no es válido.");
        }
        if (email.length() > MAX_CARACTERES_EMAIL) {
            throw new IllegalArgumentException(
                    "El email no puede tener más de " + MAX_CARACTERES_EMAIL + " caracteres.");
        }
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < MIN_EDAD) {
            throw new IllegalArgumentException("La edad debe ser mayor o igual a " + MIN_EDAD + " años.");
        }
        this.edad = edad;
    }

}