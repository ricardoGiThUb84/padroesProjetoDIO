package br.com.hamburgueria.hamburgueria.dominio;

import org.springframework.stereotype.Component;

@Component
public abstract class Hamburger {

    private String pao;
    private String carne;
    private String salada;

    private Double valor;

    public String getPao() {
        return pao;
    }

    public void setPao(String pao) {
        this.pao = pao;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public String getSalada() {
        return salada;
    }

    public void setSalada(String salada) {
        this.salada = salada;
    }


    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Hamburger{" +
                "pao='" + pao + '\'' +
                ", carne='" + carne + '\'' +
                ", salada=" + salada +
                ", valor=" + valor +
                '}';
    }
}