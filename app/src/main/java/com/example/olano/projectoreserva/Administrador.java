package com.example.olano.projectoreserva;

public class Administrador{
    private String idadministrador;
    private String nombre;
    private String apellidos;
    private String contraseña;
    private String complejodeportivo;
    private String numcanchas;
    private String imagen;

    public Administrador() {
    }

    public Administrador(String idadministrador, String nombre, String apellidos, String contraseña, String complejodeportivo, String numcanchas, String imagen) {
        this.idadministrador = idadministrador;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.contraseña = contraseña;
        this.complejodeportivo = complejodeportivo;
        this.numcanchas = numcanchas;
        this.imagen = imagen;
    }

    public Administrador(String idadministrador, String nombre, String apellidos, String contraseña, String complejodeportivo, String numcanchas) {
        this.idadministrador = idadministrador;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.contraseña = contraseña;
        this.complejodeportivo = complejodeportivo;
        this.numcanchas = numcanchas;
    }

    public String getIdadministrador() {
        return idadministrador;
    }

    public void setIdadministrador(String idadministrador) {
        this.idadministrador = idadministrador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getComplejodeportivo() {
        return complejodeportivo;
    }

    public void setComplejodeportivo(String complejodeportivo) {
        this.complejodeportivo = complejodeportivo;
    }

    public String getNumcanchas() {
        return numcanchas;
    }

    public void setNumcanchas(String numcanchas) {
        this.numcanchas = numcanchas;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
