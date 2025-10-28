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
@Table(name = "Resultados_Simulacion")
public class Resultados_Simulacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "monto_financiar",nullable = false)
    private float monto_financiar;

    @Column(name = "cuota_mensual",nullable = false)
    private float cuota_mensual;

    @Column(name = "total_interes",nullable = false)
    private float total_interes;

    @Column(name = "total_pagar",nullable = false)
    private float total_pagar;

    @Column(name = "costo_total_credito",nullable = false)
    private float costo_total_credito;

    @Column(name = "tcea",nullable = false)
    private float tcea;

    @Column(name = "van_prestamista",nullable = false)
    private float van_prestamista;
    @Column(name = "van_prestario",nullable = false)
    private float van_prestario;

    @Column(name = "tir_prestamista",nullable = false)
    private float tir_prestamista;

    @Column(name = "tir_prestario",nullable = false)
    private float tir_prestario;

    @Column(name = "numero_cuotas",nullable = false)
    private int numero_cuotas;

    @Column(name = "relacion_cuota_ingreso",nullable = false)
    private float relacion_cuota_ingreso;

    @Column(name = "total_amortizado",nullable = false)
    private float total_amortizado;

    @Column(name = "total_seguros",nullable = false)
    private float total_seguros;

    @Column(name = "ahorro_bono",nullable = false)
    private float ahorro_bono;

    @Column(name = "fecha_generacion",nullable = false)
    private LocalDate fecha_generacion;

    @ManyToOne
    @JoinColumn(name = "simulaciones_credito_id" , nullable = false)
    private Simulaciones_Credito simulaciones_credito;

    public Resultados_Simulacion(){

    }

    public Resultados_Simulacion(int id, float monto_financiar, float cuota_mensual, float total_interes, float total_pagar, float costo_total_credito, float tcea, float van_prestamista, float van_prestario, float tir_prestamista, float tir_prestario, int numero_cuotas, float relacion_cuota_ingreso, float total_amortizado, float total_seguros, float ahorro_bono, LocalDate fecha_generacion, Simulaciones_Credito simulaciones_credito) {
        this.id = id;
        this.monto_financiar = monto_financiar;
        this.cuota_mensual = cuota_mensual;
        this.total_interes = total_interes;
        this.total_pagar = total_pagar;
        this.costo_total_credito = costo_total_credito;
        this.tcea = tcea;
        this.van_prestamista = van_prestamista;
        this.van_prestario = van_prestario;
        this.tir_prestamista = tir_prestamista;
        this.tir_prestario = tir_prestario;
        this.numero_cuotas = numero_cuotas;
        this.relacion_cuota_ingreso = relacion_cuota_ingreso;
        this.total_amortizado = total_amortizado;
        this.total_seguros = total_seguros;
        this.ahorro_bono = ahorro_bono;
        this.fecha_generacion = fecha_generacion;
        this.simulaciones_credito = simulaciones_credito;
    }

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

    public float getCosto_total_credito() {
        return costo_total_credito;
    }

    public void setCosto_total_credito(float costo_total_credito) {
        this.costo_total_credito = costo_total_credito;
    }

    public float getTcea() {
        return tcea;
    }

    public void setTcea(float tcea) {
        this.tcea = tcea;
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
