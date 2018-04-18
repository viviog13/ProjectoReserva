package com.example.olano.projectoreserva;

public class Usuario {

    private String idusuario;
    private String nombres;
    private String apellidos;
    private String usuario;
    private String contraseña;
    private String repcontraseña;
    private String correo;

    public Usuario() {
    }

    public Usuario(String idusuario, String nombres, String apellidos, String usuario, String contraseña, String repcontraseña, String correo) {
        this.idusuario = idusuario;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.repcontraseña = repcontraseña;
        this.correo = correo;
    }

    public String getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(String idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getRepcontraseña() {
        return repcontraseña;
    }

    public void setRepcontraseña(String repcontraseña) {
        this.repcontraseña = repcontraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
