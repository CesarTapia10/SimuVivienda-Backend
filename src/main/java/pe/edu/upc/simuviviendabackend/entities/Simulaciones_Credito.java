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
@Table(name = "Simulaciones_Credito")
public class Simulaciones_Credito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "precio_vivienda",nullable = false)
    private float precio_vivienda;

    @Column(name = "cuota_inicial",nullable = false)
    private float cuota_inicial;

    @Column(name = "plazo_anios",nullable = false)
    private int plazo_anios;

    @Column(name = "tasa_interes",nullable = false)
    private float tasa_interes;

    @Column(name = "tipo",nullable = false)
    private String tipo;

    @Column(name = "periodo_gracia",nullable = false)
    private int periodo_gracia;

    @Column(name = "aplica_bono_techo_propio",nullable = false)
    private Boolean aplica_bono_techo_propio;

    @Column(name = "monto_bono",nullable = false)
    private float monto_bono;

    @Column(name = "Seguro_desgravamen",nullable = false)
    private Boolean Seguro_desgravamen;

    @Column(name = "modalidad_credito",nullable = false)
    private String modalidad_credito;

    @Column(name = "fecha_simulacion",nullable = false)
    private LocalDate fecha_simulacion;

    @ManyToOne
    @JoinColumn(name = "bancos_id" , nullable = false)
    private Bancos bancos;



    public Simulaciones_Credito(){

    }

    public Simulaciones_Credito(int id, float precio_vivienda, float cuota_inicial, int plazo_anios, float tasa_interes, String tipo, int periodo_gracia, Boolean aplica_bono_techo_propio, float monto_bono, Boolean seguro_desgravamen, String modalidad_credito, LocalDate fecha_simulacion, Bancos bancos) {
        this.id = id;
        this.precio_vivienda = precio_vivienda;
        this.cuota_inicial = cuota_inicial;
        this.plazo_anios = plazo_anios;
        this.tasa_interes = tasa_interes;
        this.tipo = tipo;
        this.periodo_gracia = periodo_gracia;
        this.aplica_bono_techo_propio = aplica_bono_techo_propio;
        this.monto_bono = monto_bono;
        Seguro_desgravamen = seguro_desgravamen;
        this.modalidad_credito = modalidad_credito;
        this.fecha_simulacion = fecha_simulacion;
        this.bancos = bancos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrecio_vivienda() {
        return precio_vivienda;
    }

    public void setPrecio_vivienda(float precio_vivienda) {
        this.precio_vivienda = precio_vivienda;
    }

    public int getPlazo_anios() {
        return plazo_anios;
    }

    public void setPlazo_anios(int plazo_anios) {
        this.plazo_anios = plazo_anios;
    }

    public float getCuota_inicial() {
        return cuota_inicial;
    }

    public void setCuota_inicial(float cuota_inicial) {
        this.cuota_inicial = cuota_inicial;
    }

    public float getTasa_interes() {
        return tasa_interes;
    }

    public void setTasa_interes(float tasa_interes) {
        this.tasa_interes = tasa_interes;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPeriodo_gracia() {
        return periodo_gracia;
    }

    public void setPeriodo_gracia(int periodo_gracia) {
        this.periodo_gracia = periodo_gracia;
    }

    public Boolean getAplica_bono_techo_propio() {
        return aplica_bono_techo_propio;
    }

    public void setAplica_bono_techo_propio(Boolean aplica_bono_techo_propio) {
        this.aplica_bono_techo_propio = aplica_bono_techo_propio;
    }

    public float getMonto_bono() {
        return monto_bono;
    }

    public void setMonto_bono(float monto_bono) {
        this.monto_bono = monto_bono;
    }

    public Boolean getSeguro_desgravamen() {
        return Seguro_desgravamen;
    }

    public void setSeguro_desgravamen(Boolean seguro_desgravamen) {
        Seguro_desgravamen = seguro_desgravamen;
    }

    public String getModalidad_credito() {
        return modalidad_credito;
    }

    public void setModalidad_credito(String modalidad_credito) {
        this.modalidad_credito = modalidad_credito;
    }

    public LocalDate getFecha_simulacion() {
        return fecha_simulacion;
    }

    public void setFecha_simulacion(LocalDate fecha_simulacion) {
        this.fecha_simulacion = fecha_simulacion;
    }

    public Bancos getBancos() {
        return bancos;
    }

    public void setBancos(Bancos bancos) {
        this.bancos = bancos;
    }
}
