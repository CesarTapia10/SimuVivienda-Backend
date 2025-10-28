package pe.edu.upc.simuviviendabackend.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "Soporte_Tickets")
public class Soporte_Tickets {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Asunto",nullable = false)
    private String Asunto;

    @Column(name = "Mensaje",nullable = false)
    private String Mensaje;

    @Column(name = "estado",nullable = false)
    private String estado;

    @Column(name = "fecha_envio",nullable = false)
    private LocalDate fecha_envio;


    @Column(name = "fecha_respuesta",nullable = false)
    private LocalDate fecha_respuesta;

    @ManyToOne
    @JoinColumn(name = "user_id" , nullable = false)
    private Usuario user;

    public Soporte_Tickets(){

    }

    public Soporte_Tickets(int id, String asunto, String mensaje, String estado, LocalDate fecha_envio, LocalDate fecha_respuesta, Usuario user) {
        this.id = id;
        Asunto = asunto;
        Mensaje = mensaje;
        this.estado = estado;
        this.fecha_envio = fecha_envio;
        this.fecha_respuesta = fecha_respuesta;
        this.user = user;
    }

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

    public LocalDate getFecha_envio() {
        return fecha_envio;
    }

    public void setFecha_envio(LocalDate fecha_envio) {
        this.fecha_envio = fecha_envio;
    }

    public LocalDate getFecha_respuesta() {
        return fecha_respuesta;
    }

    public void setFecha_respuesta(LocalDate fecha_respuesta) {
        this.fecha_respuesta = fecha_respuesta;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
}
