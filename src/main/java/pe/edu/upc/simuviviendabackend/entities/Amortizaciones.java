package pe.edu.upc.simuviviendabackend.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Amortizaciones")
public class Amortizaciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "numero_cuota",nullable = false)
    private int numero_cuota;

    @Column(name = "saldo_inicial",nullable = false)
    private float saldo_inicial;

    @Column(name = "interes_periodo",nullable = false)
    private float interes_periodo;

    @Column(name = "amortizacion_capital",nullable = false)
    private float amortizacion_capital;

    @Column(name = "cuota_total",nullable = false)
    private float cuota_total;

    @Column(name = "saldo_final",nullable = false)
    private float saldo_final;


    @ManyToOne
    @JoinColumn(name = "simulaciones_credito_id" , nullable = false)
    private Simulaciones_Credito simulaciones_credito;

    public Amortizaciones(){

    }

    public Amortizaciones(int id, int numero_cuota, float saldo_inicial, float interes_periodo, float amortizacion_capital, float cuota_total, float saldo_final, Simulaciones_Credito simulaciones_credito) {
        this.id = id;
        this.numero_cuota = numero_cuota;
        this.saldo_inicial = saldo_inicial;
        this.interes_periodo = interes_periodo;
        this.amortizacion_capital = amortizacion_capital;
        this.cuota_total = cuota_total;
        this.saldo_final = saldo_final;
        this.simulaciones_credito = simulaciones_credito;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero_cuota() {
        return numero_cuota;
    }

    public void setNumero_cuota(int numero_cuota) {
        this.numero_cuota = numero_cuota;
    }

    public float getSaldo_inicial() {
        return saldo_inicial;
    }

    public void setSaldo_inicial(float saldo_inicial) {
        this.saldo_inicial = saldo_inicial;
    }

    public float getInteres_periodo() {
        return interes_periodo;
    }

    public void setInteres_periodo(float interes_periodo) {
        this.interes_periodo = interes_periodo;
    }

    public float getAmortizacion_capital() {
        return amortizacion_capital;
    }

    public void setAmortizacion_capital(float amortizacion_capital) {
        this.amortizacion_capital = amortizacion_capital;
    }

    public float getSaldo_final() {
        return saldo_final;
    }

    public void setSaldo_final(float saldo_final) {
        this.saldo_final = saldo_final;
    }

    public float getCuota_total() {
        return cuota_total;
    }

    public void setCuota_total(float cuota_total) {
        this.cuota_total = cuota_total;
    }

    public Simulaciones_Credito getSimulaciones_credito() {
        return simulaciones_credito;
    }

    public void setSimulaciones_credito(Simulaciones_Credito simulaciones_credito) {
        this.simulaciones_credito = simulaciones_credito;
    }
}
