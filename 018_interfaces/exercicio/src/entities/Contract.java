package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {

    private Integer numero;
    private LocalDate data;
    private Double valorContrato;


    private List<Parcela> parcelas = new ArrayList<>();

    public Contract(Integer numero, LocalDate data, Double valorTotal) {
        this.numero = numero;
        this.data = data;
        this.valorContrato = valorTotal;
    }


    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Double getValorContrato() {
        return valorContrato;
    }

    public void setValorContrato(Double valorContrato) {
        this.valorContrato = valorContrato;
    }

    public List<Parcela> getParcelas() {
        return parcelas;
    }
}