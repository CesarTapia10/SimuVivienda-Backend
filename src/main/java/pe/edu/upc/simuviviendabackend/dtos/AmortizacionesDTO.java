package pe.edu.upc.simuviviendabackend.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import pe.edu.upc.simuviviendabackend.entities.Simulaciones_Credito;

public class AmortizacionesDTO {
    private int id;

    private int numero_cuota;

    private float saldo_inicial;

    private float interes_periodo;

    private float amortizacion_capital;

    private float cuota_total;

    private float saldo_final;

    private Simulaciones_Credito simulaciones_credito;

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

    public float getCuota_total() {
        return cuota_total;
    }

    public void setCuota_total(float cuota_total) {
        this.cuota_total = cuota_total;
    }

    public float getSaldo_final() {
        return saldo_final;
    }

    public void setSaldo_final(float saldo_final) {
        this.saldo_final = saldo_final;
    }

    public Simulaciones_Credito getSimulaciones_credito() {
        return simulaciones_credito;
    }

    public void setSimulaciones_credito(Simulaciones_Credito simulaciones_credito) {
        this.simulaciones_credito = simulaciones_credito;
    }
}
