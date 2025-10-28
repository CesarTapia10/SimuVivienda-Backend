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
@Table(name = "Tasa_Interes")
public class Tasa_Interes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "tipo",nullable = false)
    private String tipo;

    @Column(name = "valor",nullable = false)
    private float valor;

    @Column(name = "capitalizacion",nullable = false)
    private String capitalizacion;


    @Column(name = "vigente_d",nullable = false)
    private LocalDate vigente_d;


    @Column(name = "vigente_h",nullable = false)
    private LocalDate vigente_h;

    @ManyToOne
    @JoinColumn(name = "bancos_id" , nullable = false)
    private Bancos bancos;



    public Tasa_Interes(){

    }


    public Tasa_Interes(int id, String tipo, Bancos bancos, LocalDate vigente_h, String capitalizacion, float valor, LocalDate vigente_d) {
        this.id = id;
        this.tipo = tipo;
        this.bancos = bancos;
        this.vigente_h = vigente_h;
        this.capitalizacion = capitalizacion;
        this.valor = valor;
        this.vigente_d = vigente_d;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public LocalDate getVigente_d() {
        return vigente_d;
    }

    public void setVigente_d(LocalDate vigente_d) {
        this.vigente_d = vigente_d;
    }

    public String getCapitalizacion() {
        return capitalizacion;
    }

    public void setCapitalizacion(String capitalizacion) {
        this.capitalizacion = capitalizacion;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
