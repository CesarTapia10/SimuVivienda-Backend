package pe.edu.upc.simuviviendabackend.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import pe.edu.upc.simuviviendabackend.entities.Usuario;

import java.time.LocalDate;

public class Soporte_TicketsDTO {
    private int id;

    private String Asunto;


    private String Mensaje;


    private String estado;


    private LocalDate fecha_envio;



    private LocalDate fecha_respuesta;


    private Usuario user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAsunto() {
        return Asunto;
    }

    public void setAsunto(String asunto) {
        Asunto = asunto;
    }

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String mensaje) {
        Mensaje = mensaje;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getFecha_respuesta() {
        return fecha_respuesta;
    }

    public void setFecha_respuesta(LocalDate fecha_respuesta) {
        this.fecha_respuesta = fecha_respuesta;
    }

    public LocalDate getFecha_envio() {
        return fecha_envio;
    }

    public void setFecha_envio(LocalDate fecha_envio) {
        this.fecha_envio = fecha_envio;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
}
