package pe.edu.upc.simuviviendabackend.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import pe.edu.upc.simuviviendabackend.entities.Simulaciones_Credito;

import java.time.LocalDate;

public class Resultados_SimulacionDTO {
    private int id;

    private float monto_financiar;

    private float cuota_mensual;

    private float total_interes;

    private float total_pagar;

    private float costo_total_credito;

    private float tcea;

    private float van_prestamista;

    private float van_prestario;

    private float tir_prestamista;

    private float tir_prestario;

    private int numero_cuotas;

    private float relacion_cuota_ingreso;

    private float total_amortizado;

    private float total_seguros;

    private float ahorro_bono;

    private LocalDate fecha_generacion;

    private Simulaciones_Credito simulaciones_credito;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getMonto_financiar() {
        return monto_financiar;
    }

    public void setMonto_financiar(float monto_financiar) {
        this.monto_financiar = monto_financiar;
    }

    public float getCuota_mensual() {
        return cuota_mensual;
    }

    public void setCuota_mensual(float cuota_mensual) {
        this.cuota_mensual = cuota_mensual;
    }

    public float getTotal_interes() {
        return total_interes;
    }

    public void setTotal_interes(float total_interes) {
        this.total_interes = total_interes;
    }

    public float getTotal_pagar() {
        return total_pagar;
    }

    public void setTotal_pagar(float total_pagar) {
        this.total_pagar = total_pagar;
    }

    public float getTcea() {
        return tcea;
    }

    public void setTcea(float tcea) {
        this.tcea = tcea;
    }

    public float getCosto_total_credito() {
        return costo_total_credito;
    }

    public void setCosto_total_credito(float costo_total_credito) {
        this.costo_total_credito = costo_total_credito;
    }

    public float getVan_prestamista() {
        return van_prestamista;
    }

    public void setVan_prestamista(float van_prestamista) {
        this.van_prestamista = van_prestamista;
    }

    public float getVan_prestario() {
        return van_prestario;
    }

    public void setVan_prestario(float van_prestario) {
        this.van_prestario = van_prestario;
    }

    public float getTir_prestamista() {
        return tir_prestamista;
    }

    public void setTir_prestamista(float tir_prestamista) {
        this.tir_prestamista = tir_prestamista;
    }

    public float getTir_prestario() {
        return tir_prestario;
    }

    public void setTir_prestario(float tir_prestario) {
        this.tir_prestario = tir_prestario;
    }

    public int getNumero_cuotas() {
        return numero_cuotas;
    }

    public void setNumero_cuotas(int numero_cuotas) {
        this.numero_cuotas = numero_cuotas;
    }

    public float getRelacion_cuota_ingreso() {
        return relacion_cuota_ingreso;
    }

    public void setRelacion_cuota_ingreso(float relacion_cuota_ingreso) {
        this.relacion_cuota_ingreso = relacion_cuota_ingreso;
    }

    public float getTotal_amortizado() {
        return total_amortizado;
    }

    public void setTotal_amortizado(float total_amortizado) {
        this.total_amortizado = total_amortizado;
    }

    public float getTotal_seguros() {
        return total_seguros;
    }

    public void setTotal_seguros(float total_seguros) {
        this.total_seguros = total_seguros;
    }

    public float getAhorro_bono() {
        return ahorro_bono;
    }

    public void setAhorro_bono(float ahorro_bono) {
        this.ahorro_bono = ahorro_bono;
    }

    public LocalDate getFecha_generacion() {
        return fecha_generacion;
    }

    public void setFecha_generacion(LocalDate fecha_generacion) {
        this.fecha_generacion = fecha_generacion;
    }

    public Simulaciones_Credito getSimulaciones_credito() {
        return simulaciones_credito;
    }

    public void setSimulaciones_credito(Simulaciones_Credito simulaciones_credito) {
        this.simulaciones_credito = simulaciones_credito;
    }
}
