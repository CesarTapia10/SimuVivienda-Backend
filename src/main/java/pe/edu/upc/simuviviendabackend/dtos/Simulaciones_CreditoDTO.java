package pe.edu.upc.simuviviendabackend.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import pe.edu.upc.simuviviendabackend.entities.Bancos;

import java.time.LocalDate;

public class Simulaciones_CreditoDTO {
    private int id;

    private float precio_vivienda;

    private float cuota_inicial;

    private int plazo_anios;

    private float tasa_interes;

    private String tipo;

    private int periodo_gracia;

    private Boolean aplica_bono_techo_propio;

    private float monto_bono;

    private Boolean Seguro_desgravamen;

    private String modalidad_credito;

    private LocalDate fecha_simulacion;

    private Bancos bancos;

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

    public float getCuota_inicial() {
        return cuota_inicial;
    }

    public void setCuota_inicial(float cuota_inicial) {
        this.cuota_inicial = cuota_inicial;
    }

    public int getPlazo_anios() {
        return plazo_anios;
    }

    public void setPlazo_anios(int plazo_anios) {
        this.plazo_anios = plazo_anios;
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

    public Boolean getSeguro_desgravamen() {
        return Seguro_desgravamen;
    }

    public void setSeguro_desgravamen(Boolean seguro_desgravamen) {
        Seguro_desgravamen = seguro_desgravamen;
    }

    public float getMonto_bono() {
        return monto_bono;
    }

    public void setMonto_bono(float monto_bono) {
        this.monto_bono = monto_bono;
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
