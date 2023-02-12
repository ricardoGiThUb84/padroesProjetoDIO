package br.com.hamburgueria.hamburgueria.dominio;

import org.springframework.stereotype.Component;

@Component
public class HamburgerCarneBuilder implements HamburgerBuilder {

    private Hamburger hamburger;

    public HamburgerCarneBuilder() {

        this.hamburger = new HamburgerCarne();
    }

    @Override
    public void tipoPao(String pao) {

        hamburger.setPao(pao);
    }

    @Override
    public void tipoCarne(String carne) {

        hamburger.setCarne(carne);

    }

    @Override
    public void tipoSlada(String salada) {

        hamburger.setSalada(salada);

    }

    @Override
    public Hamburger getHamburger() {
        return hamburger;
    }

    @Override
    public void valor(Double s) {

        hamburger.setValor(s);
    }
}
