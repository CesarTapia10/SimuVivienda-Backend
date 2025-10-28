package pe.edu.upc.simuviviendabackend.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import pe.edu.upc.simuviviendabackend.entities.Bancos;

import java.time.LocalDate;

public class Tasa_InteresDTO {
    private int id;


    private String tipo;


    private float valor;


    private String capitalizacion;



    private LocalDate vigente_d;



    private LocalDate vigente_h;


    private Bancos bancos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getCapitalizacion() {
        return capitalizacion;
    }

    public void setCapitalizacion(String capitalizacion) {
        this.capitalizacion = capitalizacion;
    }

    public LocalDate getVigente_d() {
        return vigente_d;
    }

    public void setVigente_d(LocalDate vigente_d) {
        this.vigente_d = vigente_d;
    }

    public Bancos getBancos() {
        return bancos;
    }

    public void setBancos(Bancos bancos) {
        this.bancos = bancos;
    }

    public LocalDate getVigente_h() {
        return vigente_h;
    }

    public void setVigente_h(LocalDate vigente_h) {
        this.vigente_h = vigente_h;
    }
}
