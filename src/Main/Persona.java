package Main;

public class Persona {
    private String Nombre, Apellidos, ID, Edad, Correo, Pais;

    public Persona() {
    }

    public Persona(String Nombre, String Apellidos, String ID, String Edad, String Correo, String Pais) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.ID = ID;
        this.Edad = Edad;
        this.Correo = Correo;
        this.Pais = Pais;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String edad) {
        Edad = edad;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }
}
