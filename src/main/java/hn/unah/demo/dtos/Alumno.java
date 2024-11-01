package hn.unah.demo.dtos;

public class Alumno {
    
    private String cuenta;

    private String nombre;

    private String apellido;

    private String correo;

    private String telefono;

    public Alumno(String cuenta, String nombre, String apellido, String correo, String telefono) {
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
    public String toString(){
        return "Número de cuenta: " + cuenta +"\n" +
               "Nombre: " + nombre +"\n" +
               "Apellido: " + apellido + "\n" +
               "Correo: " + correo + " \n" +
               "Teléfono: " + telefono;
    }

}
